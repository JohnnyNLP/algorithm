package algorithm;

import java.util.Scanner;

public class Main {
	
	// 2839 ���� ��� �˰���
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sugar = scan.nextInt();
		int n = -1;
		int a = sugar/5;
		int b = sugar/3;
		
		for (int i = 0; i <=a; i++) {
			for (int j = 0; j <=b; j++) {
				int p = 5*i;
				int k = 3*j;
				if (p+k == sugar) {
					n = p/5 + k/3;
				}
			}
		}
		System.out.println(n);
	}

	
	// 10430 ������, �� ����ϱ�
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in); 
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		int C = scan.nextInt();
//		System.out.println((A+B)%C);
//		System.out.println((A%C + B%C)%C);
//		System.out.println((A*B)%C);
//		System.out.println((A%C*B%C)%C);
//		}
//	}
	
	// 11717 ���� �� ����ϱ�
//	public static void main(String[] args) {
//  	Scanner scan = new Scanner(System.in);
//      while (scan.hasNextLine()) {
//      	String input = scan.nextLine();
//    		System.out.println(input);
//      }
//	}
	
	// 10172 �� ����ϱ�
//	public static void main(String[] args) {
//		System.out.println("|\\_/|");
//		System.out.println("|q p|   /}");
//		System.out.println("( 0 )\"\"\"\\");
//		System.out.println("|\"^\"`    |");
//		System.out.println("||_/=\\\\__|");
//	}
	
	// 7287 ���� ����, ID ���
//	public static void main(String[] args) {
//		System.out.println(3);
//		System.out.println("pch7678");
//	}
	
	// 1000 A+B �����
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
