import java.util.*;
public class Program314
{
static int largest_among_three(int a,int b,int c)
{
if(a>b&&a>c)
return a;
else if(b>a&&b>c)
return b;
else 
return c;
}
public static void main(String []args)
{
int a,b,c;
System.out.print("Enter three numbers:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
int max =largest_among_three(a,b,c);
System.out.println("The largest among three numbers is" +max);
}
}