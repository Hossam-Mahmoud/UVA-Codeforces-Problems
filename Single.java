import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Single {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(read.readLine());
		int count =1;
		StringBuilder bld = new StringBuilder();
		while(count<= cases){
			int N = Integer.parseInt(read.readLine());			
			String tmp = read.readLine()+" ";
			int single=0;
			for(int i=0; i<N; i++){
				single ^= Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
				tmp = tmp.substring(tmp.indexOf(" ")+1);
			}
			bld.append("Case #"+count+": "+single+"\n");
			count++;
		}
		System.out.println(bld);
	}

}
