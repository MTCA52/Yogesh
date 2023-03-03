import java.util.*;
public class Program301
{
static void checkPositiveNegative(int a)
	{
	 if(a>=0)
		System.out.print("Positive");
	 else
		System.out.print("Negative");
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		checkPositiveNegative(num);
	}
}