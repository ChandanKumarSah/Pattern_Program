import java.util.Scanner;
class Pattern1
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}