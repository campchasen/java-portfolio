package carProject;

//child class demonstrates inheritance of the SportsCar class
public class Challenger extends SportsCar{
	protected String model;
	protected double price;
	protected String color;
	protected double mileage;
	
	//The constructor method, inherits the company maker and the type of car from superclass SportsCar
	public Challenger(String CompMake, String TypeCar, String CarModel, double Price, double miles, String Color)
	{
		super(CompMake, TypeCar);
		
		//use these variables throughout this class
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
		make = CompMake;
	}
	
	public String getMake()
	{
		return make;
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
		System.out.println("\t" +"The price of our "  +  model + "s start at " + /*get lowest*/ price +". " + model + "s are pretty fast. ");
	}

	
	
	
	public void ChallengerMethod()
	{
		System.out.println("\t" + model + " is a sport compact. It is smaller and is available in black and white.  ");
	}
}
