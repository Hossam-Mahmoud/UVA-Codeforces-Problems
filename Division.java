import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division {
	
	public static boolean check(String st, String nd){
		boolean[] mask ={false,false,false,false,false,false,false,false,false,false};
		boolean isDiff = true;
		for(int i=0; i<st.length(); i++){
			int digit = st.charAt(i)-'0';
			if(mask[digit] == false){
				mask[digit] = true;
			}else{
				isDiff = false;
				return isDiff;
			}
		}
		for(int j=0; j<nd.length(); j++){
			int digit = nd.charAt(j)-'0';
			if(mask[digit] == false){
				mask[digit] = true;
			}else{
				isDiff = false;
				return isDiff;
			}
		}
		return isDiff;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(read.readLine());;
		int upperDenum =0;
		int num = 0;
		while(n != 0){
			upperDenum = 98765/n;
			boolean sol = false;
			int denum=1234;
			while(denum<=upperDenum){
				num = denum*n;
				String st =""+num;
				String nd =""+denum;
				if(nd.length()==4 && st.length()==5){
					if(check(st, "0"+nd)== true){
						System.out.println(st+" / 0"+nd+" = "+n);
						sol =true;
					}
				}else if(nd.length()==5 && st.length()==5){
					if(check(st, nd)== true){
						System.out.println(st+" / "+nd+" = "+n);
						sol = true;
					}
				}
				denum++;
			}
			if(!sol){
				System.out.println("There are no solutions for "+n+".");
			}
			n = Integer.parseInt(read.readLine());
			if(n !=0){
				System.out.println();
			}
		}
	}
}
