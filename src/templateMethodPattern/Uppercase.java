package templateMethodPattern;

import javax.swing.JOptionPane;

public class Uppercase {
	public final void run() {
		final String EINGABE = textEingeben();
		final String KONVERTIERT = convert(EINGABE);
		drucke(KONVERTIERT);
	}
	
	public final String textEingeben() {
		final String MESSAGE = "Bitte geben Sie den Text ein: ";
		return JOptionPane.showInputDialog(MESSAGE);
	}
	
	private final String convert(String eingabe) {
		return eingabe.toUpperCase();
	}
	
	private final void drucke(String text) {
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		new Uppercase().run();
	}

}
