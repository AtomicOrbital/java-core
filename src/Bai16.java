import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào năm: ");
		int year = scanner.nextInt();
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.print("Năm bạn nhập là năm nhuận");
		} else {
			System.out.print("Năm bạn nhập không phải là năm nhuận");
		}
		
		scanner.close();
	}

}
