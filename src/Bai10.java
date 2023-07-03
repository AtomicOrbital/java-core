import java.util.Scanner;

public class Bai10 {
	
	public static boolean isPrime(int number) {
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào số tự nhiên n: ");
		int n = scanner.nextInt();
		
		int sum = 0;
		for(int i=2; i<n; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		
		System.out.printf("Tổng số nguyên tố từ 1 đến n: " + sum);
		
		scanner.close();
	}

}
