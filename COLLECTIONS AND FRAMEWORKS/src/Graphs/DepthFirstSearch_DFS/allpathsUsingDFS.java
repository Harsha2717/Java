package Graphs.DepthFirstSearch_DFS;

import java.util.ArrayList;

public class allpathsUsingDFS 
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
	
	public static void createGraph(ArrayList<Edge> graph[]) 
	{
		//Initializing the Graph with Empty Lists
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
		graph[3].add(new Edge(3,5));
		
		graph[4].add(new Edge(4,2));
		graph[4].add(new Edge(4,3));
		graph[4].add(new Edge(4,5));
		
		
		graph[5].add(new Edge(5,3));
		graph[5].add(new Edge(5,4));
		
		graph[5].add(new Edge(5,6));
		graph[6].add(new Edge(6,5));
	}
	
	public static void DFS(ArrayList<Edge> graph[],int current,boolean [] visited) 
	{
		//Time complexity : O(V+E)
		
		//We print the current Node 
		System.out.print(current + " ");
		//Marking the current element as true hence it doesnt visit again
		visited[current] = true;
		
		for(int i=0;i<graph[current].size();i++) 
		{
			Edge e = graph[current].get(i);
			if(visited[current] == false) 
			{
				DFS(graph,e.dstn,visited);
			}
		}
	
	}
	public static void allPaths(ArrayList<Edge> graph[],int current,boolean[]visited,int target,String path) 
	{
		//Time complexity : O(V^V)
		//Base Case where the Recursive Function Stops
		if(current == target) 
		{
			System.out.println(path);
			return;
		}
		
		for(int i=0;i<graph[current].size();i++) 
		{
			Edge e = graph[current].get(i);
			if(!visited[current]) 
			{
				visited[current] = true;
				allPaths(graph,e.dstn,visited,target,path+e.dstn + " ");
				visited[current]= false;
			}
		}
	}
	public static void main(String [] args) 
	{
		int v = 7;
		@SuppressWarnings("unchecked")
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		int src=0;
		int dstn = 5;
		String path = Integer.toBinaryString(src);
		boolean [] visited = new boolean[v];
		
		for(int i=0;i<graph.length;i++) 
		{
			//DFS(graph,i,visited);
		}
		//Calling the all Paths method
		
		if(!visited[src]) 
		{
			allPaths(graph,src,visited,dstn,path + " ");
		}
		
	}
}
