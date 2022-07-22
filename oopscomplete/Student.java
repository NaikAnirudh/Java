package oopscomplete;
//Using abstract class to implement ABSTRACTION
abstract class Student
{
		private String std_name;
		private long id;
		private int sub1=90;
		private int sub2=94;
		private int sub3=85;
		public int percentage;
		
		//using getter and setter method to implement ENCAPSULATION
		public String getStd_name()
		{
			return std_name;
		}
		public void setStd_name(String std_name)
		{
			this.std_name = std_name;
		}
		public long getId() 
		{
			return id;
		}
		public void setId(long id)
		{
			this.id = id;
		}
		public int total()
		{
			percentage= (sub1+sub2+sub3);
		   return percentage;
		}
		//creating abstract method for further implementation
		abstract void result(int perc);
}
// inheriting the super class properties into sub class by using "extends" keyword(INHERITANCE)
class Result extends Student 
{
//overriding the super class method and changing the implementation(POLYMORPHISM)
	@Override 
	void result(int perc)
	{
		Result x=new Result();
		if (x.total()>200&&x.total()<300)
		{
			System.out.println("First class");
		}
		else if (x.total()>100&&x.total()<200)
		{
			System.out.println("First class distinction");
		}
		else if(x.total()>0&&x.total()<100)
		{
			System.out.println("Failed, Better luck next time");
		}
		else 
		{
			System.out.println("Invalid Student");
		}
	}
	public static void main(String[] args)
	{
		Result name= new Result();
		name.setStd_name("lohith");
		System.out.println(name.getStd_name());
		Result id_no =new Result();
		id_no.setId(20221999);
		System.out.println(id_no.getId());
		Result r1 = new Result();
		System.out.println(r1.total());
		r1.result(r1.total());	
	}	
}

/* 
Output:
lohith
20221999
269
First class
/*
