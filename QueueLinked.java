
public class QueueLinked {
	//default constructor for creating an empty queue
	public Queue? () //? is a wildcard for second part of classname


	//inserts item at the end of the queue
	public void enqueue(E item)


	//returns the head of the queue and deletes it from the queue;
	//returns null if queue is empty
	public T dequeue()


	//returns the number of elements in the queue
	public int size()


	//test if queue is empty
	public boolean isEmpty()


	//returns a String-representation of this queue as
	//[item1, item2, ..., itemn] with item1 as the top item 
	//and itemn as the last inserted item
	public String toString ()


	//returns an iterator for traversing the queue
	public MyIterator<E> getIterator()
}
}