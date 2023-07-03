import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số phần tử của mảng: ");

		int n = scanner.nextInt();
		int[] array = new int[n];

		Set<Integer> set = new HashSet<>();

		System.out.println("Nhập vào số phần tử của mảng: ");

		for (int i = 0; i < n; i++) {
			int element = scanner.nextInt();
			if (set.add(element)) {
				array[i] = element;
			}
		}

		System.out.println("Các phần tử của mạng là: ");
		
		for (int number : set) {
			System.out.print(number + " ");
		}

		scanner.close();
	}

}
