package algorithm;

import java.util.Scanner;

public class For {
	
	// 2739 구구단 2단 출력하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (int i=1; i<=9; i++) {
			System.out.println(a+" * "+i+" = "+a*i);
		}
	}
	
	// 2742 5부터 1까지 출력하기
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for (int i=a; i>=1; i--) {
//			System.out.println(i);
//		}
//	}
	
	
	// 2741 1부터 5까지 출력하기
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for (int i=1; i<=a; i++) {
//			System.out.println(i);
//		}
//	}

}
