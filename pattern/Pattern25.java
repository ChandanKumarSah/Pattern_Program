/*    
1 1 1 1 1
0000  
1 1 1
00
1        
                    */
import java.util.Scanner;	
class Pattern25
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();	
    for(int i=n;i>=1;i--)
    {
    for(int j=1;j<=i;j++)
    {	
   if(i%2==0)
    System.out.print("0 ");
   else 
       System.out.print("1 ");
        }
       System.out.println();
         }
             }
                      }