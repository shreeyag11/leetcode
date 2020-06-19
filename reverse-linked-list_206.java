// Reverse a singly linked list.

// Example:

// Input: 1->2->3->4->5->NULL
// Output: 5->4->3->2->1->NULL
// Follow up:

// A linked list can be reversed either iteratively or recursively. Could you implement both?

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        ListNode node = new ListNode(head.val);
        head=head.next;
        while(head!=null){
            ListNode temp = new ListNode(head.val);
            temp.next = node;
            node = temp;
            head = head.next;
        }
        return node;
    }
}