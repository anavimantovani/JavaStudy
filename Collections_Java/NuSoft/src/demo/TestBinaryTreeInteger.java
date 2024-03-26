//Author: Ana Victoria Gomes Mantovani
//Date: 04/09/2023
//Project: Binary Tree Sort
//Description: Test the Binary Tree Sort

package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import nusoft.treeutils.BST;

public class TestBinaryTreeInteger {
	public static void main(String[] args) {
        
		//Instantiate a tree object.
        BST<Integer> tree = new BST<>();

        //Insert at least fifteen (15) random Integer objects into the tree.
        ArrayList<Integer> initialNodes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 15; i++) {
            int value = random.nextInt(100);
            initialNodes.add(value);
            tree.insert(value);
        }
        System.out.println();
        
        //Use the new preorderIterator() method to traverse and print the contents of the tree.
        System.out.println("Preorder traversal:");
        Iterator<Integer> preorderIterator = tree.preorderIterator();
        while (preorderIterator.hasNext()) {
            System.out.print(preorderIterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        //Use the iterator() method to traverse and print the contents of the tree.
        System.out.println("Inorder traversal:");
        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        //Use the new postorderIterator() method to traverse and print the contents of the tree.
        System.out.println("Postorder traversal:");
        Iterator<Integer> postorderIterator = tree.postorderIterator();
        while (postorderIterator.hasNext()) {
            System.out.print(postorderIterator.next() + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //Insert five (5) additional objects into the tree
        for (int i = 0; i <= 4; i++) {
        	int value = random.nextInt(100);
            initialNodes.add(value);
            tree.insert(value);
        }

        //Use the new preorderIterator() method to traverse and print the contents of the tree.
        System.out.println("After adding 5 more nodes:");
        System.out.println();
        System.out.println("Preorder traversal:");
        preorderIterator = tree.preorderIterator();
        while (preorderIterator.hasNext()) {
            System.out.print(preorderIterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        //Use the iterator() method to traverse and print the contents of the tree.
        System.out.println("Inorder traversal:");
        iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        //Use the new postorderIterator() method to traverse and print the contents of the tree.
        System.out.println("Postorder traversal:");
        postorderIterator = tree.postorderIterator();
        while (postorderIterator.hasNext()) {
            System.out.print(postorderIterator.next() + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
        //Delete 3 to 5 objects
        int numNodesToDelete = random.nextInt(3) + 3;
        for (int i = 0; i < numNodesToDelete; i++) {
            int indexToDelete = random.nextInt(initialNodes.size());
            int valueToDelete = initialNodes.get(indexToDelete);
            initialNodes.remove(indexToDelete);
            tree.delete(valueToDelete);
        }

        //Use the new preorderIterator() method to traverse and print the contents of the tree.
        System.out.println("After deleting " + numNodesToDelete + " nodes:");
        System.out.println();
        System.out.println("Preorder traversal:");
        preorderIterator = tree.preorderIterator();
        while (preorderIterator.hasNext()) {
            System.out.print(preorderIterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        //Use the iterator() method to traverse and print the contents of the tree.
        System.out.println("Inorder traversal:");
        iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        //Use the new postorderIterator() method to traverse and print the contents of the tree.
        System.out.println("Postorder traversal:");
        postorderIterator = tree.postorderIterator();
        while (postorderIterator.hasNext()) {
            System.out.print(postorderIterator.next() + " ");
        }
        System.out.println();
    }
}