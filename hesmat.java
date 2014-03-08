import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class hesmat {

	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(
				System.in));
		String x = buff.readLine();
		long first, sec;
		while (x !=  null) {
			first =Long.parseLong((x.substring(x.indexOf(" ")+1)));
			sec = Long.parseLong((x.substring(0, x.indexOf(" "))));
			System.out.println(Math.abs(first-sec));
			x = buff.readLine();
		}

	}

}
