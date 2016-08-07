public class Solution {

    public String convert(String s, int numRows) {

        if(s.length()==0)

            return new String();

        if(s.length()<=numRows)

            return s;

        StringBuffer[] str=new StringBuffer[numRows];

        int j=0;

        //int flag=0;

        int add=1;



        String c=new String();

//        char c;



        for(int i=0;i<s.length();i++)



        {



           // if(j<numRows&&j>=0)



            {



               c=s.substring(i,i+1);

//              System.out.println(c+"is c");

                if(str[j]!=null)

                {

                       str[j]=str[j].append(c);

  //                

//                      System.out.println(str[j].toString()+"  "+j);

                }

                 else

                {

                str[j]=new StringBuffer(c);



//               j++;

//              System.out.println(str[j].toString());

                }

                if(j==numRows-1)

                {

                        add=-1;

                }

                if(j==0)

                {

                        add=1;

                //      j++;

                }

                j+=add;

                if(j==numRows)

                    j--;

//              System.out.println(str[j].toString());



            }

 }



        StringBuffer res=new StringBuffer();



        for(int i=0;i<numRows;i++)

        {

//      System.out.println(str[i].toString()+"   inside for");

        res=res.append(str[i]);

        }



        return res.toString();





    }

}


