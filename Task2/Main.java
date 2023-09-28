import java.util.Scanner;

public class Main
{
	public static void main (String[] args)
	{
		System.out.println("Please type your name");

		Scanner scanner = new Scanner(System.in);

		String name = scanner.nextLine();

		System.out.println("Hello " + name + ", Please type your age.");

		String age = scanner.nextLine();

		int i = Integer.parseInt(age);

		System.out.println(age);

		int retirement = 67;

		if(i > 67 || i < 0)
		{
			System.out.println("Invalid age");
		}
		else
		System.out.println("You have : " + (retirement - i) + " years until you can retire");
	}
	

}