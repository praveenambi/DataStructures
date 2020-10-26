package com.datastructures;

import com.datastructures.BinaryTreePreOrder.TreeNode;


/**
 * The IN order traversal will be   in a format  left subtree , root node  and right subtree
 * 
 * 
 * 
 * @author PRAAMBI
 *
 */

public class BinaryTree_InOrder {
	

	
	// used to create the nodes
	public static class TreeNode {
		
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data){
		this.data = data;
			
		}
	}
	
	public TreeNode createBinaryTree() {
		TreeNode rootnode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node44 = new TreeNode(44);
		TreeNode node60 = new TreeNode(60);
		TreeNode node28 = new TreeNode(28);
		TreeNode node36 = new TreeNode(36);
		
		rootnode.left=node20;
		rootnode.right=node60;
		
		node20.left=node10;
		node20.right=node44;
		
		node60.left=node28;
		node60.right=node36;
		
		return rootnode;
		
	}
	
	// pre order recursive solution
	public void preOrderTraverse(TreeNode root) {
		if (root!=null) {
			System.out.print(root.data +  "  ");
			preOrderTraverse(root.left);
			preOrderTraverse(root.right);
		}
		
	}
	
	
	// pre order recursive solution
		public void InOrderTraversal(TreeNode root) {
			if (root!=null) {
				
				InOrderTraversal(root.left);
				System.out.print(root.data + " " );
				InOrderTraversal(root.right);
			}
			
		}
	
	
	public static void main(String[] args) {
		BinaryTree_InOrder bintrorder= new BinaryTree_InOrder();
		TreeNode  rootnod = bintrorder.createBinaryTree();
		bintrorder.InOrderTraversal(rootnod);	
	}
	
	
	
	
	
	
	



}
