package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

// Definition for singly-linked list.

public class Solution3 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

	private static ListNode getLinkedList(List<Integer> listtobuild) {
		ListIterator<Integer> gfg_itr = listtobuild.listIterator(listtobuild.size());

		// hasPrevious() returns true if the list has
		// previous element
		ListNode ln = null;
		ListNode ln1 = null;
		while (gfg_itr.hasPrevious()) {
			// Iterate in reverse
			int prev = gfg_itr.previous();
			if (ln != null) {
				ln = new ListNode(prev, ln1);
				ln.val = prev;
				ln1 = ln;
			} else {
				ln = new ListNode(prev, null);
				ln1 = ln;

			}

		}
		return ln;
	}

	public static void main(String[] args) {
		/*
		 * ListNode ln = new ListNode(3, null); ListNode ln1 = new ListNode(4, ln);
		 * ListNode ln2 = new ListNode(2, ln1);
		 * 
		 * ListNode ln3 = new ListNode(4, null); ListNode ln4 = new ListNode(6, ln3);
		 * ListNode ln5 = new ListNode(5, ln4);
		 */
		/*
		 * ListNode ln2 = new ListNode(0, null); ListNode ln5 = new ListNode(0, null);
		 */
		List<Integer> listtobuild = new ArrayList<Integer>();
		listtobuild.add(9);
		listtobuild.add(9);
		listtobuild.add(9);
		listtobuild.add(9);
		listtobuild.add(9);
		listtobuild.add(9);
		listtobuild.add(9);

		ListNode ln1 = getLinkedList(listtobuild);
		listtobuild = new ArrayList<Integer>();

		listtobuild.add(9);
		listtobuild.add(9);
		listtobuild.add(9);
		listtobuild.add(9);

		ListNode ln2 = getLinkedList(listtobuild);

		System.out.println(ln1);
		System.out.println(ln2);

		Solution3 solution = new Solution3();
		System.out.println(solution.addTwoNumbers(ln1, ln2));

	}
}
