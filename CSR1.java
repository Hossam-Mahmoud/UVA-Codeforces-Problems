public class CSR1 {

	public static void main(String check, String print , int n){
		if(print.length() == n)
			System.out.println(print);
		else{
			for(int i=0; i<check.length() ; i++){
				if(!print.contains(""+check.charAt(i)))
					main(check, print+check.charAt(i), n);
				
			}
		}
			
	}
	
	public static void main(String[] args){
		main("abc","", 3);
	}
	
	

}