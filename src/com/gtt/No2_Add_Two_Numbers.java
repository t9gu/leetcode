package com.gtt;

public class No2_Add_Two_Numbers {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */

	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        if(l1 == null && l2 == null) return null;
	        if(l1 == null) return l2;
	        if(l2 == null) return l1;
	        
	        int carry = 0;
	        ListNode p3 = new ListNode(-1);
	        ListNode l3 = p3;
	        while(l1 != null || l2 != null){
	            
	            if(l1 != null){
	                carry += l1.val;
	                l1 = l1.next;
	            }
	            if(l2 != null){
	                carry += l2.val;
	                l2 = l2.next;
	            }
	   
	            l3.next = new ListNode(carry%10);
	            l3=l3.next;
	            carry /= 10;

	        }
	        if(carry == 1) l3.next = new ListNode(1);
	        return p3.next;
	    }
	
}
