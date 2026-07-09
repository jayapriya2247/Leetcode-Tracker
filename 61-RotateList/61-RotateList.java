// Last updated: 7/9/2026, 3:09:04 PM
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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        // Edge cases: empty list, single node, or no rotation needed
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Calculate the length and find the tail
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Optimize k
        // If k is greater than length, we only need the remainder
        k = k % length; 
        if (k == 0) {
            return head; // No change needed if k is multiple of length
        }

        // Step 3: Connect tail to head to form a circle
        tail.next = head;

        // Step 4: Find the new tail
        // We need to move 'length - k' steps forward from the current tail
        int stepsToNewTail = length - k;
        for (int i = 0; i < stepsToNewTail; i++) {
            tail = tail.next;
        }

        // Step 5: Break the circle
        ListNode newHead = tail.next;
        tail.next = null;

        return newHead;
    }
}