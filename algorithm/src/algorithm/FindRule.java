package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class FindRule {
	
	//1475 방번호
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String roomNum = br.readLine();
		int[] numbs = new int [9];
		int set = 0;
				
		for(int i=0; i<roomNum.length(); i++) {
			int x = roomNum.charAt(i)-48;
			if (x == 9) {
				x -= 3;
			}
			
			if(numbs[x] == 0) {
				for(int k=0; k<=8; k++) {
					numbs[k]++;
				}
				numbs[6]++;
				set ++;
			}
			
			numbs[x] -= 1;
		}
		
		bw.write(Integer.toString(set));
		bw.flush();
		bw.close();
	}
	
	
	//2775 부녀회장
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int repeat = Integer.parseInt(br.readLine());
//		for (int i=1; i<=repeat; i++) {
//			int k = Integer.parseInt(br.readLine());
//			int n = Integer.parseInt(br.readLine());
//			
//			int[][] apartment = new int[k+1][n];
//			for(int j=0; j<n; j++) {
//				apartment[0][j] = j+1;
//			}
//			
//			for(int l=1; l<=k; l++) {
//				for(int m=0; m<n; m++) {
//					for(int o=0; o<=m; o++) {
//						apartment[l][m] += apartment[l-1][o];						
//					}
//				}
//			}
//			bw.append(Integer.toString(apartment[k][n-1])+"\n");
//		}
//		bw.flush();
//		bw.close();
//	}
	
	//10250 AMC 호텔
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int repeat = Integer.parseInt(br.readLine());
//		for (int i=1; i<=repeat; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			StringBuffer roomNumber = new StringBuffer();
//			int H = Integer.parseInt(st.nextToken());
//			int W = Integer.parseInt(st.nextToken());
//			int N = Integer.parseInt(st.nextToken());
//			int count = 0;
//			boolean off = false;
//			
//			for(int w=1; w<=W; w++) {
//				for(int h=1; h<=H; h++) {
//					count += 1;
//					if (count == N) {
//						if (w >= 10) {
//							roomNumber.append(Integer.toString(h)).append(Integer.toString(w));
//						} else {
//							roomNumber.append(Integer.toString(h)).append("0").append(Integer.toString(w));
//						}
//						off = true;
//						break;
//					}
//				}
//				if (off) break;
//			}
//			bw.append(roomNumber + "\n");
//		}
//		bw.flush();
//		bw.close();
//	}
	
	//1011 알파 센타우리 풀이 B (int -> long으로 바꾸니 해결)
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int repeat = Integer.parseInt(br.readLine());
//		long x, y, distance;
//		long n, k, set;
//		
//		for (int i=1; i <= repeat; i++) {
//			n = 2;
//			k = 4;
//			set = 1;
//			
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			x = Integer.parseInt(st.nextToken());
//			y = Integer.parseInt(st.nextToken());
//			distance = y-x;
//			
//			while(distance > n) {
//				n += k;
//				k += 2;
//				set += 2;
//			}
//			
//			if(distance > n - (k-2)/2) {
//				set ++;
//			}
//			bw.append(Long.toString(set)+"\n");
//		}
//		bw.flush();
//		bw.close();
//	}
	
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
