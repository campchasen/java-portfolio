package carProject;

public class SportsCar extends Car {

	protected String type;
	
	/* the parent class for child classes that are sports cars*/ 
	public SportsCar(String CompMake, String TypeCar) {
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
	
	
	public void sportsCarMethod()
	{
		System.out.println("\n" +type +  " tend to be more expensive and more difficult to maintain, but are designed to be flashy and provide more horsepower for acceleration. ");
	}
	
	
	
	public void Report(String CompMake, String TypeCar, String CarModel, double Price, double miles, String Color)//reports the mileage of each sedan in a list
	{
		System.out.println("The styles of our available " + type + " sportscars are sport compacts and hot hatches.");
	}

}
