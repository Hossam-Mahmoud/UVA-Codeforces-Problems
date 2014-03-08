import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sultan {
	
	public static int[] rows = new int[8];
	public static int soln=0;

	public static boolean checkPlace(int col , int newRow){
		for(int prev=0; prev<col; prev++){
			if(rows[prev] == newRow || (Math.abs(col-prev)==Math.abs(rows[prev]-newRow)))
				return false;
		}
		return true;
	}
	
	public static int getMax(int[][] board, int max, int col){
		for(int rw=0; rw<8; rw++){
			if(checkPlace(col, rw)){
				rows[col] = rw;
				if(col==7){
					max += board[rw][col];
					if(max>=soln){
						soln = max;
					}
				}else{
					getMax(board, max+board[rw][col], col+1 );
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int n = Integer.parseInt(tmp);
		int[][] board = new int[8][8];
		while(n>0)
		{
			for(int i=0; i<8; i++){
				tmp = read.readLine()+" ";
				for(int j=0; j<8 ; j++){
					if(tmp.charAt(0) == ' ')
						tmp = tmp.substring(1);
					int x = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
					tmp = tmp.substring(tmp.indexOf(" ")+1);
					board[i][j] = x;
				}
			}
			getMax(board, 0, 0);
			String sol = ""+soln;
			for(int i= sol.length(); i<5; i++){
				sol = " "+sol;
			}
			System.out.println(sol);
			soln=0;
			n--;
		}

	}

}
