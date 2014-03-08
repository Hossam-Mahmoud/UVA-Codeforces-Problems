import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Nlogonia {

	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int K, N, M, x, y;
		String tmp;
		K = Integer.parseInt(bf.readLine());
		while (K != 0)
		{
			tmp = bf.readLine();
			N = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
			M = Integer.parseInt(tmp.substring(tmp.indexOf(" ")+1));
			for(int i=0; i<K; i++)
			{
				tmp = bf.readLine();
				x = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
				y = Integer.parseInt(tmp.substring(tmp.indexOf(" ")+1));
				x -= N;
				y -= M;
				if( x == 0 || y == 0)
					System.out.println("divisa");
				else if( x < 0 && y < 0)
					System.out.println("SO");
				else if(x<0 && y > 0)
					System.out.println("NO");
				else if(x>0 && y<0)
					System.out.println("SE");
				else if(x>0 && y>0)
					System.out.println("NE");
			}
			K = Integer.parseInt(bf.readLine());
		}
		
	}

}
