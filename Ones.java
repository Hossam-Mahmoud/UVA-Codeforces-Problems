import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ones {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int[] primitive = {1, 11, 111, 1111, 11111};
		while(! tmp.equals("")){
			 
			int n = Integer.parseInt(tmp);
			long start = primitive[tmp.length()-1]>=n ? primitive[tmp.length()-1] : primitive[tmp.length()];
			start = start%n;
			int count = primitive[tmp.length()-1]>=n ? tmp.length(): tmp.length()+1;
			while(start%n != 0){
				int j=1;
				for(int i=0; i<count; i++){
					j = (j*10)%n;
				}
				start +=j;
				count++;
			}
			System.out.println(count);
			tmp = read.readLine();
		}
	}

}
