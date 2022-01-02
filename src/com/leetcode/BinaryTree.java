package com.leetcode;
public class BinaryTree {
	TreeNode root;

	// A utility function to check if a given node is leaf or not
	boolean isLeaf(TreeNode node) {
		if (node == null)
			return false;
		if (node.left == null && node.right == null)
			return true;
		return false;
	}

	// This function returns sum of all left leaves in a given
	// binary tree
	int leftLeavesSum(TreeNode node) {
		// Initialize result
		int res = 0;

		// Update result if root is not NULL
		if (node != null) {
			// If left of root is NULL, then add key of
			// left child
			if (isLeaf(node.left))
				res += node.left.data;
			else // Else recur for left child of root
				res += leftLeavesSum(node.left);

			// Recur for right child of root and update res
			res += leftLeavesSum(node.right);
		}

		// return result
		return res;
	}

	// Driver program
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(20);
		tree.root.left = new TreeNode(9);
		tree.root.right = new TreeNode(49);
		tree.root.left.right = new TreeNode(12);
		tree.root.left.left = new TreeNode(5);
		tree.root.right.left = new TreeNode(23);
		tree.root.right.right = new TreeNode(52);
		tree.root.left.right.right = new TreeNode(12);
		tree.root.right.right.left = new TreeNode(50);

		System.out.println("The sum of leaves is " + tree.leftLeavesSum(tree.root));
	}
}