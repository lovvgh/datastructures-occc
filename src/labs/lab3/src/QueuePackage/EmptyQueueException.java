/*
 * An exception used to signal that attempted to get a value from an empty queue.
 * 
 * @author Charles Hoot
 * @version 5.0
 */

package labs.lab3.src.QueuePackage;

public final class EmptyQueueException extends RuntimeException {

	public EmptyQueueException(String s)
	{
		super(s);
	}
}
   
