import java.util.*;

public class Bai18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số tiền gửi ban đầu của X:");
		double initialAmount = scanner.nextDouble();
		System.out.println("Số tiền mong muốn nhận của X:");
		double desiredAmount = scanner.nextDouble();
		System.out.println("Nhận lãi suất tiết kiệm dưới dạng số thập phân:");
		double interestRate = scanner.nextDouble();
		
		int years = 0;
		while(initialAmount < desiredAmount) {
			initialAmount += initialAmount * interestRate;
			years++;
		}
		System.out.println("Số năm ít nhất mà X phải chờ là: " + years);
	}

}
