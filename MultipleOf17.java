import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class MultipleOf17 {
	public static void main(String[] args) throws IOException {
		int[] tens = {10, 15, 14, 4, 6, 9, 5, 16, 7, 2, 3, 13, 11, 8, 12, 1};
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		while(!tmp.equals("0")){
			char [] num = tmp.toCharArray();
			int last = ((num[num.length-1]-'0')*5);
			int remind = num[num.length-2]-'0';
			int j =0;
			for(int i= num.length-3; i>-1; i--){
				remind += ((num[i]-'0')*tens[j])%17;
				j = (j+1)%16;
			}
			if((remind-last)%17 == 0)
				System.out.println(1);
			else
				System.out.println(0);
			tmp = read.readLine();
		}
	}
}

