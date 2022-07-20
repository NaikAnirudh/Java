package exception_handling;

class Custom_exception extends Exception 
{
	//array to store the Position number
	public static int position[] = {1,3,4,2};
	
	//String array to store the name of the Avenger
	public static String avenger_name[] = {"Ironman","Thor","Hulk","Captain America"};
	
	//array to store the power level of the Avenger
	public static double power_level[] = {8000,15000.500,6000,5000};
	
	//default constructor
	Custom_exception()
	{
		
	}
		
	Custom_exception(String str)
	{
			super(str);
	}
	
	
	public static void main(String[] args)
	{
		try     // try Block to check the risky line of code
		{
			System.out.println("Avenger Name" + "\t" + "Avenger Position" +"\t" + "Power level" );
			for(int i=0; i<5; i++)
			{
				System.out.println(avenger_name[i] + "\t" +  position[i] + "\t" + power_level[i]);
				if(power_level[i]<6000)
				{
					Custom_exception c = new Custom_exception("Mortal Avenger");
					throw c;   // throw keyword to create custom exception
				}
			}
		}
		catch(Custom_exception e)  //catch block to handle the exception
		{
			e.printStackTrace();   //printstacktrace() to display the precise sequence of steps that led to the error  
		}
	}
}
