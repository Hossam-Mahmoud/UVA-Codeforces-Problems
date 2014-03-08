import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bacteria {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String s = read.readLine();
		int k = Integer.parseInt(s.substring(0, s.indexOf(" ")));
		s = s.substring(s.indexOf(" ")+1);
		int b = Integer.parseInt(s.substring(0, s.indexOf(" ")));
		s = s.substring(s.indexOf(" ")+1);
		int n = Integer.parseInt(s.substring(0, s.indexOf(" ")));
		s = s.substring(s.indexOf(" ")+1);
		int t = Integer.parseInt(s);
		long x =1;
		int sec=0;
		while(sec<n && x<t){
			x = (k*x)+b;
			if(x<=t)
			sec++;
		}
		int res = n-sec;
		System.out.println(res);
		
	}

}
