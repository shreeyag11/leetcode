// Sort a linked list in O(n log n) time using constant space complexity.

// Example 1:

// Input: 4->2->1->3
// Output: 1->2->3->4
// Example 2:

// Input: -1->5->3->4->0
// Output: -1->0->3->4->5

// Definition for singly-linked list.
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

class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null)
            return head;
        ListNode i = head, j = head.next;
        while (i.next != null) {
            if (j.val < i.val) {
                int temp = i.val;
                i.val = j.val;
                j.val = temp;
            }
            if (j.next == null) {
                i = i.next;
                j = i;
            }
            j = j.next;
        }
        return head;
    }
}