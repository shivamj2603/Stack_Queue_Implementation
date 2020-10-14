package stackandqueue;
import com.java.datastructures.*;

public class Stack<E> {
	public LinkedList<E> linkedlist;
	public Stack() {
		linkedlist = new LinkedList<E>();
	}
	/**
	 * Usecase 1
	 * Function pushes an element on to the stack
	 * @param node
	 */
	public void push(INode<E> node) {
		this.linkedlist.add(node);	
	}
	/**
	 * Function is used to view the top element of the stack
	 * @return
	 */
	public E peek() {
		E peekElement = this.linkedlist.pop();
		this.linkedlist.add(new MyNode<E>(peekElement));
		return peekElement;
	}
	private void printStack() {
		this.linkedlist.printNodes();
		System.out.println();
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		stack.push(thirdNode);
		stack.push(secondNode);
		stack.push(firstNode);
		stack.printStack();
		System.out.println(stack.peek()); //Returns the top element of the stack
	}
}
