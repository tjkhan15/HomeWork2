package Container;

import java.util.Scanner;

public class Container {

	public static void main(String[] args) {
		
		System.out.println("Please enter your lucky numbers: ");

		Scanner container = new Scanner(System.in);
			
		int [] input = new int[4];
			
		for(int i=0; i<input.length; i++) {
			input[i] = container.nextInt();	
		}
		System.out.println();

		System.out.println("You lucky numbers are: ");
		
		for (int j=0; j<input.length; j++) {
		
			System.out.println(input[j]);
			container.close();
				
		}

	}

}
