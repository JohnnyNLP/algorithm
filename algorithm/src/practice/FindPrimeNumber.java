package practice;

import java.util.Scanner;

public class FindPrimeNumber {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("확인하고 싶은 숫자를 입력하세요.");
		int num = sc.nextInt();
		boolean check = ifPrimeNumber(num);
		
		if(check) System.out.println("입력하신 숫자 "+num+"은 소수입니다.");
		else System.out.println("입력하신 숫자 "+num+"은 소수가 아닙니다.");
	}
	
	public static boolean ifPrimeNumber (int num) {
		if (num == 2 || num == 3) return true;
		if (num == 1 || num%2 == 0) return false;
		else {
			int temp = num/2;
			for(int j=1; j<temp; j++) {
				if(num%(2*j+1)==0) {
					return false;
				}
			}
			return true;
		}
	}
}
