/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.adt.MyQueueADT;

public class MyQueue<E> implements MyQueueADT<E> {


    private Node<E> front;
    private Node<E> rear;
    private int size = 0;





    @Override
    public void enqueue(E data) {
        Node<E> node = new Node<E>(data);


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
    private static class Node<E> {
        E data;
        Node<E> next;
        public Node(E data) {
            this.data = data;
        }

        public Node(Node<E> next) {
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    }

