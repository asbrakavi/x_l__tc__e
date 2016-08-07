////not accepted!!
import java.util.Arrays;
public class Solution
{
	public static int coinChange(int[] coins,int amount)
	{
		if(amount<0)return -1;
		if(amount==0)	return 0;
		Arrays.sort(coins);
		int l=coins.length;
		int tempamount=amount;
		int count=0;
		for(int i=l-1;i>=0;i--)
		{
			tempamount=amount;
			count=0;
			for(int j=i;j>=0;j--)
			{
				while(tempamount-coins[j]>=0)
				{
					tempamount-=coins[j];
					count++;
				}
				if(tempamount==0)
					return count;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int[] arr=new int[]{186,419,83,408};
		//arr={1,2,5};
		int num=6249;
		/*for this input answer is 20 but this routine gives -1---->  figure out how
		System.out.println(coinChange(arr,num));
	}
}
