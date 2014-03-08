import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;


public class Anagram {
	static Hashtable<Integer, String> list ;
	static StringBuilder bld ;
	
	public static void print(char[] check, StringBuilder print, boolean[] arr){
		if(print.length() == check.length){
			if(!list.containsKey(print.toString().hashCode())){
				bld.append(print+"\n");
				list.put(print.toString().hashCode(), print.toString());
			}
		}
		else{
			for(int i=0; i<check.length ; i++){
				if(! arr[i]){
					arr[i] = true;
					print.append(check[i]);
					print(check,print , arr);
					print.deleteCharAt(print.length()-1);
					arr[i]=false;
				}
			}
		}
			
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bf.readLine());
		String tmp ;
		char[] temp;
		bld = new StringBuilder();
		list = new Hashtable<Integer, String>();
		StringBuilder st = new StringBuilder();
		while(cases>0){
			tmp = bf.readLine();
			temp = tmp.toCharArray();
			Arrays.sort(temp);
			boolean[] check = new boolean[temp.length];
			print(temp, st, check);
			list = new Hashtable<Integer, String>();
			cases--;
			st = new StringBuilder();
		}
		System.out.println(bld);
	}

}
