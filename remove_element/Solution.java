public class Solution {

    public int removeElement(int[] nums, int val) {

         int i=0;

        int len=0;

        int flag=1;

        while(i<nums.length)

        {

            //len++;

            while(nums[i]==val&&(i+1)<nums.length)

            {

                flag=0;

                int t=i+1;

                while(t<nums.length&&nums[t]==val)

                {

                    

                    t++;

                }

                if(t<nums.length&&nums[t]!=val)

                {

                nums[i]=nums[t];

                len++;

                nums[t]=val;

          

                }

                i++;

            }

            if(nums[i]==val&&(i+1)>=nums.length)

            {

                flag=0;

            }

            if(flag==1)

                len++;

            i++;

            flag=1;

        

        }

        return len;

      

    }

}


