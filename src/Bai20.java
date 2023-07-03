import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập số phần tủ của mảng:");
		int numberElement = scanner.nextInt();
		int[] array = new int[numberElement];

		System.out.println("Nhập các phần tử của mảng");
		for (int i = 0; i < numberElement; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Số phần tử chẵn là : ");
		for (int i = 0; i < numberElement; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("Số phần tử lẻ là : ");
		for (int i = 0; i < numberElement; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		
		

		scanner.close();
	}

}
