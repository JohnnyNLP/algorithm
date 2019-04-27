package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class PrimeNumber {

	//2581 소수 찾기 그룹
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList();
		int temp;
		int sum = 0;
		
		try {
			for(int i=x; i<=y; i++) {
				boolean checker = false;
				
				if (i==2 || i==3) {
					list.add(i);
					sum += i;
					continue;
				}

				if (i==1 || i%2==0) {
					continue;
				} else {
					temp = i/2;
					for(int j=1; j<temp; j++) {
						if(i%(2*j+1)==0) {
							checker = true;
							break;
						}
					}
				}
				
				if (checker) continue;
				else {
					sum += i;
					list.add(i);
				}
				
			}
			bw.write(sum+"\n"+list.get(0));
			bw.flush();
			bw.close();
		} catch (IndexOutOfBoundsException e) {
			bw.write("-1");
			bw.flush();
			bw.close();
		}
	}
	
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
