class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode dup = head;

        while (dup != null) {

            if (dup.next != null && dup.val == dup.next.val) {

                int value = dup.val;

                while (dup != null && dup.val == value) {
                    dup = dup.next;
                }

                temp.next = dup;

            } else {

                temp.next = dup;
                temp = temp.next;
                dup = dup.next;
            }
        }

        return dummy.next;
    }
}