class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;         

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null) {
            if (slow.val == fast.val) {
                slow.next = fast.next; 
                fast = slow.next;       
            } else {
                slow = slow.next;       
                fast = fast.next;       
            }
        }

        return dummy.next;              // FIX: return correct head
    }
}
