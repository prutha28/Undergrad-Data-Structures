package representation.of.graphs.using.adjacency.list;

public class AdjacencyList {

	int numberOfNodes ; // vertices
	/**
	 * This is an array of pointers for each vertex.
	 * If a vertex v1 is connected to v2, v3 , v5
	 * Then we will have adjacencyList[0] pointing to Node2, Node2 & Node5 
	 */
	Node[] adjacencyList ; // an array of pointers to Nodes.


	public AdjacencyList( int numberOfNodes ){
		this.numberOfNodes = numberOfNodes ;
		adjacencyList = new Node[ numberOfNodes ] ;

		// Make each vertex point to nothing.
		for (int i = 0; i < adjacencyList.length; i++) {
			adjacencyList[ i ].next = null ;
		}
	}
	
	/**
	 * This connects the two vertices by making the first vertex point to the second one. 
	 * @param i
	 * @param j
	 */
	public void connectVertices( int i, int weight){
		
		Node newNode = new Node(weight) ;
		
		// Not yet connected to any node.
		if( adjacencyList[ i-1 ].next == null ){
			adjacencyList[ i-1 ] = newNode ;
		}else{
			Node current = adjacencyList[ i -1] ;
			while( current.next != null){
				current = current.next ;
			}
			
			current = newNode ;
		}
	}
	
	public void connectVertices( int i, Node vertex ){
		
		// Not yet connected to any node.
		if( adjacencyList[ i-1 ].next == null ){
			adjacencyList[ i-1 ] = vertex ;
		}else{
			Node current = adjacencyList[ i -1] ;
			while( current.next != null){
				current = current.next ;
			}
			
			current = vertex ;
		}
	}
}
