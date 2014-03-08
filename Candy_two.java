import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Candy_two {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(read.readLine());
		int count =1;
		
		while(count<= cases){
			int N = Integer.parseInt(read.readLine());
			long candies = 0;
			int min = Integer.MAX_VALUE;
			int num =0;
			String tmp = read.readLine()+" ";
			int xor =0;
			for(int i=0; i<N; i++){
				num = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
				candies += num;
				if(num<min){
					if(min != Integer.MAX_VALUE)
						xor ^= min;
					min = num;
				}else
					xor ^= num;
				tmp = tmp.substring(tmp.indexOf(" ")+1);
			}
			if(xor != min)
				System.out.println("Case #"+count+": NO");
			else
				System.out.println("Case #"+count+": "+(candies-min));
			count++;
		}
	}

}
