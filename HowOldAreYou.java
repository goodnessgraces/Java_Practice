import java.util.Scanner;

public class HowOldAreYou
{
	public static void main (String[]args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = keyboard.nextInt();

		if(age<16){
		System.out.println("You can't drive.");
	}
	if(age<18){
		System.out.println("You can't vote.");
	}
	if(age<25){
		System.out.println("You can't rent a car.");
	}
	else{
		System.out.println("You can do anything legal.");
	}
		}
	}


