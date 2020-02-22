package Rodriguez_Problem1;
import java.util.Scanner;

public class CAI5 {
	private static Scanner scan = new Scanner(System.in);
	public static int counter = 0;
	public static int difficulty = 0;
	public static int arithmetic = 0;

	public static void main(String[] args) {
		//Randomly generate 2 single digit ints
		//Ask user to answer problem in a loop
		//if answered correct break loop and close program
		//else loop again.
		while(true) {
			counter = 0;
			arithmetic = 0;
			System.out.printf("%n%nNew Quiz!! Choose a Difficulty(1, 2, 3 or 4): ");
			readDifficulty();
			System.out.printf("%nChoose an problem type (1, 2, 3, 4, 5): ");
			readProblemType();
			quiz();
		}
		
	}
	public static void quiz() {
		for(int i = 0; i < 10; i++) {
			askQuestion();
		}
		displayCompletetionMessage();
	}
	public static double randomNumOne() {//Randomly produces an int between 0 - 9
		int max = 9, min = 0;
		double x = (int) (Math.random() * ((max - min) + 1)) + min;
		return x;
	}
	public static double randomNumTwo() {//Randomly produces an int between 0 - 99
		int max = 99, min = 0;
		double x = (int) (Math.random() * ((max - min) + 1)) + min;
		return x;
	}
	public static double randomNumThree() {//Randomly produces an int between 0 - 999
		int max = 999, min = 0;
		double x = (int) (Math.random() * ((max - min) + 1)) + min;
		return x;
	}
	public static double randomNumFour() {//Randomly produces an int between 0 - 9999
		int max = 9999, min = 0;
		double x = (int) (Math.random() * ((max - min) + 1)) + min;
		return x;
	}
	public static double randomResponse() {//Randomly produces an int between 0 - 3 for different possible responses
		int max = 3, min = 0;
		double x = (int) (Math.random() * ((max - min) + 1)) + min;
		return x;
	}
	public static double randomProblem() {//Generates a random problem if the arithmetic choice is 5
		int max = 4, min = 1;
		double x = (int) (Math.random() * ((max - min) + 1)) + min;
		return x;
	}
	public static void askQuestion() {
		double x = generateQuestionArgument();
		double y = generateQuestionArgument();
		int randomNum = 0;
		if(arithmetic == 5) {
			randomNum = (int) randomProblem();
		}
		if(arithmetic == 1 || randomNum == 1) {
			System.out.printf("%nWhat is %.0f plus %.0f: ",x ,y);
		}
		else if(arithmetic == 2 || randomNum == 2) {
			System.out.printf("%nWhat is %.0f times %.0f: ",x ,y);
		}
		else if(arithmetic == 3 || randomNum == 3) {
			System.out.printf("%nWhat is %.0f minus %.0f: ",x ,y);
		}
		else if(arithmetic == 4 || randomNum == 4) {
			System.out.printf("%nWhat is %.0f divide %.0f: ",x ,y);
		}
		readResponse(x,y,randomNum);
	}
	public static void readResponse(double x, double y,int randomNum) {
		//Reads in the input from the user
		int response = scan.nextInt();
		isAnswerCorrect(x,y,response,randomNum);
	}
	public static void isAnswerCorrect(double x, double y, int response, int randomNum) {
		//Checks to see if the answer is correct or not
		if(arithmetic == 1 || randomNum == 1) {
			if(response == x + y) {
				displayCorrectResponse();
			}
			else {
				displayIncorrectResponse();
			}
		}
		else if(arithmetic == 2 || randomNum == 2) {
			if(response == x * y) {
				displayCorrectResponse();
			}
			else {
				displayIncorrectResponse();
			}
		}
		else if(arithmetic == 3 || randomNum == 3) {
			if(response == x - y) {
				displayCorrectResponse();
			}
			else {
				displayIncorrectResponse();
			}
		}
		else if(arithmetic == 4 || randomNum == 4) {
			if(response == x / y) {
				displayCorrectResponse();
			}
			else {
				displayIncorrectResponse();
			}
		}
	
	}
	public static void displayCorrectResponse() {
		double x = randomResponse();
		if(x == 0) {
			System.out.printf("%nVery Good!");
		}
		else if(x == 1) {
			System.out.printf("%nExcellent!");
		}
		else if(x == 2) {
			System.out.printf("%nNice Work!");
		}
		else if(x == 3) {
			System.out.printf("%nKeep up the good work!");
		}
		counter++;
		
	}
	public static void displayIncorrectResponse() {
		double x = randomResponse();
		if(x == 0) {
			System.out.printf("%nNo. Please try again.");
		}
		else if(x == 1) {
			System.out.printf("%nWrong. Try once more.");
		}
		else if(x == 2) {
			System.out.printf("%nDon't give up!");
		}
		else if(x == 3) {
			System.out.printf("%nNo. Keep trying.");
		}
	}
	public static void displayCompletetionMessage() {
		if(counter > 7) {
			System.out.printf("%nCongratulations, you are ready to go to the next level!");
		}
		else {
			System.out.printf("%nPlease ask your teacher for extra help.");
		}
	}
	public static void readDifficulty() {
		difficulty = scan.nextInt(); 
	}
	public static int generateQuestionArgument() {
		int x = 0;
		if(difficulty == 1) {
			x = (int) randomNumOne();
		}
		else if(difficulty == 2) {
			x = (int) randomNumTwo();
		}
		else if(difficulty == 3){
			x = (int) randomNumThree();
		}
		else {
			x = (int) randomNumFour();
		}
		return x;
	}
	public static void readProblemType() {
		arithmetic = scan.nextInt();
	}

}
