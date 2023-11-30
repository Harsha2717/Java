package Graphs.AdjacencyMatrix;
/*
 * Graphs are Versatile DataStructure that is used to Store the connections and Relations between Elememts
 * Graphs Element is called Vertice and connection between two vertices is called Edge.
 * The Edge can be two types :
 
  		*Directed Graph   : Edge has a Start and End point in specific Direction
  		*UnDirected Graph : Edge has a Start and End point but no Specific Direction
  
  *	The Edges May contain weight which can be used to Calculate some examples like Shortest Distance and etc
  *	
  *	The Graphs can be Used in Maps,SocialNetworking and Networking
  *
  *	Graphs can be Implemented in two ways
  			** Adjacency Matrix
  			** Adjacency Listx
  	in Adjacency Matrix if There is a relation between two nodes it is Represented by 1 else 0
  		 * in Adjacency List the Nodes containing Edges is Stored in LinkedList form and Every Edge contains a Relation is represented as the List
   */
public class AdjacencyMatrixMain 
{
	public static void main(String [] args) 
	{
		int v = 6;
		Graph graph = new Graph(v);
		graph.addNode(new Node("A"));
		graph.addNode(new Node("B"));
		graph.addNode(new Node("C"));
		graph.addNode(new Node("D"));
		graph.addNode(new Node("E"));
		
		//graph.print();
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);	
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);

		System.out.println();
//		graph.print();
//
//		System.out.println(graph.hasEdge(0, 1));
//		System.out.println(graph.hasEdge(0, 5));
//		System.out.println(graph.hasEdge(5, 0));
		
		graph.bfs(1);
	}
}












