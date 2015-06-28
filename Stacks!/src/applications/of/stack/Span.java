package applications.of.stack;

/**
 * INEFFICIENT SOLUTION. 
 * Time Complexity : O ( n^2 )
 */

import java.util.Random;

public class Span {

	int numDays ;
	float[] prices ;
	int span[] ;

	public Span( int numDays ){
		this.numDays =numDays ;
		prices = new float[ numDays ] ;
		span = new int[ numDays ] ;

		Random random = new Random() ;
		for (int i = 0; i < prices.length; i++) {
			prices[ i ] = random.nextFloat() * 100 ;
		}
	}

	public void displaySpans(){

		System.out.println("\nThe prices for the " + numDays + " days are as shown:");
		for (int i = 0; i < prices.length; i++) {
			System.out.printf("%6.2f", prices[ i ]);
		}

		System.out.println("\nThe spans for the " + numDays + " days are as shown:");
		for (int i = 0; i < span.length; i++) {
			System.out.printf("%4d", span[ i ]);
		}
	}

	public void calculateSpan(){

		int i = (prices.length - 1) ;
		int j ;

		while( i >= 0){
			j = (i -1 ) ;

			while(( j >= 0) && (prices[ j ] < prices[ i ] ))
				j-- ;

			span[ i ] = i - j  ;
			i-- ;
		}

	}

}
