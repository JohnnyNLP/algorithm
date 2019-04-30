package practice;

import java.util.Arrays;

public class RecursiveFucntion {

	public static int factorial(int number) {
		if(number==1) return 1;
		else return number*factorial(number-1);
	}
	
	public static int fibonacci(int number) {
		if(number==1||number==2) return 1;
		else return fibonacci(number-1)+fibonacci(number-2);
	}
	
	public static int fibonacciM(int[] f, int number) {
		if(number==1||number==2) {
			return 1;
		}
		else if(f[number]>-1) {
			return f[number];
		}
		else {
			f[number]=fibonacciM(f, number-1)+fibonacciM(f, number-2);
			return f[number];
		}
	}
	
	public static int fibonacciBU(int number) {
		int[] f = new int[number+1];
		Arrays.fill(f, -1);
		
		f[1] = f[2] = 1;
		for(int i=3; i<=number; i++){
			f[i] = f[i-1] + f[i-2];
		}
		return f[number];
	}
	
	public static void main(String[] args) {
		int number = 30;
	
		System.out.println(number+"팩토리얼은 "+factorial(number)+"입니다.");
		
		long start = System.currentTimeMillis();
		System.out.println("기본 피보나치 수열의 "+number+"번째 값은 "+fibonacci(number)+"입니다.");
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : "+(end-start)/1000.0+"초");
		
		int[] f = new int[number+1];
		Arrays.fill(f, -1);
		
		start = System.currentTimeMillis();
		System.out.println("M 피보나치 수열의 "+number+"번째 값은 "+fibonacciM(f, number)+"입니다.");
		end = System.currentTimeMillis();
		System.out.println("실행 시간 : "+(end-start)/1000.0+"초");
		
		start = System.currentTimeMillis();
		System.out.println("BU 피보나치 수열의 "+number+"번째 값은 "+fibonacciBU(number)+"입니다.");
		end = System.currentTimeMillis();
		System.out.println("실행 시간 : "+(end-start)/1000.0+"초");
			
	}

}
