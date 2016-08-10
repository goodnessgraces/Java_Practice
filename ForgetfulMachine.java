
import java.util.Scanner;
public class ForgetfulMachine{
	public static void main(String [] args){

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Give me a word!");
		keyboard.next();

		System.out.print("Give me a second word!");//will place cursor on the same line
		keyboard.next();

		System.out.println("Great, now your favorite number!");
		keyboard.nextInt();

		System.out.println("And, your second favorite number. . .");
		keyboard.next();

		System.out.println("Whew! Wasn't that fun?");

	}

}