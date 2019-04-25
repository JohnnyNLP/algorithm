package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		int[] list = new int[repeat];
		for (int i=1; i<=repeat; i++) {
			list[i-1] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(list);
		for(int k : list) {
			bw.append(Integer.toString(k)+"\n");
		}
		bw.flush();
		bw.close();
	}

}
