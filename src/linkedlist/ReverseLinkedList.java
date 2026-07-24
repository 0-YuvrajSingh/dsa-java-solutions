// Pattern: In-place Reversal of Linked List
// LeetCode: 206 (Reverse Linked List)
// Difficulty: Easy

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}