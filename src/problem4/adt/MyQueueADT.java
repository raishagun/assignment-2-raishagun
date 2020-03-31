package problem4.adt;

public interface MyQueueADT<E> {

    //a method to add new element at rear
    public void enqueue(E data);

    //a method to remove element from front of queue
    public E dequeue();


    public E peek();  //method to get front element of queue

}
