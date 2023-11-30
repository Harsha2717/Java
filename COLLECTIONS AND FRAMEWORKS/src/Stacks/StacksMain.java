package Stacks;
import java.util.*;
/*
 * The Stack Support LIFO Architecture where the Last Element can be removed First
 * 
 */
public class StacksMain {
	public static void main(String [] args) 
	{
		Stack<String> stack = new Stack<String>();
		//Check whether the Stack is Empty
		
		System.out.println(stack.isEmpty());
		
		//Adding a Element into the stack 
		
		stack.push("a");
		stack.push("e");
		stack.push("i");
		stack.push("o");
		stack.push("u");
		
		//We can Add elements using add but the semantically proven one is the stack.push()
		System.out.println(stack);
		
//		stack.pop();
//		System.out.println(stack);

		
		//We can store the element we removed from the Stack
		
		String popped = stack.pop();
		System.out.println(popped);
		System.out.println(stack);
		
		// Instead of removing the last element we can also use peek() to See the last element in the Stack
		System.out.println(stack.peek());
		
		//Check whether the Stack contains the Element or not
		System.out.println(stack.contains("a"));
		System.out.println(stack.contains("b"));
		
		
	}
}
