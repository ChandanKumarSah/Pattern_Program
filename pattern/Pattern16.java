/*1
   21
   321
   4321
   54321  */

import java.util.Scanner;
class Pattern16
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();	
    for(int i=1;i<=n;i++)
    {
    for(int j=i;j>=1;j--)
    {
    System.out.print(j+" ");
        }
       System.out.println();
         }
             }
                      }