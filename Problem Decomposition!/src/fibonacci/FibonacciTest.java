package fibonacci;

import java.util.Scanner;

public class FibonacciTest {

	public static void main(String[] args) {

		int n ;
		System.out.println("\nEnter the number upto" +
				" which you want the fibonacci series");
		Scanner input = new Scanner( System.in ) ;
		n = input.nextInt() ;
		System.out.println("\nThe fibonacci numbers upto " + n + " are :" ) ;

		for( int i = 1 ; i <= n ; i++){
			System.out.println( Fibonacci.fibonnaci( i ));
		}
	}

}
