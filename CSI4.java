import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CSI4 {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new  BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int max = (int) Math.pow(2, tmp.length());
		System.out.println("FI");
		int bin ;
		for(int i=1; i<max; i++ ){
			for(int j=0; j<tmp.length(); j++){
				bin = 1<<j;
				if((i&bin) == bin)
					System.out.print(tmp.charAt(j));
			}
			System.out.println();
		}
	}
}
