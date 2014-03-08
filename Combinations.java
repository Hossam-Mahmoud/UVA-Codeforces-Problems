import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Combinations {
	public int comb =0;
	public static int Comb(int n, int r, int num){
		if(num == r){
			return 1;
		}else{
			int sum=0;
			for(int i=n; i>0; i--){
				sum += Comb(i-1, r, num+1);
			}
			return sum;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(read.readLine());
		int r = Integer.parseInt(read.readLine());
		System.out.println("C("+n+","+r+") = "+Comb(n, r, 0));
	}

}
