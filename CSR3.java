
public class CSR3 {
	private static int count=0;

	public static void backTrack(boolean visit[][], int row, int column){
		if((row == visit.length-1) && (column == visit[row].length-1)){
			count++;
		}else{ 
			if((row+1)< visit.length)
				backTrack(visit, row+1, column);
			if((column+1)< visit[row].length)
				backTrack(visit, row, column+1);
		}
	}
	
	public static void main(String[] args) {
		boolean[][] tmp = new boolean[3][3];
		backTrack(tmp, 0, 0);
		System.out.println(count);

	}

}
