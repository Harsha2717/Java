package Graphs.AdjacencyMatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	int [][] matrix ;
	
	ArrayList<Node> names;
	
	Graph(int size)
	{
		names = new ArrayList<>();
		matrix = new int[size][size];	//Space Complexity(v^2)
	}
	
	public void addNode(Node node) 
	{
		names.add(node);
	}
	
	public void addEdge(int src,int dst) 
	{
		matrix[src][dst] = 1;
	}
	public boolean hasEdge(int src,int dst) 
	{
		if(matrix[src][dst] == 1) 
		{
			System.out.println(names.get(src).data + " is Related to " + names.get(dst).data);
		}
		return (matrix[src][dst] == 1)? true: false;
	}
	
	public void print() 
	{
//		System.out.print("  ");
//		for(Node n : names) 
//		{
//			System.out.print(n.data+" ");
//		}
		System.out.println();
		for(int i=0;i<matrix.length;i++) 
		{
			//System.out.print(names.get(i).data + " ");
			for(int j=0;j<matrix[i].length;j++) 
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void bfs(int src) 
	{
		Queue<Integer> queue = new LinkedList<>();
		boolean [] visited = new boolean[matrix.length];

		queue.offer(src);
		visited[src] = true;
		while(!queue.isEmpty()) 
		{
			src = queue.poll();
			System.out.println(names.get(src).data);
			for(int i=0;i<matrix[src].length;i++) 
			{
				if(matrix[src][i] ==1 && !visited[i]) 
				{
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}
