package Quizegame;

import java.util.*;

class QuizQuestions {

	String question, answer1, answer2, answer3, answer4;
	int answer;

	public QuizQuestions(String q, String a1, String a2, String a3, String a4, int a) {
		this.question = q;
		this.answer1 = a1;
		this.answer2 = a2;
		this.answer3 = a3;
		this.answer4 = a4;
		this.answer = a;
	}

	public String getQ() {
		return question;
	}

	public void setQ(String q) {
		this.question = q;
	}

	public void setCa(int ca) {
		this.answer = ca;
	}

	public int getCa() {
		return answer;
	}

	public String getA1() {
		return answer1;
	}

	public void setA1(String a1) {
		this.answer1 = a1;
	}

	public String getA2() {
		return answer2;
	}

	public void setA2(String a2) {
		this.answer2 = a2;
	}

	public String getA3() {
		return answer3;
	}

	public void setA3(String a3) {
		this.answer3 = a3;
	}

	public String getA4() {
		return answer4;
	}

	public void setA4(String a4) {
		this.answer4 = a4;
	}

	@Override
	public String toString() {
		return "Questions{" + "q='" + question + '\'' + ", a1='" + answer3 + '\'' + ", a2='" + answer2 + '\'' + ", a3='"
				+ answer3 + '\'' + ", a4='" + answer4 + '\'' + '}';
	}

	public static List<QuizQuestions> questions = new ArrayList<>(List.of(
			new QuizQuestions("What is a method in Java?", "A block of code that performs a specific task",
					"A variable that stores data", "A class that defines objects",
					"An interface that declares constants", 1),

			new QuizQuestions(
					"In Java, what is the implicit call inserted by the compiler in every constructor if no other constructor call is specified?",
					"this()", "super()", "default()", "base()", 2),
			new QuizQuestions("Which of the following statements about multiple inheritance in Java is correct?",
					"Java supports multiple inheritance through classes.",
					"Java supports multiple inheritance through interfaces.",
					"Java supports multiple inheritance through both classes and interfaces.",
					"Java does not support multiple inheritance.", 2),

			new QuizQuestions("What is the extension of java code files?", ".java", ".c", ".c++", ".js", 1),
			new QuizQuestions("Which of the following statements about abstract classes in Java is true?",
					"Abstract classes cannot have any methods with implementations",
					"Abstract classes cannot be instantiated", "Abstract classes can only contain abstract methods.",
					"Abstract classes cannot have constructors.", 2)));

	public static void addQuestions(String q, String a1, String a2, String a3, String a4, int ca) {
		QuizQuestions question = new QuizQuestions(q, a1, a2, a3, a4, ca);
		questions.add(question);
	}

	public boolean isCorrect(int userAnswer) {
		return userAnswer == this.getCa();
	}

	public static void allQuestions() {
		int correctAnswers = 0;
		int incorrectAnswers = 0;
		int sizeOfList = questions.size();
		for (QuizQuestions item : questions) {
			System.out.println(item.question);
			System.out.println("1] " + item.getA1());
			System.out.println("2] " + item.getA2());
			System.out.println("3] " + item.getA3());
			System.out.println("4] " + item.getA4());
			System.out.print("Enter the number as an answer: ");

			Scanner sc = new Scanner(System.in);
			int userAnswer = sc.nextInt();
			boolean ans = item.isCorrect(userAnswer);

			if (ans == true) {
				correctAnswers++;
			} else {
				incorrectAnswers++;
			}
		}
		System.out.println("Total correct answers=" + correctAnswers);
		System.out.println("Total incorrect answers=" + incorrectAnswers);
		double totalPercentage = ((double) correctAnswers / sizeOfList) * 100;
		System.out.printf("Total percentage = %.2f%%\n", totalPercentage);

		if (totalPercentage > 0 && totalPercentage < 30) {
			System.out.println("You should study much harder");
		} else if (totalPercentage > 31 && totalPercentage < 60) {
			System.out.println("You are studying good, need some more study");
		}
		if (totalPercentage > 61 && totalPercentage < 90) {
			System.out.println("You are becoming topper and bit of extra efforts required");
		}
		if (totalPercentage > 91 && totalPercentage < 100) {
			System.out.println("You are very good at concepts and being into top list");
		}
	}
}

public class Quize {
	public static void main(String[] args) {

		QuizQuestions.addQuestions(" Which of these are selection statements in Java?", "break", "continue", "for()",
				"if()", 4);
		QuizQuestions.allQuestions();
	}
}
