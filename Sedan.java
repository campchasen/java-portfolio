package carProject;
import java.util.*;
public class Sedan extends Car {
	
	protected String type;
	
	
	
	public Sedan(String CompMake, String TypeCar) {
		super(CompMake);
		
		type = TypeCar;
		
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
	
	
	public void sedanMethod()
	{
		System.out.println(type + " are medium size vehicles. They are not designed for speed or utility, but are long lasting, cheaper to maintain and reliable.");
	}
	
	
	
	public void Report(String CompMake, String TypeCar, String CarModel, double Price, double miles, String Color)//reports the mileage of each sedan in a list
	{
		System.out.println( "The styles of our available " + type + " is notchbacks and hatchbacks");
	}






}
