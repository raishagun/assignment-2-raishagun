/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<E> implements MyBinarySearchTreeADT<E> {


    private TreeNode<E> root;
    public int numberOfLeftChild = 0;
    private int maxLevel = 0;

    public TreeNode<E> getRoot() {
        return root;
    }


    @Override
    public boolean add(E data) {
        root = addRecursive(root,data);
        return true;
    }
     private TreeNode<E> addRecursive(TreeNode<E> currentNode,E data){



        return currentNode;
    }


}
