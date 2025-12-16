class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int number = count - n;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;

        for (int i = 0; i < number; i++) {
            slow = slow.next;  // FIX: correct movement
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}
