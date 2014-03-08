import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CSR2 {

	public static void Comb(String check, String print , int n){
		if(print.length() == n)
			System.out.println(print);
		else{
			for(int i=0; i<check.length() ; i++){
				if(!print.contains(""+check.charAt(i)))
					Comb(check.substring(i), print+check.charAt(i), n);
				
			}
		}
			
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int n = Integer.parseInt(read.readLine());
		Comb(tmp, "", n);
	}

}
