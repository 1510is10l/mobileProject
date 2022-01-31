package myProject;

public class Mobile {
	
	String make;
	String model;
	String version;
	double price;
	String color;
	
	public void printMob()
	{
		System.out.println("Make: " + make);
		System.out.println("Model: "+ model);
		System.out.println("Version: "+ version);
		System.out.println("Price: "+ price);
		System.out.println("Color: "+ color);
		
		System.out.println(" ");
	}
	
//	public void changeMob(double change)
//	{
//		price = change;
//	}
	
	public void oldAndNew(double change)
	{
		System.out.println("Old: " + price);
		price = change;
		System.out.println("New: "+ change);
		
		System.out.println(" ");
	}

}
