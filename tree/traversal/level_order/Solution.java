public class Solution{
ArrayList a=new ArrayList();
public List<List<Integer>> levelOrder(TreeNode root) {

        

        Queue<TreeNode> q1=new LinkedList();

        q1.add(root);

        TreeNode temp=q1.poll();

        ArrayList anew=new ArrayList();

        Queue<TreeNode> q2=new LinkedList();

        while(temp!=null)

        {

            anew.add(temp.val);

            if(temp.left!=null)

                q2.add(temp.left);

            if(temp.right!=null)

                q2.add(temp.right);

            temp=q1.poll();

            if(temp==null)

            {

                ArrayList x=new ArrayList();

                q1=q2;

                q2=new LinkedList();

                a.add(anew);

                anew=x;

                temp=q1.poll();

            }

        

        }

        //a.add(anew);

      return a;

    }

}
