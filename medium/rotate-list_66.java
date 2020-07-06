// Given a linked list, rotate the list to the right by k places, where k is non-negative.

// Example 1:

// Input: 1->2->3->4->5->NULL, k = 2
// Output: 4->5->1->2->3->NULL
// Explanation:
// rotate 1 steps to the right: 5->1->2->3->4->NULL
// rotate 2 steps to the right: 4->5->1->2->3->NULL
// Example 2:

// Input: 0->1->2->NULL, k = 4
// Output: 2->0->1->NULL
// Explanation:
// rotate 1 steps to the right: 2->0->1->NULL
// rotate 2 steps to the right: 1->2->0->NULL
// rotate 3 steps to the right: 0->1->2->NULL
// rotate 4 steps to the right: 2->0->1->NULL

//  Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Rotate {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        ListNode slow = head, fast = head;
        int len = 1;
        while (fast.next != null) {
            len++;
            fast = fast.next;
        }
        for (int j = len - k % len; j > 1; j--) // Get the i-n%i th node
            slow = slow.next;

        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}