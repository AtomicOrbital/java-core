import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Mời bạn nhập vào một số: ");
		
		int number = scanner.nextInt();
		System.out.print("Các ước số là: ");
		for(int i=1; i<=number; i++) {
			if(number % i == 0) {
				System.out.printf("%d ", i);
			}
		}
		
		scanner.close();
	}

}
