class Bank
{
int getRateOfInterest()
	{
	return 0;
	}
}
class SBI extends Bank
{
int getRateOfInterest()
	{
	return 8;
	}
}
class ICICI extends Bank
{
int getRateOfInterest()
	{
	return 7;
	}
}
class AXIS extends Bank
{
int getRateOfInterest()
	{
	return 9;
	}
}
class Test
{
public static void main(String []args)
	{
	SBI s=new SBI();
	ICICI i=new ICICI();
	AXIS a=new AXIS();
	System.out.println("SBI Rate Of Interest : " +s.getRateOfInterest());
	System.out.println("ICICI Rate Of Interest : " +i.getRateOfInterest());
	System.out.println("AXIS Rate Of Interest : " +a.getRateOfInterest());
	}
}