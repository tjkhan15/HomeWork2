package Laptop;

// Design a class name call Laptop with multiple constructors 
// and with few static and non-static variables and methods.
// Then design another class name call TestLaptop in which you
// can create multiple objects from Laptop class. Show the 
// usages of all variables and methods from Laptop class.

import java.util.Scanner;

public class Laptop {
	
	// Laptop static variables
	public static String brandName = "Apple";
	public static String modelName = "MacBook Pro (15-inch)";
	public static int modelYear = 2018;
	
	// Laptop non-static variables
	public String processorName, memoryName;
	public int storageSize;
	public double processorSpeed;
	
	// Laptop constructor - 1
	public Laptop() {
		System.out.println("Laptop Brand: " + brandName);
		System.out.println("Laptop Model: " + modelName + " " + modelYear);
	}
	
	// Laptop constructor - 2
	public Laptop(String memoryName, int storageSize) {
		this.memoryName = memoryName;
		this.storageSize = storageSize;
		System.out.println("Memory: " + memoryName + ", " + "Storage: " + storageSize);
		
	}
	// Laptop constructor - 3
	public Laptop(String processorName, double processorSpeed) {
		this.processorName = processorName;
		this.processorSpeed = processorSpeed;
		System.out.println("Processor: " + processorSpeed + " GHz " + processorName);
	}
	
	// Standard Accessor methods
	public String getMemory() {
		return memoryName;
	}
	
	public int getStorage() {
		return storageSize;
	}
	
	public static void laptopPrice() {
		System.out.println("Enter laptop price: ");
		Scanner sc = new Scanner (System.in);
		int laptopPrice = sc.nextInt();
		sc.close();
		System.out.println("Price: $" + laptopPrice);
	}
	
}
