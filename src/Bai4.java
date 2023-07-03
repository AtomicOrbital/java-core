import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào một số tự nhiên: ");
		int number = scanner.nextInt();

		int sum = 0;
		while (number != 0) {
			int tmp = number % 10;
			sum += tmp;
			number = number / 10;
		}

		System.out.println("Tổng các chữ số: " + sum);
		scanner.close();
	}

}
