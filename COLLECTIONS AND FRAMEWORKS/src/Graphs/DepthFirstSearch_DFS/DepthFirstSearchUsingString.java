 package Graphs.DepthFirstSearch_DFS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;


public class DepthFirstSearchUsingString 
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
		//Initialize the graph Elements with EmptyLinkedLists
		for(int i=0;i<graph.length;i++) 
		{
			graph[i] = new ArrayList<>();
		}
		
		// Adding Vertices and the Connection between them (Edges)
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
	
	public static void DepthFirstSearch(ArrayList<Edge> graph[],int Vertices,boolean [] visited,String start) 
	{
		Stack<String> stack = new Stack<>();
		//Duplicate Keys are Not Allowed Hence it Creates unique Key for every Element
		HashMap<String,Integer> VMap = new HashMap<>();
		//Creating Vertices and the Keys for them //Only Used when we use String Data
		for(int i=0;i<graph.length;i++) 
		{
			//The Outer Loop is for the Vertices Starting point
			for(int j=0;j<graph[i].size();j++) 
			{
				//The Inner Loop is For the Element at the vertice
				VMap.put(graph[i].get(j).src, i);
				//the String is the Src at the index i 
			}
		}
		
		stack.push(start);
		while(!stack.isEmpty()) 
		{
			String current = stack.pop();
			int currentIndex = VMap.get(current);
			if(!visited[currentIndex]) 
			{
				System.out.println(current);
				visited[currentIndex] = true;
				
				for(int i=graph[currentIndex].size()-1;i>=0;i--) 
				{
					Edge e = graph[currentIndex].get(i);
					stack.push(e.src);
				}
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
		for(int i = 0;i < v; i++) 
		{
			if(!visited[i]) 
			{
				DepthFirstSearch(graph,v,visited,graph[i].get(0).src);				
			}
		}
	}
}
