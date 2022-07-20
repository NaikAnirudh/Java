package overriding;
// overriding a method to display the features of a device!!
class Android 
{ 
	public void features()
	{
		System.out.println("Features of the Brand");
	}

}

class Samsung extends Android
{
	@Override                 //@override keyword to explicitly override a method 
	public void features()
	{
		super.features();     //Super keyword helps in accessing the immediate superclass method
		System.out.println();
		System.out.println("Model Name: Samsung Galaxy S10");
		System.out.println("RAM: 8GB");
		System.out.println("Storage: 128GB");
		System.out.println("Price:Rs.45,000/- ");
		
	}
}
class Oneplus extends Android
{
	@Override
	public void features()
	{
		super.features();
		System.out.println();
		System.out.println("Model Name: OnePlus 9R");
		System.out.println("RAM: 12GB");
		System.out.println("Storage: 256GB");
		System.out.println("Price: Rs.36,500/-");
	}
}
class Realme extends Android
{
	@Override
	public void features()
	{
		super.features();
		System.out.println();
		System.out.println("Model Name: Realme 8 Pro");
		System.out.println("RAM: 8GB");
		System.out.println("Storage: 128GB");
		System.out.println("Price:Rs.28,000/-");
	}
}
class Main
{	
	public static void main(String[] args)
	{
		Samsung s1= new Samsung();
		s1.features();
		Samsung s2 = new Samsung();
		s2= null;                    // Setting the object value to null.
		Oneplus o1 = new Oneplus();
		o1.features();
		Realme r1 = new Realme();
		r1.features();
		System.gc();                // by adding System.gc(); we can call garbage collection which will be deployed by JVM
	}
}


/* o/p 
 * Features of the Brand

Model Name: Samsung Galaxy S10
RAM: 8GB
Storage: 128GB
Price:Rs.45,000/- 
Features of the Brand

Model Name: OnePlus 9R
RAM: 12GB
Storage: 256GB
Price: Rs.36,500/-
Features of the Brand

Model Name: Realme 8 Pro
RAM: 8GB
Storage: 128GB
Price:Rs.28,000/-
*/

