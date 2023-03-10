final class Bike3
{
class Honda1 extends Bike3
{
void run()
	{
	System.out.println("Running safely with 100kmph");
	}
	public static void main(String []args)
	{
		Honda1 honda=new Honda1();
		honda.run();
	}
}
}