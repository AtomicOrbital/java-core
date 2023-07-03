import java.util.Scanner;
import java.util.Stack;

public class Bai2 {

	public static int convertBinaryToDemical(String binaryString) {
		int demicalNumber = 0;
		int power = 0;
		for (int i = binaryString.length() - 1; i >= 0; i--) {
			int digit = binaryString.charAt(i) - '0';
			demicalNumber += digit * Math.pow(2, power);
			power++;
		}
		return demicalNumber;
	}

	public static String convertDemicalToBinary(int decimalNumber) {
		if (decimalNumber < 0) {
			System.out.println("Không thể chuyển số âm sang hệ nhị phân.");
			return null;
		}
		StringBuilder binaryString = new StringBuilder();
		do {
			int digit = decimalNumber % 2;
			binaryString.insert(0, digit);
			decimalNumber /= 2;
		} while (decimalNumber > 0);
		return binaryString.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Chuyển từ thập phân sang nhị phân");
		System.out.println("2. Chuyển từ nhị phân sang thập phân");

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Nhập vào số thập phân : ");
			int demical = scanner.nextInt();
			String binary = convertDemicalToBinary(demical);
			System.out.println("Chuỗi nhị phân là : " + binary);
			break;
		case 2:
			System.out.print("Nhập vào chuỗi nhị phân : ");
			String binaryString = scanner.next();
			int demicalNumber = convertBinaryToDemical(binaryString);
			System.out.println("Số thập phân là : " + demicalNumber);
			break;
		default:
			System.out.println("Không hợp lệ");
			break;
		}

		scanner.close();
	}

}
