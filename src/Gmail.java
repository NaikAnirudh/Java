import java.util.Scanner;
//Super class(provides properties to be inherited)
public class Gmail 
{
	Scanner sc=new Scanner(System.in);
	private String mailid;
	private String pwd;
	public void user_details()
	{
		
		System.out.println("Enter the Employee name: ");
		String name =sc.next();
		System.out.println("Enter the mobile number: ");
		long mob_no=sc.nextLong();
		System.out.println("Enter the MailID");
		mailid=sc.next();	
		System.out.println("Enter the Password");
		setPwd(sc.next());
	
	}
	public String getMailId()        // Getter method( gets the value) 
	{
		return mailid;
	}
	public void setId(String mailid) // Setter Method(Sets the value)
	{
		this.mailid = mailid;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}

}
		 
		


