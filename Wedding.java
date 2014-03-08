import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Wedding {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int T,R,H;
		int[][]TR,RH,HT;
		int min ;
		int newPrice;
		while(tmp != null){
			tmp+="  ";
			T = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
			tmp = tmp.substring(tmp.indexOf(" ")+1);
			R = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
			tmp = tmp.substring(tmp.indexOf(" ")+1);
			H = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
			tmp = tmp.substring(tmp.indexOf(" ")+1);
			TR = new int[T][R+1];
			RH = new int[R][H+1];
			HT = new int[H][T+1];
			//read process
			for(int i=0; i<T; i++){
				tmp = read.readLine()+"  ";
				for(int j=0; j<R+1; j++){
					TR[i][j]= Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
				}
			}
			for(int i=0; i<R; i++){
				tmp = read.readLine()+"  ";
				for(int j=0; j<H+1; j++){
					RH[i][j]= Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
				}
			}
			for(int i=0; i<H; i++){
				tmp = read.readLine()+"  ";
				for(int j=0; j<T+1; j++){
					HT[i][j]= Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
				}
			}
			//end read
			
			//get the answer
			HashMap<Integer, String> res = new HashMap<Integer, String>();
			min =0;
			newPrice =0;
			for(int i=0; i<TR.length; i++){
				for(int j=1;  j<TR[i].length; j++ ){
					if(TR[i][j] == 0){
						for(int k=1; k<RH[j-1].length; k++){
							if(RH[j-1][k] == 0){
								for(int l=1; l<HT[k-1].length; l++){
									if(HT[k-1][l]==0 && (l-1)==i){
										newPrice = (TR[i][0]+RH[j-1][0]+HT[k-1][0]);
										res.put(newPrice,(""+i+" "+(j-1)+" "+(k-1)));
										if(newPrice<= min || min == 0)
											min = newPrice;
									}
								}
							}
						}
					}
				}
			}
			
			if(res.isEmpty())
				System.out.println("Don't get married!");
			else
				System.out.println(res.get(min)+":"+min);
			
			
			tmp = read.readLine();
		}
	}

}
