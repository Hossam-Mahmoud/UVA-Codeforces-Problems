import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HamingDistance {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(read.readLine());
		StringBuilder bld = new StringBuilder();
		StringBuilder bin = new StringBuilder();
		String tmp;
		while(cases >0){
			read.readLine();
			tmp = read.readLine();
			int n = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
			int h = Integer.parseInt(tmp.substring(tmp.indexOf(" ")+1));
			int max = 1<<n;
			int count = 0;
			for(int i=0; i<max; i++){
				count =0;
				bin.delete(0, bin.length());
				for(int j=n-1; j>-1; j--){
					if((i&(1<<j)) != 0){
						count++;
						bin.append("1");
					}else
						bin.append("0");
				}
				if(count == h)
					bld.append(bin+"\n");
			}
			cases--;
			if(cases == 0)
				break;
			bld.append("\n");
		}
		System.out.print(bld);
	}

}
