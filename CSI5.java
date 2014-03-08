import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CSI5 {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int m = Integer.parseInt(read.readLine());
		int max = (int) Math.pow(2, tmp.length());
		System.out.println("FI");
		int bin ;
		String res;
		for(int i=1; i<max; i++ ){
			res = "";
			for(int j=0; j<tmp.length(); j++){
				bin = 1<<j;
				if((i&bin) == bin)
					res += tmp.charAt(j);
			}
			if(res.length() == m)
				System.out.println(res);
		}

	}

}
