import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class PFast {
	
	public static int countOnes(int num, int n){
		int count=0;
		for(int j=0; j<n; j++){
			if((num&(1<<j)) != 0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int n = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
		int m = Integer.parseInt(tmp.substring(tmp.indexOf(" ")+1));
		String[] volunteers = new String[n];
		String[] pairs = new String[m*2];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<n; i++){
			volunteers[i] = read.readLine();
			map.put(volunteers[i], (1<<i));
		}
		for(int j=0; j<pairs.length ; j= j+2){
			tmp = read.readLine();
			pairs[j] = tmp.substring(0,tmp.indexOf(" "));
			pairs[j+1] = tmp.substring(tmp.indexOf(" ")+1);
		}
		int max = 1<<n;
		int answer = max-1;
		int numOfVol = n;
		int st;
		int nd;
		boolean takeIt = true;
		if(m != 0){
			numOfVol = -1;
			for(int i=max-1; i>0;i-- ){
				takeIt = true;
				for(int j=0; j<pairs.length; j=j+2){
					st = (i&map.get(pairs[j]));
					nd = (i&map.get(pairs[j+1]));
					if( st != 0 && nd !=0){
						takeIt = false;
						break;
					}
				}
				if(takeIt){
					int ones = countOnes(i, n);
					if(ones > numOfVol){
						numOfVol = ones;
						answer = i;
					}
				}
			}
		}
		String[] list = new String[numOfVol];
		int j=0;
		for(int i=0; i<n; i++){
			if((answer&(1<<i))!= 0)
				list[j++] = (volunteers[i]);
		}
		Arrays.sort(list);
		System.out.println(numOfVol);
		for(String temp : list){
			System.out.println(temp);
		}
		
	}

}
