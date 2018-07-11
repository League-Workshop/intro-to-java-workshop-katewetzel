package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell ambidextrous");
		// 2. Catch the user's answer in a String
		String name1 = JOptionPane.showInputDialog(null);
		// 3. If the user spelled the word correctly, speak "correct"
		if (name1.equals("ambidextrous")) {
			speak("correct");
			JOptionPane.showMessageDialog(null, "Your score: 1");
			speak("spell aqueous");
			String name2 = JOptionPane.showInputDialog(null);
			if (name2.equals("aqueous")) {
				speak("correct");
				JOptionPane.showMessageDialog(null, "Your score: 2");
				speak("spell biscuit");
				String name5 = JOptionPane.showInputDialog(null);
				if (name5.equals("biscuit")) {
					speak("correct");
					JOptionPane.showMessageDialog(null, "Your score: 3");
				} else {
					speak("wrong");
					JOptionPane.showMessageDialog(null, "Your score: 2");
				}
			} else {
				speak("wrong");
				JOptionPane.showMessageDialog(null, "Your score: 1");
			}
			speak("spell biscuit");
			String name4 = JOptionPane.showInputDialog(null);
			if (name4.equals("biscuit")) {
				speak("correct");
				JOptionPane.showMessageDialog(null, "Your score: 2");
			} else {
				speak("wrong");
				JOptionPane.showMessageDialog(null, "Your score:1");
			}
		} else {
			speak("wrong.");
			JOptionPane.showMessageDialog(null, "Your score: 0");
			speak("spell aqueous");
			String name3 = JOptionPane.showInputDialog(null);
			if (name3.equals("aqueous")) {
				speak("correct");
				JOptionPane.showMessageDialog(null, "Your score: 1");
				speak("spell biscuit");
				String name6 = JOptionPane.showInputDialog(null);
				if (name6.equals("biscuit")) {
					speak("correct");
					JOptionPane.showMessageDialog(null, "Your score: 2");
				} else {
					speak("wrong");
					JOptionPane.showMessageDialog(null, "Your score: 1");
				}
			} else {
				speak("wrong");
				JOptionPane.showMessageDialog(null, "Your score: 0");
				speak("spell biscuit");
				String name7 = JOptionPane.showInputDialog(null);
				if(name7.equals("biscuit")) {
					speak("correct");
					JOptionPane.showMessageDialog(null, "Your score: 1");
				} else {
					speak("wrong");
					JOptionPane.showMessageDialog(null, "Your score: 0");
				}
			}
		}

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
