public class Solution {

    public void moveZeroes(int[] nums) {

        int i=0;

        

        while(i<nums.length)

        {

            //System.out.println(i+" "+nums.length);

            while(nums[i]==0&&(i+1)<nums.length)

            {

               // System.out.println(i+" "+nums[i]);

                int t=i+1;

                while(t<nums.length&&nums[t]==0)

                {

                    t++;

                }

                if(t<nums.length)

                {

                nums[i]=nums[t];

                nums[t]=0;

                }

                i++;

            }

            i++;

        }

    }

}
