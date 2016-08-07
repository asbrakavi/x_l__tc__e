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

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root!=null)

        {

            a.add(root.val);

            if(root.left!=null)

                preorderTraversal(root.left);

            if(root.right!=null)

                preorderTraversal(root.right);

        }

        return a;

        

    }

}
