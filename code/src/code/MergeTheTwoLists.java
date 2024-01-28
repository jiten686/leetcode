package code;

public class MergeTheTwoLists {

	public static class ListNode{
		int val;
		ListNode next;
		ListNode(){}
		public ListNode(int val) {
			this.val = val;
		}
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
		
		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}
		
		
	}
	
	/*
	 * Input: list1 = [1,2,4], list2 = [1,3,4]
	 *	Output: [1,1,2,3,4,4]
	 */
	
	public static void main(String[] args) {
		ListNode node3 = new ListNode(4,null);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		
		ListNode node23 = new ListNode(4,null);
		ListNode node22 = new ListNode(3,node23);
		ListNode node21 = new ListNode(1,node22);
		
		print(node1);
		print(node21);
		
		System.out.println(Math.min(1, 1));
		
		print(mergeTwoList(node1,node21));
		
	}

	private static ListNode mergeTwoList(ListNode list1, ListNode list2) {
		
		if(list1==null)
			return list2;
		if(list2==null)
			return list1;
		
		ListNode current;
		
		if (list1.val <= list2.val) {
			current = new ListNode(list1.val);
			current.next = mergeTwoList(list1.next,list2);
		} else{
			current = new ListNode(list2.val);
			current.next = mergeTwoList(list1,list2.next);
		}
		
		return current;
			
		
	}

	private static void print(ListNode node) {
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
		System.out.println();
	}
	
	
	
	

}
