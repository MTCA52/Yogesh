class Animal4
{
Animal4()
{
System.out.println("animal is created");
}
}
class Dog extends Animal4
{
Dog()
{
System.out.println("dog is created");
}
}
class TestSuper4
{
public static void main(String []args)
{
Dog d=new Dog();
}
}