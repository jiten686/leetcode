package tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class Pair {
	int hd;
	Node node;

	public Pair(int hd, Node node) {
		this.hd = hd;
		this.node = node;
	}

}

public class TopBottomViewBinaryTree {

	public static void main(String[] args) {
		Node n1, n2, n3, n4, n5, n6, n7, root;

		n1 = new Node(50);
		n2 = new Node(20);
		n3 = new Node(100);
		n4 = new Node(10);
		n5 = new Node(30);
		n6 = new Node(80);
		n7 = new Node(90);

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


		System.out.println("topViewBinaryTree");

		topViewBinaryTree(root);
		System.out.println();
		System.out.println("bottomViewBinaryTree");
		bootomViewBinaryTree(root);
	}



	private static void topViewBinaryTree(Node root) {
		if(root == null)
			return;
		
		Queue<Pair> q = new LinkedList<>();
		Map<Integer, Node> map = new TreeMap<>(); // TreeMap to do sorting based on key i.e -1, 0, 1...
		
		q.add(new Pair(0, root));
		
		while(!q.isEmpty()) {
			Pair curr = q.poll();
			
			if(!map.containsKey(curr.hd)) {
				map.put(curr.hd, curr.node);
			}
			
			if(curr.node.left!=null) {
				q.add(new Pair(curr.hd-1 , curr.node.left));
			}
			
			if(curr.node.right!=null) {
				q.add(new Pair(curr.hd+1,curr.node.right));
			}
			
		}
		
		for(Map.Entry<Integer, Node> pair : map.entrySet()) {
			System.out.print(pair.getValue().data+" ");
		}
		
	}
	
	
	private static void bootomViewBinaryTree(Node root) {
		if(root == null)
			return;
		
		Queue<Pair> q = new LinkedList<>();
		Map<Integer, Node> map = new TreeMap<>(); // TreeMap to do sorting based on key i.e -1, 0, 1...
		
		q.add(new Pair(0, root));
		
		while(!q.isEmpty()) {
			Pair curr = q.poll();
			
			map.put(curr.hd, curr.node);
			
			
			if(curr.node.left!=null) {
				q.add(new Pair(curr.hd-1 , curr.node.left));
			}
			
			if(curr.node.right!=null) {
				q.add(new Pair(curr.hd+1,curr.node.right));
			}
			
		}
		
		for(Map.Entry<Integer, Node> pair : map.entrySet()) {
			System.out.print(pair.getValue().data+" ");
		}
		
	}

}
