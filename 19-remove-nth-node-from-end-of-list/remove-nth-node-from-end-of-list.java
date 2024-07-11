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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int k=0;
        ListNode node=head;
        while(node!=null){
            k++;
            node=node.next;
            
        }
        int idxToremove=k-n;
        if(idxToremove==0) return head.next;
        ListNode prev=head;
        for(int i=1;i < idxToremove;i++){

            prev=prev.next;
           
        }

         prev.next=prev.next.next;
        
        return head;
    }
}