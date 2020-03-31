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

public class MyQueue<E> implements MyQueueADT {


    private Node<E> front;
    private Node<E> rear;
    private int size = 0;





    @Override
    public void enqueue(Object data) {

    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
