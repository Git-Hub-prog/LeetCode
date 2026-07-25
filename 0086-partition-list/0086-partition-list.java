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
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode largeDummy = new ListNode(0);

        ListNode smallNode = smallDummy;
        ListNode largeNode = largeDummy;

        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = null;

            if(curr.val < x){
                smallNode.next = curr;
                smallNode = curr;
            }else{
                largeNode.next = curr;
                largeNode = curr;
            }
            curr = next;
        }
        smallNode.next = largeDummy.next;
        return smallDummy.next; 
    }
}