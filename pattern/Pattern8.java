import java.util.Scanner;
class Pattern8
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=n;j++)
    {
     if(i==j || i+j==n+1 || (i+j)%2==0)
       System.out.print("1 ");
   
          else 
        System.out.print("0 ");
        }
         System.out.println();
         }
             }
                      }