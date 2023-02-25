import java.util.*;
public class Program207
{
static boolean hi(int n)
{
return((n/2)*2==n);
}
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=sc.nextInt();
if(hi(n))
System.out.println("Even\n");
else
System.out.println("Odd\n");
}
}