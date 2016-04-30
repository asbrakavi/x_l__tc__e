class Solution {
public:
    bool isPalindrome(int x) {
    //    cout<<"here "<<x<<endl;
       int flag=0;
        if(x<0)
            return false;
      /*  if(x<(-2147483640))
            return false;
    */
      //  cout<<"out of if"<<endl;
      /*  if(x<0)
        {
            //cout<<"inside if"<<endl;
            //int t=x<-2147483640;
            //cout<<x<<'\t'<<t<<endl;
            x=abs(x);
            flag=1;
            
        }
        */
        if(x<10)
        {
            if(!flag)
                return true;
            return false;
        }
        int reverse;
        reverse=0;
        int temp=x;
        int rem;
        while(x>0)
        {
            rem=x%10;
            reverse=reverse*10+rem;
            x/=10;
          //  cout<<reverse<<endl;
        }
        if(temp==reverse)
            return true;
        return false;
    }
};