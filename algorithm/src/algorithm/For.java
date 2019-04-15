package algorithm;

import java.util.Scanner;

public class For {
	
	// 8393 자기 자신까지의 합 구하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numb = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= numb; i ++){
			sum += i;
		}
		System.out.println(sum);
	}
	
	// 1924 날짜에서 요일 추출하기 (2007년)
/*	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();
		scan.close();
		
		int [] endDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String [] weekDays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int days = day;
		for (int i = 0; i < month-1; i++) {
			days += endDays[i];
		}
		System.out.println(weekDays[days%7]);
		
	}*/
	
	
	// 2441 별 뒤집어 반대로 찍기
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for (int i=a; i>=1; i--) {
//			for(int j=1; j<=a-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	// 2440 별 반대로 찍기
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for (int i=a; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	// 2439 별 거꾸로 찍기
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for (int i=1; i<=a; i++) {
//			for(int j=1; j<=a-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	// 2438 별 찍기
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for (int i=1; i<=a; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	// 2739 구구단 2단 출력하기
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for (int i=1; i<=9; i++) {
//			System.out.println(a+" * "+i+" = "+a*i);
//		}
//	}
	
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
