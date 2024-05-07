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
    public ListNode doubleIt(ListNode head) {
        ListNode reversedHead=reverseList(head);

        ListNode curr=reversedHead;
        ListNode prev =null;

        int carry =0;
        while(curr!=null){
            int newVal= curr.val=curr.val*2 + carry;

            carry =newVal / 10;
            
            curr.val= newVal %10;
            
            prev=curr;
            curr=curr.next;
        }


        if(carry >0){
            prev.next=new ListNode(carry);
        }

        return reverseList(reversedHead);

        
    }
    public ListNode reverseList(ListNode head ){
        ListNode prev =null;
        ListNode curr=head;
        
        while(curr!= null){
            ListNode next =curr.next;
            curr.next =prev;
            prev=curr;
            curr=next;
            
        }
        return prev;
    }
}