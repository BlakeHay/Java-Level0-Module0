package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String Q1 = JOptionPane.showInputDialog("Are cats better than dogs?");
				// 3.  Use an if statement to check if their answer is correct
				if(Q1 .equals("yes")){
					
				score += 1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				String Q2 = JOptionPane.showInputDialog("Does pizza taste good?");

				if(Q2 .equals("no")){
					
				score += 1;
					}
		
		// After all the questions have been asked, tell the user their final score 
	System.out.println("Your score is "+String.valueOf(score)+". Good job.");	
	}
}
