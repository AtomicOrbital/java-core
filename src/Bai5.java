import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào tọa độ điểm A");
		System.out.print("Nhập tọa độ x1 cho điểm A: ");
		double x1 = scanner.nextDouble();
		System.out.print("Nhập tọa độ y1 cho điểm A: ");
		double y1 = scanner.nextDouble();
				
		System.out.print("Nhập tọa độ x2 cho điểm B: ");
		double x2 = scanner.nextDouble();
		System.out.print("Nhập tọa độ y2 cho điểm B: ");
		double y2 = scanner.nextDouble();

		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("Độ dài đoạn thẳng AB: " + distance);
		
		scanner.close();
	}

}
