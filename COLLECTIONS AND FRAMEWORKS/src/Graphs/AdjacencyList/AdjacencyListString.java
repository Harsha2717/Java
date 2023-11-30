package Graphs.AdjacencyList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
 * While we use String data type as our data we need to get the Index of the String
 * we can do it in 3 Ways
 * 	**Create a Helper Function to find Index of String
 * 	**Implement the Function in the method itself
 * 
 * 	**Create an HashMap and store the Index of the Vertice as a Key
 */
public class AdjacencyListString 
{
	static class Edge
	{
		String src;
		String dstn;
	
		Edge(String src,String dstn)
		{
			this.src = src;
			this.dstn = dstn;
		}
	}
	
	public static void createGraph(ArrayList<Edge> graph[]) 
	{
		//Initialize the NullPointer Array with Empty ArrayList
		for(int i=0;i<graph.length;i++) 
		{
			graph[i] = new ArrayList<Edge>();
		}
		
		//We create Some Vertices and Nodes for them here
		//Src is the Verice and dstn is the verice and the conncetion between them is Edge
		graph[0].add(new Edge("A", "B"));
		graph[0].add(new Edge("A", "C"));
		
		graph[1].add(new Edge("B", "A"));
		graph[1].add(new Edge("B", "D"));

		graph[2].add(new Edge("C", "A"));
		graph[2].add(new Edge("C", "E"));

		graph[3].add(new Edge("D", "B"));
		graph[3].add(new Edge("D", "E"));
		graph[3].add(new Edge("D", "F"));

		graph[4].add(new Edge("E", "D"));
		graph[4].add(new Edge("E", "C"));
		graph[4].add(new Edge("E", "F"));

		graph[6].add(new Edge("G", "F"));
		graph[5].add(new Edge("F", "G"));
		
	}
	
	public static void BreadthFirstSearch(ArrayList<Edge> graph[] ,int vertices,boolean [] Visited,String start) 
	{
		//We are using a HashMap to Store the Index of the String
		//For Strings we use Source rather than the Destination
		HashMap<String,Integer> VMap = new HashMap<>();
		//Initializing HashMap with Every Vertice and there Index
		for(int i=0;i<graph.length;i++) 
		{
			for(int j=0;j<graph[i].size();j++) 
			{
				//String data = graph[i].get(j).src; 
				//This uses More Memory 
				//This Store the data of the String at the Position
				//Because when a String is Modified or Updated a new String is 
				//Created at the String Constant Pool Because String is Immutable
				
				VMap.put(graph[i].get(j).src, i);
			}
		}
		
		Queue<String> queue = new LinkedList<>();
		queue.add(start);
		while(!queue.isEmpty()) 
		{
			String Current = queue.poll();
			int CurrentIndex = VMap.get(Current);

			//int CurrentIndex = IndexOf(graph,Current);
			
			if(!Visited[CurrentIndex]) 
			{
				System.out.println(Current);
				Visited[CurrentIndex] = true;
				
				//Adding all the Edges Linked to the Vertice
				for(int i=0;i<graph[CurrentIndex].size();i++) 
				{
					Edge e = graph[CurrentIndex].get(i);
					queue.add(e.dstn);
				}
			}
		}
	}

	// This is a Helper Method used to 
	
//	public static int IndexOf(ArrayList<Edge> graph[],String Vertex) 
//	{
//		for(int i=0;i<graph.length;i++) 
//		{
//			for(int j=0;j<graph[i].size();j++) 
//			{
//				if(graph[i].get(j).src.equals(Vertex)) 
//				{
//					return i;
//				}
//			}
//		}
//		return -1;
//	}	
	public static void main(String [] args) 
	{
		int v = 7;
		@SuppressWarnings("unchecked")
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		boolean [] visited = new boolean[v];
		for(int i=0;i<graph.length;i++) 
		{
			BreadthFirstSearch(graph,v,visited,graph[i].get(0).src);
		}
	}
}
