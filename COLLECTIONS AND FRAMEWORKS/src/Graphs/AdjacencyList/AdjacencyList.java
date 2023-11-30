package Graphs.AdjacencyList;

import java.util.ArrayList;

public class AdjacencyList 
{
	//Creating a Static Class named Edge which contains src and destination for the Nodes
	//Reason for Creating it as Static because it is Called before the Main method
	
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
	
	//in the creatGraph we passes an ArrayList with graph[] array
	public static void  createGraph(ArrayList<Edge> graph[]) 
	{
		//We need to initilize every array[] with an EmptyArrayList
		for(int i=0;i<graph.length;i++) 
		{
			graph[i] = new ArrayList<>();
			//Else NullPointerException is Thrown
		}
		
		//Adding Edges to the nodes where node is array 
		//Elements in node is the ArrayList
		graph[0].add(new Edge(0,2));
		graph[1].add(new Edge(1,2));
		graph[1].add(new Edge(1,3));
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,3));
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,2));
		
	}
	public static void main(String [] args) 
	{
		@SuppressWarnings("unchecked")
		ArrayList<Edge> graph[] = new ArrayList[5];
		//We are Creating an graph Elements with size of 5
		createGraph(graph);
		
		//Printing Elements
		for(int i=0;i<graph[2].size();i++) 
		{
			Edge e = graph[2].get(i);
			System.out.print(e.dstn + " ");
		}
	}
}
