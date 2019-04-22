package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FindRule {
	
	//1011 알파 센타우리 풀이 B
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		int x, y, distance;
		int n, k, set, temp;
		
		for (int i=1; i <= repeat; i++) {
			n = 2;
			k = 4;
			set = 1;
			temp = 1;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			distance = y-x;
			
			while(distance > n) {
				n += k;
				k += 2;
				set += 2;
				temp ++;
			}
			
			if(distance > Math.pow(temp, 2)) {
				set ++;
			}
			bw.append(Integer.toString(set)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	//1011 알파 센타우리 풀이 A (시간 초과)
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int repeat = Integer.parseInt(br.readLine());
//		int x, y, distance;
//	
//		for (int i=1; i<=repeat; i++) {
//			int count = 0;
//			int come = 1;
//			int go = 1;
//			int location = 0;
//
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			x = Integer.parseInt(st.nextToken());
//			y = Integer.parseInt(st.nextToken());
//			distance = y-x;
//			
//			while(location < distance) {
//				location += come;
//				come += 1;
//				count += 1;
//				if(location < distance) {
//					location += go;
//					go += 1;
//					count += 1;
//				} else break; 
//			}
//			bw.append(Integer.toString(count)+"\n");			
//		}
//		bw.flush();
//		bw.close();
//	}
	
	//1193 분수 찾기
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int num = Integer.parseInt(br.readLine());
//		int loof = 1;
//		int k = 2;
//		int count = 1;
//		String result;
//		int numerator = 0;
//		int denominator = 0;
//		
//		while (loof < num) {
//			loof += k;
//			count += 1;
//			k += 1;
//		}
//		
//		if (count%2 == 0) {
//			numerator = count - (loof-num);
//			denominator = (count+1) - numerator;
//		} else {
//			denominator = count - (loof-num); 
//			numerator = (count+1) - denominator;
//		}
//		result = Integer.toString(numerator) + "/" + Integer.toString(denominator);
//		bw.write(result);
//		bw.flush();
//		bw.close();
//	}
	
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
