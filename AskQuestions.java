import java.util.Scanner;
public class AskQuestions{
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
int age;
String height;
double weight;
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		System.out.print("How tall are you? ");
		height = keyboard.next();
		System.out.print("How much do you weigh? ");
		weight = keyboard.nextDouble();
		System.out.println("You are "+ age +", are "+ height +" tall, and weigh "+ weight + " pounds.");
	}
}