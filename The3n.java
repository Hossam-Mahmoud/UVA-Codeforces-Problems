import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class The3n {
	public static void main(String[] args)throws IOException {
		BufferedReader koko = new BufferedReader(new InputStreamReader(System.in));
		String x = koko.readLine();
		while(x != null){
			int i = Integer.parseInt(x.substring(0,x.indexOf(" ")));
			int j = Integer.parseInt(x.substring(x.indexOf(" ")+1));
			int count = 2;
			while(j != i){
				if(j%2 != 0){
					j = (3*j)+1;
				}else{
					j = j/2;
				}
				count++;
			}
			System.out.println(i+" "+j+" "+count);
			x = koko.readLine();
		}
	}

}
