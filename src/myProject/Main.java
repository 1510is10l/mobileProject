package myProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	


	public static void main(String[] args) {
		
		//سوينا كائن من الكلاس
		Mobile m1 = new Mobile();
		
		// وضعنا للكائن خصائص
		m1.make = "Apple";
		m1.model = "iphone";
		m1.version = "13";
		m1.price = 4000;
		m1.color = "Black";
		
		// استدعينا دالة الطباعة لطباعة خصائص الكائن
		m1.printMob();
		// استدعينا دالة الطباعة لطباعة السعر القديم و الجديد
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
