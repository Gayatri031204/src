package Quizegame;

import java.util.*;

public class Quize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("\n--- Quiz Game Menu ---");
			System.out.println("1. Take a Quiz");
			System.out.println("2. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			if (choice == 1) {
				// You can also add more questions here dynamically
				QuizQuestions.addQuestions("Which of these are selection statements in Java?", "break", "continue",
						"for()", "if()", 4);
				QuizQuestions.allQuestions();
			} else if (choice == 2) {
				System.out.println("Thank you for playing!");
				break;
			} else {
				System.out.println("Invalid choice. Please try again.");
			}
		}

		sc.close();
	}
}
