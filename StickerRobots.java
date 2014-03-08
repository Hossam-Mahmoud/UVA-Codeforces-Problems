import java.io.BufferedReader;
import java.io.InputStreamReader;


public class StickerRobots {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine()+" ";
		int N, M, S;
		char[][] map;
		char[] sequence;
		int dx,dy;
		int x,y,stickers;
		while(!tmp.equals("0 0 0 "))
		{
			dx =0;
			dy =0;
			y = 0;
			x = 0;
			stickers = 0;
			N = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
			tmp = tmp.substring(tmp.indexOf(" ")+1);
			M = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
			tmp = tmp.substring(tmp.indexOf(" ")+1);
			S = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
			map = new char[N][M];
			for(int i=0; i<N ; i++){
				map[i] = br.readLine().toCharArray();
				for(int j=0; j<M; j++)
				{
					if(map[i][j] == 'N')
					{
						x = j;
						y = i;
						map[i][j] = '.';
						dx = 0;
						dy = -1;
					}else if(map[i][j] == 'S')
					{
						x = j;
						y = i;
						map[i][j] = '.';
						dx = 0;
						dy = +1;
					}else if(map[i][j] == 'L')
					{
						x = j;
						y = i;
						map[i][j] = '.';
						dx = +1;
						dy = 0;
					}else if(map[i][j] == 'O')
					{
						x = j;
						y = i;
						map[i][j] = '.';
						dx = -1;
						dy = 0;
					}
				}
			}
			
			sequence = br.readLine().toCharArray();
			for(int i=0; i<S; i++)
			{
				if(sequence[i] == 'D')
				{
					int swap = dy*-1;
					dy = dx;
					dx = swap;
					
				}else if(sequence[i] == 'E')
				{
					int swap = dx*-1;
					dx = dy;
					dy = swap;
				}else if(sequence[i] == 'F')
				{
					if(y+dy >-1 && y+dy< N && x+dx>-1 && x+dx< M)
					{
						if(map[y+dy][x+dx] == '.')
						{
							y +=dy;
							x +=dx;
						}else if(map[y+dy][x+dx] == '*')
						{
							y +=dy;
							x +=dx;
							map[y][x]='.';
							stickers++;
						}
					}
				}
			}
			System.out.println(stickers);
			tmp = br.readLine()+" ";
		}
	}

}
