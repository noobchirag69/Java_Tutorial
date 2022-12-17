package Tutorial;

// TestProject is a Public class, which means it is accessible to everyone inside the code
public class Tutorial {

	// Main Function with a return type of Void
	public static void main(String[] args) {
		// Print Statement in Java
		System.out.println("Hello, World!"); // Prints and moves on to New Line
		System.out.print("Helo, Java!\n"); // Same thing but with \n
		// Variables in Java
		String name = "Chirag"; // String
		int age = 22; // Integer
		double gpa = 8.77; // Double
		float height = 5.8f; // Float
		boolean condition = true; // Boolean

		// Concatenation in Java
		System.out.println(name + " is " + age + " years old and he has achieved a GPA of " + gpa + ". He is " + height + " feet tall.");

		// Arithmetic Operators in Java
		int num1 = 10;
		int num2 = 5;

		int sum = num1 + num2; // Addition
		int difference = num1 - num2; // Subtraction
		int product = num1 * num2; // Multiplication
		int quotient = num1 / num2; // Division
		int remainder = num1 % num2; // Remainder

		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum + ".");
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference + ".");
		System.out.println("Product of " + num1 + " and " + num2 + " is " + product + ".");
		System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient + ".");
		System.out.println("Remainder of " + num1 + " and " + num2 + " is " + remainder + ".");

		// Relational Operators in Java
		int a = 50;
		int b = 30;
		System.out.println(a > b); // True
		System.out.println(a < b); // False
		System.out.println(a == b); // False
		System.out.println(a != b); // True

		// Logical Operators in Java
		boolean m = true;
		boolean n = false;
		System.out.println(m && n); // Logical AND Operator
		System.out.println(m || n); // Logical OR Operator

		// If-Else Conditions in Java
		if (age < 13) {
			System.out.println("Chirag is a Child.");
		} else if (age >= 13 && age <= 19) {
			System.out.println("Chirag is a Teenager.");
		} else if (age > 19 && age <= 40) {
			System.out.println("Chirag is a Young Man.");
		} else {
			System.out.println("Chirag is Old.");
		}

		// While Loop in Java
		int x = 1;
		while (x <= 5) {
			System.out.println(x);
			x++; // Increment
		}

		// For Loop in Java
		for (int i = 1; i <= 5; i++) {
			System.out.println("Printing: " + i);
		}

		// Nested For Loop in java
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // Prints a new line
		}

		// Arrays in Java
		String[] wrestlers = new String[5]; // Creates an array named wrestlers of type string and length 5
		wrestlers[0] = "Chris Jericho"; // Index 0
		wrestlers[1] = "Shawn Michaels"; // Index 1
		wrestlers[2] = "Triple H"; // Index 2
		wrestlers[3] = "The Undertaker"; // Index 3
		wrestlers[4] = "Kane"; // Index 4

		// Iterating through the Array using For Loop
		for (int i = 0; i < wrestlers.length; i++) {
			System.out.println(wrestlers[i]);
		}

		// Calling Functions
		wishMe("Chirag", "Chakraborty");
	}

	// Functions in Java (Written outside the Main Function)
	public static void wishMe(String firstName, String lastName) {
		System.out.println("Hello, " + firstName + " " + lastName + "!");
	}

}
