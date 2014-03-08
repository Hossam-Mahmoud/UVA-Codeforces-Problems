import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recycling {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int[] st = new int[3];
		int[] nd = new int[3];
		int[] rd = new int[3];
		int[] case1 = new int[3];
		int[] case2 = new int[3];
		int[] case3 = new int[3];
		int moves,min,counter;
		char[] res = new char[3] ;
		while(tmp != null ){
			min=(int) Math.pow(2, 31);
			tmp +="  ";
			counter=0;
			String[] all =  {"z","z","z","z","z","z"};
			for(int i=0; i<3; i++){
				if(i==0){
					st[0] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
					st[1] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
					st[2] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
				}else if(i==1){
					nd[0] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
					nd[1] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
					nd[2] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
				}else if(i==2){
					rd[0] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
					rd[1] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
					rd[2] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
				}
			}
			case1[0]= st[1]+st[2];case1[1]= nd[1]+nd[2];case1[2]= rd[1]+rd[2];
			case2[0]= st[0]+st[2];case2[1]= nd[0]+nd[2];case2[2]= rd[0]+rd[2];
			case3[0]= st[0]+st[1];case3[1]= nd[0]+nd[1];case3[2]= rd[0]+rd[1];
			for(int i=0; i<case1.length; i++){
				for(int j=0; j<case2.length; j++){
					if(i!=j){
						for(int k=0; k<case3.length; k++){
							if(k!=j && k!=i){
								moves = case1[i]+case2[j]+case3[k];
								if(moves<=min){
									if(moves<min){
										min = moves;
										res[i]= 'B';res[j]='G';res[k]='C';
										for(int m=0; m<all.length; m++){
											all[m]="z";
										}
										counter=0;
										all[counter]= ""+res[0]+""+res[1]+""+res[2];
									}else if(moves == min){
										res[i]= 'B';res[j]='G';res[k]='C';
										counter++;
										all[counter]= ""+res[0]+""+res[1]+""+res[2];	
									}
								}
							}
						}
					}
				}
			}
			java.util.Arrays.sort(all);
			System.out.println(all[0]+" "+min);
		}
	}
}