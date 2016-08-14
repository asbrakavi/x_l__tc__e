public class NumArray {

    public int[] arr;
    public NumArray(int[] nums) {
        arr=new int[nums.length];
        if(nums.length>=1)
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            arr[i]=arr[i-1]+nums[i];
            System.out.println(i+" "+arr[i]);
        }
      //  arr=new int[nums.length];
        //arr=Arrays.copyOf(nums,nums.length);
    }

    public int sumRange(int i, int j) {
        //int sum=0;
        //for(int k=i;k<=j;k++)
          //  sum+=arr[k];
          if(i==0)
            return arr[j];
        return arr[j]-arr[i-1];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);