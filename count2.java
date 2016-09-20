import java.io.*;
import java.util.*;
class count2
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
    count3 c3=new count3();
    c3.count3(s);
   }
}
class count3
{
   void count3(String s)
     {
        int flag=0,count=0;
        for(int i=0;i<s.length()-2;i++)
           {
               int k=i+2;
               for(int j=i;j<k;j++)
                  {
                      if(s.charAt(i)==s.charAt(j+1))
                        flag=1; 
                      else 
                        flag=0; 
                   } 
              if(flag==1)
                count++;
          }
        System.out.println(count);
   
     }
 }