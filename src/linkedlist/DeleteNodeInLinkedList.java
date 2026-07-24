// Pattern: Linked List Manipulation
// LeetCode: 237 (Delete Node in a Linked List)
// Difficulty: Medium

class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        curr.val = curr.next.val;
        curr.next = curr.next.next;
    }
}