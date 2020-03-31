/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.Student5;
import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyCircularQueue circularQueue = new MyCircularQueue();

        System.out.println("Enter number of records you wants to enter");
        int numberOfRecords = scan.nextInt();

        while (numberOfRecords != 0) {
            Student5 student = new Student5();
            Node node = new Node();

            System.out.println("Enter name");
            student.setName(scan.next().trim());
            System.out.println("Enter roll number");
            student.setRollNumber(scan.nextInt());
            System.out.println("Enter backlogs");
            int backLogs = scan.nextInt();
            if (backLogs > 2) {
                System.out.println("This student is not allowed");
                continue;
            }
            student.setBackLogCounter(backLogs);

            node.setStudent(student);

            circularQueue.enQueue(node);

            numberOfRecords--;
        }
        System.out.println("Data before deleting records");
        circularQueue.traverseQueue();
    }

}
