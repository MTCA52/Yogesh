import java.util.*;
public class Program306
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter thr numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
a= a^b;
b= a^b;
a= a^b;
System.out.println("Numbers after swapping:" +a+ " "+b);
}
}