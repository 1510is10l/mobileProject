package myProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Home father  = new Home();
//		Home mather  = new Home();
//		Home sister  = new Home();
//		Home brother = new Home();
//		
//		father.name = "Faisal";
//		father.age  = 40;
//		father.tall = 170;
//		
//		mather.name = "Roaa";
//		mather.age  = 36;
//		mather.tall = 155;
//		
//		sister.name = "Fatma";
//		sister.age  = 20;
//		sister.tall = 150;
//		
//		brother.name = "Saud";
//		brother.age  = 25;
//		brother.tall = 166;
//		
//		father.printInfo();
//		mather.printInfo();
//		sister.printInfo();
//		brother.printInfo();
		
//        String time = "12:30";
//        boolean isMorning = false;
//        
//        //قم بإضافة النصوص في التعبير 
//        time = time + (isMorning? "am" : "pm" );
//
//        System.out.println(time);
		
//		  Scanner input = new Scanner(System.in);
//		  System.out.println("هل الآن صباح أم مساء؟");
//		  
//		  
//		  String time = input.nextLine();
//		  
//		  switch(time)
//		  {
//		  case "ص":
//			  System.out.println("صباح الخير");
//			  break;
//		  case "م":
//			  System.out.println("مساء الخير");
//			  break;
//		  default:
//			  System.out.println("أنتهى الزمن");
//		  }
		
//		int money = 100;
//		
//		do
//		{
//			if(money == 0)
//			{
//				System.out.println("طفرنا");
//				break;
//			}
//			else
//			{
//			money = money - 10;
//			System.out.printf("%d %s \n", 10, " أعطيت");
//			System.out.printf("%d %s \n", money, " تبقى");
//			}
//		}
//		while(money >= 0);
		
//		String[][] names =
//			{
//					{"عبدالله", "وضحى", "نورة"},
//					{"فيصل", "محمد", "خالد", "سعود", "عبدالعزيز"}
//			};
//		
//		String value = names[1][3];
//		System.out.println(value);
//
//				
//		String[] jobs =
//			{
//					"برمجة", "شبكات", "أتصالات"
//			};
//		
//		int id[][] =
//			{
//					{100, 101, 102},
//					{103, 104, 105, 106, 107}
//			};
//		
//		String job = jobs[1];
//		int ids = id[1][3];
//		System.out.println(value + " وظيفته " + job + " رقمه " + ids);
		
//		ArrayList<String> programmingLanguages = new ArrayList<String>();
//		
//		programmingLanguages.add("Java");
//		programmingLanguages.add("JavaScript");
//		programmingLanguages.add("Ruby");
//		
//		System.out.println(programmingLanguages.get(2));
		
//		Car c1 = new Car();
//		
//		c1.make = "Toyota";
//		c1.model = "Camry";
//		c1.year = 2001;
//		c1.color = "Red";
//		
//		c1.printCar();
//		
//		Car c2 = new Car();
//		
//		c2.make = "Ford";
//		c2.model = "Explorer";
//		c2.year = 2015;
//		c2.color = "Yellow";
//		
//		c2.printCar();
		
		Mobile m1 = new Mobile();
		
		m1.make = "Apple";
		m1.model = "iphone";
		m1.version = "13";
		m1.price = 4000;
		m1.color = "Black";
		
//		m1.printMob();
		
		
		m1.printMob();
		m1.oldAndNew(2500);
		
		Mobile m2 = new Mobile();
		
		m2.make = "Android";
		m2.model = "Galaxy";
		m2.version = "G4";
		m2.price = 3500;
		m2.color = "Blue";
		
		m2.printMob();
		
		m2.oldAndNew(2400.42);
		
		
	}

}