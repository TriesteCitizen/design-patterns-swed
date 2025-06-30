package templateMethodPattern;

public class Client {
	public static void main(String[] args) {
		Eingabe eingabe = new LowercaseConverter();
		eingabe.run();
		Eingabe neueEingabe = new UppercaseConverter();
		neueEingabe.run();
	}

}
