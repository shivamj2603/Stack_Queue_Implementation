package stackandqueue;
import com.java.datastructures.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {
	/**
	 * Usecase3
	 */
	@Test
	public void given3Numbers_whenAddedToQueue_shouldReturnSizeAs3() {
		Queue<Integer> queue = new Queue();
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		queue.enque(myFirstNode);
		queue.enque(mySecondNode);
		queue.enque(myThirdNode);
		assertEquals(3, queue.size());
	}
	/**
	 * Usecase4
	 */
	@Test
	public void givenQueue_whenDequeued_ShouldReturnSizeAs2() {
		Queue<Integer> queue = new Queue();
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		queue.enque(myFirstNode);
		queue.enque(mySecondNode);
		queue.enque(myThirdNode);
		queue.deque();
		assertEquals(2, queue.size());
	}
}