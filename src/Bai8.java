import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Mời bạn nhập vào một chuỗi: ");
		String str = scanner.nextLine();
		String[] array = str.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(String word : array) {
			result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
		}
		
		System.out.print("Chuỗi hoàn chỉnh là: " + result);
		
		scanner.close();
	}

}
