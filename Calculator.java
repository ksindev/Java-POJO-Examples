import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a, b, c;
		char operand, decision;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter your first number:");
			a = input.nextInt();
		
			System.out.println("Enter your second number:");
			b = input.nextInt();
			
			System.out.println("Enter + for addition or * for multiplication:");
			operand = input.next().charAt(0);
			
			switch (operand) {
				
				case  '+' : 
					c = a + b;
					System.out.println("The sum is: " + c);
					break;
				
				case  '*' : 
					c = a * b;
					System.out.println("The product is: " + c);
					break;
				
				default : System.out.println("Sorry, you entered a wrong operand");
			}
			
			System.out.println("Do you want to coninue: y/n");
			decision = input.next().charAt(0);
			
		} while (decision == 'y');
		
		input.close();
		
	}
}