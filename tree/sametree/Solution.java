public class Solution {
	//arr={1,2,-1,3,4,5,-10,6,7,8};
	//arr={1,2,-1,3,4,5,-10,6,7,8};

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null&&q==null)

            return true;

        if((p==null&&q!=null)||(p!=null&&q==null))

            return false;

        return (p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right));

        

    //    return false;

        

    }

}
