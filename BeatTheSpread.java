import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BeatTheSpread{
	public static void main(String[] args) throws IOException {
		int n=0;
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		n =Integer.parseInt(buff.readLine()); 
		while(n != 0){
			int x =0;
			int y =0;
			String tmp = buff.readLine();
			String st = tmp.substring(0, tmp.indexOf(" "));
			String nd = tmp.substring(tmp.indexOf(" ")+1);
			x = Integer.parseInt(st);
			y = Integer.parseInt(nd);
			if (y > x){
				System.out.println("impossible");
			}else{
				if((x+y)%2 == 0){
				System.out.println(((x+y)/2)+" "+ (x-((x+y)/2)));
				}else{
					System.out.println("impossible");
				}
			}
			n--;	
		}
	}
}
