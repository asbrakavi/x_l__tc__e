class Solution {
public:
    bool isValid(string s) {
   vector<char> v;
        for(int i=0;i<s.length();i++)
            {
                switch(s[i])
                {
                  case '(':
                  case '[':
                  case '{':
                  {
                    v.push_back(s[i]);
                    break;
                  }
                  case ')':
                  {
                    if(v.empty())
                        return false;
                    //char c=v.back();
                    if(v.back()!='(')
                        return false;
                    v.pop_back();
                   break;   
                  }
                  case ']':
                  {
                      if(v.empty())
                        return false;
                      if(v.back()!='[')
                        return false;
                    v.pop_back();
                   break;   
                  }
                  case '}':
                  {
                      if(v.empty())
                        return false;
                      if(v.back()!='{')
                        return false;
                    v.pop_back();
                   break;   
                  }
                  /*{
                      cout<<"in closing case"<<endl;
                    if(v.empty())
                    {
                        cout<<"here"<<endl;
                        return false;
                        
                    }
                    char c=v.back();
                    cout<<c<<endl;
                    v.pop_back();
                    if(c!=s[i])
                    {
                        cout<<"here 3"<<endl;
                        return false;
                    }
                  }
                  */
                };
            }
        if(v.empty())
        
          //  cout<<"here final"<<endl;
            return true;
            
        
        return false;
        
    }
};   