package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Strings {

	//1157 많이 사용된 알파벳 찾기
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine().toUpperCase();
		int[] alphabets = new int [26];
		int max = 0;
		char index = '0';
		
		for(int i=0; i<word.length(); i++) {
			alphabets[word.charAt(i)-65] += 1;
		}
		
		for(int i = 0; i < 26; i ++) {
			if (max<alphabets[i]) {
				max = alphabets[i];
				index = (char)(i+65);
			} else if(max==alphabets[i]) {
				index = '?';
			} 
		}
		bw.write(index);
		bw.flush();
		bw.close();
	}
	 
	
	
	//10809 ���ĺ� ã��
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//		int[] alphabets = new int [26];
//		Arrays.fill(alphabets, -1);
//
//		for(int i=0; i<s.length(); i++) {
//			if (alphabets[s.charAt(i)-97] == -1) {
//				alphabets[s.charAt(i)-97] = i;				
//			}
//		}
//		for(int i : alphabets) {
//			System.out.print(i + " ");
//		}
//	}
	
	//11654 �ƽ�Ű �ڵ�
//	public static void main(Strings[] args) {
//		Scanner scan = new Scanner(System.in);
//		char a  = scan.next().charAt(0);
//		System.out.println((int) a);
//	}
}
