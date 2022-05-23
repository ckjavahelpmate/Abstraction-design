package Abstraction;

public class Empty {
	public static void main(String[] args) {

		
		int num = 5789 ;
		
		while ( num > 0 ) {
			
			int last = num % 10 ;
			
			System.out.println( last );
			
			num = num / 10 ;
			
		}

		
	}

}
