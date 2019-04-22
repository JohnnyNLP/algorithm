package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FindRule {
	
	//1193 분수 찾기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int loof = 1;
		int k = 2;
		int count = 1;
		String result;
		int numerator = 0;
		int denominator = 0;
		
		while (loof < num) {
			loof += k;
			count += 1;
			k += 1;
		}
		
		if (count%2 == 0) {
			numerator = count - (loof-num);
			denominator = (count+1) - numerator;
		} else {
			denominator = count - (loof-num); 
			numerator = (count+1) - denominator;
		}
		result = Integer.toString(numerator) + "/" + Integer.toString(denominator);
		bw.write(result);
		bw.flush();
		bw.close();
	}
	
	//2292 벌집
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int loof = 1;
//		int k = 6;
//		int count = 1;
//		int num = Integer.parseInt(br.readLine());
//		
//		while (loof < num) {
//			loof += k;
//			count += 1;
//			k += 6;
//		}
//		
//		bw.write(Integer.toString(count));
//		bw.flush();
//		bw.close();
//	}
}
