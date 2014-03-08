import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;


//1103
public class AncientMessages {
	
	
	
	public static void main(String[] args) throws IOException {
		Hashtable<Character, String> ht = new Hashtable<Character, String>();
		ht.put('0', "0000");
		ht.put('1', "0001");
		ht.put('2', "0010");
		ht.put('3', "0011");
		ht.put('4', "0100");
		ht.put('5', "0101");
		ht.put('6', "0110");
		ht.put('7', "0111");
		ht.put('8', "1000");
		ht.put('9', "1001");
		ht.put('a', "1010");
		ht.put('b', "1011");
		ht.put('c', "1100");
		ht.put('d', "1101");
		ht.put('e', "1110");
		ht.put('f', "1111");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] image;
		String tmp = br.readLine();
		String tmp2 = "";
		int H,W;
		int tmpI, tmpJ;
		int tmpI2, tmpJ2;
		int cases = 1;
		Queue<Integer> myQ = new LinkedList<Integer>();
		Queue<Integer> tempQ = new LinkedList<Integer>();
		while(! tmp.equals("0 0"))
		{
			H = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
			W = Integer.parseInt(tmp.substring(tmp.indexOf(" ")+1))*4;
			image = new char[H][];
			
			//start building image
			for(int i=0; i<H; i++)
			{
				image[i] = br.readLine().toCharArray();
				tmp2 = "";
				for(int j=0; j<image[i].length; j++){
					tmp2 += ht.get(image[i][j]);
				}
				//System.out.println(tmp2);
				image[i] = tmp2.toCharArray();
			}
			//end of building image
			
			//clear the white background
			myQ.clear();
			for(int i=0; i<H; i++)
			{
				if(i == 0)
				{
					for(int j=0; j<W; j++)
					{
						if(image[0][j] == '0')
						{
							myQ.add(0);
							myQ.add(j);
							image[0][j] = '2';
						}
						
					}
				}
				else if(i == H-1)
				{
					for(int j=0; j<W; j++)
					{
						if(image[H-1][j] == '0')
						{
							myQ.add(H-1);
							myQ.add(j);
							image[H-1][j] = '2';
						}
						
					}
				}
				if(image[i][0] == '0')
				{
					myQ.add(i);
					myQ.add(0);
					image[i][0] = '2';
				}if(image[i][W-1] == '0')
				{
					myQ.add(i);
					myQ.add(W-1);
					image[i][W-1] = '2';
				}
			}
			while(! myQ.isEmpty())
			{
				tmpI = myQ.poll();
				tmpJ = myQ.poll();
				
				if(tmpI+1< H && image[tmpI+1][tmpJ] == '0'){
					image[tmpI+1][tmpJ] = '2';
					myQ.add(tmpI+1);
					myQ.add(tmpJ);
				}
				if(tmpI-1>-1 && image[tmpI-1][tmpJ] == '0'){
					image[tmpI-1][tmpJ] = '2';
					myQ.add(tmpI-1);
					myQ.add(tmpJ);
				}
				if(tmpJ+1<W && image[tmpI][tmpJ+1] == '0'){
					image[tmpI][tmpJ+1] = '2';
					myQ.add(tmpI);
					myQ.add(tmpJ+1);
				}
				if(tmpJ-1>-1 && image[tmpI][tmpJ-1] == '0'){
					image[tmpI][tmpJ-1] = '2';
					myQ.add(tmpI);
					myQ.add(tmpJ-1);
				}
			}
			//end clearing the background
			
			/*for(int i=0; i<H; i++)
			{
				System.out.println(image[i]);
			}*/
			
			//start finding connected components with white holes
			int holes = 0;
			String code = "";
			for(int i=0; i<H; i++)
			{
				for(int j=0; j<image[i].length; j++)
				{
					if(image[i][j] == '1')
					{
						holes =0;
						myQ.add(i);
						myQ.add(j);
						image[i][j] = '3';
						while(! myQ.isEmpty())
						{
							tmpI = myQ.poll();
							tmpJ = myQ.poll();
							
							//image[tmpI][tmpJ] = '3';
							if(tmpI+1<H && image[tmpI+1][tmpJ] == '1'){
								image[tmpI+1][tmpJ] = '3';
								myQ.add(tmpI+1);
								myQ.add(tmpJ);
							}else if(tmpI+1<H && image[tmpI+1][tmpJ] == '0')
							{
								holes +=1;
								tempQ.add(tmpI+1);
								tempQ.add(tmpJ);
								image[tmpI+1][tmpJ] = '3';
								while(! tempQ.isEmpty())
								{
									tmpI2 = tempQ.poll();
									tmpJ2 = tempQ.poll();
									//image[tmpI2][tmpJ2] = '3';
									if(tmpI2+1 < H && image[tmpI2+1][tmpJ2] == '0'){
										image[tmpI2+1][tmpJ2] = '3';
										tempQ.add(tmpI2+1);
										tempQ.add(tmpJ2);
									}if(tmpI2-1 > -1 && image[tmpI2-1][tmpJ2] == '0'){
										image[tmpI2-1][tmpJ2] = '3';
										tempQ.add(tmpI2-1);
										tempQ.add(tmpJ2);
									}
									if(tmpJ2+1 < W && image[tmpI2][tmpJ2+1] == '0'){
										image[tmpI2][tmpJ2+1] = '3';
										tempQ.add(tmpI2);
										tempQ.add(tmpJ2+1);
									}
									if(tmpJ2-1 > -1 && image[tmpI2][tmpJ2-1] == '0'){
										image[tmpI2][tmpJ2-1] = '3';
										tempQ.add(tmpI2);
										tempQ.add(tmpJ2-1);
									}	
								}
							}
							if(tmpI-1 > -1 && image[tmpI-1][tmpJ] == '1'){
								image[tmpI-1][tmpJ] = '3';
								myQ.add(tmpI-1);
								myQ.add(tmpJ);
							}
							else if(tmpI-1 > -1 && image[tmpI-1][tmpJ] == '0')
							{
								holes +=1;
								tempQ.add(tmpI-1);
								tempQ.add(tmpJ);
								image[tmpI-1][tmpJ] = '3';
								while(! tempQ.isEmpty())
								{
									tmpI2 = tempQ.poll();
									tmpJ2 = tempQ.poll();
									if(tmpI2+1<H && image[tmpI2+1][tmpJ2] == '0'){
										tempQ.add(tmpI2+1);
										tempQ.add(tmpJ2);
										image[tmpI2+1][tmpJ2] = '3';
									}if(tmpI2-1>-1 && image[tmpI2-1][tmpJ2] == '0'){
										tempQ.add(tmpI2-1);
										tempQ.add(tmpJ2);
										image[tmpI2-1][tmpJ2] = '3';
									}
									if(tmpJ2+1<W && image[tmpI2][tmpJ2+1] == '0'){
										tempQ.add(tmpI2);
										tempQ.add(tmpJ2+1);
										image[tmpI2][tmpJ2+1] = '3';
									}
									if(tmpJ2-1>-1 && image[tmpI2][tmpJ2-1] == '0'){
										tempQ.add(tmpI2);
										tempQ.add(tmpJ2-1);
										image[tmpI2][tmpJ2-1] = '3';
									}	
								}
							}
							if(tmpJ+1<W && image[tmpI][tmpJ+1] == '1'){
								myQ.add(tmpI);
								myQ.add(tmpJ+1);
								image[tmpI][tmpJ+1] = '3';
							}else if(tmpJ+1<W && image[tmpI][tmpJ+1] == '0')
							{
								holes +=1;
								tempQ.add(tmpI);
								tempQ.add(tmpJ+1);
								image[tmpI][tmpJ+1] = '3';
								while(! tempQ.isEmpty())
								{
									tmpI2 = tempQ.poll();
									tmpJ2 = tempQ.poll();
									//image[tmpI2][tmpJ2] = '3';
									if(tmpI2+1<H && image[tmpI2+1][tmpJ2] == '0'){
										tempQ.add(tmpI2+1);
										tempQ.add(tmpJ2);
										image[tmpI2+1][tmpJ2] = '3';
									}if(tmpI2-1>-1 && image[tmpI2-1][tmpJ2] == '0'){
										tempQ.add(tmpI2-1);
										tempQ.add(tmpJ2);
										image[tmpI2-1][tmpJ2] = '3';
									}
									if(tmpJ2+1<W && image[tmpI2][tmpJ2+1] == '0'){
										tempQ.add(tmpI2);
										tempQ.add(tmpJ2+1);
										image[tmpI2][tmpJ2+1] = '3';
									}
									if(tmpJ2-1>-1 && image[tmpI2][tmpJ2-1] == '0'){
										tempQ.add(tmpI2);
										tempQ.add(tmpJ2-1);
										image[tmpI2][tmpJ2-1] = '3';
									}	
								}
							}
							if(tmpJ-1>-1 && image[tmpI][tmpJ-1] == '1'){
								myQ.add(tmpI);
								myQ.add(tmpJ-1);
								image[tmpI][tmpJ-1] = '3';
							}else if(tmpJ-1>-1 && image[tmpI][tmpJ-1] == '0')
							{
								holes +=1;
								tempQ.add(tmpI);
								tempQ.add(tmpJ-1);
								image[tmpI][tmpJ-1] = '3';
								while(! tempQ.isEmpty())
								{
									tmpI2 = tempQ.poll();
									tmpJ2 = tempQ.poll();
									//image[tmpI2][tmpJ2] = '3';
									if(tmpI2+1<H && image[tmpI2+1][tmpJ2] == '0'){
										tempQ.add(tmpI2+1);
										tempQ.add(tmpJ2);
										image[tmpI2+1][tmpJ2] = '3';
									}if(tmpI2-1>-1 && image[tmpI2-1][tmpJ2] == '0'){
										tempQ.add(tmpI2-1);
										tempQ.add(tmpJ2);
										image[tmpI2-1][tmpJ2] = '3';
									}
									if(tmpJ2+1<W && image[tmpI2][tmpJ2+1] == '0'){
										tempQ.add(tmpI2);
										tempQ.add(tmpJ2+1);
										image[tmpI2][tmpJ2+1] = '3';
									}
									if(tmpJ2-1>-1 && image[tmpI2][tmpJ2-1] == '0'){
										tempQ.add(tmpI2);
										tempQ.add(tmpJ2-1);
										image[tmpI2][tmpJ2-1] = '3';
									}	
								}
							}	
						}
						
						if(holes == 0)
							code += "W";
						else if(holes == 1)
							code += "A";
						else if(holes == 2)
							code += "K";
						else if(holes == 3)
							code += "J";
						else if(holes == 4)
							code += "S";
						else if(holes == 5)
							code += "D";
					}
					
				}
			}
			//end of finding connected components with white edges;
			char[] pntr = code.toCharArray();
			Arrays.sort(pntr);
			System.out.println("Case "+cases+": "+new String(pntr));
			cases++;
			tmp = br.readLine();
		}
	}

}
