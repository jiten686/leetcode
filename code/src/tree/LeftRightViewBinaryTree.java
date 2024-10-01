package tree;

import java.util.HashMap;
import java.util.Map;

class BTNode {

	int data;
	BTNode left;
	BTNode right;

	BTNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class LeftRightViewBinaryTree {

	public static void main(String[] args) {
		BTNode n1, n2, n3, n4, n5, n6, n7, root;

		n1 = new BTNode(50);
		n2 = new BTNode(20);
		n3 = new BTNode(100);
		n4 = new BTNode(10);
		n5 = new BTNode(30);
		n6 = new BTNode(80);
		n7 = new BTNode(90);

		n1.left = n2;
		n1.right = n3;

		n2.left = n4;
		n2.right = n5;

		n3.left = n6;

		n6.right = n7;

		root = n1;
		
		/*
		 * 				  50
		 * 			20			100
		 * 		10		30   80
		 * 						90
		 */

		System.out.println("leftViewBinaryTree");
		
		leftViewBinaryTree(root);
		System.out.println("rightViewBinaryTree");
		rightViewBinaryTree(root);
	}

	private static void leftViewBinaryTree(BTNode root) {
		Map<Integer, BTNode> map = new HashMap<>();

		leftViewUtil(root, map, 0);

		for (Map.Entry<Integer, BTNode> BTNode : map.entrySet())
			System.out.println("level : " + BTNode.getKey() + " => " + BTNode.getValue().data);
	}

	private static void leftViewUtil(BTNode BTNode, Map<Integer, BTNode> map, int level) {

		if (BTNode == null)
			return;

		if (map.get(level) == null) {
			map.put(level, BTNode);
		}

		leftViewUtil(BTNode.left, map, level + 1);
		leftViewUtil(BTNode.right, map, level + 1);

	}

	private static void rightViewBinaryTree(BTNode root) {
		Map<Integer, BTNode> map = new HashMap<>();

		rightViewUtil(root, map, 0);

		for (Map.Entry<Integer, BTNode> BTNode : map.entrySet())
			System.out.println("level : " + BTNode.getKey() + " => " + BTNode.getValue().data);

	}

	private static void rightViewUtil(BTNode BTNode, Map<Integer, BTNode> map, int level) {
		if (BTNode == null)
			return;

		map.put(level, BTNode);

		rightViewUtil(BTNode.left, map, level + 1);
		rightViewUtil(BTNode.right, map, level + 1);

	}

}
