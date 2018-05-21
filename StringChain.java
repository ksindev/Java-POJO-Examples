import java.util.Scanner;

public class StringChain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder myText = new StringBuilder("");
		
		for (int i =0; i < 5; i++) {
			
		    System.out.println("Enter the next word: ");
		    myText.append(input.nextLine());
		    
		    System.out.println("The text is: " + myText.toString());
		}
		input.close();
	}

}
