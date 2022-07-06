package test;

import java.util.Scanner;

public class Booleanops {

	public static void main(String[] args) {
		// == equality operator
		System.out.println(2 == 2);
		System.out.println(2 > 5);
		System.out.println(3 <= 5);
		System.out.println(5 <= 5);
		// && and || or
		System.out.println(2 == 2 && 1 < 5);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(2 == 2 || 1 == 5);
		
		String name = "Sam";
		
		if (name == "Sam") {
			System.out.println("Hello Sam!");
		} else { 
			System.out.println( "You are not Sam, " + name);
		}
		
		int age = 14;
		
		if (age >= 16) {
			System.out.println("You can get your license!");
		} else {
			System.out.println("Please wait " + (16 - age) + " year(s) to get your license.");
		}
		
		double costOfMilk = 2.5;
		
		if (costOfMilk <= 2) {
			System.out.println("Buying 2");
		} else if (costOfMilk <= 3) {
			System.out.println("Buying 1");
		} else {
			System.out.println("Not buying any milk.");
		}
		
		char grade = 'C';
		
		switch (grade) {
			case 'A':
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
		}
		
		if (5 == 5) {
			if (4 == 3) {
				System.out.println("5 is 5 and 4 is 4");
			} else {
				System.out.println("5 is 5");
			}
		}

//		if (5 == 5 && 4 == 4) {
//			System.out.println("Yes");	
//		}
//			for (int i = 0; i < 10; i++)  {
//				System.out.println(i);
//			}
//			
//			for (int i = 1; i <= 10; i++) {
//				System.out.println(i);
//	}
		
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
			System.out.println(i);
			}	
		}
		int x = 10;
		while (x < 10 ) {
			System.out.println(x);
			x++;
		}
		
		do {
			System.out.println(x);
			x++;
		} while (x < 2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name1 = sc.nextLine();
		
		System.out.println("Welcome, " + name1);
		
		int selection = 0;
		double total = 0;
		
		while (selection != 4) {
		System.out.println("Select an option.");
		System.out.println("1) add candybar to shopping cart: 1.99");
		System.out.println("2) add cheese to shopping cart: 6.95");
		System.out.println("3) add soccer ball to shopping cart: 12.99");
		System.out.println("4) check out");
		
		selection = sc.nextInt();
		
		
		switch (selection) {
		case 1:
			total = total += 1.99;
			break;
		case 2:
			total += 6.95;
			break;
		case 3:
			total += 12.99;
			break;
		case 4:
			break;
		default:
			System.out.println("Please pick a valid option.");
		}
		
		System.out.println("Your current total is: " + total);
	}
	}
}
