/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem3.node.Node;
import problem4.adt.MyQueueADT;

public class MyQueue<E> implements MyQueueADT<E> {


    private Node<E> front;
    private Node<E> rear;
    private int size = 0;





    @Override
    public void enqueue(E data) {
        Node<E> node = new Node<>(data);

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
