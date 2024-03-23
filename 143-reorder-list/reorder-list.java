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
    public void reorderList(ListNode head) {
          
        ListNode slow=head;
        ListNode fast =head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        
        Stack<ListNode> s=new Stack<>();
        ListNode temp=slow.next;
        while(temp!=null){
            s.push(temp);
            temp=temp.next;
        }
        slow.next=null;

        ListNode p1 = head;
        while (!s.isEmpty()) {
            ListNode nextP1 = p1.next;
            ListNode stackNode = s.pop();
            p1.next = stackNode;
            stackNode.next = nextP1;
            p1 = nextP1;
        }
    }
}

        

        
