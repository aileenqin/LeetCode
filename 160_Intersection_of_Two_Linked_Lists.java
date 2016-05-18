/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
			return null;
		}
		ListNode p1 = headA;
		ListNode p2 = headB;
		int len1 = 0, len2 = 0;
		while (p1 != null) {
			len1++;
			p1 = p1.next;
		}
		while (p2 != null) {
			len2++;
			p2 = p2.next;
		}
		
		p1 = headA;
		p2 = headB;
		if (len1 > len2) {
			int diff = len1 - len2;
			for (int i = 0; i < diff; i++) {
				p1 = p1.next;
			}
		}
		else {
			int diff = len2 - len1;
			for (int i = 0; i < diff; i++) {
				p2 = p2.next;
			}
		}
		
		while (p1 != null && p2 != null) {
			if (p1.val == p2.val) {
				return p1;
			}
			else {
				p1 = p1.next;
				p2 = p2.next;
			}
			
		}
		return null;
    }
}