import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class fiveOutForTwentyThree {
	static boolean found = false;
	static boolean[] visit;
	public static void doExp(int res, int[] arr, int num){
		if( num == 5 ){
			if(res == 23 && !found){
				System.out.println("Possible");
				found = true;
			}
			
		}else {
			for(int i=0; i<5; i++){
				if(!visit[i]){
					visit[i] = true;
					doExp(res+arr[i],arr,num+1);
					doExp(res-arr[i],arr,num+1);
					doExp(res*arr[i],arr,num+1);
					visit[i] = false;
				}
			}	
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		String tmp = read.readLine();
		int[] nums = new int[5];
		
		while(! tmp.equals("0 0 0 0 0")){
			visit = new boolean[5];
			tmp+=" ";
			for(int i=0; i<5; i++){
				nums[i] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
				tmp = tmp.substring(tmp.indexOf(" ")+1);
			}
			found = false;
			doExp(0, nums, 0);
			if(!found)
				System.out.println("Impossible");
			tmp = read.readLine();
		}
	}
}
