package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Fibonacci {
	
	//2747 피보나치 기본
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int[] container = new int[count+1];
		Arrays.fill(container, -1);
		
		bw.write(Integer.toString(fibonacci(container, count)));
		bw.flush();
		bw.close();
	}
	
	public static int fibonacci(int[] container, int count) {
		
		if (count==1 || count==2) {
			container[count] = 1;
			return 1;
		}
		
		if (container[count]>0) {
			return container[count];
		} else {
			container[count] = fibonacci(container, count-1) + fibonacci(container, count-2);
			return container[count];
		}
	}
}
