package carProject;

public class Malibu extends Sedan{

	public String model;
	protected double price;
	protected String color;
	protected double mileage;
	

  
  
	public Malibu(String CompMake, String TypeCar, String CarModel, double Price, double miles, String Color)
	{
		super(CompMake, TypeCar);
		 model = CarModel;
		 price = Price;
		 mileage = miles;
		 color = Color;
	}
	/* below are demonstrations of polymorphism.  
	   The settters and getters for 
	   Make, Milieage, Color, Model, and price as well as toString(), report(), etc. 
	   will differ from child class to child class. 
	   So when the methods are called in the Demo, you will recieve unique information depending on the parent class of the object you are instantiating */
	public void setMake(String CompMake)
	{
		make =CompMake;
	}
	
	public String getMake() {
        return make ;
    }
	
	public void setMileage(double miles)
	{
		 mileage = miles;
	}
	public double getMileage()
	{
		return mileage;
	
	}
	
	
	public void setColor(String Color)
	{
		color = Color;
	}
	public String getColor()
	{
		return color;
	}
	
	public void setModel(String CarModel)
	{
		  model = CarModel;
	}
	
	public String getModel()
	{
		return model;
	}
	
	
	
	public void setPrice(double Price)
	{
		price = Price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	
	
	
	public String toString()
	{
		return " " + color + " " + make + " " + type + " " + model + ". Gas mileage: " + mileage +". Price: "+ price;
	}
	
	
	public void Report() 
	{
		System.out.println("\t" + "The price of our "  +  model + "s start at " + price +". " + model + "s are not very fast.");
	}

	
	public void MalibuMethod()
	{
		System.out.println("\t" + "The " + model + " is a hatchback sedan. Malibus are available in red and blue.");
	}
}