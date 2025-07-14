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
    public int getDecimalValue(ListNode head) {
        int sum=0;
        int count=0;
        ListNode curr=head;
        ListNode dummy=head;
        while(curr!=null){
            count++;
            curr=curr.next;

        }
        int i=count-1;
        while(dummy!=null){
            sum+=dummy.val*Math.pow(2,i);
            i--;
            dummy=dummy.next;
        }
        return sum;

        
    }
}