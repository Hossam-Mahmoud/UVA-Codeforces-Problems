

public class EllysXors {
	
	public static long getXor(long L, long R){
		long res;
		long first = L;
		if(L%2 != 0)
			first = L+1;
		long second = R;
		if(R%2 != 1)
			second = R-1;
		long pairs = (second-first+1)/2;
		if(pairs%2 == 0)
			res = 0;
		else
			res =1;
		if(first != L)
			res ^= L;
		if(second != R)
			res ^= R;
		return res;
	}
}
