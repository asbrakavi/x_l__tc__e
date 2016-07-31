public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int[] a=new int[nums1.length+nums2.length];
     if(nums1!=null)
     System.arraycopy(nums1,0,a,0,nums1.length);
     if(nums2!=null)
     System.arraycopy(nums2,0,a,nums1.length,nums2.length);
     Arrays.sort(a);
     //System.out.println(a.length);
     if(a.length%2!=0)
     {
      //   System.out.println("mod 2 not equal to zeor");
        return a[a.length/2];
     }
   // if(a.length==1)
     //   return a[0];
    double n1=a[(a.length-1)/2];
    double n2=a[a.length/2];
    return (n1+n2)/2;
    }
}