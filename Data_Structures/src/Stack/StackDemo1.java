package Stack;

import java.io.*;
import java.util.*;

public class StackDemo1 {

	public static void main(String[] args) {
		
		//Default initialization of stack
		Stack stack1 = new Stack();
		
		//initialization of stack using Generics
		Stack<String> stack2 = new Stack<String>();
		
		//Pushing the elements
		stack1.push(4);
		stack1.push("Greeks");
		stack1.push("All");
		
		System.out.println("The element at the top of the"+ "stack-1 is: "+ stack1.indexOf("All"));
		
		//Fetching the element at the head of the stack 1
		System.out.println("The element at the top of the"+ "stack-1 is: "+ stack1.peek());

		stack2.push("Greeks");
		stack2.push("For");
		stack2.push("Goa");
		
		//Fetching the element at the head of the stack 2
		System.out.println("The element at the top of the"+ "stack-2 is:"+ stack2.peek());
		
		//Printing the stack elements
		System.out.println(stack1);
		System.out.println(stack2);
		
		//Removing elements using pop()method
		System.out.println("Popped element from stack 1:" + stack1.pop());
		System.out.println("Popped element from stack 2:" + stack2.pop());
				
		

	}

}
