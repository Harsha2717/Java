package Graphs.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

//Creating a Node class which can be used to create a Node of Data
class Node {
	String data;
	Node(String data) {
		this.data = data;
	}
}

//We are creating a Graph of list of list type and creating methods
class Graph 
{
	// List of List
	ArrayList<LinkedList<Node>> adjacentList;

	// Calling Graph Constructor
	Graph() {
		adjacentList = new ArrayList<>();
	}

	// Adding Node to a list and adding the List to ArrayList
	public void addNode(Node node) {
		LinkedList<Node> currentList = new LinkedList<>();
		currentList.add(node);
		adjacentList.add(currentList);
	}

	// Creating an Edge Between a src and dstn nodes
	public void addEdge(int src, int dstn) {
		// Here we obtained list at the Source
		LinkedList<Node> currentList = adjacentList.get(src);

		// We obtained value of destination and getting the Head of the List
		Node dstnNode = adjacentList.get(dstn).get(0);

		// Adding node to CurrentList
		currentList.add(dstnNode);
	}

	public boolean hasEdge(int src, int dstn) {
		LinkedList<Node> currentList = adjacentList.get(src);
		Node dstnNode = adjacentList.get(dstn).get(0);
		System.out.println(dstnNode.data);
		if (currentList.get(dstn) == dstnNode) {
			return true;
		}
		return false;
	}

	public void print() {
		for (LinkedList<Node> list : adjacentList) {
			for (Node node : list) {
				System.out.print(node.data + " -> ");
			}
			System.out.println();
		}
	}
	
	public int findIndex(Node currentVertex) 
	{
		for(int i=0;i<adjacentList.size();i++) 
		{
			LinkedList<Node> currentList = adjacentList.get(i);
			if(currentList.contains(currentVertex)) 
			{
				return i;
			}
		}
		return -1;
	}

}


public class AdjacencyListUsingNode
{
	public static void main(String [] args) 
	{
		Graph graph = new Graph();
		
		graph.addNode(new Node("A"));
		graph.addNode(new Node("B"));
		graph.addNode(new Node("C"));
		graph.addNode(new Node("D"));
		graph.addNode(new Node("E"));

		graph.addEdge(0, 1);
		graph.addEdge(1, 3);
		graph.addEdge(2, 1);
		graph.addEdge(2, 2);
		graph.addEdge(4, 0);
		graph.addEdge(4, 1);
		graph.addEdge(4, 2);
		
		graph.print();
	}	
}
