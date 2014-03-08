
public class CSR4 {
	private static int max=0;
	
	public static void maxSum(int[][] array, int row , int col, int sum){
		if((row == array.length-1)&& (col == array[row].length-1)){
			if(max == 0){
				max =sum;
			}else if(sum> max){
				max = sum;
			}
		}else{
			if((row+1)< array.length)
				maxSum(array, row+1, col, sum+array[row+1][col]);
			if((col+1)< array[row].length)
				maxSum(array, row, col+1,sum+array[row][col+1] );
		}
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		maxSum(arr, 0, 0, arr[0][0]);
		System.out.println(max);

	}

}
