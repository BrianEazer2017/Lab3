import java.util.Scanner;

public class Lab3DescribeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	private static void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		printer("What's your name?");
		String name = sc.nextLine();
		printer("OK, " + name +". Enter a number between 1 and 100");
		int num = sc.nextInt();
		tellMeAboutTheNumber(num);
	}

	public static void tellMeAboutTheNumber(int num) {
		// TODO Auto-generated method stub
		if (num % 2 != 0 && num <= 59) {
			printer("Odd");
		}
		else if (num >= 2 && num <= 25) {
			printer("Even and less than 25");
		}
		else if (num >= 26 && num % 2 == 0) {
			printer("even");
		}
		else {
			printer("Odd and over 60");
		}
		input();
		
	}

	private static void printer(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}
}
