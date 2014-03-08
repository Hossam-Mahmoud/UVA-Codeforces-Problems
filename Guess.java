import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Guess {
	public static void main(String[] args)throws IOException {
		BufferedReader koko = new BufferedReader(new InputStreamReader(System.in));
		String nw = koko.readLine();
		int[] gNum = new int[100]; 
		String[] resp = new String[100];
		while(nw.equals("0") == false){
			gNum[0] = Integer.parseInt(nw);
			nw = koko.readLine();
			resp[0] = nw;
			int i =1;
			while(nw.equals("right on") == false && i<100){
				gNum[i] = Integer.parseInt(koko.readLine());
				nw = koko.readLine();
				resp[i] = nw;
				i++;
			}
			i--;
			int j=0;
			if(resp[j].equals("right on")){
				System.out.println("Stan may be honest");
			}else if(resp[i].equals("right on") == false){
				System.out.println("Stan is dishonest");
			}else{
				while(j<i){
					if(gNum[j]>=gNum[i] && resp[j].equals("too low")){
						System.out.println("Stan is dishonest");
						break;
					}else if(gNum[j]<=gNum[i] && resp[j].equals("too high")){
						System.out.println("Stan is dishonest");
						break;
					}else{
						j++;
						if(j == i){
							System.out.println("Stan may be honest");
						}
					}
				}
			}
			nw = koko.readLine();
		}
	}
}
