uint32_t reverseBits(uint32_t n) {

    int x;

        int count=31;

        uint32_t tt;

        uint32_t sum=0;

        while(count>=0)

        {

                x=n%2;

                tt=pow(2.0,count);

                sum=sum+x*tt;

                count--;

                n=n>>1;

        }

        return sum;

}
