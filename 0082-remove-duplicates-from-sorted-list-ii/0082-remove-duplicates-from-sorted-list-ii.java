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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode dummy = prev;
        boolean flag = false;
        
        while(temp != null && temp.next != null){
            while(temp.next != null && temp.val == temp.next.val){
                temp.next = temp.next.next;
                flag = true;
            }if(flag == true){
                prev.next = temp.next;
                temp = prev.next;
                flag = false;
            }else{
                prev = temp;
                temp = temp.next;
            }
           
        }
        return dummy.next;
        
    }
}