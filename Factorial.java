import java.util.*;
class  Factorial
{
public static int productDigit(int n)
{
int res=1;
while(n>=0)
{
if(n==0)
{
return res;
}
else
{
res=res*n;
}
n--;
}
return 1;
}
public static void main(String []args)
{
	Number ob1=new Number();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number:");
int temp=sc.nextInt();
int res=productDigit(temp);
System.out.println("Factorial of " +temp+ " is " +res);
}
}