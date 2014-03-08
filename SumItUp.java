import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class SumItUp {
	private static ArrayList<String> check = new ArrayList<String>();
	
	public static void printRes(int[] list , int n, String res, int result,int start){
		if(result == n){
			res = res.substring(0, res.length()-1);
			if(!check.contains(res)){
				System.out.println(res);
				check.add(res);
			}
		}
		else{
			for(int i =start; i<list.length ; i++){
				printRes(list, n, res+""+list[i]+"+", result+list[i],i+1);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine()+" ";
		while(!tmp.equals("0 0 ")){
			int n = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
			tmp = tmp.substring(tmp.indexOf(" ")+1);
			int t = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
			tmp = tmp.substring(tmp.indexOf(" ")+1);
			int [] list = new int[t];
			for(int i=0; i<t; i++){
				list[i] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
				tmp = tmp.substring(tmp.indexOf(" ")+1);
			}
			System.out.println("Sums of "+n+":");
			printRes(list, n, "", 0,0);
			if(check.size() == 0)
				System.out.println("NONE");
			check.clear();
			tmp = read.readLine()+" ";
		}
		

	}

}
