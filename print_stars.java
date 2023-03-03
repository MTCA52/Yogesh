import java.util.*;
class print_stars
{
public static void Print_multiple_stars(int i)
	{
	int k=1;
	for(k=1;k<=i;k=k+1)
		System.out.print("*");
	}
	public static void main(String []args)
	{
		int j=5;
		Print_multiple_stars(j);
		System.out.print(" ");
	}
}