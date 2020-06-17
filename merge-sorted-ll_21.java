// Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

// Example:

// Input: 1->2->4, 1->3->4
// Output: 1->1->2->3->4->4

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

class MergeLL {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode dummy = res;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                res.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                res.next = l1;
                l1 = l1.next;
            } else if (l1.val >= l2.val) {
                res.next = l2;
                l2 = l2.next;
            } else if (l1.val < l2.val) {
                res.next = l1;
                l1 = l1.next;
            }
            res = res.next;

        }
        return dummy.next;
    }
}