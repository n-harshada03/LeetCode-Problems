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
        ListNode finalList=new ListNode();
        // if(list1==null && list2==null) return final;
       
        ListNode current=finalList;

        ListNode ptr1=list1;
        ListNode ptr2=list2;

        while(ptr1!=null && ptr2!=null){
            if(ptr1.val <=ptr2.val){
                current.next=ptr1;
                ptr1=ptr1.next;
            }
            else if(ptr1.val > ptr2.val){
                current.next=ptr2;
                ptr2=ptr2.next;
            }
            current=current.next;
        }

        if(ptr1!=null){
            current.next=ptr1;
            }
        else {
            current.next=ptr2;
            }
        return finalList.next;
        
    }
}