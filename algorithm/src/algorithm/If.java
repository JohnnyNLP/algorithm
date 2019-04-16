package algorithm;

import java.util.Scanner;

public class If {
	
	//10817 세 숫자 비교
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		if (A>B && A>C) {
			if (B>=C) {
				System.out.println(B);
			} else {
				System.out.println(C);
			}
		} else if (A<B && A<C) {
			if (B>=C) {
				System.out.println(C);
			} else {
				System.out.println(B);
			}
		} else {
			System.out.println(A);
		}
	}
	
	
//	// 9498 시험 성적 매기기
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
//		String grade = "";
//		if (score <= 100 && score >=90) {
//			grade = "A";
//		} else if (score < 90 && score >= 80) {
//			grade = "B";
//		} else if (score < 80 && score >= 70) {
//			grade = "C";
//		} else if (score < 70 && score >= 60) {
//			grade = "D";
//		} else {
//			grade = "F";
//		}
//		System.out.println(grade);
//	}

}

