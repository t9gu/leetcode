package com.gtt;

public class No82_Remove_Duplicates_from_Sorted_List_II {
	/**
	 * Definition for singly-linked list. 
	 * public class ListNode { 
	 * int val;
	 * ListNode next; 
	 * ListNode(int x) { val = x; } 
	 * }
	 */

	public ListNode deleteDuplicates(ListNode head) {
		ListNode t = new ListNode(0);
		t.next = head;
		ListNode p = t;
		while (p.next != null && p.next.next != null) {
			if (p.next.val == p.next.next.val) {
				int dup = p.next.val;
				while (p.next != null && dup == p.next.val) {
					p.next = p.next.next;
				}
			} else {
				p = p.next;
			}
		}
		return t.next;
	}

}
