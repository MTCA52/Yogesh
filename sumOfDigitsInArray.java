import java.util.Scanner;
public class sumOfDigitsInArray
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of the array:");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.print("Enter the elements of the array:");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<size;i++)
{
int num=arr[i];
while(num>0)
{
sum += num%10;
num /= 10;
}
}
System.out.println("Sum of digits in the array : " +sum);
}
}