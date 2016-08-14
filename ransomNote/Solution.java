public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     StringBuffer s=new StringBuffer(magazine);
     int x=-1;
     for(int i=0;i<ransomNote.length();i++)
     {
        // System.out.println(ransomNote.substring(i,i+1));
         x=s.indexOf(ransomNote.substring(i,i+1));
         //System.out.println(x);
         if(x>=0)
         {
             //int i=s.indexOf(ransomNote.charAt(i));
             s.setCharAt(x,'*');
           //  System.out.println(s);
         }
         else
            return false;
     }
     return true;
    }
}