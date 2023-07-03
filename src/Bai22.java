import java.util.Scanner;

import javax.security.auth.Subject;

public class Bai22 {
	public static boolean isPalindromic(String s) {
		int i = 0, j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		String stringPalindrmic = "";
		int maxLength = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String substr = str.substring(i,j);
				
				if(isPalindromic(substr) && substr.length() > maxLength) {
					stringPalindrmic = substr;
					maxLength = substr.length();
				}
			}
		}
		
		System.out.println("Chuỗi Palindrmic dài nhất: " + stringPalindrmic);

		scanner.close();
	}

}
