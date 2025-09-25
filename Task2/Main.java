import java.util.Scanner;

class Main{
	public static void main(String [] args)
	{
		System.out.print("Please type your name here: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String input1 = scanner.nextLine();

		System.out.println("Hello " + input1 + "\nHow old are you?");
		
		int input2 = scanner.nextInt();

		System.out.println("OK. So you're " + input2 + " years old.\nNice.\nOr Idk? I don't I have preference as I AM a computer.");

		int retire = 67 - input2;

		System.out.println("However, it seems like you can retire in " + retire + " years, good for you I guess.");
	}
}