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

        // int size=0;
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode temp=head;
        int size=0;

        while(temp!=null){
            size++;
            temp=temp.next;
        }
        k=k%size;
        if(k==0){
            return head;
        }

        ListNode dummy =head;
        for(int i=0;i<size-k-1;i++){
            dummy=dummy.next;
        }   

        ListNode newHead=dummy.next;
        dummy.next=null;

        ListNode newNode=newHead;
        while(newNode.next!=null){
            newNode=newNode.next;
        }   

        newNode.next=head;
               
        return newHead;
    }
}