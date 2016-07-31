////lca

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root||q==root)
            return root;
        if(p.left==q||p.right==q)
            return p;
        if(q.left==p||q.right==p)
            return q;
        if(p.val<root.val&&q.val>root.val)
            return root;
        if(q.val<root.val&&p.val>root.val)
            return root;
        if(p.val<root.val&&q.val<root.val)
            return lowestCommonAncestor(root.left,p,q);
        return lowestCommonAncestor(root.right,p,q);
    }
}