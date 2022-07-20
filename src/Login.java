
//Sub class(inherits the properties that are provided by the Super class)
public class Login extends Gmail
{
    //Super keyword is not used here as there is no requirement for the super class method!!
	public static void main(String[] args)
	{
		
		Gmail obj1= new Login();
		obj1.user_details();
		if(obj1.getPwd().equals("Beerus@1234"))
		{
		System.out.println("ID  "+obj1.getMailId() +" Login Successful!!!" );
		}
		else
		{
			System.out.println("Wrong user id or password!!");
		}

}

}
