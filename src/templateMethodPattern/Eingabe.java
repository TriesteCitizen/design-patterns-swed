package templateMethodPattern;

import javax.swing.JOptionPane;

public abstract class Eingabe {
	public final void run() {
		String eingabe = textEingeben();
		String konvertiert = convert(eingabe);
		drucke(konvertiert);
		if(speichern()) {
			saveToDisk();
		}
	}
	
	private final String textEingeben() {
		final String MESSAGE = "Bitte geben Sie den Text ein: ";
		return JOptionPane.showInputDialog(MESSAGE);
	}
	
	protected abstract String convert(String eingabe);
	
	private final void drucke(String text) {
		System.out.println(text);
	}
	
	protected boolean speichern() {
		return false;
	}
	
	private void saveToDisk() {
		System.out.println("Eingabe wurde gespeichert.");
	}
}
