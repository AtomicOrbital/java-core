import java.util.Scanner;

public class Bai15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào một chuỗi: ");

		String input = scanner.nextLine();
		System.out.print("Độ dài của chuỗi là : " + input.length());

		System.out.println();

		// In ra ký tự tại một vị trí nhất định (index)
		System.out.print("Nhập vào ký tự thứ index: ");
		int index = scanner.nextInt();
		scanner.nextLine();
		char character = input.charAt(index);

		System.out.print("Ký tự thứ " + index + " là : " + character);

		System.out.println();

		boolean flag = false;
		for (int i = 0; i <= input.length(); i++) {
			if (input.substring(i, i + 6).equals("abcdef")) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.print("Chuỗi nhập vào có chuỗi phụ abcdef");
		} else {
			System.out.print("Chuỗi nhập vào không có chuỗi phụ abcdef");
		}

		scanner.close();
	}

}
