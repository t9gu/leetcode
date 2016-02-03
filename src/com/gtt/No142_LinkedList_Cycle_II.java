package com.gtt;

public class No142_LinkedList_Cycle_II {
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
	
	    public ListNode detectCycle(ListNode head) {
	       if(head == null || head.next == null) return null;
	       
	       ListNode slow = head;
	       ListNode fast = head;
	       boolean flag = false;
	       
	       while(fast != null && fast.next != null){
	           slow = slow.next;
	           fast = fast.next.next;
	           if(slow == fast){
	               flag = true;
	               break;
	           }
	       }
	       slow = head;
	       if(flag){
	           while(slow != fast){
	               fast = fast.next;
	               slow = slow.next;
	           }
	           return slow;
	       }
	       return null;
	    }
	
}
