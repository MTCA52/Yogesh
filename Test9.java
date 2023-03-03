import java.util.*;
class Test9
{
public static int sumDigit(int n)
{
int sum=0;
while(n>0)
{
sum=sum+n%10;
n=n/10;
}
return sum;
}
public static int reverseDigit(int n)
{
int sum=0;
while(n>0)
{
sum=sum*10+n%10;
n=n/10;
}
return sum;
}
public static void main(String []args)
{
Number ob1=new Number();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers:");
int temp=sc.nextInt();
int res=sumDigit(temp);
int rev=reverseDigit(temp);
System.out.println("Sum of digits of  " +temp+ " is  " +res);
System.out.println("Reverse of digits of " +temp+ " is " +rev);
}
}

