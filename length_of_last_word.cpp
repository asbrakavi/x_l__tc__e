class Solution {
public:
    int lengthOfLastWord(string s) {
        int n=s.find_last_of(' ');
        int l=s.length();
        if(!l)
            return 0;
        if(n==l-1)
        {
            s=s.substr(0,l-1);
          //  cout<<s<<endl;
            return lengthOfLastWord(s);
        }
        
        /*if(n==-1)
            return -1;
            */
        return s.length()-n-1;
    }
};