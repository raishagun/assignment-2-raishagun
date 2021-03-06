package problem4.adt;

public interface MyQueueADT<E> {

    //a method to add new element at rear
    public void enqueue(E data);

    //a method to remove element from front of queue
    public E dequeue();

    public int getSize();    // to get size of queue


    public E peek();  //method to get front element of queue

    // a method to check whether queue is empty
    public boolean isEmpty();


}
