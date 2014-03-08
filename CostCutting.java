import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CostCutting {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int counter = n;
		int max, min, total;
		String tmp;
		int salary;
		while(n-- >0)
		{
			tmp = bf.readLine()+" ";
			max=Integer.MIN_VALUE;
			min=Integer.MAX_VALUE;
			total=0;
			for(int i=0; i<3; i++)
			{
				salary = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
				tmp = tmp.substring(tmp.indexOf(" ")+1);
				
				if(max < salary)
					max = salary;
				if(min > salary)
					min = salary;
				total +=salary;
			}
			System.out.println("Case "+(counter-n)+": "+ (total-min-max));
			
		}
	}

}
