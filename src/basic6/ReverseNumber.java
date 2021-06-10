package basic6;

public class ReverseNumber {
	public static void main(String[] args) {
		 int num = 12345678, reversed = 0;

		    // run loop until num becomes 0
		    while(num != 0) {
		    
		      // get last digit from num
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);
		  } 
	   

}
