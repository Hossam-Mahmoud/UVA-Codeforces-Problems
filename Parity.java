import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Parity {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(read.readLine());
		StringBuilder bld = new StringBuilder();
		int count =0;
		while(x !=0){
			count=0;
			for(int j=0; j<32; j++){
				if((x&(1<<j)) != 0)
					count++;
			}
			bld.append("The parity of "+Integer.toBinaryString(x)+" is "+count+" (mod 2).\n");
			x = Integer.parseInt(read.readLine());
		}
		System.out.print(bld);
	}

}
