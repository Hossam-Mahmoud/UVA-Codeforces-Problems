import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class Recycling {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String tmp = read.readLine();
		String col = "roygb";
		while(!tmp.equals("#")){
			ArrayList<HashMap<Character, Character>> cities = new ArrayList<HashMap<Character,Character>>();
			while(tmp.charAt(0) != 'e'){
				HashMap<Character, Character> city = new HashMap<Character, Character>();
				for(int i=0; i<tmp.length(); i=i+4){
					city.put(tmp.charAt(i), tmp.charAt(i+2));
				}
				cities.add(city);
				tmp = read.readLine();
			}
			int changes = Integer.MAX_VALUE;
			int city = 0;
			for(int i=0; i<cities.size(); i++){
				int count=0;
				for(int j=0; j<cities.size(); j++){
					if(i != j){
						for(int k=0; k<5; k++){
							if(cities.get(i).get(col.charAt(k)) != cities.get(j).get(col.charAt(k))){
								count++;
							}
						}
					}
				}
				if(count < changes){
					changes = count;
					city = i+1;
				}
			}
			System.out.println(city);
			tmp = read.readLine();
		}
	}

}
