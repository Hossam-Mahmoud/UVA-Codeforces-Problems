import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class eightQueen {
	
	static int[] rows = new int[9];
	static int ro,co, solNum;
	
	public static boolean checkPlace(int newRow, int col){
		for(int prev=1; prev<col; prev++){
			if(rows[prev] == newRow || (Math.abs(col-prev)==Math.abs(rows[prev]-newRow))){
				return false;
			}
		}
		return true;
	}
	
	public static void backtrack(int col){
		for(int tryRow=1; tryRow<9; tryRow++){
			if(checkPlace(tryRow, col)){
				rows[col] = tryRow;
				if(col==8 && rows[co]==ro ){
					System.out.printf("%2d     ",++solNum);
					for(int i=1; i<9; i++){
						System.out.print(" "+rows[i]);
					}
					System.out.println();
				}else
					backtrack(col+1);
			}
		}
	}
	
	public static void main(String[] args)throws IOException {
		int numOfLines;
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		numOfLines = Integer.parseInt(read.readLine());
		read.readLine();
		while(numOfLines >0){
			String line = read.readLine();
			ro = Integer.parseInt(line.substring(0, line.indexOf(" ")));
			co = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			solNum=0;
			for(int i=1; i<9; i++){
				rows[i]=0;
			}
			System.out.println("SOLN       COLUMN");
			System.out.println(" #      1 2 3 4 5 6 7 8\n");
			backtrack(1);
			numOfLines--;
			if(numOfLines==0){
				break;
			}else{
				System.out.println();
				read.readLine();
			}
		}
	}
}
