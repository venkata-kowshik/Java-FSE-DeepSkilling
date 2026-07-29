package kowshik;

public class Singleton {
	private static Singleton si;
	
	private Singleton ()
	{
		System.out.println("constructor");
	}
	
	public static Singleton getInstance()
	{
		if(si==null)
		{
			si=new Singleton();
		}
		return si;
		
	}
	   public void display() {
	        System.out.println("Singleton Method Called");
	    }


	   public static void main(String []args)
	   {
		Singleton.getInstance().display();
	   }
}

