package com.gtt;

public class No226_Invert_Binary_Tree {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	
	    public TreeNode invertTree(TreeNode root) {
	        //set pointer
	       if(root != null){
	           subInvert(root);
	       }
	       return root;
	    }
	    
	    public static void subInvert(TreeNode count){
	        TreeNode rem = null;
	        
	            rem = count.left;
	            count.left = count.right;
	            count.right = rem;
	           
	        if(count.left != null){
	            subInvert(count.left);
	        }
	        if(count.right != null){
	            subInvert(count.right);
	        }
	    
	    }
	
}
