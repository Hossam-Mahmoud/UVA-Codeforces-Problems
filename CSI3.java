import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CSI3 {


	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		for(int i=0; i<tmp.length(); i++){
			for(int j=0; j<tmp.length(); j++){
				if(j != i){
					for(int k=0; k<tmp.length(); k++){
						if(k !=j && k!=i){
							for(int l=0; l<tmp.length(); l++){
								if(l!=k && l!=j && l!=i){
									for(int m=0; m<tmp.length(); m++){
										if(m!=l && m!=k && m!=j && m!=i){
											System.out.println(tmp.charAt(i)+""+tmp.charAt(j)+""+
																tmp.charAt(k)+""+tmp.charAt(l)+
																""+tmp.charAt(m));
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
