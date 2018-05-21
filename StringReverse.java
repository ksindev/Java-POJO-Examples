
public class StringReverse {

	public static void main(String[] args) {
		if (args.length == 0) 
		{
			System.out.println("No arguments passed");
		} 
		else 
		{
			
			System.out.println("String entered :"+args[0]);
			char[] charArray = args[0].toCharArray();
		    StringBuilder reverseString = new StringBuilder();
		    
		    for (int j = charArray.length -1; j >= 0; j--) {
		    	reverseString.append(charArray[j]);
		    }
		    
			System.out.println("Reversed String is "+reverseString.toString());
		}

	}

}
