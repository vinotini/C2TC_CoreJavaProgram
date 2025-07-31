package DayFive.MultilevelInheritance.Texteditor;

public class TextEditor {

	public static void main(String[] args) {
		Word word = new Word();

		word.write("I am MAHALAKSHMI ");
		word.formatText(true);
		word.write(" IV year CSE Student");
		word.displayContent();

		word.spellCheck();

		System.out.println("Is text in WordPad bold? " + word.isBold());
		System.out.println("Disabling spell check in Word.");
		word.enableSpellCheck(false);
		word.spellCheck();
	}
}
