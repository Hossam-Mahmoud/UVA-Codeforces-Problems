package div187;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BottlesA {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] bottle = new int[n+1];
		int x = n;
		boolean[] can_be_opened =  new boolean[n+1];
		String temp;
		for(int i=1; i<=n; i++)
		{
			temp = bf.readLine();
			bottle[i] = Integer.parseInt(temp.substring(temp.indexOf(" ")+1));
			if( i != bottle[i] && !can_be_opened[bottle[i]]){
				x--;
				can_be_opened[bottle[i]] = true;
			}
		}
		System.out.println(x);
		
		
	}

}
