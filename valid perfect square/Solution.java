public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
        for(int i=num/2;i>0;i--)
            if(i*i==num)
                return true;
        return false;
    }
}