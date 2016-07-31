class Solution {
public:
    bool isAnagram(string s, string t) {
        int sl=s.length();
        int tl=t.length();
        if(sl!=tl)
        {
            cout<<"here"<<endl;
            return false;
        }
        int flag=0;
        int loc;
        for(int i=0;i<sl;i++)
        {
            loc=t.find_first_of(s[i]);
            //cout<<loc<<'\t';
            if(loc==-1)
                return false;
            else
            {
                
                t[loc]='*';
              //  cout<<t<<endl;
            }
            /*for(int j=0;j<tl-1;j++)
            {
                if(s[i]==t[j])
                {
                   flag=1;
                   t[j]='*';
                   break;
                }
               // flag=0;
                
            }
            if(!flag)
                return false;
            flag=0;
            */
        }
        return true;
        
        //return true;
    }
};