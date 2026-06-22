package kowshik;

interface Greeting
{
	public void SayHello();
}
class Tamil implements Greeting
{
	@Override
	public void SayHello()
	{
		System.out.println("vanakkam");
	}
}
class Telugu implements Greeting
{
	@Override
	public void SayHello()
	{
		System.out.println("namaskaram");
	}
}
public class OpenClosedP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tamil t=new Tamil();
		Telugu tu=new Telugu();
		t.SayHello();
		tu.SayHello();
		

	}

}
