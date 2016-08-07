/*

 * public class TreeNode {

 *     int val;

 *     TreeNode left;

 *     TreeNode right;

 *     TreeNode(int x) { val = x; }

 * }

 */

public class Solution {

    ArrayList a=new ArrayList();

    public List<Integer> postorderTraversal(TreeNode root) {

        if(root!=null)

        {

            if(root.left!=null)

                postorderTraversal(root.left);

            if(root.right!=null)

                postorderTraversal(root.right);

            a.add(root.val);

        }

        return a;

    }

}
