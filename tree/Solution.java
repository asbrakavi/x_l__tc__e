/*

 * public class TreeNode {

 *     int val;

 *     TreeNode left;

 *     TreeNode right;

 *     TreeNode(int x) { val = x; }

 * }

 */
//mirror image or symmetric tree
public class Solution {

        public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null&&q==null)

            return true;

        if((p==null&&q!=null)||(p!=null&&q==null))

            return false;

        return (p.val==q.val&&isSameTree(p.left,q.right)&&isSameTree(p.right,q.left));

        }



    public boolean isSymmetric(TreeNode root) {

 //       public class Solution {

   // public boolean isSameTree(TreeNode p, TreeNode q) {

        /*if(root.left==null&&root.right==null)

            return true;

            */

        

         //   if(root.left.val!=root.right.val)

                //return false;

        if(root==null)

            return true;

        if((root.left==null&&root.right!=null)||(root.left!=null&&root.right==null))

            return false;

        return isSameTree(root.left,root.right);

        

    //    return false;

        

    //}

//}

    }

}
