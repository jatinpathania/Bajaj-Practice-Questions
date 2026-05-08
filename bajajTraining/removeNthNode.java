class Solution {
    public int size(ListNode head){
        int c=0;
        ListNode t=head;

        while(t!=null){
            c++;
            t=t.next;
        }

        return c;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int m=size(head);

        if(head==null) return null;
        if(m==n) return head.next;

        for(int i=1;i<m-n;i++){
            temp=temp.next;
        }

        temp.next=temp.next.next;

        return head;
    }
}