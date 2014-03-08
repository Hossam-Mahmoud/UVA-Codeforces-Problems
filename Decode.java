import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Decode {
	public static char getASCII(String s){
		char asci = 0;
		s = s.replace("|", "");
		s = s.replace(".", "");
		int j=0;
		for(int i=s.length()-1; i>-1; i--){
			if(s.charAt(i) == 'o'){
				asci += Math.pow(2, j);
			}
			j++;
		}
		return asci;
	}
	public static void main(String[] args)throws IOException {
		BufferedReader koko = new BufferedReader(new InputStreamReader(System.in));
		koko.readLine();
		String nw = koko.readLine();
		String ans = "";
		while(nw.equals("___________") == false){
			ans += getASCII(nw);
			nw = koko.readLine();
		}
		System.out.print(ans);
	}
}
