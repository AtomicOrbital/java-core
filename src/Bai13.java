import java.util.Scanner;

public class Bai13 {

	public static int[] addElementAtIndex(int[] array, int index, int element) {
		int[] newArray = new int[array.length + 1];

		for (int i = 0; i < index; i++) {
			newArray[i] = array[i];
		}

		newArray[index] = element;

		for (int i = index + 1; i < array.length + 1; i++) {
			newArray[i] = array[i - 1];
		}

		return newArray;
	}

	public static int[] removeElementAtIndex(int[] array, int index) {
		int[] newArray = new int[array.length - 1];

		for (int i = 0; i < index; i++) {
			newArray[i] = array[i];
		}

		for (int i = index + 1; i < array.length; i++) {
			newArray[i - 1] = array[i];
		}

		return newArray;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số phần tử một mảng: ");

		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += array[i];
		}

		System.out.println("Độ dài trung bình của mảng là: " + sum / array.length);

		// Tìm phần tử lớn nhất, nhỏ nhất
		int largest = array[0];
		int smallest = array[0];

		for (int i = 1; i < n; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}

			if (array[i] < smallest) {
				smallest = array[i];
			}
		}

		System.out.println("Phần tử lớn nhất là : " + largest);
		System.out.println("Phần tử nhỏ nhất là : " + smallest);

		int largestNegative = Integer.MIN_VALUE;
		int smallestNegative = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (array[i] < 0 && array[i] > largestNegative) {
				largestNegative = array[i];
			}

			if (array[i] < 0 && array[i] < smallestNegative) {
				smallestNegative = array[i];
			}
		}

		if (largestNegative != Integer.MIN_VALUE) {
            System.out.println("Phần tử âm lớn nhất là : " + largestNegative);
        } else {
            System.out.println("Không có phần tử âm trong mảng");
        }

        if (smallestNegative != Integer.MAX_VALUE) {
            System.out.println("Phần tử âm nhỏ nhất là : " + smallestNegative);
        } else {
            System.out.println("Không có phần tử âm trong mảng");
        }


		System.out.print("Các phần tử chẵn là: ");
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println();

		System.out.print("Các phần tử lẻ là: ");
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println();

		// Thêm một phần tử theo index

		System.out.print("Nhập index thêm phần tử: ");
		int addIndex = scanner.nextInt();
		System.out.print("Nhập phần tử mới: ");
		int newElement = scanner.nextInt();

		array = addElementAtIndex(array, addIndex, newElement);

		System.out.println("Mảng mới sau khi thêm phần tử : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();

		System.out.print("Nhập index cần xóa: ");
		int index = scanner.nextInt();
		array = removeElementAtIndex(array, index);

		System.out.println("Mảng mới sau khi xóa phần tử : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}

}
