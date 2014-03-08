import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class TreasureMap {
	public static int max = Integer.MIN_VALUE;
	public static void foundMax(ArrayList<ArrayList<Integer>> map, int row, int column, int sum){
		if(row == map.size()){
			if(sum>max)
				max = sum;
		}
		else{
			foundMax(map, row+1, column, sum+map.get(row).get(column));
			foundMax(map, row+1, column+1, sum+map.get(row).get(column));
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
		String tmp = read.readLine()+" ";
		while(! tmp.equals(" ")){
			ArrayList<Integer> row = new ArrayList<Integer>();
			while(tmp.length() != 0){
				row.add(Integer.parseInt(tmp.substring(0,tmp.indexOf(" "))));
				tmp = tmp.substring(tmp.indexOf(" ")+1);
			}
			map.add(row);
			tmp = read.readLine()+" ";
		}
		foundMax(map, 0, 0, 0);
		System.out.println(max);
		
	}

}
