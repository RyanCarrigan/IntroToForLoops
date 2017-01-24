import java.util.Scanner;

public class ForLoopsPractice
	{
		public static void main(String[] args)
			{
				System.out.println("#1");
				for (int i = 1; i < 6; i++)
					{
					System.out.println(i);
					}
				System.out.println();
				System.out.println("#2");
				for (int i = 2; i < 12; i= i + 2)
					{
					System.out.println(i + ") I love Mullen.");
					}
				System.out.println();
				System.out.println("#3");
				for (int i = 1; i < 6; i++)
					{
					System.out.print(i);
					}
				System.out.println();
				System.out.println();
				System.out.println("#4");
				for (int i = 10; i > 0; i--)
					{
					System.out.println(i);
					if (i == 1)
						{
						System.out.println("Liftoff!");
						}
					}
				System.out.println();
				System.out.println("#5");
				for (int i = 1; i < 11; i++)
					{
					int coinflip = (int)(Math.random()* 2) + 1;
					if (coinflip == 1)
						{
						System.out.println("Heads");
						}
					else if (coinflip == 2)
						{
						System.out.println("Tails");
						}
					}
			}
	}
