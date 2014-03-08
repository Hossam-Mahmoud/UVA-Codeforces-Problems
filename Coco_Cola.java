import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Coco_Cola {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(read.readLine());
		while(n !=0){
			int drnkB = 0;
			while(n > 2){
				drnkB += n/3;
				n = n/3 + n%3;
			}
			if( n  == 2)
				drnkB++;
			System.out.println(drnkB);
			n = Integer.parseInt(read.readLine());
		}
	}

}
