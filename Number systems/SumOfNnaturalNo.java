//Print sum of  n natural number from user
import java.util.Scanner;
class SumOfNnaturalNo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
int n=sc.nextInt();
int i=1,sum=0;
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println("sum of First "+n+" natural number is:"+sum);
}
}
