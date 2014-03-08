import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;


public class Ananagrams {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		Hashtable<Integer, String> list = new Hashtable<Integer, String>();
		String tmp = br.readLine()+" ";
		String word;
		while(!tmp.equals("# "))
		{
			while(tmp.length() != 0){
				word = tmp.substring(0,tmp.indexOf(" "));
				word = word.replace(" ", "");
				char[] cWord = word.toLowerCase().toCharArray();
				Arrays.sort(cWord);
				int hash = new String(cWord).hashCode();
				if(!ht.containsKey(hash)){
					ht.put(hash, word);
					list.put(hash, word);
				}else
				{
					list.remove(hash);
				}
				tmp = tmp.substring(tmp.indexOf(" ")+1);
			}
			tmp = br.readLine()+" ";
		}
		
		Collection<String> list2 = list.values();
		ArrayList<String> list3 = new ArrayList<String>(list2);
		Collections.sort(list3);
		for(String s : list3)
			System.out.println(s);
		
	}

}
