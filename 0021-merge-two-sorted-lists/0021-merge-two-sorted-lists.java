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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {  

        // through this code we have to use extra space
        // ListNode temp1 = list1;
        // ListNode temp2 = list2;
        // ListNode head = new ListNode(3);
        // ListNode temp = head;
        // while(temp1 != null && temp2 != null){
        //     if(temp1.val <= temp2.val){
        //         ListNode a = new ListNode(temp1.val);
        //         temp.next = a;
        //         temp = a;
        //         temp1 = temp1.next;
        //     }else{
        //         ListNode a = new ListNode(temp2.val);
        //         temp.next = a;
        //         temp = a;
        //         temp2 = temp2.next; 
        //     }
        // }
        // if(temp1 != null){
        //     temp.next = temp1;
        // }else{
        //     temp.next = temp2;
        // }
        // return head.next;  // our new linked list will be from head.next because at head i give a value myself so i return it after this node 

        // without using extra space 
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(3);
        ListNode temp = head;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1 != null){
            temp.next = temp1;
        }
        if(temp2 != null){
            temp.next = temp2;
        }
        return head.next;
        
    }
}