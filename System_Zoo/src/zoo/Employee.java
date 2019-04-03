package zoo;


public class Employee 
{
	private String EmployeeName, AFM;
	
	public Employee(String EmployeeName, String AFM)
	{
		this.EmployeeName = EmployeeName;
		this.AFM = AFM;
	}
	
	
	public String getEmployeeName()
	{
		return EmployeeName;
	}
	public void setEmployeeName(String EmployeeName)
	{
		this.EmployeeName = EmployeeName;
	}
	
	public String getAFM()
	{
		return AFM;
	}
	public void setAFM(String AFM)
	{
		this.AFM = AFM;
	}

}
