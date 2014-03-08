import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Operator {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int n = Integer.parseInt(tmp);
		int x =0;
		int y =0;
		while(n>0){
			tmp = read.readLine();
			x = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
			y = Integer.parseInt(tmp.substring(tmp.indexOf(" ")+1));
			if(x>y)
				System.out.println(">");
			else if(x<y)
				System.out.println("<");
			else
				System.out.println("=");
			n--;
		}
		

	}

}
