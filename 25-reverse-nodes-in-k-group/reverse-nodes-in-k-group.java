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
    ListNode findKthNode(ListNode temp,int k){

        ListNode curr=temp;
        while(curr!=null && k>1){
            
            curr=curr.next;
            k--;
        }
        return curr;

    }
    ListNode reverseList(ListNode temp){
        ListNode curr=temp;
        ListNode prev=null;
        ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null)return head;

        ListNode temp=head;
        ListNode prevNode=null;
        ListNode nextNode=null;
        while(temp!=null){
            ListNode kthNode=findKthNode(temp,k);

            if(kthNode==null){
                if(prevNode!=null){
                    prevNode.next=temp;
                    break;
                }
            }

            nextNode =kthNode.next;
            kthNode.next=null;


            reverseList(temp);

            if(temp==head){
                head=kthNode;
            }
            else {
                prevNode.next=kthNode;
            }

            prevNode=temp;
            temp=nextNode;

        }

        return head;
        
    }
}