class Solution {
public:
    int addDigits(int num) {
        int new_num=0;
        int rem;
        while(num>0)
        {
            rem=num%10;
            new_num+=rem;
            num/=10;
        }
        if(new_num<10)
            return new_num;
        return addDigits(new_num);
    }
};