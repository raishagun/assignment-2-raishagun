/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {

    public static void main(String[] args) {

            MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<Integer>();
            myBinarySearchTree.add(11);
            myBinarySearchTree.add(44);
            myBinarySearchTree.add(42);
            myBinarySearchTree.add(78);
            myBinarySearchTree.add(13);
            myBinarySearchTree.add(74);
            myBinarySearchTree.add(150);
            myBinarySearchTree.add(180);
            myBinarySearchTree.add(25);
            myBinarySearchTree.add(90);
            myBinarySearchTree.print();
            System.out.println("number of nodes who don't have their left child " + myBinarySearchTree.numberOfLeftChild);
        }


}
