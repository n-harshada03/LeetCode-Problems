/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        

        ListNode head=node;

        ListNode temp=head;
        temp.val=temp.next.val;
        temp.next=head.next.next;
        


    }
}