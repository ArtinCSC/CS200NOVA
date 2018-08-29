
import java.util.Scanner;

public class HomeWork3A {
	public static final int ASCII_PRINTABLE_BEGIN = 33;
	public static final int ASCII_PRINTABLE_END = 126;
	public static final int BINARY_NUMBER = 1;
	public static final int ASCII_TWENTY_NUMBER_BEGIN = 48;
	public static final int ASCII_TWENTY_NUMBER_END = 57;
	public static final int ASCII_TWENTY_CHAR_BEGIN = 65;
	public static final int ASCII_TWENTY_CHAR_END = 74;
	public static final int ASCII_TWENTY_CHAR_LOWER_BEGIN = 97;
	public static final int ASCII_TWENTY_CHAR_LOWER_END = 106;
	public static final int HEX = 16;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number followed a character");
		String userInput = input.nextLine();

		int posSpase = userInput.indexOf(" ");
		String userNumberStr = userInput.substring(0, posSpase);

		String userCharStr = userInput.substring(++posSpase);

		char userChar = userCharStr.charAt(0);

		switch (userChar)

		{
		case 'A':
		case 'a':
			int userNumber = Integer.parseInt(userNumberStr);

			if ((userNumber >= ASCII_PRINTABLE_BEGIN) || (userNumber <= ASCII_PRINTABLE_END)) {
				char asciiRep = (char) userNumber;

				System.out.println("Your corresponding ASCII representation = " + asciiRep);
			} else if ((userNumber <= ASCII_PRINTABLE_BEGIN) || (userNumber >= ASCII_PRINTABLE_END))
				System.out.println("Not Printable");

			else
				System.out.println("Pass");
			break;

		case 'B':
		case 'b':

			String digit1 = userNumberStr.substring(0, 1);
			String digit2 = userNumberStr.substring(1, 2);
			String digit3 = userNumberStr.substring(2, 3);
			String digit4 = userNumberStr.substring(3, 4);

			int digitInt1 = Integer.parseInt(digit1);
			int digitInt2 = Integer.parseInt(digit2);
			int digitInt3 = Integer.parseInt(digit3);
			int digitInt4 = Integer.parseInt(digit4);

			if ((userNumberStr.length() == 4) && (digitInt1 <= BINARY_NUMBER) && (digitInt2 <= BINARY_NUMBER)
					&& (digitInt3 <= BINARY_NUMBER) && (digitInt4 <= BINARY_NUMBER)) {
				int decimalNumber = Integer.parseInt(userNumberStr, 2);
				System.out.println("The decimal equivalent of your number = " + decimalNumber);
			} else
				System.out.println("Pass");
		case 'V':
		case 'v':
			String firstDigit = userNumberStr.substring(0, 1);
			String secondDigit = userNumberStr.substring(1, 2);

			char firstDigitChar = firstDigit.charAt(0);
			char secondDigitChar = secondDigit.charAt(0);

			if ((userNumberStr.length() == 2) || (firstDigitChar >= ASCII_TWENTY_NUMBER_BEGIN)
					|| (secondDigitChar >= ASCII_TWENTY_NUMBER_BEGIN) || (firstDigitChar <= ASCII_TWENTY_NUMBER_END)
					|| (secondDigitChar <= ASCII_TWENTY_NUMBER_END) || (firstDigitChar >= ASCII_TWENTY_CHAR_BEGIN)
					|| (secondDigitChar >= ASCII_TWENTY_CHAR_BEGIN) || (firstDigitChar <= ASCII_TWENTY_CHAR_END)
					|| (secondDigitChar <= ASCII_TWENTY_CHAR_END) || (firstDigitChar >= ASCII_TWENTY_CHAR_LOWER_BEGIN)
					|| (secondDigitChar >= ASCII_TWENTY_CHAR_LOWER_BEGIN)
					|| (firstDigitChar <= ASCII_TWENTY_CHAR_LOWER_END)
					|| (secondDigitChar <= ASCII_TWENTY_CHAR_LOWER_END)) {
				int userNumberTen = Integer.parseInt(userNumberStr, 20);

				int userNumberHex1 = userNumberTen / HEX;
				int userNumberHexR1 = userNumberTen % HEX;

				int userNumberHex2 = userNumberHex1 / HEX;
				int userNumberHexR2 = userNumberHex1 % HEX;

				int userNumberHex3 = userNumberHex2 / HEX;
				int userNumberHexR3 = userNumberHex2 % HEX;

				int userNumberHexR4 = userNumberHex3 % HEX;

				if (userNumberHexR4 >= 10) {
					int hex1 = userNumberHexR4 + 55;
					char hexAscii1 = (char) hex1;
					String hexAsciiStr1 = String.valueOf(hexAscii1);
				} else {
					String hexAsciiStr1 = String.valueOf(userNumberHexR4);
				}

				if (userNumberHexR3 >= 10) {
					int hex2 = userNumberHexR3 + 55;
					char hexAscii2 = (char) hex2;
					String hexAsciiStr2 = String.valueOf(hexAscii2);

				} else {
					String hexAsciiStr2 = String.valueOf(userNumberHexR3);
				}
				if (userNumberHexR2 >= 10) {
					int hex3 = userNumberHexR2 + 55;
					char hexAscii3 = (char) hex3;
					String hexAsciiStr3 = String.valueOf(hexAscii3);

				} else {
					String hexAsciiStr3 = String.valueOf(userNumberHexR2);
				}
				if (userNumberHexR1 >= 10) {
					int hex4 = userNumberHexR1 + 55;
					char hexAscii4 = (char) hex4;
					String hexAsciiStr4 = String.valueOf(hexAscii4);

				} else {
					String hexAsciiStr4 = String.valueOf(userNumberHexR1);
				}

				System.out.println(
						"The hexadecimal equivalent = " + hexAsciiStr1 + hexAsciiStr2 + hexAsciiStr3 + hexAsciiStr4);

			} else {
				System.out.println("Pass");
			}

		}
	}
}