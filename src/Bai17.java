import java.util.Random;
import java.util.Scanner;

public class Bai17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numberSecret = random.nextInt(1000) + 1;
		
		int numberInput;
		
		do {	
			System.out.println("Nhập vào số từ 1 đến 1000: ");
			numberInput = scanner.nextInt();
			
			if(numberInput == numberSecret) {
				System.out.println("Bạn đã tìm được số bí mật ");
			}
			else if(numberInput > numberSecret) {
				System.out.println("Số bí mật nhỏ hơn " + numberInput);
			} else {
				System.out.println("Số bị mật lớn hơn " + numberInput);
			}
		} while(numberInput != numberSecret);
		
		scanner.close();
	}

}
