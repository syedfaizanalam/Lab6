import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		int m = 0;
		int n = 0;
		String answer;
		System.out.println("Enter the number of sides for your pair of dice:");
		m = scnr.nextInt();
		n = m;
		do {
		System.out.println("Roll the dice");
		System.out.println(generateRandomDieRoll(m));
		System.out.println(generateRandomDieRoll(n));
		System.out.println("Do you want to roll again? [y/n]");
		answer = scnr.next().toLowerCase();
		} while ( 
		(answer.contentEquals("y")
		));
		
	}

	public static int generateRandomDieRoll(int x) {
		int i;
		
		
		i = (int)(Math.random()*x) +1;
		return i;
	}
}
