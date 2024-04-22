package queue;

public class ArrayQueue {
	
	private int capacity;	// generelle größe
	private int front;
	private int rear;
	private int [] queue;
	
	public ArrayQueue(int capacity) {
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.queue = new int [capacity];
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getFront() {
		return front;
	}
	public void setFront(int front) {
		this.front = front;
	}
	public int getRear() {
		return rear;
	}
	public void setRear(int rear) {
		this.rear = rear;
	}
	public int[] getQueue() {
		return queue;
	}
	public void setQueue(int[] queue) {
		this.queue = queue;
	}
	/**
	 * The method checks if the front of the List is equal to the rear
	 * @return if the list is empty
	 */
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}
	/**
	 * The method checks if the rear is the same as the capacity
	 * @return if the list is full
	 */ 
	public boolean isFull() {
		if(rear == capacity) {
			return true;
		}
		return false;
	}
	/**
	 * The method enlists the element at the rear, if the list is full,
	 * the method returns "Queue is full!"
	 * @param element
	 */
	public void enqueue(int element) {
		if(!isFull()) {
			queue[rear] = element;
			rear++;
		} else {
			System.out.println("Queue is full!");
		}
	}
	/**
	 * The method deletes the front of the queue
	 */
	public void dequeue() {
		if(!isEmpty()) {
			for(int i=0;i<rear-1;i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
		} else { 
			System.out.println("Queue is empty");
		}
	}
	/**
	 * The mthod checks if the queue is empty and than returns the front
	 * @return the front of the queue
	 */
	public int front() {
		if(!isEmpty()) {
			return queue[front];
		}
		return -1;	// keine saubere Lösung -> Exception Handling
	}
	/**
	 * The method prints out every sector of the queue
	 */
	public void display() {
		if(!isEmpty()) {
			for(int i=0;i<rear-1;i++) {
				System.out.println(queue[i]);
			} 
		} else {
			System.out.println("Queue is empty!");
		}
	}
	
	
	
	
	
	
	
}
