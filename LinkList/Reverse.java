class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null ) 
            return head;
        ListNode p = null;
        ListNode c = head;
        while(c.next!=null){
            ListNode n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        c.next=p;
        return c;
    }
}
