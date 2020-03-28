/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
            MyPriorityQueue<Student> myPriorityQueue = new MyPriorityQueue<>();
            myPriorityQueue.add(new Student(55, "shagun"));
            myPriorityQueue.add(new Student(5, "apooorva"));
            myPriorityQueue.add(new Student(37, "rishi"));
            myPriorityQueue.add(new Student(28, "palak"));
            System.out.println(myPriorityQueue);
        }
    }

