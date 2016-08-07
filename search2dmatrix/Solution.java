public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int count=-1;

        for(int[] x:matrix)

        {

            if(x[0]<=target)

                count++;

            else

                break;

        }

        if(count==-1)count++;

        //System.out.println(count);

        int[] temp=matrix[count];

        for(int x:temp)

        {

           // System.out.println("x="+x);

            if(x==target)

                return true;

        }

//        System.out.println(count);

        return false;

    }

}
