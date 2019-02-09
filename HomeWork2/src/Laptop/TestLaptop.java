package Laptop;

public class TestLaptop {

	public static void main(String[] args) {
		Laptop lc1 = new Laptop();
		
		Laptop lc2 = new Laptop("16 GB 2400 MHz DDR4", 500);
		
		Laptop lc3 = new Laptop("Intel Core i7", 2.6);
		
		Laptop.laptopPrice();

	}

}
