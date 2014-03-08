import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldBach {

	public static boolean[] generate(){
		boolean[] primes = new boolean[1000001];
		for(int i=2; i<1001;i++){
			if(!primes[i])
				for(int j=i*i; j<1000001; j +=i )
					primes[j] = true;
		}
		return primes;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		String tmp = read.readLine();
		boolean[] prims = generate();
		while (!tmp.equals("0")) {
			int x = Integer.parseInt(tmp);
			int first = 0, second = 0;
			boolean found = false;
			for (int i = 2; i <= x / 2; i++) {
				if ((!prims[i]) && (!prims[x - i])) {
					found = true;
					first = i;
					second = x - i;
					break;
				}
			}
			if (found)
				System.out.println(x + " = " + first + " + " + second);
			else
				System.out.println("Goldbach's conjecture is wrong.");
			tmp = read.readLine();
		}

	}
}
