package ArrayLaunchPad;

// Write a Java program to count the letters, spaces, numbers and other characters of an input string

public class TextCounter {

	int evenCounter = 0;

	public static void TextCounter(String _text) {

		int letterCounter = 0;
		int spaceCounter = 0;
		int digitCounter = 0;
		int specialCharCounter = 0;

		for (char ch : _text.toCharArray()) {

			if (Character.isLetter(ch)) {

				letterCounter++;

			} else if (Character.isSpaceChar(ch)) {
				spaceCounter++;

			} else if (Character.isDigit(ch)) {
				digitCounter++;

			} else {
				specialCharCounter++;

			}
		}

		System.out.println("Counter Info :  \n" + _text + "\nLetter Count is " + letterCounter + "\n"
				+ "Space Count is " + spaceCounter + "\n" + "Digit Count is " + digitCounter + "\n"
				+ "Special Char Count is " + specialCharCounter);

	}

	public static void main(String[] args) {
		String text = "Hello World! This is Chitti the Robo @ Memory 2 TB!";

		TextCounter(text);

	}

}
