
public class Solution {

    public ListNode reverseList(ListNode head) {

                        ListNode prev=null;

                ListNode temp=head;

                ListNode n=null;

                while(temp!=null)

                {

                        n=temp.next;

                        temp.next=prev;

                        prev=temp;

                        temp=n;

                        //System.out.println(temp.val);

                }





                //temp=null;

                return prev;



    }

}
