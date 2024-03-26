
public class Cellphone 
{
	private String manufact;
	private int model;
	private double retailPrice;
	
	public void setManufact(String manufactName)
	{ manufact = manufactName; }
	
	public void setModel(int phoneModel)
	{ model = phoneModel; }
	
	public void setRetailPrice(double retail)
	{ retailPrice = retail; }
	
	public String getManufact()
	{ return manufact; }
	
	public int getModel()
	{ return model; }
	
	public double getRetailPrice()
	{ return retailPrice; }
	
	public Cellphone(String manufactName, int phoneModel, double retail)
	{
		manufact = manufactName;
		model = phoneModel;
		retailPrice = retail;
		
	}
}
