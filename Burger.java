import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Burger {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int ln = Integer.parseInt(read.readLine());
		while(ln !=0){
			String s = read.readLine();
			int dist = Integer.MAX_VALUE;
			int count=0;
			if(s.contains("Z"))
				dist=0;
			else{
				for(int i =0; i<s.length(); i++){
					if(s.charAt(i) == 'R' ){
						i++;
						count=1;
						while(i<s.length() && s.charAt(i) != 'D' && s.charAt(i) != 'R'){
							count++;
							i++;
						}
						if(i<s.length() && s.charAt(i) == 'D'){
							if(count<dist)
								dist = count;
						}
						i--;
					}
					else if( s.charAt(i) == 'D'){
						i++;
						count=1;
						while(i<s.length()&& s.charAt(i) != 'D' && s.charAt(i) != 'R'){
							count++;
							i++;
						}
						if(i<s.length() && s.charAt(i) == 'R'){
							if(count<dist)
								dist = count;
						}
						i--;
					}
				}
			}
			ln = Integer.parseInt(read.readLine());
			System.out.println(dist);
			/*if(ln !=0)
				System.out.println(dist);
			else
				System.out.print(dist);*/
		}

	}

}
