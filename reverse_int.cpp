#include<math.h>
class Solution {
public:
    int reverse(int x) {
        int flag=0;
        if(x<0)
            flag=1;
        x=abs(x);
        int res=0,rem;
        while(x>0)
        {
            rem=x%10;
          //  cout<<rem<<'\t';
          //integer upper limit 2147483647
            if(res>214748364)
                return 0;
            res=res*10;
            //cout<<res<<'\t';
            if(res==2147483640&&rem>7)
                return 0;
            res+=rem;
            //+rem;
            
            x/=10;
            //cout<<"res="<<res<<endl;
        }
        cout<<endl;
        if(flag)
            res=-res;
        //cout<<flag<<endl<<res<<endl;
        return res;
    }
};