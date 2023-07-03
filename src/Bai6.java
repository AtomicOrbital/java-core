import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào một chuỗi: ");
		String str = scanner.nextLine();
		
		System.out.print("Chuỗi đảo ngược: ");
		for(int i = str.length() - 1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		scanner.close();
	}

}
