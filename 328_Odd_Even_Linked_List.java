/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
			return null;
		}
		ListNode dummy = new ListNode(0);
		ListNode odd = head;
		ListNode even = dummy;
		while (odd != null && even != null) {
			even.next = odd.next;
			even = even.next;
			
			if (odd.next != null && odd.next.next != null) {
				odd.next = odd.next.next;
				odd = odd.next;
			}
			else
				break;
		}
		odd.next = dummy.next;
		return head;
    }
}