package Graphs.DepthFirstSearch_DFS;

import java.util.ArrayList;
import java.util.Stack;
//We can also use a Recursive method to call the DFS
public class DepthFirstSearchUsingInteger 
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
	
	public static void createGraph(ArrayList<Edge> [] graph) 
	{
		//Initialize the graph with Empty ArrayList
		for(int i=0;i<graph.length;i++) 
		{
			graph[i] = new ArrayList<>();
		}
		
		//Creating Nodes and Edges
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
	
	public static void DepthFirstSearch(ArrayList<Edge> graph[],int vertices,boolean[] visited,int start) 
	{
		Stack<Integer> stack = new Stack<>();
		stack.add(start);
		while(!stack.isEmpty()) 
		{
			int current = stack.pop();
			if(!visited[current]) 
			{
				System.out.print(current + " ");
				visited[current] = true;
				
				//In DFS we need to use the Reverse for loop as we use the Stack that follow LastInFirstOut
				for(int i=graph[current].size()-1;i>=0;i--) 
				{
					Edge e = graph[current].get(i);
					stack.push(e.dstn);
				} 
			}
		}
	}
	public static void DFS(ArrayList<Edge> graph[] ,int Current,boolean[]visited) 
	{
		if(!visited[Current]) 
		{
			System.out.print(Current + " ");
			visited[Current] = true;
			
			for(int i=0;i<graph[Current].size();i++) 
			{
				Edge e = graph[Current].get(i);
				DFS(graph,e.dstn,visited);
			}
		}
	}
	public static void main(String [] args) 
	{
		int v = 7;
		@SuppressWarnings("unchecked")
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		boolean [] visited = new boolean[v];
		for(int i=0;i<v;i++) 
		{
			//This loop runs Until all the Vertices are Covered
			//Hence any break between is not going to stop the Traversal of the Graph because the it Iterates over every Element
			if(!visited[i]) 
			{
				//DFS(graph,i,visited);
				//System.out.println("================");
				DepthFirstSearch(graph,v,visited,i);
			}
		}
	}
}
