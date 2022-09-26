package Task;
import java.util.Scanner;

public class number_guessing_game {
	public static void main(String[] args) {
		
		int n = (int)(Math.random()*100); 
		//generates random number
		
		System.out.println("Number Guessing game!");
		System.out.println("Rules of this game are: \n The Number you have to guess lies between 0 to 100 \n If your guess is wrong It will tell you that your guessed Number is greater or smaller than random number \n Each one gets five chances to guess the Number,Person who guesses in minimum chances wins" );
		
		Scanner x = new Scanner(System.in);
		
		int max = 4;
		//maximum choices to guess the number
		
		int i = 0;
			
		while(i < max) {
			int num = x.nextInt();
			if(num == n) {
				System.out.println("Congratulations");
				break;
			}
			else if(num < n && i != max-1){
				System.out.println("Your guessed number is Smaller than the random number");
			}
			else if(num > n && i != max-1) {
				System.out.println("Your guessed number is Greater than the random number");
			}
			i++;
		}
		if(i == max) {
			System.out.println("You're out of choices, the number was:"+n);
		}
		x.close();
	}
}
