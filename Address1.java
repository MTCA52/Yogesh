public class Address1
{
String city,state,country;
public Address1(String city,String state,String country)
{
this.city=city;
this.state=state;
this.country=country;
}
}
class Emp
{
int id;
String name;
Address1 address;
public Emp(int id, String name, Address1 address)
{
this.id=id;
this.name=name;
this.address=address;
}
void display()
{
System.out.println(id + " " + name);
System.out.println(address.city + " " + address.state + " " + address.country);
}
public static void main(String []args)
{
Address1 address1=new Address1("V.kota","AP","india");
Address1 address2=new Address1("Tirupati","AP","india");
Emp e1=new Emp(111,"Yogesh",address1);
Emp e2=new Emp(112,"Yogi",address2);
e1.display();
e2.display();
}
}
