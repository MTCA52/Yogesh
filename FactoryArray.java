import java.util.*;
public class FactoryArray
{
public static void main(String []args)
{
int num;
Scanner sc=new Scanner(System.in);
System.out.print("\n Enter a number:");
num=sc.nextInt();
int size=(int)num/2;
int[]FA=new int[size];
int i,count = 0;
System.out.print("\n The Factors of " + num + " are:");
for(i=1;i<=num;i++)
{
if(num%i==0)
{
FA[count]=i;
//System.out.print(i+ " ");
count = count + 1;
}
}
System.out.print("\n Total Factors of " + num + " : " +count);
for(int j=0;j<count;j++)
System.out.print(FA[j]+ " ");
}
}