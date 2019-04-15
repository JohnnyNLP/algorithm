package algorithm;

import java.util.Scanner;

public class Main {
	
	// 10430 나머지, 몫 계산하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C*B%C)%C);
		}
		
	}
	
	// 11717 여러 줄 출력하기
//	public static void main(String[] args) {
//  	Scanner scan = new Scanner(System.in);
//      while (scan.hasNextLine()) {
//      	String input = scan.nextLine();
//    		System.out.println(input);
//      }
//	}
	
	// 10172 개 출력하기
//	public static void main(String[] args) {
//		System.out.println("|\\_/|");
//		System.out.println("|q p|   /}");
//		System.out.println("( 0 )\"\"\"\\");
//		System.out.println("|\"^\"`    |");
//		System.out.println("||_/=\\\\__|");
//	}
	
	// 7287 맞춘 문제, ID 출력
//	public static void main(String[] args) {
//		System.out.println(3);
//		System.out.println("pch7678");
//	}
	
	// 1000 A+B 입출력
//	public static void main(String[] args) {
//		 Scanner scan = new Scanner(System.in);
//		 int A = scan.nextInt();
//		 int B = scan.nextInt();
//		 System.out.println(A+B);
//	}

	
	// 2557 Hello World!
//	public static void main(String[] args) {
//		System.out.println("Hello World!");
//	}

}
