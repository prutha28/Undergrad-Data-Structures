package sorted.arrays;

/**
 * @author prutha!
 *
 *	This will consist of an underlying array of GameEntries of some fixed size.
 *	that we shall call capacity.
 */

public class ScoreCard {

	public static final int CAPACITY = 10 ;

	// Actual number of entries. ( <= CAPACITY)
	private int numEntries ;
	// This array is stored in an ordered manner from largest to lowest.
	private GameEntry[] board ;	

	public ScoreCard(){
		board = new GameEntry[ CAPACITY ] ;
		numEntries = 0 ;
	}


	public void addEntry( GameEntry entry, int startIndex)
	{
		if( CAPACITY == (numEntries - 1)){
			throw new IndexOutOfBoundsException() ;
		}

		// BASE
		if( numEntries == 0 )
		{
			board[ 0 ] = entry ;
		}

		// INDUCTIVE
		if( entry.getScore() > board[0].getScore())
		{
			GameEntry temp = board[ 0 ] ;	// Store this temporarily.
			board[0] = entry ;
			// Now recursively insert temp into the sorted array board[ 1 ... n-1]
			addEntry(temp, 1 ) ;
		}
	}


	public void add( GameEntry e)
	{
		if( CAPACITY == (numEntries - 1)){
			throw new IndexOutOfBoundsException() ;
		}

		// Special case when e is greater than 
		if( (e.getScore() > board[ numEntries - 1].getScore()) && (e.getScore() < board[ numEntries - 2].getScore())){
			board[ numEntries - 1] = e ;
		}
		
		int j = numEntries - 2 ;	// second last index
		
		while( j > 0 && board[j].getScore() < e.getScore())
		{
			board[ j + 1 ] = board[ j ] ;
			j-- ;
		}
		board[ j + 1 ] = e ;
	}

	public GameEntry remove( int index ){

		int i = index ;

		if( i < 0 || i >= numEntries)
			throw new IndexOutOfBoundsException() ;

		GameEntry entry = board[ index ] ;
		// Code to move the elements 1 back.
		while( i <= numEntries -2)
		{
			board[ i ] = board[ i + 1 ] ;
			i++ ;
		}

		// Make the element in the last index null.
		board[ numEntries - 1] = null ;
		// DO NOT FORGET THIS.
		numEntries-- ;
		return entry ;
	}

	public void display(){
		for (int i = 0; i < board.length; i++) {
			System.out.println(board[ i ]);
			System.out.println();
		}
	}
}
