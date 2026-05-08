class Solution {
    public ListNode deleteDuplicates(ListNode head){
        ListNode temp=head;
        if(head==null) return null;
        while(temp!=null){
            if(temp.next!=null && temp.next.val==temp.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}