package com.gtt;

public class No206_Reverse_LinkedList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	
	    public ListNode reverseList(ListNode head) {
	        if(head == null || head.next == null) return head;
	        
	        ListNode reHead = null;
	        ListNode cur = head;
	        
	        while(cur != null){
	            ListNode preCur = cur;
	            cur = cur.next;
	            preCur.next = reHead;
	            reHead = preCur;
	        }
	        return reHead;
	    }
	
}
