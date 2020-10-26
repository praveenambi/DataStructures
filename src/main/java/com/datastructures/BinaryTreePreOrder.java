package com.datastructures;

public class BinaryTreePreOrder {
	
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
	
	
	
	public static void main(String[] args) {
		BinaryTreePreOrder bintrorder= new BinaryTreePreOrder();
		TreeNode  rootnod = bintrorder.createBinaryTree();
		bintrorder.preOrderTraverse(rootnod);		
	}
	
	
	
	
	
	
	

}
