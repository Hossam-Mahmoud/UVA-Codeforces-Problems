import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Permutations {
	
	public static void Perm(int n){
		long res = 1;
		int n2 =n;
		while(n>0){
			res *= n--;
		}
		System.out.println("P("+n2+") = "+res);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(read.readLine());
		Perm(x);
	}

}
