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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode second=slow.next;
        slow.next=null;//breaking the link is mandatory since this is linked list
        ListNode left=sortList(head);
        ListNode right=sortList(second);//Represented as new list
        return merge(left,right);
    }
    private ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        while(l1!=null){
            curr.next=l1;
            curr=curr.next;
            l1=l1.next;
        }
         while(l2!=null){
            curr.next=l2;
            curr=curr.next;
            l2=l2.next;
        }
        return dummy.next;
    }
}