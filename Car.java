package carProject;


public abstract class Car {
	
	protected String make;
	
	//protected double price;
	
	
	public Car( String compmake)
	{
		
		make = compmake;
		//model = CarModel;
		//price = CarPrice; 
		
	}
	
	
	public void setMake(String compmake)
	{
		 make = compmake;
	}
	
	public String getMake()
	{
		return make;
	}
	
	
	
		
		
		
		
	public String toString()
	{
		return "You are currently viewing a " + make + " model vehicle." + make + " 's" + " start at $39,999.";
	}
	
	
	public void Inspect(String compmake)
	{
		System.out.println("The " +  make +" is in good condition.");
	}
	
	
	protected abstract void Report(String make, String TypeCar, String CarModel, double Price, double miles, String Color);
	
}
