/*

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp=head;

        if(head==null)

            return head;

        while(temp.next!=null)

        {

        if(temp.val==temp.next.val)

            temp.next=temp.next.next;

        if(temp.next!=null&&temp.val!=temp.next.val)

        temp=temp.next;

        }

        return head;

    }

}
