import java.util.*;
public class cubeofArray
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int Cube[]=new int[10];
System.out.println("Enter 10 array elements :");
int Arr[]=new int[10];
for(int i=0;i<Arr.length;i++)
Arr[i]=sc.nextInt();
System.out.println("Cube of Numbers :");
for(int j=0;j<Arr.length;j++)
{
Cube[j] = Arr[j]*Arr[j]*Arr[j];
System.out.println(Cube[j]);
}
}
}