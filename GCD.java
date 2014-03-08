import java.io.IOException;
import java.util.Scanner;

public class GCD {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases >0){
			int g = sc.nextInt();
			int l = sc.nextInt();
			if(l%g == 0)
				System.out.println(g+" "+l);
			else
				System.out.println(-1);
			cases--;
		}
	}
}