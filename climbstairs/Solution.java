public class Solution {

    public int fib(int n)

    {

        int[] fib=new int[n+1];

        fib[0]=0;

        fib[1]=1;

        for(int i=2;i<=n;i++)

        {

            fib[i]=fib[i-1]+fib[i-2];

        }

        return fib[n];

        /*if(n<=1)

            return n;

        return fib(n-1)+fib(n-2);

        */

    }

    public int climbStairs(int n) {

        return fib(n+1);

       // int x=(int)Math.pow(2.0,(double)n-1);

        //return x;

        

    }

}
