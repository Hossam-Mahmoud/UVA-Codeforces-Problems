import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff = new BufferedReader( new InputStreamReader(System.in));
		int n = Integer.parseInt(buff.readLine());
		String x = buff.readLine()+" ";
		int[] table = new int[n+1];
		int i=1;
		while(n != 0){
			int first = Integer.parseInt(x.substring(0, x.indexOf(" ")));
			x = x.substring((x.indexOf(" ")+1));
			table[first]= i;
			i++;
			n--;
		}
		for(int j=1; j<table.length ; j++){
			System.out.print(table[j]+" ");
		}
	}

}
