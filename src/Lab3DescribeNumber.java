import java.util.Scanner;

public class Lab3DescribeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		printer("What's your name?");
		String name = sc.nextLine();
		input(name);
		
	}
	
	private static void input(String name) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner sc = new Scanner(System.in);
		printer(name + ", give me a number.");
		if (sc.hasNextInt()) {
			num = sc.nextInt();
			if (num >= 1 && num <= 100) {
			tellMeAboutTheNumber(num, name);
			}
			else {
				printer(name + ", your number is out of range.");
				input(name);
			}
		}
		
	}


	public static void tellMeAboutTheNumber(int num, String name) {
		// TODO Auto-generated method stub
		if (num % 2 != 0 && num <= 59) {
			printer(name + ", your number '" + num + "' is odd");
		}
		else if (num >= 2 && num <= 25) {
			printer(name + ", your number is even and less than 25");
		}
		else if (num >= 26 && num <= 60 && num % 2 == 0) {
			printer(name + ", your number is even");
		}
		else if (num > 60 && num % 2 == 0) {
			printer(name + ", your number '" + num + "' is even and over 60");
		}
		else {
			printer(name + ", your number '" + num + "' is odd and over 60");
		}
		repeat(name);
	}
	
	public static void repeat(String name) {
		Scanner sc = new Scanner(System.in);
		printer("Do you want to continue? Type y/n");
		String answer = sc.nextLine();
		if (answer.equals("y")) {
			input(name);
		}
		else if (answer.equals("n")) {
				printer("Alright, it's been real " + name + ".");
			}
		else {
			printer("ur smart. Here's some money. Go buy yourself a jetski, get a good night's sleep. Try again");
			repeat(name);
		}
	}
	private static void printer(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}
}
