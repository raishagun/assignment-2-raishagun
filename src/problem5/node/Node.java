/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;

//import problem5.student.Student5;

import problem5.Student5;

// to define node properties
public class Node {
    private Student5 student;
    private Node next;

    public Student5 getStudent() {
        return student;
    }

    public void setStudent(Student5 student) {
        this.student = student;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
