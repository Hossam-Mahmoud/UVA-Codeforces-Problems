import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CSI2 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		for(int i=0; i<tmp.length()-4; i++){
			for(int j=i+1; j<tmp.length()-3; j++){
				for(int k=j+1; k<tmp.length()-2; k++){
					for(int l=k+1; l<tmp.length()-1; l++){
						for(int m=k+1; m<tmp.length(); m++){
							System.out.println(tmp.charAt(i)+""+tmp.charAt(j)+""+tmp.charAt(k)+""
												+tmp.charAt(l)+""+tmp.charAt(m));
						}
					}
				}
			}
		}

	}

}
