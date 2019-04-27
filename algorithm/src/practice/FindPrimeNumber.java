package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FindPrimeNumber {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("확인하고 싶은 숫자를 입력하세요.");
		int num = sc.nextInt();
		boolean check = ifPrimeNumber(num);
		
		if(check) System.out.print("입력하신 숫자 "+num+"은 소수입니다.");
		else {
			System.out.print("입력하신 숫자 "+num+"은 소수가 아닙니다.\n"+num+"의 약수는 ");
			ArrayList<Integer> list = findDivisor(num);
			ascendingSort(list);
			
			for (int i : list) {
				System.out.print(i+", ");
			}
			System.out.print("입니다.");
		}
		
	}
	
	public static boolean ifPrimeNumber (int num) {
		if (num == 2 || num == 3) return true;
		if (num == 1 || num%2 == 0) return false;
		else {
			int temp = num/2;
			for(int j=1; j<temp; j++) {
				if(num%(2*j+1)==0) {
					return false;
				}
			}
			return true;
		}
	}
	
	// 약수 찾기 메소드
	public static ArrayList<Integer> findDivisor (int num) {
		ArrayList<Integer> list = new ArrayList();
		
		// num이 짝수일 때
		if(num%2 == 0) {
			for(int i=1; i<=num; i++) {
				if(num%i ==0) list.add(i);
			}
		}
		
		// num이 홀수일 때
		else {
			int temp = num/2;
			for(int i=1; i<=temp; i++) {
				if(num%(2*i-1)==0) list.add(2*i-1);
			}
			list.add(num);
		}
		
		return list;
	}
	
	// ArrayList 오름차순 정렬
	public static void ascendingSort (ArrayList<Integer> list) {
		Ascending ascending = new Ascending();
	    Collections.sort(list, ascending);
	}
}

	
// Comparator 오버라이딩
class Ascending implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

