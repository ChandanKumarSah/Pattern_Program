/*
        a
      b a b
    c b a b c
  d c b a b c d
e d c b a b c d e
                                */
import java.util.Scanner;	
class Pattern39
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=n-i;j++)
    {	
        System.out.print("  ");
          }
       char k=(char)(i+96);
    for(int j=1;j<=2*i-1;j++)
       {
               System.out.print(k+" ");
            if(j<i)
               k--;
         else 
             k++;
            }
       System.out.println(); 
          
      }
   }
 }