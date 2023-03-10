class Bike2
{
final void run()
	{
	System.out.println("Runnig");
	}
}
class Honda extends Bike2
{
void run()
	{
	System.out.println("Running safely with 100kmph");
	}
	public static void main(String []args)
	{
		Honda honda=new Honda();
		honda.run();
	}
}