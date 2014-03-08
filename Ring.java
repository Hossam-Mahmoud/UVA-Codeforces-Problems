import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Ring {

	
	public static void Ringo(int n, String res, int prevNum, int CurrLnth, boolean[] chk) throws IOException{
		
		if( CurrLnth== n-1){
			for(int i=2; i<=n ; i++){
				if(isPrime(i+1) && (!chk[i]) && isPrime(prevNum+i) ){
					System.out.println();
					System.out.print(res+i);
				}
			}
		}
		else{
			for(int i=2; i<=n ; i++){
				if(isPrime(prevNum+i) && (!chk[i])){
					boolean[] chk2 = new boolean[n+1];
					chk2 = Arrays.copyOf(chk, n+1);
					chk2[i] = true;
					Ringo(n, res+i+" ", i, CurrLnth+1, chk2);
				}
			}
		}
	}
	
	public static boolean isPrime(int x){
		boolean prime = true;
		for(int i=2; i<x ; i++){
			if(x%i == 0){
				prime =false;
				break;
			}
		}
		return prime;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int counter = 1;
		int n = 0;
		while(tmp != null){
			try{
				n = Integer.parseInt(tmp);
				System.out.print("Case "+counter+":");
				
			}catch(Exception e){
				System.exit(0);
			}
			
			boolean[] chk = new boolean[n+1];
			Ringo(n, "1 ", 1, 1, chk);
			tmp = read.readLine();
			if(tmp != null){
				System.out.println();
			}else{
				break;
			}
			
			counter++;
		}
		

	}


}
