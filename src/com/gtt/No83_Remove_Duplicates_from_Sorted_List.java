package com.gtt;

public class No83_Remove_Duplicates_from_Sorted_List {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */

	    public ListNode deleteDuplicates(ListNode head) {
	         if(head == null || head.next == null) return head;
	         
	         ListNode head1 = head;
	         while(head1 != null && head1.next != null){
	             if(head1.val == head1.next.val){
	                head1.next = head1.next.next;
	             }else{
	                 head1 = head1.next;
	             }
	         }
	         return head;
	    }
	
}
