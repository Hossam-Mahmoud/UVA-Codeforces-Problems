import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Credit {
	public static void main(String[] args)throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int n =0;
		n = Integer.parseInt(buff.readLine());
		while(n != 0){
			String all = buff.readLine();
			all = all.replace(" ", "");
			int doubledSum =0;
			int undoubledSum = 0;
			for(int i=0; i<all.length(); i++){
				int x = Integer.parseInt(""+all.charAt(i));
				if(i%2 == 0){
					if(x>4){
						x = ((x*2)%10)+1;
					}else{
						x = x*2;
					}
					doubledSum +=x;
				}else{
					undoubledSum +=x;
				}
			}
			if((doubledSum +undoubledSum)%10 == 0){
				System.out.println("Valid");
			}else{
				System.out.println("Invalid");
			}
			n--;
		}
	}
}
