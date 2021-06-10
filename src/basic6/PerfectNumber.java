package basic6;
import java.util.Scanner;
public class PerfectNumber {
		private static Scanner sc;
		public static void main(String[] args) {
			int i, Number, Minimum, Maximum, Sum = 0;
			sc = new Scanner(System.in);
			
			System.out.println("Please Enter the Minimum Value: ");
			Minimum = sc.nextInt();
			
			System.out.println("Please Enter the Maximum Value: ");
			Maximum = sc.nextInt();
			
			for(Number = Minimum; Number <= Maximum; Number++) {
				for(i = 1, Sum =0; i < Number; i++)  {
					if(Number % i == 0)  {
						Sum = Sum + i;
					}
				}
				if (Sum == Number) {
					System.out.format("%d \t", Number);
				}
			}
		}
}

