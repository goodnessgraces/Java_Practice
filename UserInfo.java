import java.util.Scanner;

public class UserInfo{
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the following information so I can sell it for profit!");
		System.out.print("First Name: ");
		String firstName = keyboard.next();

		System.out.print("Last Name: ");
		String lastName = keyboard.next();

		System.out.print("Grade (9-12): ");
		int grade = keyboard.nextInt();

		System.out.print("StudentID: ");
		int studentID = keyboard.nextInt();

		System.out.print("Login: ");
		String login = keyboard.next();

		System.out.print("GPA (0.0-4.0): ");
		double gpa = keyboard.nextDouble();

		System.out.println("Your information:");

		System.out.print("	Name: " + lastName +", "+ firstName+"\n");

		System.out.print("	Grade (9-12): " + grade+"\n");

		System.out.print("	StudentID: " + studentID +"\n" );

		System.out.print("	Login: " + login + "\n");

		System.out.print("	GPA(0.0-4.0): "+ gpa + "\n");
	
	}
}