import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;


public class Anagrams {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		String tmp = br.readLine();
		Hashtable<Integer, ArrayList<Integer> > ht = new Hashtable<Integer, ArrayList<Integer> >();
		ArrayList< ArrayList<String> > list = new ArrayList<ArrayList<String> >();
		while(cases-- > 0)
		{
			ht.clear();
			list.clear();
			tmp = br.readLine();
			ArrayList<String> toSort = new ArrayList<String>();
			while(tmp !=null && tmp.length() !=0 )
			{
				toSort.add(tmp);
				ArrayList<String> newList = new ArrayList<String>();
				list.add(newList);
				tmp = br.readLine();
			}
			String[] to_sort = new String[toSort.size()];
			to_sort = toSort.toArray(to_sort);
			Arrays.sort(to_sort);
			for(int i=0;i<to_sort.length; i++)
			{
				
				char[] tmp2 = to_sort[i].replace(" ", "").toCharArray();
				Arrays.sort(tmp2);
				int hashcode = new String(tmp2).hashCode();
				if( ht.containsKey(hashcode) )
				{
					ArrayList<Integer> returned = ht.get(hashcode);
					for(Integer index : returned)
						list.get(index).add(to_sort[i]);
					
					returned.add(i);
					ht.put(hashcode, returned);
					
				}else
				{
					ArrayList<Integer> to_add = new ArrayList<Integer>();
					to_add.add(i);
					ht.put(hashcode, to_add);
				}
			}
			for(int i=0; i<list.size(); i++)
			{
				for(String st : list.get(i))
				{
					System.out.println(to_sort[i]+" = "+st);
				}
			}
			if( cases !=0 )
				System.out.println();
		}
	}

}
