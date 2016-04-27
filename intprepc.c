#include<stdio.h>
 //#include <stdio.h>
    int main()
    {
        int temp=(sizeof(int)>-1);
        printf("%d",temp);
        printf("%d",sizeof(int));
        char p;
        char* s;
        s=&p;
        *s= 'a';
        printf("value in pointer p is %c\n", *s);
        if (sizeof(int) > -1)
           printf("True");
       else
           printf("False");
    /*char *t = "Sanfoundry C-Test";
        t[0] = 'a';
        t[1] = 'b';
        printf("%s", t);
        */
        float f = 0.1;
        if (f == 0.1)
            printf("True");
        else
            printf("False");
        int a[5] = {1, 2, 3, 4, 5};
        int i;
        for (i = 0; i < 5; i++)
            if ((char)a[i] == '5')
                printf("%d\n", a[i]);
            else
                printf("FAIL\n");
        printf("%d %d",'5',(char)a[4]);
        int ii = 3;
        int l = ii / -2;
        int k = ii % -2;
        printf("%d %d\n", l, k);
    /*    int x = 1, y = 0, z = 3;
        x > y ? printf("%d", z) : return z;*/
    }
