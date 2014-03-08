import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Lotto {

	public static void print(int[] tmp){
		for(int i=0; i<tmp.length-5; i++){
			for(int j=i+1; j<tmp.length-4; j++){
				for(int k=j+1; k<tmp.length-3; k++){
					for(int l=k+1; l<tmp.length-2; l++){
						for(int m=l+1; m<tmp.length-1; m++){
							for(int n=m+1; n<tmp.length; n++){
								System.out.println(tmp[i]+" "+tmp[j]+" "+tmp[k]+" "
												+tmp[l]+" "+tmp[m]+" "+tmp[n]);
							}
							
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int[] blck ;
		int length;
		while(!tmp.equals("0")){
			tmp +="  ";
			length = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
			tmp = tmp.substring(tmp.indexOf(" ")+1);
			blck = new int[length];
			for(int i=0; i<blck.length; i++){
				blck[i] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
				tmp = tmp.substring(tmp.indexOf(" ")+1);
			}
			print(blck);
			tmp = read.readLine();
			if(!tmp.equals("0"))
				System.out.println();
		}
	}

}
