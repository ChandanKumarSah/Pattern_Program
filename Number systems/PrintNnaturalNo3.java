//Print n natural number from user using do while  loop
import java.util.Scanner;
class PrintNnaturalNo3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
int n=sc.nextInt();
int i=1;
do{
System.out.println(i);
i++;
}
while(i<=n);
}
}

