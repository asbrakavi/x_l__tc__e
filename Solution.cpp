class Solution {
public:
    string reverseString(string s) {
        string rev;
        for(int i=s.length()-1;i>=0;i--)
            rev.push_back(s[i]);
        return rev;
        
    }
};