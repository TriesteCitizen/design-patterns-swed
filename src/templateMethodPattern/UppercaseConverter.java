package templateMethodPattern;

public class UppercaseConverter extends Eingabe{
	@Override
	protected String convert(String eingabe) {
		return eingabe.toUpperCase();
	}
	
	@Override
	protected boolean speichern() {
		return true;
	}
}
