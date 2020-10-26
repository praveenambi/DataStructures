package com.datastructures;

import com.datastructures.BinaryTree_InOrder.TreeNode;

public class BinaryTree_postorder {
	
	
	/***
	 * The post order traversal will be  left tree. right tree and  root node
	 * @author PRAAMBI
	 *
	 */
	
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
		public void postOrderTraversal(TreeNode root) {
			if (root!=null) {
				
				postOrderTraversal(root.left);
				postOrderTraversal(root.right);
				System.out.print(root.data + " " );
			}
			
		}
	
	
	public static void main(String[] args) {
		BinaryTree_postorder bintrorder= new BinaryTree_postorder();
		TreeNode  rootnod = bintrorder.createBinaryTree();
		bintrorder.postOrderTraversal(rootnod);	
	}
	
	
	
	
	
	
	




	
	

}
