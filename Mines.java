import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Mines {

	public static void print(String[] blk){
		
		for(int i=0; i<blk.length; i++){
			for(int j=0; j<blk[i].length(); j++){
				int count =0;
				if(blk[i].charAt(j)== '.'){
					if(i>0 && blk[i-1].charAt(j) == '*'){
						count++;
					}
					if(i>0 && j<blk[i].length()-1 && blk[i-1].charAt(j+1) == '*'){
						count++;
					}
					if(j<blk[i].length()-1 && blk[i].charAt(j+1) == '*'){
						count++;
					}
					if(i<blk.length-1 && j<blk[i].length()-1 && blk[i+1].charAt(j+1) == '*'){
						count++;
					}
					if(i<blk.length-1 && blk[i+1].charAt(j) == '*'){
						count++;
					}
					if(i<blk.length-1 && j>0 && blk[i+1].charAt(j-1) == '*'){
						count++;
					}
					if(j>0 && blk[i].charAt(j-1) == '*'){
						count++;
					}
					if(j>0 && i>0 && blk[i-1].charAt(j-1)=='*'){
						count++;
					}
					System.out.print(count);
				}else
					System.out.print('*');
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		int x,y;
		String[] block;
		int counter =1;
		while(!tmp.equals("0 0")){
			x = Integer.parseInt(tmp.substring(0,tmp.indexOf(" ")));
			y = Integer.parseInt(tmp.substring(tmp.indexOf(" ")+1));
			block = new String[x];
			for(int i=0; i<x; i++){
				block[i] = read.readLine();
			}
			System.out.println("Field #"+counter+":");
			print(block);
			tmp = read.readLine();
			if(!tmp.equals("0 0"))
				System.out.println();
			counter++;
		}
	}

}
