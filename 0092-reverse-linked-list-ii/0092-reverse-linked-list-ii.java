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
    public ListNode reverseBetween(ListNode head, int left, int right) {
     int i=1;
       if (head == null || left == right) {
            return head;
        }
     ListNode dummy=new ListNode(-1);
     ListNode before=dummy;
     dummy.next=head;
     while(i<left){
        before=before.next;
        i++;
     }
     ListNode curr=before.next;
     ListNode tail=curr;
     ListNode prev=null;
     while(curr!=null && i<=right){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        i++;
     }
     before.next=prev;//connecting lat element to left part
        tail.next=curr;// connecting to right part with tail pointer which initially points to curr
        return dummy.next;
    }
}