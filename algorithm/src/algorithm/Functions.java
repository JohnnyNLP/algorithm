package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Functions {
	//1065 �Ѽ�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();
		ArrayList<Integer> list = new ArrayList();
		int a = 0; //���� �ڸ���
		int b = 0; //���� �ڸ���
		int c = 0; //���� �ڸ���
		
		//1���� limit������ ��� ������ list�� �߰�
		for(int i = 1; i<=limit; i++) {
			list.add(i);
		}
		
		//1���� 99������ ��� ������ �Ѽ��̴�.
		//���� 100���� 1000������ �Ǵ��ؼ� list���� �������ָ� �ȴ�.
		if (limit >=100) {
			for(int i = 100; i <= limit; i++) {
				a = i%10;
				b = (i/10)%10;
				c = i/100;
				if(2*b != a+c) {
					list.remove((Integer)i);
				}
			}
		}
		System.out.println(list.size());
	}
	
	
	
	//4673 ���� �ѹ�
//	public static void main(String[] args) {
//		ArrayList <Integer> list = new ArrayList();
//		int temp = 0;
//		int num = 0;
//		int sum = 0;
//		
//		for(int i = 1; i <= 10000; i++) {
//			list.add(i);
//		}
//		
//		for(int i = 0; i < list.size(); i ++) {
//			num = list.get(i);
//			while (num <= 10000) {
//				temp = num;
//				sum = 0;
//				while(temp!=0) {
//					sum += temp%10;
//					temp /= 10;
//				}
//				num = num + sum;
//				list.remove((Integer) num);
//			}
//		}
//		
//		for (int j : list) {
//			System.out.println(j);
//		}
//	}
}
