package stackandqueue;
import com.java.datastructures.*;

public class Queue<E> {
	public LinkedList<E> linkedlist;
	public Queue() {
		linkedlist = new LinkedList<E>();
	}
	/**
	 * Usecase 3
	 * Function enqueues element on to the queue
	 * @param node
	 */
	public void enque(INode<E> node) {
		this.linkedlist.append(node);	
	}
	/**
	 * Function prints the queue
	 * 
	 */
	private void printQueue() {
		this.linkedlist.printNodes();
		System.out.println();
	}
	/**
	 * Usecase 4
	 * Function removes item from the queue
	 * @return
	 */
	public E deque() {
		E dequedItem = this.linkedlist.pop();
		return dequedItem;
	}
	private boolean isEmpty() {
		return this.linkedlist.isEmpty();
	}
	private int size() {
		return this.linkedlist.size();
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		queue.enque(firstNode);
		queue.enque(secondNode);
		queue.enque(thirdNode);
		queue.deque();
		queue.printQueue();
	}
}