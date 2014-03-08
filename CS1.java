import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CS1 {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		for(int i=0; i<tmp.length()-1; i++){
			for(int j=i+1; j<tmp.length(); j++){
				System.out.println(tmp.charAt(i)+""+tmp.charAt(j));
			}
		}
	}

}
