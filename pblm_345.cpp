//reverse vowels of a string
//problem 345 solution
class Solution {
public:
    string reverseVowels(string s) {
        string rev;
        
        for(int i=0;i<s.length();i++)
        {
            //s[i]=tolower(s[i]);
            switch(s[i])
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    rev.push_back(s[i]);
            };
            
        }
        cout<<rev<<endl;
        int l=rev.length();
        for(int i=0;i<s.length();i++)
        {
            switch(s[i])
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    s[i]=rev[--l];
            };
            
        }
        cout<<s;
        return s;
    }
};