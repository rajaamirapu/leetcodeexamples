package com.leetcode;

public class Solution9 {
	static ListNode head;
	static ListNode temp;

	static ListNode mergeKLists(ListNode[] lists) {
		if(lists.length<=0){
			 return new ListNode();
		}
		int last=lists.length-1;
		for (int i = 1; i <= last; i++) {
			while (true) {
				ListNode head_0 = lists[0];
				ListNode head_i = lists[i];
				if (head_i == null)
					break;
				if (head_0.next.val >= head_i.val) {
					lists[i] = head_i.next;
					head_i.next = head_0;
					lists[0] = head_i;
				} else {
					while (head_0.next != null)
					{
						 if (head_0.next.val >= head_i.val)
				            {
							 lists[i] = head_i.next;
				              head_i.next = head_0.next;
				              head_0.next = head_i;
				              break;
				            }
						 head_0 = head_0.next;
						 if (head_0.next == null) {
							 lists[i] = head_i.next;
							 head_i.next = null;
							 head_0.next = head_i;
							 head_0.next.next = null;
							 break;
						 }
					}
				}
			}
		}
		return lists[0];
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");

			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n = 4;
		int k = 3;
		
		ListNode[] arr = {};
		/*
		 * arr[0] = new ListNode(1); arr[0].next = new ListNode(3); arr[0].next.next =
		 * new ListNode(5); arr[0].next.next.next = new ListNode(7);
		 * 
		 * arr[1] = new ListNode(2); arr[1].next = new ListNode(4); arr[1].next.next =
		 * new ListNode(6); arr[1].next.next.next = new ListNode(8);
		 * 
		 * arr[2] = new ListNode(0); arr[2].next = new ListNode(9); arr[2].next.next =
		 * new ListNode(10); arr[2].next.next.next = new ListNode(11);
		 */		
		head = mergeKLists(arr);
		printList(head);

	}
}
