import java.util.Scanner;

public class Bai21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vị trí x1: ");
		int x1 = scanner.nextInt();
		System.out.print("Nhập vị trí v1: ");
		int v1 = scanner.nextInt();
		System.out.print("Nhập vị trí x2: ");
		int x2 = scanner.nextInt();
		System.out.print("Nhập vị trí v2: ");
		int v2 = scanner.nextInt();
		
		// x1 + v1*t = x2 + v2*t
		if(v1 > v2 && (x2 - x1) % (v1 - v2) == 0) {
			System.out.println("2 con Kan gặp được nhau");
		} else {
			System.out.println("2 con Kan không gặp được nhau");
		}
		
		scanner.close();
	}

}
