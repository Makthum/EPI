package com.ibm.epi.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<Item> {

	BinaryTreeNode<Item> root;

	public void add(Item item) {
		if (root == null) {
			root = new BinaryTreeNode<Item>(item);
		} else {
			Queue<BinaryTreeNode<Item>> q = new LinkedList<>();
			q.add(root);
			while (!q.isEmpty()) {
				BinaryTreeNode<Item> temp = q.poll();
				if (temp.left == null) {
					temp.left = new BinaryTreeNode<Item>(item);
					break;
				} else if (temp.right == null) {
					temp.right = new BinaryTreeNode<Item>(item);
					break;
				}
				q.add(temp.left);
				q.add(temp.right);
			}
		}
	}

	public void traversePreOrder() {
		this.traversePreOrder(root);
	}

	private void traversePreOrder(BinaryTreeNode<Item> node) {
		BinaryTreeNode<Item> current = node;
		if (current == null)
			return;
		traverseInOrder(node.left);
		System.out.println(node.item.toString());
		traverseInOrder(node.right);
	}

	public void traverseInOrder() {
		this.traverseInOrder(root);
	}

	private void traverseInOrder(BinaryTreeNode<Item> node) {
		BinaryTreeNode<Item> current = node;
		if (current == null)
			return;
		System.out.println(node.item.toString());
		traverseInOrder(node.left);
		traverseInOrder(node.right);
	}

	public void traversePostOrder() {
		this.traversePostOrder(root);
	}

	private void traversePostOrder(BinaryTreeNode<Item> node) {
		BinaryTreeNode<Item> current = node;
		if (current == null)
			return;
		traverseInOrder(node.left);
		traverseInOrder(node.right);
		System.out.println(node.item.toString());
	}

	public boolean isBalanced() {
		return isBalanced(root);
	}

	private boolean isBalanced(BinaryTreeNode<Item> node) {
		if (node == null)
			return true;
		if (Math.abs(height(node.left) - height(node.right)) >= 2)
			return false;
		return isBalanced(node.left) && isBalanced(node.right);
	}

	private int height(BinaryTreeNode<Item> node) {
		if (node == null)
			return -1;
		return Math.max(height(node.left), height(node.right)) + 1;
	}

	public boolean isSymmentrical() {
		return isSymmentrical(root.left, root.right);
	}

	private boolean isSymmentrical(BinaryTreeNode<Item> leftSubTree, BinaryTreeNode<Item> rightSubTree) {
		if (leftSubTree == null && rightSubTree == null)
			return true;
		if (leftSubTree != null && rightSubTree != null) {
			return leftSubTree.item.equals(rightSubTree.item) && isSymmentrical(leftSubTree.left, rightSubTree.right)
					&& isSymmentrical(leftSubTree.right, rightSubTree.left);
		} else
			return false;
	}

	public BinaryTreeNode<Item> commonAncestor(BinaryTreeNode<Item> item1, BinaryTreeNode<Item> item2) {
		return this.commonAncestor(root, item1, item2);

	}

	private BinaryTreeNode<Item> commonAncestor(BinaryTreeNode<Item> root, BinaryTreeNode<Item> item1,
			BinaryTreeNode<Item> item2) {
		if (root == null)
			return null;
		if (root == item1 || root == item2)
			return root;

		BinaryTreeNode<Item> lLca = commonAncestor(root.left, item1, item2);
		BinaryTreeNode<Item> rLca = commonAncestor(root.right, item1, item2);

		if (lLca != null && rLca != null)
			return root;

		if (lLca != null)
			return lLca;
		else
			return rLca;

	}
}
