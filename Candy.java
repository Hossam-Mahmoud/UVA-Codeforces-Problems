import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Candy {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(read.readLine());
		int count =1;
		StringBuilder output = new StringBuilder();
		while(count<= cases){
			int N = Integer.parseInt(read.readLine());
			int[] candies = new int[N];
			String tmp = read.readLine()+" ";
			for(int i=0; i<N; i++){
				candies[i] = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
				tmp = tmp.substring(tmp.indexOf(" ")+1);
			}
			int subsets = (1<<N);
			int least = subsets/2;
			int Sean= 0;
			int Patrick = 0;
			
			int maxCandy=-1;
			for(int i=subsets-2; i>=least; i--){
				Sean =0;
				Patrick =0;
				for(int j=0; j<N; j++){
					if((i&(1<<j)) !=0)
						Sean ^= candies[j];
					else
						Patrick ^= candies[j];
				}
				if(Sean == Patrick ){
					Sean=0;
					Patrick=0;
					for(int j=0; j<N; j++){
						if((i&(1<<j)) != 0)
							Sean += candies[j];
						else
							Patrick += candies[j];
					}
					if(Sean>Patrick && Sean > maxCandy)
						maxCandy = Sean;
					else if(Patrick > maxCandy)
						maxCandy = Patrick;
				}
			}
			if(maxCandy == -1)
				output.append("Case #"+count+": NO\n");
			else
				output.append("Case #"+count+": "+maxCandy+"\n");
			count++;
		}
		System.out.println(output);
	}

}
