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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // ListNode curr = head;
        
        // while(right.next != null){
        //     left = left.next;
        //     right = right.next.next;
        //     }
        // }
        
        // if(left <= right){
        //     right.next = left.next.next;
        //     left.next.next = right;
        //     right = left;
        //     left = right;
        // }

        // ListNode current = new ListNode(left);
        // ListNode prev = new ListNode();
        // ListNode after = new Node();
        // while(left != right){
        //     after = current.next;
        //     current.next = prev;
        //     prev = current;
        //     current = after;
        // }
        // return left;


        if (head == null || left == right) return head;

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 1: reach node before 'left'
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: reverse from left to right
        ListNode curr = prev.next;
        ListNode next = null;

        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;      
    }
} 