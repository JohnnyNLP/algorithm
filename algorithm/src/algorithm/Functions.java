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
			temp = list.get(i);
			while (temp <= 10000) {
				num = temp;
				sum = 0;
				while(num!=0) {
					sum += num%10;
					num /= 10;
				}
				temp = temp + sum;
				list.remove((Integer) temp);
			}
		}
		
		for (int j : list) {
			System.out.println(j);
		}
	}
}
