import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Google {
	public static void main(String[] args)throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buff.readLine());
		String[] urls = new String[10];
		int[] rating = new int[10];
		int count=1;
		while(count <= n){
			int biggestRate = 0;
			for(int i=0; i<10; i++){
				String nw = buff.readLine();
				urls[i] = nw.substring(0, nw.indexOf(" "));
				rating[i]=Integer.parseInt(nw.substring(nw.indexOf(" ")+1, nw.length()));
				if(rating[i] > biggestRate){
					biggestRate = rating[i];
				}
			}
			System.out.println("Case #"+count+":");
			for(int j=0; j<10; j++){
				if(biggestRate == rating[j]){
					System.out.println(urls[j]);
				}
			}
			count++;
		}
	}
}
