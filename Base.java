import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Base {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(read.readLine());
		int[] cost = new int[36];
		String tmp;
		int queries;
		int num;
		int caseN=1;
		ArrayList<Integer> res = new ArrayList<Integer>();
		while(x>0){
			System.out.println("Case "+caseN+":");
			queries =0;
			tmp = read.readLine()+" "+read.readLine()+" "+read.readLine()+" "+read.readLine()+"  ";
			for(int i=0; i<36; i++){
				cost[i] = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
				tmp = tmp.substring(tmp.indexOf(" ")+1);
			}
			queries = Integer.parseInt(read.readLine());
			for(int i=0; i<queries; i++){
				num = Integer.parseInt(read.readLine());
				int temp ;
				int prevCost=0;
				for(int base=2; base<37; base++){
					int costs=0;
					temp = num;
					
					while(temp !=0){
						costs += cost[temp%base];
						temp = temp/base;
					}
					
					if(base==2 || costs< prevCost){
						prevCost = costs;
						res.clear();
						res.add(base);
					}else if(costs == prevCost){
						res.add(base);
					}
				}
				System.out.print("Cheapest base(s) for number "+num+": ");
				for(int k=0; k<res.size(); k++){
					System.out.print(res.get(k));
					if(k+1 != res.size())
						System.out.print(" ");
				}
				System.out.println();
			}
			
			x--;
			if(x !=0)
				System.out.println();
			caseN++;
		}
	}

}
