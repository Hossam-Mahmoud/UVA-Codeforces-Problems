import java.io.*;
public class SmsTyping {
	public static void main(String[] args)throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(buff.readLine());
		int d = 1;
		while(d <= x ){
			String tmp = buff.readLine();
			int first = tmp.length();
			int counter =0;
			tmp = tmp.replace("a", "");
			tmp = tmp.replace("d", "");
			tmp = tmp.replace("g", "");
			tmp = tmp.replace("j", "");
			tmp = tmp.replace("m", "");
			tmp = tmp.replace("p", "");
			tmp = tmp.replace("t", "");
			tmp = tmp.replace("w", "");
			tmp = tmp.replace(" ", "");
			counter += first - tmp.length();
			first = tmp.length();
			tmp = tmp.replace("b", "");
			tmp = tmp.replace("e", "");
			tmp = tmp.replace("h", "");
			tmp = tmp.replace("k", "");
			tmp = tmp.replace("n", "");
			tmp = tmp.replace("q", "");
			tmp = tmp.replace("u", "");
			tmp = tmp.replace("x", "");
			counter += (first - tmp.length())*2;
			first = tmp.length();
			tmp = tmp.replace("c", "");
			tmp = tmp.replace("f", "");
			tmp = tmp.replace("i", "");
			tmp = tmp.replace("l", "");
			tmp = tmp.replace("o", "");
			tmp = tmp.replace("r", "");
			tmp = tmp.replace("v", "");
			tmp = tmp.replace("y", "");
			counter += (first - tmp.length())*3;
			first = tmp.length();
			tmp = tmp.replace("s", "");
			tmp = tmp.replace("z", "");
			counter += (first - tmp.length())*4;
			System.out.println("Case #"+d+": "+counter);
			d++;
		}
	}
}
