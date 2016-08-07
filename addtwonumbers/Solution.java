public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head=new ListNode(l1.val+l2.val);

        ListNode temp=head;

        int carry=0;

        if(head.val>9)

        {

            head.val-=10;

            carry=1;

        }

        l1=l1.next;

        l2=l2.next;

        while(l1!=null&&l2!=null)

        {

            head.next=new ListNode(l1.val+l2.val+carry);

            if(head.next.val>9)

            {

                head.next.val-=10;

                carry=1;

            }

            else

                carry=0;

            head=head.next;

            l1=l1.next;

            l2=l2.next;

        }

        int i=1;

        while(l1!=null)

        {

            if(i==1)

            {

                head.next=new ListNode(l1.val+carry);

                carry=0;

                i=10;

                if(head.next.val>9)

                {

                    head.next.val-=10;

                    carry=1;i=1;

                }

                else

                carry=0;

            }

            else

                head.next=new ListNode(l1.val);

            head=head.next;

            l1=l1.next;

        }

        if(carry==1&&l2==null)

        {

            head.next=new ListNode(carry);

        return temp;

        }

        while(l2!=null)

        {

            if(i==1)

            {

                head.next=new ListNode(l2.val+carry);

                carry=0;

                i=10;

                if(head.next.val>9)

                {

                    head.next.val-=10;

                    carry=1;i=1;

                }

                else

                carry=0;

            }

            else

            head.next=new ListNode(l2.val);

            head=head.next;

            l2=l2.next;

        }

        if(carry==1)

            head.next=new ListNode(carry);

        return temp;

        

        }
}
