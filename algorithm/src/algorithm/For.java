package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class For {

	// 15552 ���� A+B
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int testCount = Integer.parseInt(bf.readLine());
			for (int i=1; i<=testCount; i++) {
				StringTokenizer st = new StringTokenizer( bf.readLine() );
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(Integer.toString(a+b)+"\n");
			}
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 11721 ���ڿ� �Ϻθ� ����ϱ�
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String words = scan.next();
//		int token = words.length()/10;
//		for (int i = 0; i < token; i++) {
//			System.out.println(words.substring(i*10, i*10+10));
//		}
//		System.out.println(words.substring(token*10, words.length()));
//	}
	
	// 11720 �־��� ������ �� ���ϱ�
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int total = scan.nextInt();
//		String dummy = scan.next();
//		int sum = 0;
//		for (int i = 0; i <= total-1; i++) {
//			sum += Integer.parseInt(dummy.substring(i, i+1));
//		}
//		System.out.println(sum);
//	}
	
	// 8393 �ڱ� �ڽű����� �� ���ϱ�
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int numb = scan.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= numb; i ++){
//			sum += i;
//		}
//		System.out.println(sum);
//	}
	
	// 1924 ��¥���� ���� �����ϱ� (2007��)
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
	
	
	// 2441 �� ������ �ݴ�� ���
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
	
	// 2440 �� �ݴ�� ���
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
	
	// 2439 �� �Ųٷ� ���
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
	
	// 2438 �� ���
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
	
	// 2739 ������ 2�� ����ϱ�
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for (int i=1; i<=9; i++) {
//			System.out.println(a+" * "+i+" = "+a*i);
//		}
//	}
	
	// 2742 5���� 1���� ����ϱ�
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for (int i=a; i>=1; i--) {
//			System.out.println(i);
//		}
//	}
	
	
	// 2741 1���� 5���� ����ϱ�
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		for (int i=1; i<=a; i++) {
//			System.out.println(i);
//		}
//	}

}
