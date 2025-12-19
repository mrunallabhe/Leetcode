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
        ArrayList<Integer> res=new ArrayList<>();
        ListNode dummy=new ListNode(0);
        ListNode result=dummy;
        for(int i=0;i<lists.length;i++){
            ListNode curr=lists[i];
            while(curr!=null){
                res.add(curr.val);
                curr=curr.next;
            }
            } 
        
       Collections.sort(res);
        for(int l=0;l<res.size();l++){
            result.next=new ListNode(res.get(l));
            result=result.next;
        }
        return dummy.next;
        
    }
}