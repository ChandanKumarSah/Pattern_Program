
import java.util.Scanner;	
class Pattern47
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();
       int sp=n/2;
      int st=1;
    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=sp;j++)
    {	
        System.out.print("  ");
               }
    for(int j=1;j<=st;j++)
       {
               System.out.print(j+" ");
           if(j<st)
                System.out.print("* ");
              }
            if(i<=n/2)
                 {  
              sp--;
            st++;
                 }
             else 
              {
             sp++;
            st--;
                      }
       System.out.println();  
      }
   }
 }