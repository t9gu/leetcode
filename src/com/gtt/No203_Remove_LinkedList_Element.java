package com.gtt;

public class No203_Remove_LinkedList_Element {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	
	    public ListNode removeElements(ListNode head, int val) {
	        ListNode t = new ListNode(0);
	        t.next = head;
	        ListNode  p = t;
	        
	        while(p.next != null){
	            if(p.next.val ==  val){
	                int dup = p.next.val;
	                while(p.next != null && dup == p.next.val){
	                    p.next = p.next.next;
	                }
	            }else{
	                p = p.next;
	            }
	        }
	        return t.next;
	    }
	
}
