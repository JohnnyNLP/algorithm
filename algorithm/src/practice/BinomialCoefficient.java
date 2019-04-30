package practice;

public class BinomialCoefficient {
	
	public static int binomial(int n, int k) {
		if(n==k || k==0) {
			return 1;
		} else return binomial(n-1, k) + binomial(n-1, k-1);
	}
	
	public static int binomialM(int n, int k) {
		int[][] binom = new int[n+1][k+1];
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=i && j<=k; j++) {
				binom[i][j] = -1;
			}
		}
		
		if(n==k || k==0) {
			return 1;
		} else if (binom[n][k] > -1) {
			return binom[n][k];
		} else {
			binom[n][k] = binomialM(n-1, k) + binomialM(n-1, k-1);
			return binom[n][k];
		}
	}
	
	public static int binomialBU(int n, int k) {
		int[][] binom = new int[n+1][k+1];
		for (int i=0; i<=n; i++) {
			for(int j=0; j<=i && j<=k; j++) {
				if(j==0 || i==j) {
					binom[i][j] = 1;
				} else {
					binom[i][j] = binom[i-1][j-1] + binom[i-1][j];
				}
			}
		}
		return binom[n][k];
	}
	
	public static void main(String[] args) {
		
		int n = 20;
		int k = 10;
		
		long start = System.currentTimeMillis();
		System.out.println("이항정리 "+n+"C"+k+"의 값은 "+binomial(n, k)+"입니다.");
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : "+(end-start)/1000.0+"초");
		
		start = System.currentTimeMillis();
		System.out.println("M이항정리 "+n+"C"+k+"의 값은 "+binomialM(n, k)+"입니다.");
		end = System.currentTimeMillis();
		System.out.println("실행 시간 : "+(end-start)/1000.0+"초");
		
		start = System.currentTimeMillis();
		System.out.println("BU이항정리 "+n+"C"+k+"의 값은 "+binomialBU(n, k)+"입니다.");
		end = System.currentTimeMillis();
		System.out.println("실행 시간 : "+(end-start)/1000.0+"초");

	}

}
