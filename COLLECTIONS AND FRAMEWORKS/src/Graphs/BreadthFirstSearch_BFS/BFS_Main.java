package Graphs.BreadthFirstSearch_BFS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
 *  Breadth-First Search (BFS) is a versatile algorithm used for graph traversal, enabling various applications such as:
 * 		- Printing vertices
 * 		- Finding connectivity between vertices
 * 		- Discovering shortest paths
  
 * The algorithm employs breadthward exploration, covering unvisited nodes of a level before moving on to the next level.
 * To keep track of visited vertices, a 'visited' array is commonly utilized.
 * A queue is employed to manage the vertices that need to be searched, and it helps in the orderly exploration of linked vertices.
 *
 * During each step, the algorithm iteratively processes and verifies elements, allowing for the systematic printing of vertices.
 */
public class BFS_Main 
{
	static class Edge
	{
		int src;
		int dstn;
		
		Edge(int src,int dstn)
		{
			this.src = src;
			this.dstn = dstn;
		}
	}
	
	public static void CreateGraph(ArrayList<Edge> graph[]) 
	{
		//Initiate the arrays with empty ArrayList
		for(int i=0;i<graph.length;i++) 
		{
			graph[i] = new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,3));
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,4));
		
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,4));
		
		graph[4].add(new Edge(4,2));
		graph[4].add(new Edge(4,3));
		
		
		graph[5].add(new Edge(5,6));
		
		graph[5].add(new Edge(6,5));	
	
			
	}
	
	//In this Method we traverse the Graph only from a single start point and miss the breaked Graph
	
	public static void bfs(ArrayList<Edge> [] graph,int Verices,int start) 
	{
		//We have Created A Queue to store the Vertices of the Graph
		Queue<Integer> queue = new LinkedList<>();
		
		//Here we store the Visited Array Elements
		boolean [] visited = new boolean[Verices];
		queue.add(start);

		while(!queue.isEmpty()) 
		{
			int current = queue.poll();
		
			if(!visited[current]) 
			{
				System.out.println(current);
				visited[current] = true;
				
				for(int i=0;i<graph[current].size();i++) 
				{
					Edge e = graph[current].get(i);
					queue.add(e.dstn);
				}
			}
		}
	}
	
	//	This method Prints Every Veritice of the Graph because this is called on every Vertice until end
	public static void breadthFirstsearch(ArrayList<Edge> graph[],int vertices,boolean[] visited,int start) 
	{
		Queue<Integer> queue = new LinkedList<>();
		//The start has the Index of Every element	
		queue.add(start);
		while(!queue.isEmpty()) 
		{
			int current = queue.poll();
			if(!visited[current]) 
			{
				System.out.println(current);
				visited[current] = true;
				
				for(int i=0;i<graph[current].size();i++) 
				{
					Edge e = graph[current].get(i);
					queue.add(e.dstn);
				}
			}
		}
	}
	public static void main(String [] args) 
	{
		int v = 7;
		@SuppressWarnings("unchecked")
		ArrayList<Edge> graph [] = new ArrayList[v];
		boolean[] visited = new boolean[v];
		CreateGraph(graph);
		
		bfs(graph,v,0);
	
		System.out.println("BFS method to traverse Every Vertice of the Graph");
		//This method traverse through Every Element of the Graph Even the Broken Links
		for(int i=0;i<v;i++) 
		{
			if(!visited[i]) 
			{
				breadthFirstsearch(graph,v,visited,i);
			}
			
		}
		
	}
}	
