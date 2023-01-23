import java.util.Random;
import java.util.Scanner;

class Main
{
	public static void main(String[] args) {
		generateRandom();
	}

	public  static void generateRandom()
	{
		Random random= new Random();

		int randNum = random.nextInt(100)+1;
		GuessNum(randNum);

	}

	public static void GuessNum(int randNum)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("");
		System.out.println("NUMBER GUESSING GAME");
		System.out.println("---------------------");
		System.out.println("Guess a number between 1-100:");
		System.out.println("");

		while(true)
		{
			int guess=scan.nextInt();
			if(guess==randNum)
			{
				System.out.println("HURRAYY....!");
				System.out.println("currect YOU WON");
				break;
			}
			else if(guess>randNum)
			{
				System.out.println("Nope, The Number is Higher");
				System.out.println("Guess Again! ");	
			}
			else
			{
				System.out.println("Nope, The Number is Lower");
				System.out.println("Guess Again! ");
			}

		}

	}

}