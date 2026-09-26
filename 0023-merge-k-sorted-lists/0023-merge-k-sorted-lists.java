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
    public ListNode mergeKLists(ListNode[] lists) {
   PriorityQueue<ListNode> q=new PriorityQueue<>((a,b)->a.val-b.val);
   for(ListNode head:lists)
   {if(head!=null)
    {q.add(head);}
   }
ListNode dummy=new ListNode(-1);
ListNode tail=dummy;
while(!q.isEmpty())
{
    ListNode curr=q.poll();
     tail.next=curr;
     tail=tail.next;
     if(curr.next!=null)
     {
        q.add(curr.next);
     }
}
return dummy.next;
    }
}