class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int carry=1;
        for(int i=digits.size()-1;i>=0;i--)
        {
            digits[i]+=carry;
            if(digits[i]<10)
                return digits;
            if(i!=0)
            digits[i]-=10;
                
        }
        if(digits[0]>=10)
        {
          //  cout<<"here"<<digits[0]<<endl;
            digits[0]-=10;
            digits.insert(digits.begin(),1);
        }
        return digits;
        
    }
};