import java.util.Scanner;


public class Bicycle {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int[] front = new int[n];
		for(int i=0; i<n; i++)
			front[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] rear = new int[m];
		for(int i=0; i<m; i++){
			rear[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(rear[i]%front[j] == 0){
					if(rear[i]/ front[j] > max){
						count =1;
						max = rear[i]/front[j];
					}else if(rear[i]/ front[j] == max )
						count++;
				}	
			}
		}
		System.out.println(count);
	}
}
