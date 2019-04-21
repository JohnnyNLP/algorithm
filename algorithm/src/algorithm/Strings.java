package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {

	//10809 알파벳 찾기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int[] alphabets = new int [26];
		Arrays.fill(alphabets, -1);

		for(int i=0; i<s.length(); i++) {
			if (alphabets[s.charAt(i)-97] == -1) {
				alphabets[s.charAt(i)-97] = i;				
			}
		}
		for(int i : alphabets) {
			System.out.print(i + " ");
		}
	}
	
	//11654 아스키 코드
//	public static void main(Strings[] args) {
//		Scanner scan = new Scanner(System.in);
//		char a  = scan.next().charAt(0);
//		System.out.println((int) a);
//	}
}
