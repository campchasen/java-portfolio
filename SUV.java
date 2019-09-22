package carProject;

public class SUV extends Car{
	protected String type;
	
	/* the parent class for child classes that are SUV*/ 
	public SUV(String CompMake, String TypeCar) {
		super(CompMake);
		
		type = TypeCar;
		
	}

	
	
	public void setType(String TypeCar)
	{
		type = TypeCar;
	}
	
	public String getType()
	{
		return type;
	}
	
	
	
	
	public String toString()
	{
		return "You are currently viewing a " + make + " " + type + " ." + type + " 's" + " start at $39,999.";
	}
	
	
	public void SUVMethod()
	{
		System.out.println("\n" + type + "s are convenient for their spacious interior, but lack much practicalit7 and MPG.");
	}
	
	
	
	public void Report(String CompMake, String TypeCar, String CarModel, double Price, double miles, String Color)//reports the mileage of each sedan in a list
	{
		System.out.println("The styles of our available " + type + " is 4 wheel drive and 2 wheel drive.");
	}
}
