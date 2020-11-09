/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode node = res;
        int r = 0, q = 0;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int val = x + y + r;
            r = val / 10;
            q = val % 10;
            ListNode temp = new ListNode(q);
            node.next = temp;
            node = node.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        if (r > 0) {
            ListNode temp = new ListNode(1);
            node.next = temp;
            node = node.next;
        }
        return res.next;
    }
}