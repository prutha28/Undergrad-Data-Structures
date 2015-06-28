package representation.of.graphs.using.adjacency.matrix;

public class AdjacencyMatrix {

	int numberOfNodes ;

	/**
	 * The adjacency Matrix for n vertices is a n x n matrix M such that
	 * whenever there is an edge from vertex i to vertex j, M [ i, j] = 1
	 * otherwise it is 0.
	 */
	boolean[][] adjacencyMatrix ;

	// By Default make all values in matrix to be 0

	public AdjacencyMatrix( int numberOfNodes ) 
	{
		this.numberOfNodes = numberOfNodes ;
		adjacencyMatrix = new boolean[numberOfNodes ][ numberOfNodes] ;

		for (int row = 0; row < adjacencyMatrix.length; row++) {
			for (int column = 0; column < adjacencyMatrix[row].length; column++) 
				adjacencyMatrix[ row ][ column ] = false ;
		}
	}

	/**
	 * This method connects the i'th and the j'th vertices.
	 * i.e. M [ i-1][j-1]  = true 
	 * @param i
	 * @param j
	 */
	public void connectNodes( int i, int j ){

		adjacencyMatrix[ i -1 ][ j -1 ] = true ;
	}

	public void displayGraph(){
		for (int row = 0; row < adjacencyMatrix.length; row++) {
			for (int column = 0; column < adjacencyMatrix[row].length; column++)

				if( adjacencyMatrix[ row ][ column ])
					System.out.printf("%3d", 0 ) ;
				else
					System.out.printf("%3d", 1 ) ;	
		}
	}
}
