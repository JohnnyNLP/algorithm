package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class PrimeNumber {
	
	//4948 베르트랑 공준
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num;
		
		while (true) {
			num = Integer.parseInt(br.readLine());
			if(num == 0) break;
			int count = 0;
			ArrayList<Boolean> list = new ArrayList (2*num+1);
			list.add(false);
			list.add(false);
			for(int i=2; i<=2*num; i++) list.add(i, true);
		
			for(int i=2; i<=2*num; i++) {
				if(list.get(i)) {
					for(int j=2; j*i<=2*num; j++) {
						list.set(j*i, false);
					}
				} else continue;
			}
	
			for(int i=num+1; i<=2*num; i++) {
				if(list.get(i)) count++;
			}
			bw.append(Integer.toString(count)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	//1929 소수 구하기
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int x = Integer.parseInt(st.nextToken());
//		int y = Integer.parseInt(st.nextToken());
//		
//		ArrayList<Boolean> list = new ArrayList (y+1);
//		list.add(false);
//		list.add(false);
//		for(int i=2; i<=y; i++) list.add(i, true);
//	
//		for(int i=2; i<=y; i++) {
//			if(list.get(i)) {
//				for(int j=2; j*i<=y; j++) {
//					list.set(j*i, false);
//				}
//			} else continue;
//		}
//
//		for(int i=x; i<=y; i++) {
//			if(list.get(i)) bw.append(Integer.toString(i)+"\n");
//		}
//	
//		bw.flush();
//		bw.close();
//	}

	//2581 소수 찾기 그룹
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		ArrayList<Integer> list = new ArrayList();
//		int temp;
//		int sum = 0;
//		
//		try {
//			for(int i=x; i<=y; i++) {
//				boolean checker = false;
//				
//				if (i==2 || i==3) {
//					list.add(i);
//					sum += i;
//					continue;
//				}
//
//				if (i==1 || i%2==0) {
//					continue;
//				} else {
//					temp = i/2;
//					for(int j=1; j<temp; j++) {
//						if(i%(2*j+1)==0) {
//							checker = true;
//							break;
//						}
//					}
//				}
//				
//				if (checker) continue;
//				else {
//					sum += i;
//					list.add(i);
//				}
//				
//			}
//			bw.write(sum+"\n"+list.get(0));
//			bw.flush();
//			bw.close();
//		} catch (IndexOutOfBoundsException e) {
//			bw.write("-1");
//			bw.flush();
//			bw.close();
//		}
//	}
	
	//1978 소수 찾기
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int repeat = Integer.parseInt(br.readLine());
//		int count = 0;
//		int temp;
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		for (int i=1; i<=repeat; i++) {
//			int n = Integer.parseInt(st.nextToken());	
//			boolean primeNumber = true;
//			
//			if (n==2 || n==3) {
//				count++;
//				continue;
//			}
//			
//			if (n==1 || n%2==0) {
//				continue;
//			} else {
//				temp = n/2;
//				for(int j=1; j<temp; j++) {
//					if(n%(2*j+1)==0) {
//						primeNumber = false;
//						break; 
//					}
//				}
//			}
//			if (primeNumber) count++;
//			
//		}
//		bw.write(Integer.toString(count));
//		bw.flush();
//		bw.close();
//	}
}
