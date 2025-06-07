
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
if(head.next==null){
    return null;
}
//size
int size=0;
ListNode curr=head;
while(curr !=null){
    curr=curr.next;
    size++;
}
if(n==size){
    return head.next;
}
int indexToSearch=size-n;
ListNode perv=head;
int i=1;
while(i<indexToSearch){
    perv=perv.next;
    i++;
}
perv.next=perv.next.next;
return head;
        
    }
}
