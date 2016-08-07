public class Solution {

    int count;

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp=head;

        count=1;

        if(head.next==null)

            return null;

        while(temp.next!=null)

        {

            count++;

            temp=temp.next;

        }

        count=count-n-1;

        if(count==-1)

            return head.next;

        temp=head;

        while(count>0)

        {

            temp=temp.next;

            count--;

        }

        if(temp.next!=null)

            temp.next=temp.next.next;

        

        return head;

    }

}
