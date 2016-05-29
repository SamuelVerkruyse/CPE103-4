import java.lang.Exception;
import java.util.*;
import org.omg.CORBA.portable.UnknownException;
public class myBinaryHeap<AnyType extends Comparable<? super AnyType>>{
	private static final int DEFAULT_CAPACITY = 10;//Set the default size of a heap as 10
	public AnyType [] array;//Create an array to hold heap values
	private int currentSize;//Tracker variable that holds the current size of the heap
	public myBinaryHeap(){//Parameterless constructor
		this(100);//call the integer constructor with 100 as the parameter
	}
	public myBinaryHeap(int capacity){//Integer constructor
		currentSize = 0;//Set the current size as 0
		array = (AnyType[])new Comparable[capacity + 1];
	}
	void insert(AnyType x){
		if(currentSize == array.length - 1)
			enlargeArray(array.length * 2 + 1);
		int hole = ++currentSize;
		for(array[0] = x; x.compareTo(array[hole/2]) < 0; hole /= 2)
			array[hole] = array[hole/2];
		array[hole] = x;
	}
	public AnyType deleteMin(){
		if(isEmpty())
			throw new UnknownException(null);
		AnyType minItem = findMin();
		array[1] = array[currentSize--];
		percolateDown(1);
		return minItem;
	}
	public AnyType findMin(){
		if( isEmpty( ) )
			throw new UnknownException(null);
		return array[1];
	}
	private void percolateDown(int hole){
		int child;
		AnyType tmp = array[hole];
		for(;hole * 2 <= currentSize; hole = child){
			child = hole * 2;
			if(child != currentSize && array[child + 1].compareTo(array[child]) < 0)
				child++;
			if(array[child].compareTo(tmp) < 0)
				array[hole] = array[child];
			else
				break;
		}
		array[hole] = tmp;
	}
	boolean isEmpty(){
		return currentSize == 0;
	}
	void makeEmpty(){
		currentSize = 0;
	}
	private void enlargeArray(int newSize){
		AnyType [] old = array;
        array = (AnyType []) new Comparable[ newSize ];
        for( int i = 0; i < old.length; i++ )
            array[i] = old[ i ];
	}
	public int size(){
		return currentSize;
	}
	public String toString(){
		String returnee = "";
		for(int i = 1; i < currentSize+1; i++){
			returnee += array[i] + " ";
		}
		return returnee;
	}
}