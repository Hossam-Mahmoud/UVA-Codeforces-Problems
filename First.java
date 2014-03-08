import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class First {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int n = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
		int m = Integer.parseInt(tmp.substring(tmp.indexOf(" ")+1));
		String[] st = new String[n]; 
		for(int i=0; i <n; i++){
			st[i] = read.readLine();
		}
		int max=0;
		int counter=0;
		int save=0;
		boolean indicator =false;
		for(int i=0; i< m; i++){
			max = 0;
			for(int j=0; j<n; j++){
				if(j==0){
					max = st[j].charAt(i);
					save = j;
				}else if(max < st[j].charAt(i) ){
					max = st[j].charAt(i);
					save = j;
					indicator = false;
				}else if(max == st[j].charAt(i) ){
					indicator = true;
					
				}
			}
			if(  st[save].charAt(st.length-1) != -1){
				counter++;
				st[save] += "-1";
			}
		}
		System.out.println(counter);
	}

}
