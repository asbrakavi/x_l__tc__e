public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    a.add(nums1[i]);
                    nums1[i]=nums2[j]=-1;
                    break;
                }
            }
            /*if(nums2.c(nums1[i]))
            {
                a.add(nums1[i]);
                System.out.println(nums1[i]);
            }*/
        }
        int[] res=new int[a.size()];
        for(int i=0;i<a.size();i++)
            res[i]=a.get(i);
        return res;
    }
}