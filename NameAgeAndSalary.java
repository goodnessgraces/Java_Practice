import java.util.Scanner;
public class NameAgeAndSalary{
	public static void main (String [] args){
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		double salary;
		System.out.println("What is your name?");
		name = keyboard.next();
		System.out.println("What is your age?");
		age = keyboard.nextInt();
		System.out.println("What is your salary?");
		salary= keyboard.nextDouble();
System.out.println(" Wow, "+ name + ", at "+ age + "years of age I hope your salary of " + salary + "is buy the hour.");
	}
}