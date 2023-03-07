class  Main3
{
	public static void main(String[] args) 
	{
		int [] Numbers = {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double average;
		for(int number : Numbers)
		{
			sum+=number;
		}
		int arrayLength=Numbers.length;
		average=((double)sum/(double)arrayLength);
		System.out.println("Sum="+sum);
		System.out.println("Average="+average);
	}
}
