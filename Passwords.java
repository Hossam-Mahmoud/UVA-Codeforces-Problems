import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Passwords {
	static ArrayList<String> dic;
	static ArrayList<String> rule;
	
	public static void print(int pos, String res, String rule){
		if(pos == rule.length()-1){
			if(rule.charAt(pos) == '0'){
				for(int i=0; i<10; i++)
					System.out.println(res+i);
			}else if(rule.charAt(pos)== '#'){
				for(int i=0; i<dic.size(); i++)
					System.out.println(res+dic.get(i));
			}
		}else{
			if(rule.charAt(pos) == '0'){
				for(int i=0; i<10; i++)
					print(pos+1,res+i, rule);
			}else if(rule.charAt(pos)== '#'){
				for(int i=0; i<dic.size(); i++)
					print(pos+1,res+dic.get(i), rule);
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		dic = new ArrayList<String>();
		rule = new ArrayList<String>();
		while(tmp != null){
			int x = Integer.parseInt(tmp);
			dic.clear();
			for(int i=0; i<x ; i++){
				dic.add(read.readLine());
			}
			x = Integer.parseInt(read.readLine());
			rule.clear();
			for(int j=0; j<x; j++){
				rule.add(read.readLine());
			}
			System.out.println("--");
			for(int j =0; j<rule.size(); j++){
				print(0,"",rule.get(j));
			}
			tmp = read.readLine();
		}

	}

}
