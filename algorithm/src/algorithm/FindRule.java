package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FindRule {
	
	//2292 벌집
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int loof = 1;
		int k = 6;
		int count = 1;
		int num = Integer.parseInt(br.readLine());
		
		while (loof < num) {
			loof += k;
			count += 1;
			k += 6;
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();

	}
}
