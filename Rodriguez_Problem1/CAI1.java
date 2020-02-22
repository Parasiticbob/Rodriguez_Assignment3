package Rodriguez_Problem1;
import java.util.Scanner;

public class CAI1 {
	private static Scanner scan = new Scanner(System.in);
	public static int i = 1;

	public static void main(String[] args) {
		//Randomly generate 2 single digit ints
		//Ask user to answer problem in a loop
		//if answered correct break loop and close program
		//else loop again.
		quiz();
		
	}
	public static void quiz() {
		
		double x = 0, y = 0;
		x = randomNum();
		y = randomNum();
		while(i == 1) {
			askQuestion(x,y);
			
		}
	}
	public static double randomNum() {//Randomly produces an int between 0 - 9
		int max = 9, min = 0;
		double x = (int) (Math.random() * ((max - min) + 1)) + min;
		return x;
	}
	public static void askQuestion(double x, double y) {
		while(true) {
			System.out.printf("%nWhat is %.0f times %.0f: ",x ,y);
			readResponse(x,y);
		}
	}
	public static void readResponse(double x, double y) {
		//Reads in the input from the user
		int answer = scan.nextInt();
		isAnswerCorrect(x,y,answer);
	}
	public static void isAnswerCorrect(double x, double y, int answer) {
		//Checks to see if the answer is correct or not
		if(answer == x * y) {
			displayCorrectResponse();
			System.exit(0);
		}
		else {
			displayIncorrectResponse();
		}
	}
	public static void displayCorrectResponse() {
		System.out.printf("%nVery Good!");
	}
	public static void displayIncorrectResponse() {
		System.out.printf("%nNo.Please try again.");
	}

}
