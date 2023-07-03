import java.util.Scanner;

public class Bai19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("1. Giải phương trình bậc nhất ");
			System.out.println("2. Giải phương trình bậc hai ");
			System.out.println("3. Thoát");
			
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Phương trình bậc nhất có dạng a1x + b1 = 0");
				
				System.out.println("Nhập vào giá trị a1: ");
				double a1 = scanner.nextDouble();
				System.out.println("Nhập vào giá trị b1: ");
				double b1 = scanner.nextDouble();
				
				if(a1 == 0) {
					if(b1 == 0) {
						System.out.println("Phương trình có vô số nghiệm ");
					} else {
						System.out.println("Phương trình có vô nghiệm ");
					}
				} else {
					double x = -b1 / a1;
					System.out.printf("x = %.2f\n", x);
				}
				break;
			}
			
			case 2: {
				System.out.println("Phương trình bậc hai có dạng : a2x + b2x + c = 0");
			
				System.out.println("Nhập vào giá trị a2:");
				double a2 = scanner.nextDouble();
				System.out.println("Nhập vào giá trị b2:");
				double b2 = scanner.nextDouble();
				System.out.println("Nhập vào giá trị c:");
				double c = scanner.nextDouble();
			
				double delta = b2 * b2 - 4 * a2 * c;
				
				if(delta > 0) {
					double x1 = (-b2 + Math.sqrt(delta)) / (2 * a2);
					double x2 = (-b2 - Math.sqrt(delta)) / (2 * a2);
					
					System.out.printf("x1 = %.2f, x2 = %.2f\n", x1, x2);
				} else if(delta == 0) {
					double x = -b2 / (2 * a2);
					System.out.printf("x = %.2f", x);
				} else {
					System.out.println("Phương trình vô nghiệm");
				}
				
				break;
			}
			
			case 3: {
				System.out.println("Exit");
				break;
			}
			
			default:
				break;
			}
		} while(choice != 3);
		
//		scanner.close();
	}

}
