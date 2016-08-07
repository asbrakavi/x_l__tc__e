public class Solution {

    ArrayList a=new ArrayList();

    public List<Integer> inorderTraversal(TreeNode root) {

      //  ArrayList a=new ArrayList();

      //  TreeNode t=root;

       if(root!=null)

        {

        //if(root.left!=null)

        //if(root==null)

          //  return a;

        if(root.left!=null)

        inorderTraversal(root.left);

        if(root!=null)

        a.add(root.val);

        if(root.right!=null)

        inorderTraversal(root.right);

        }

        //if(t.right.val==root.val)

            //return a;

     //   return a;

       //if(root.left==null&&root.right==null)

         //   return a;

        return a;

    }

}
