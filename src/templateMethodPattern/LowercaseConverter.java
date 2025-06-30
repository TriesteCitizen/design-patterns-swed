package templateMethodPattern;

import javax.swing.JOptionPane;

public class LowercaseConverter extends Eingabe{
	@Override
	protected String convert(String eingabe) {
		return eingabe.toLowerCase();
	}
	
	@Override
	protected boolean speichern() {
		String frage = "Soll der Text gespeichert werden?";
		int antwort = JOptionPane.showConfirmDialog(null, frage);
		return antwort == JOptionPane.YES_OPTION;
	}
}
//hook-methods give the possibility to influence the procedure of the algorithm
