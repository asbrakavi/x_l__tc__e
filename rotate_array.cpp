class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        while(k--)
        {
            int index=nums.size()-1;
            int temp2=nums[index];
            //int temp=nums[0];
            nums.pop_back();
            nums.insert(nums.begin(),temp2);
            //nums.erase(nums.);
           // nums.push_back(temp);
            cout<<k;
            cout<<nums[0];
           /* for(int j=0;j<nums.size();j++)
                cout<<nums[j];
                cout<<endl;
           /* int x=nums[0];
            int i;
            for(i=0;i<nums.size()-1;i++)
                nums[i]=nums[i+1];
            nums[i]=x;
            */
        }
    }
};