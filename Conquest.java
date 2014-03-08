import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Conquest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(read.readLine());
		String[] blk = new String[x];
		String tmp ;
		for(int i=0; i<x; i++){
			tmp = read.readLine();
			blk[i] = tmp.substring(0, tmp.indexOf(" "));
			
		}
		java.util.Arrays.sort(blk);
		int k=0;
		while(k<blk.length){
			int cont=1;
			String nw = blk[k];
			while(k+1<blk.length && nw.equals(blk[k+1])){
				cont++;
				k++;
			}
			System.out.println(nw+" "+cont);
			k++;
		}
	}

}
