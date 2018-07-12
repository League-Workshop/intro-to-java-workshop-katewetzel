package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
int score = 0;		
		// 2.  Ask the user a question 
String name1 = JOptionPane.showInputDialog("What is the speed of light (in m/s)?");		
		// 3.  Use an if statement to check if their answer is correct
if(name1.equals("300000000 m/s")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
	JOptionPane.showMessageDialog(null,"Your Score...");
	JOptionPane.showMessageDialog(null, score);
}else {
	JOptionPane.showMessageDialog(null, "Incorrect");
	JOptionPane.showMessageDialog(null, "Your score...");
	JOptionPane.showMessageDialog(null, score);
	
}
String name2 = JOptionPane.showInputDialog("7 X 9");
if(name2.equals("63")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
	JOptionPane.showMessageDialog(null, "Your Score...");
	JOptionPane.showMessageDialog(null, score);
} else {
	JOptionPane.showMessageDialog(null, "Incorrect");
	JOptionPane.showMessageDialog(null, "Your Score...");
	JOptionPane.showMessageDialog(null, score);
}
String name3 = JOptionPane.showInputDialog("Who was the 27th president of the United States?");
if(name3.equals("Taft")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
	JOptionPane.showMessageDialog(null, "Your Score...");
	JOptionPane.showMessageDialog(null, score);
}else {
	JOptionPane.showMessageDialog(null, "Incorrect");
	JOptionPane.showMessageDialog(null, "Your Score...");
	JOptionPane.showMessageDialog(null, score);
}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
