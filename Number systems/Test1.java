import java.util.Scanner;
class Test1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter your name:");
String name=sc.next();
System.out.print("Enter your age:");
int age=sc.nextInt();
if(age>18)
System.out.println("You are eligible for vote.");
else
System.out.println("You are not eligible for vote.");
}
}