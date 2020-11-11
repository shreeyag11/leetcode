package Intel;

public class PalindromeLL_234 {
    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode
     * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
     * ListNode next) { this.val = val; this.next = next; } }
     */
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            fast = head;
            slow = reverseList(slow);
            while (slow != null) {
                if (fast.val != slow.val)
                    return false;
                slow = slow.next;
                fast = fast.next;
            }
            return true;
        }

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
}
