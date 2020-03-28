/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
public class MyMain {

    public static void main(String[] args) {

MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();

        myBinarySearchTree.add(31);
        myBinarySearchTree.add(45);
        myBinarySearchTree.add(76);
        myBinarySearchTree.add(32);
        myBinarySearchTree.add(34);
        System.out.println("Traverse the tree in preOrder:");
        traversePreOrder(myBinarySearchTree.getRoot());
        System.out.println();
        System.out.println("Traverse the tree in postOrder:");
        traversePostOrder(myBinarySearchTree.getRoot());

    }public static void traversePreOrder(TreeNode<Integer> currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            traversePreOrder(currentNode.getLeftChild());
            traversePreOrder(currentNode.getRightChild());
        }
    }
    public static void traversePostOrder(TreeNode<Integer> currentNode) {
        if (currentNode != null) {
            traversePostOrder(currentNode.getLeftChild());
            traversePostOrder(currentNode.getRightChild());
            System.out.print(currentNode.getData() + " ");
        }
    }

    }

