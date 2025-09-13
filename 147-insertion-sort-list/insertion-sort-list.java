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
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        // Step 1: Extract values into a list
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }

        // Step 2: Sort values
        int[] a = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            a[i] = res.get(i);
        }
        Arrays.sort(a);

        // Step 3: Rebuild the linked list
        ListNode dummy = new ListNode(0);
        ListNode currNode = dummy;
        for (int val : a) {
            currNode.next = new ListNode(val);
            currNode = currNode.next;
        }

        return dummy.next;
    }
}
