/*definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null&&l2==null)

            return l1;

        ListNode res=new ListNode(0);

        ListNode ans=new ListNode(0);

        int count=0;

        while(l1!=null&&l2!=null)

        {

            if(l1.val<l2.val)

            {

                

                ListNode temp=new ListNode(l1.val);

                l1=l1.next;

                   if(count==0)

                    {

                       // ans=res;

                        res=temp;

                        ans=res;

                        count++;    

                    }

                    else

                    {

                        res.next=temp;

                        res=res.next;

                    }        

            }

            else

            {

                ListNode temp=new ListNode(l2.val);

                l2=l2.next;

                if(count==0)

                    {

                        //ans=res;

                        res=temp;

                        ans=res;

                        count++;    

                    }

                    else

                    {

                        res.next=temp;

                        res=res.next;

                    }

            }

         

        }

        while(l1!=null)

        { ListNode temp=new ListNode(l1.val);

                l1=l1.next;

                   if(count==0)

                    {

                       // ans=res;

                        res=temp;

                        ans=res;

                        count++;    

                    }

                    else

                    {

                        res.next=temp;

                        res=res.next;

                    }        

            

        }

        while(l2!=null)

        {

            ListNode temp=new ListNode(l2.val);

                l2=l2.next;

                if(count==0)

                    {

                        //ans=res;

                        res=temp;

                        ans=res;

                        count++;    

                    }

                    else

                    {

                        res.next=temp;

                        res=res.next;

                    }

            

        }

        return ans;

    }

}
