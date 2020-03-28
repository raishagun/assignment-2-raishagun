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

         if (currentNode == null) {
             return new TreeNode<>(data);
         } else if ((Integer) data < (Integer) currentNode.getData()) {
             currentNode.setLeftChild(addRecursive(currentNode.getLeftChild(), data));
         } else if ((Integer) data > (Integer) currentNode.getData()) {
             currentNode.setRightChild(addRecursive(currentNode.getRightChild(), data));
         }

        return currentNode;
    }


    private void printLeftChild(TreeNode<E> node, int level) {
        if (node == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.print(node.getData() + " ");
        }
        maxLevel = level;
        if (node.getLeftChild() == null) {
            numberOfLeftChild++;
            maxLevel++;
        }
        printLeftChild(node.getLeftChild(), level + 1);
        printLeftChild(node.getRightChild(), level + 1);
    }

}
