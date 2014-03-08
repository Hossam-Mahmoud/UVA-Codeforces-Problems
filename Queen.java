import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Queen {
	public static void main(String[] args)throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String nw = buff.readLine();
		while(nw.equals("0 0 0 0")== false){
			int x1,y1,x2,y2;
			x1 = Integer.parseInt(""+nw.charAt(0));
			y1 = Integer.parseInt(""+nw.charAt(2));
			x2 = Integer.parseInt(""+nw.charAt(4));
			y2 = Integer.parseInt(""+nw.charAt(6));
			if(x1 == x2 && y1 == y2){
				System.out.println(0);
			}else if(x1 == x2 || y1 == y2 || Math.abs(x1-x2)==Math.abs(y1-y2)){
				System.out.println(1);
			}else{
				System.out.println(2);
			}
			nw = buff.readLine();
		}
	}
}
