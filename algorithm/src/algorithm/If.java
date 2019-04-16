package algorithm;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// 9498 시험 성적 매기기
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade = "";
		if (score <= 100 && score >=90) {
			grade = "A";
		} else if (score < 90 && score >= 80) {
			grade = "B";
		} else if (score < 80 && score >= 70) {
			grade = "C";
		} else if (score < 70 && score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}

}
