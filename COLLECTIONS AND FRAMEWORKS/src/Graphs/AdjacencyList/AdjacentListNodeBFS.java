package Graphs.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class NodeBfs
{
	String data;
	ArrayList<NodeBfs> nodeList;
	NodeBfs(String data)
	{
		this.data = data;
		nodeList = new ArrayList<>();
	}
	
	//This adds a Neighbour to the NodeList
	public void addNeighbour(NodeBfs node) 
	{
		this.nodeList.add(node);
	}
}
class GraphBfs
{
	ArrayList<NodeBfs> node;
	
	GraphBfs()
	{
		node = new ArrayList<>();
	}
	void addNode(NodeBfs node) 
	{
		this.node.add(node);
	}
	void addEdge(int src,int dstn) 
	{
		NodeBfs srcNode = node.get(src);
		NodeBfs dstnNode = node.get(dstn);
		srcNode.addNeighbour(dstnNode);
	}
	boolean hasEdge(int src,int dstn) 
	{
		NodeBfs srcNode = this.node.get(src);
		NodeBfs dstnNode = this.node.get(dstn);
		return srcNode.nodeList.contains(dstnNode);
	}
	
	public void BFS(int start,boolean [] visited) 
	{
		Queue<NodeBfs> queue = new LinkedList<>();
		NodeBfs currNode = this.node.get(start);
		queue.add(currNode);
		while(!queue.isEmpty()) 
		{
			NodeBfs current = queue.poll();
			int currentIndex = this.node.indexOf(current);
			if(!visited[currentIndex]) 
			{
				System.out.println(current.data);
				visited[currentIndex] = true;
				
				for(NodeBfs node : current.nodeList) 
				{
					queue.add(node);
				}
			}
		}
		
	}
}
public class AdjacentListNodeBFS 
{
	public static void main(String [] args) 
	{
		int v = 6;
		GraphBfs graph = new GraphBfs();
		boolean [] visited = new boolean[v];
		graph.addNode(new NodeBfs("A"));
		graph.addNode(new NodeBfs("B"));
		graph.addNode(new NodeBfs("C"));
		graph.addNode(new NodeBfs("D"));
		graph.addNode(new NodeBfs("E"));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 0);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 1);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 1);
		graph.addEdge(3, 2);
		graph.addEdge(3, 4);
		
		graph.BFS(0,visited);
		
	}
}
