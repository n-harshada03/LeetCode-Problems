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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list=new ArrayList<>();
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            
            int Value=(l1!=null?l1.val:0)+(l2!=null?l2.val:0) + carry;
            carry=Value/10;

            if(Value>9){
                list.add(Value%10);
            }
            else{
                list.add(Value);
            }
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }

    ListNode node=null;
    ListNode head=null;
    for(int i=0;i<list.size();i++){
        if(node==null){
            node=new ListNode(list.get(i));
            head=node;
        }
        else{
            node.next=new ListNode(list.get(i));
            node=node.next; 
        }
    }
    return head;   
    }
}