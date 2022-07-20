package interface_package;

import java.util.Scanner;

interface Instagram
{
	abstract void login();

}

class User_1 implements Instagram
{
	@Override
	public void login()
	{
		System.out.println("User_1 logged in");
	}
}

class User_2 implements Instagram
{
	@Override
	public void login()
	{
		System.out.println("User_2 logged in");
	}
}

class Obj
{
	Instagram i;
	public Instagram pwd(int password)
	{
		if(password==123)
		{
			Instagram i =new User_1();
			return i;
		}
		
		else if(password==456)
		{
			Instagram i = new User_2();
			return i;
		}
		return i;
		
		
	}
	
}

class Main
{
	public static void main(String[] args)
	{
		System.out.println("Enter the password");
		Scanner sc=new Scanner(System.in);
		Obj o=new Obj();
		Instagram a =o.pwd(sc.nextInt());
	    a.login();
		
	}
}

/*output
/*Enter the password
123
User_1 logged in
*/
