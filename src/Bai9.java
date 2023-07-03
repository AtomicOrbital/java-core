import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số nguyên thứ nhất: ");
		int number1 = scanner.nextInt();
		System.out.print("Nhập vào số nguyên thứ hai: ");
		int number2 = scanner.nextInt();

		if ((number1 >= 10 && number1 <= 99) && ((number2 >= 10) && (number2 <= 99))) {

			int firstDigit1 = number1 / 10;
			int secondDigit1 = number1 % 10;

			int firstDigit2 = number2 / 10;
			int secondDigit2 = number2 % 10;

			if (firstDigit1 == firstDigit2 || firstDigit1 == secondDigit2 || secondDigit1 == firstDigit2
					|| secondDigit1 == secondDigit2) {
				System.out.print("true");
			} else {
				System.out.print("false");
			}
		} else {
			System.out.println("Vui lòng nhập số có 2 chữ số ");
		}

		scanner.close();
	}

}
