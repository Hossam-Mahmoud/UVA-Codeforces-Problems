import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Rooked {

	
	public static int getMax(String[] mp, int[] row, int max,int place){
		for(int col=0; col<mp.length; col++){
			if(mp[col].charAt(place) != 'X'){
				if(row[col] == place){
					
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(read.readLine());
		String[] map;
		while(x != 0){
			map = new String[x];
			for(int i=0; i<x; x++){
				map[i] = read.readLine();
			}
		}
		

	}

}
