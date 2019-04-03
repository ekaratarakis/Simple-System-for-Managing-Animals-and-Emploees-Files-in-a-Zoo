package zoo;


public class Zoo 
{
	private String ZooName, City;
	
////////////////////////////////////////////////////////////////	
	public Zoo(String ZooName, String City)
	{
		this.ZooName = ZooName;
		this.City = City;
	}
////////////////////////////////////////////////////////////////	
	
	public String getZooName()
	{
		return ZooName;
	}
	public void setZooName(String ZooName)
	{
		this.ZooName = ZooName;
	}
	
	public String getCity()
	{
		return City;
	}
	public void setCity(String City)
	{
		this.City = City;
	}
	
		
}
