package algorithm;

import java.util.ArrayList;

public class Functions {

	//4673 ¼¿ÇÁ ³Ñ¹ö
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList();
		int temp = 0;
		int num = 0;
		int sum = 0;
		
		for(int i = 1; i <= 10000; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < list.size(); i ++) {
			num = list.get(i);
			while (num <= 10000) {
				temp = num;
				sum = 0;
				while(temp!=0) {
					sum += temp%10;
					temp /= 10;
				}
				num = num + sum;
				list.remove((Integer) num);
			}
		}
		
		for (int j : list) {
			System.out.println(j);
		}
	}
}
