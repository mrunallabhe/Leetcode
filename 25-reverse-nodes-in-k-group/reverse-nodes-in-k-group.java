class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=new ListNode(-1,head), curr=prev, res=prev;
        while(true){
            for(int i=0; i<k; i++){
                if(curr.next==null) return res.next;
                curr=curr.next;
            }
            ListNode newHead=null, temp=prev.next, first=temp, currnext=curr.next;
            while(temp!=currnext){
                ListNode temp2=temp.next;
                temp.next=newHead;
                newHead=temp;
                temp=temp2;
            }
            first.next=currnext;
            prev.next=newHead;
            prev=first;
            curr=prev;
        }
    }
}