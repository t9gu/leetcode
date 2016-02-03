package com.gtt;

public class No19_Remove_Nth_Node_From_End_of_List {
	/**
	 * Definition for singly-linked list. public class ListNode { int val;
	 * ListNode next; ListNode(int x) { val = x; } }
	 */

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;

		ListNode p = head;
		int count = 0;
		while (p.next != null) {
			count++;
			p = p.next;
		}

		int target = count - n + 1;
		if (target == 0)
			return head.next;

		p = head;
		int i = 0;
		while (p != null) {
			i++;
			if (i == target) {
				p.next = p.next.next;
			}
			p = p.next;
		}
		return head;

	}

}
