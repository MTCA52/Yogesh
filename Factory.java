import java.util.*;
public class Factory
{
public static void main(String []args)
{
int num;
Scanner sc=new Scanner(System.in);
System.out.print("\n Enter a number:");
num=sc.nextInt();
int i,count = 0;
System.out.print("\n The Factors of " + num + " are:");
for(i=1;i<=num;i++)
{
if(num%i==0)
{
count = count + 1;
System.out.print(i+ " ");
}
}
System.out.print("\n Total Factors of " + num + " : " +count);
}
}