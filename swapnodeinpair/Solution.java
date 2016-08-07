public class Solution {

    public ListNode swapPairs(ListNode head) {

        ListNode temp=head;

        int a;

        if(head==null)

            return head;

        while(temp!=null&&temp.next!=null)

        {

            //int a;

            a=temp.val;

            temp.val=temp.next.val;

            temp.next.val=a;

            temp=temp.next.next;

        }

        return head;

    }

}
