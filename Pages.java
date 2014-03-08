import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pages {

	public static void print(int one, int two, int sheet){
		while(one-two >0){
			System.out.println("Sheet "+sheet+", front: "+one+", "+two);
			System.out.println("Sheet "+sheet+", back : "+(++two)+", "+(--one));
			sheet++;
			one--;
			two++;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int x = 0;
		while(!tmp.equals("0")){
			x = Integer.parseInt(tmp);
			System.out.println("Printing order for "+x+" pages:");
			
			if(x%4 == 3){
				if(x == 3){
					System.out.println("Sheet 1, front: Blank, 1");
					System.out.println("Sheet 1, back : 2, 3");
				}else{
					System.out.println("Sheet 1, front: Blank, 1");
					System.out.println("Sheet 1, back : 2, "+x);
					print(x-1,3,2);
				}
				
			}
			
			else if(x%4 == 2){
				System.out.println("Sheet 1, front: Blank, 1");
				System.out.println("Sheet 1, back : 2, Blank");
				if(x != 2)
					print(x,3,2);	
			}
			
			else if(x%4 == 1){
				if(x == 1){
					System.out.println("Sheet 1, front: Blank, 1");
				}else{
					System.out.println("Sheet 1, front: Blank, 1");
					System.out.println("Sheet 1, back : 2, Blank");
					System.out.println("Sheet 2, front: Blank, 3");
					System.out.println("Sheet 2, back : 4, "+x);
					print(x-1,5,3);
				}
			}
			
			else
				print(x,1,1);
			
			tmp = read.readLine();
		}		

	}

}
