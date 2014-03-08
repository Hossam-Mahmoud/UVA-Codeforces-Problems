import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class All {
	public static void main(String[] args)throws IOException {
		BufferedReader me = new BufferedReader(new InputStreamReader(System.in));
		String two = me.readLine();
		String st = "";
		String nd = "";
		while(two != null){
			boolean tr = true;
			st = two.substring(0, two.indexOf(" "));
			nd = two.substring(two.indexOf(" ")+1);
			if(st.length()>nd.length()){
				System.out.println("No");
			}else{
				for(int i=0; i<st.length(); i++){
					if(nd.contains(""+st.charAt(i))){
						nd = nd.substring(nd.indexOf(st.charAt(i))+1);
					}else{
						tr = false;
						System.out.println("No");
						break;
					}
				}if(tr == true){
					System.out.println("Yes");
				}
			}
			two = me.readLine();
		}
	}
}
