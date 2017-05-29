class Employee
{
	private int id;
	private String name;
	private String email;
	private double salary;

	public Employee()
	{

	}

	public Employee(int id, String name, String email, double salary)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
	}

	//getter---getXXX & setter----setXXX methods

		public void setId(int id)
		{
			this.id=id;
		}

		public int getId()
		{		
			return id;
		}


		public void setName(String name)
		{
			this.name=name;
		}

		public String getName()
		{		
			return name;
		}


		public void setEmail(String email)
		{
			this.email=email;
		}

		public String getEmail()
		{		
			return email;
		}


		public void setSalary(double salary)
		{
			this.salary=salary;
		}

		public double getSalary()
		{		
			return salary;
		}

		



}

class Office
{
	public static void main(String[] args)
	{		
		Employee emp=new Employee(101,"Mary","mary@gmail.com",40000.00d);
		
		int id=emp.getId();
		String name=emp.getName();

System.out.println("Employee 1 details");
		System.out.println("id = "+id);
	System.out.println("Name = "+name);
System.out.println("Salary = "+emp.getSalary());


Employee emp1=new Employee();

emp1.setId(102);
emp1.setName("John");
emp1.setEmail("john@yahoo.com");
emp1.setSalary(35000.0d);

System.out.println("Employee 2 details");
System.out.println("id = "+emp1.getId());
System.out.println("Name = "+emp1.getName());
System.out.println("Email = "+emp1.getEmail());
System.out.println("Salary = "+emp1.getSalary());



	}

}