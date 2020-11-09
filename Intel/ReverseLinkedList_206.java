/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode node = new ListNode(head.val);
        node.next = null;
        head = head.next;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = node;
            node = temp;
            head = head.next;
        }
        return node;
    }
}
