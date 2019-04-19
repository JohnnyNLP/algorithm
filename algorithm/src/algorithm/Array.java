package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array {

	//2577 숫자 세기
	public static void main(String[]args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int gob = A*B*C;
		int length = (int)(Math.log10(gob)+1);
		
		int[] array = new int[10];
		
		for(int i = 1; i <= length; i ++) {
			array[gob%10] += 1;
			gob /= 10;
		}
		
		for (int i : array) {
			bw.write(Integer.toString(i)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	//1152 단어 세기
//	public static void main(String[] args) {
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			String sentence = br.readLine();
//			StringTokenizer st = new StringTokenizer(sentence);
//			int count = st.countTokens();
//			bw.write(Integer.toString(count));
//			bw.flush();
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
