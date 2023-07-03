import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào một số tự nhiên: ");
		int number = scanner.nextInt();
		
		double logN = Math.log(number) / Math.log(2);
		int largestNumber = (int) Math.floor(logN);
		
		System.out.print("Số lớn nhất nhỏ hơn log2(n) là : " + largestNumber);
		
		
		scanner.close();
	}

}
