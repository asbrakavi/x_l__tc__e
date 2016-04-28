#include<math.h>
class Solution {
public:
    double myPow(double x, int n) {
      /*  double temp=x;
        while(--n)
        {
            x=x*temp;
        }
        return x;
========>> time limit exceeded
*/
        return pow(x,n);
    }
};