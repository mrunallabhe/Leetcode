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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;
        
        while (current != null && current.next != null) {
            int a = current.val;
            int b = current.next.val;
            int c = calculategcd(a, b);
            
            ListNode newNode = new ListNode(c);
            ListNode next = current.next;  
            current.next = newNode;       
            newNode.next = next;          
            
            current = next;  
        }
        
        return head;
    }
    
    static int calculategcd(int a, int b) {
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}