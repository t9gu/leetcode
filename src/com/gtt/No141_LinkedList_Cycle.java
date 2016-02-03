package com.gtt;

public class No141_LinkedList_Cycle {
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */

	    public boolean hasCycle(ListNode head) {
	        ListNode fast = head;
	        ListNode slow = head;
	        
	        while(fast != null && fast.next != null){
	            fast = fast.next.next;
	            slow = slow.next;
	            if(fast == slow) return true;
	        }
	        return false;
	    }
	
}
