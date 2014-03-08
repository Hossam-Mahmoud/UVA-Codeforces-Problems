import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CD {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		StringBuilder build = new StringBuilder();
		while (! tmp.equals("")){
			tmp += " ";
			int mins = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
			tmp = tmp.substring(tmp.indexOf(" ")+1);
			int nums = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
			tmp = tmp.substring(tmp.indexOf(" ")+1);
			int[] numbers = new int[nums];
			for(int i=0; i<nums; i++){
				numbers[i] = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
				tmp = tmp.substring(tmp.indexOf(" ")+1);
			}
			int max = 1<<nums;
			int ress =0;
			int maxy = Integer.MIN_VALUE;
			int finall = 0;
			for(int i=max-1; i>0; i--){
				ress =0;
				for(int j=0; j <nums ; j++){
					if((i&(1<<j)) == (1<<j))
						ress += numbers[j];
				}
				if(ress >=maxy && ress<= mins ){
					maxy = ress;
					finall = i;
					if(ress == mins || i ==max-1)
						break;
				}
			}
			for(int j=0; j <nums ; j++){
				if((finall&(1<<j)) == (1<<j))
					build.append(numbers[j]+" ");
			}
			build.append("sum:"+maxy+"\n");
			/*System.out.println(finall+"sum:"+maxy);*/
			tmp = read.readLine();
		}
		System.out.print(build);
	}

}
