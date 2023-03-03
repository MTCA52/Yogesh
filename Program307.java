import java.util.*;
public class Program307
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
a=(a+b)-(b=a);
System.out.println("Numbers after swapping:" +a+ " "+b);
}
}