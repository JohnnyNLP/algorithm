# Algorithm



## #2839

### 설탕 배달 알고리즘 짜기

- 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

  상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

  상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sugar = scan.nextInt();
		int n = -1;
		int a = sugar/5;
		int b = sugar/3;
		boolean check = false;
		
		for (int i = a; i >=0; i--) {
			for (int j = b; j >=0; j--) {
				if (5*i+3*j == sugar) {
					n = i + j;
					check = true;
					break;
				}
			}
		if (check) break;
		}
		System.out.println(n);
	}
```

> ```
> 18
> 4
> 6
> 9
> 11
> ```
>
> ```
> 4
> -1
> 2
> 3
> 3
> ```



### 문제 접근 방식

- 처음에는 주어진 수(int sugar)가 -1로 출력되는 경우와 아닌 경우로 구분하여 생각해보았다.
- 먼저 큰 수인 5로 나누었을 때의 나머지를 a라고 하자. 이 a가 3으로도 나누어 떨어지는 경우에만 봉지의 수가 계산될 수 있다. 

> 1) a = sugar%5 
>
> ​	1-a) a%3 == 0 ... n=sugar/5 + a/3
>
> ​	1-b ) a%3 != 0 ... n=-1

- 그런데 11의 경우, 5로 나눈 나머지가 1이기 때문에 1-b에 해당하여 n=-1이라는 값이 도출된다. 
- 11을 5x1과 3x2로 나누어 생각하려면, 11을 5로 나눈 나머지만 생각할 것이 아니라, 그보다 더 작은 값(1, 0)도 생각해보아야 한다.
- 이때 for문을 사용해야겠다는 생각이 떠올랐다.

> 1) sugar을 5와 3으로 나눈 몫을 각각 a, b로 둔다.
>
> 2) 5로 나눈 값 a에 대하여 -> 바깥 for문을 구성한다. (int i는 a부터 0까지 점점 작아지도록 설정한다.)
>
> ​	2-a) 3으로 나눈 값 b에 대하여 -> 내부 for문을 구성한다. (int j는 b부터 0까지 점점 작아지도록 설정한다.)
>
> ​		for문 내부에서 5*i+3*j=sugar가 되는 경우 (5의 배수 + 3의 배수 조합)를 캐치한다.
>
> ​		이때 i와 j는 각각 5와 3으로 나눈 '몫'에 해당하므로, 곧 설탕 봉지의 개수가 된다.
>
> ​		n = i + j 값을 부여하고  break 한다.

- 그러나 위의 중첩 for문에서 사용한 break에서 문제가 발생했다. 18의 경우, 5x3과 3x1이 되는 경우(n=4)에서 멈추어야 하는데, 5x0과 3x6인 경우까지 진행되어 n이 6으로 출력된 것이다.
- 찾아보니 내부 for문의 break는 바깥 for문에 영향을 주지 못하기 때문에 발생하는 오류였다.
- 따라서 내부 for문에서 원하는 결과물을 찾아낼 경우에 외부 for문까지 break할 수 있도록 임의의 boolean값 check 변수를 설정했다.

> 1) 내부 for문에서 원하는 n값을 도출
>
> 2) check값이 true로 변경
>
> 3) 외부 for문에서 check가 true일 경우 break

- 위와 같은 이중 점검 장치를 통해 n이 최소가 되는 경우를 도출해낼 수 있었다.



## #2348

### 입력한 숫자의 개수만큼 별 찍기

- 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
```

> ```
> 5
> ```
>
> ```
> *
> **
> ***
> ****
> *****
> ```

### 문제 접근 방식

- 위 문제는 숫자를 입력받아 문자열을 출력한다는 점에서 독특하다. 그리고 문자열을 출력하는 횟수가 총 입력한 숫자와 같다는 점도 눈여겨볼 만하다.
- 컴퓨터는 별을 n번 입력하는 행위를 "*"을 n번 출력하는 행위로밖에 인식하지 못한다.
- 따라서 하나의 출력 단위를 "*"으로 고정시켜놓고 시작하는 것이 편리하다.
- 응답으로 출력된 부분을 보면 별의 개수가 각각 1, 2, 3, 4, 5개로 차례대로 한 개씩 증가하여 n에 이르는 것을 알 수 있다. 이에 다음과 같은 중첩for문 구조가 필요하다.

> 1) scanner를 통해 입력받은 숫자를 int a에 저장한다.
>
> 2) *의 총 개수에 대하여 -> 바깥 for문을 구성한다 (int i는 1부터 a까지 증가한다)
>
> ​	2-a) *을 반복 출력하는 부분에 대하여 -> 내부 for문을 구성한다. (int j는 1부터 i까지 증가한다)
>
> ​		j의 개수만큼 print 함수를 통해 *을 출력한다 => 한 줄로 구성되도록 println이 아닌 print를 사용한다.
>
> ​	2-b) 내부 for문이 끝나면 개행문자를 입력하여 다음 시행과 구분하도록 한다.



## #2349

### 입력한 숫자의 개수만큼 별 거꾸로 찍기

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (int i=1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
```

> ```
> 5
> ```
>
> ```
>        *
>       **
>     ***
>   ****
> *****
> ```

### 문제 접근 방식

- 위 문제가 2348과 다른 부분은 딱 하나, 공백이 함께 입력된다는 점이다.
- 그러므로 공백을 출력하는 for문 부분만 추가해주면 된다.
- 공백의 개수는 각각 4, 3, 2, 1, 0개로, 이 값은 입력받은 값 a에서 바깥 for문의 i값을 뺀 값이다.
- 그러므로 j라는 인수를 1부터 (a-1)의 값까지 반복시켜 공백 " "을 출력하게 하면 된다.



## #1924

### 특정 날짜에 해당하는 요일 추출하기

- 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
- 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();
		scan.close();
		
		int [] endDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String [] weekDays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int days = day;
		for (int i = 0; i < month-1; i++) {
			days += endDays[i];
		}
		System.out.println(weekDays[days%7]);
	}
}
```

> ```
> 1 1
> 3 14
> 9 2
> 12 25
> ```
>
> ```
> MON
> WED
> SUN
> TUE
> ```

### 문제 접근 방식 1

- 다른 접근 방식

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
            String year = "2007";
            Scanner scan = new Scanner(System.in);
            String month = Integer.toString(scan.nextInt());
            String day = Integer.toString(scan.nextInt());
            if (month.length() == 1) {
                month = "0" + month;
            }
            if (day.length() == 1) {
                day = "0" + day;
            }
            String dd = year.concat(month).concat(day);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Date date = sdf.parse(dd);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            String[] d = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
            System.out.println(d[calendar.get(Calendar.DAY_OF_WEEK)-1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
```

- 위 문제는 처음 다음과 같은 방식으로 접근했다.
- 먼저 년도가 주어지고 월과 일을 입력받는다는 점에서 "yyyyMMdd" 형태의 날짜 포맷 하나를 얻어낼 수 있다고 생각했다.
- 만약 그러하다면 그러한 형태의 date 객체를 실제로 생성하여 어떠한 요일인지 return시킬 수 있다.

> 1) 입력받은 내용을 scan.nextInt로 가져온다.
>
> 2) 이를 바로 String 객체로 바꾸기 위해 Integer의 toString 함수를 이용한다.
>
> 3) 그런데 SimpleDateFormat에 맞추려면 월과 일이 한자리 수인 경우를 고려해야 한다. if문으로 처리한다.
>
> 4) 입력받은 월/일 정보를 연도와 합쳐 날짜 소스를 만들어낸다.
>
> 5) 이후 SimpleDateFormat으로 "yyyyMMdd" 형태를 맞춰준다.
>
> 6) date 객체로 String을 변환시켜준다.
>
> 7) calendar 객체의 Day_OF_WEEK 함수를 이용, 요일 인덱스를 끄집어낸다.
>
> 8) 요일 정보를 담고 있는 String 배열을 만든 뒤 인덱스를 입력하여 요일을 추출한다.

- 마지막 인덱스를 입력하는 부분에서 -1을 해주는 이유는, 인덱스는 0부터 시작하는데 반해 calendar값은 1부터 시작하기 때문이다.

- 위 풀이는 다음과 같은 한계를 지닌다.

  ​	1) 한자리수가 입력되는 경우 때문에 코드가 복잡해진다는 점(if문이 필수적)

  ​	2) for문 챕터인데 for문을 사용하지 않은 점

- 하지만 연도 정보를 바꾸어도 그대로 사용할 수 있다는 점은 이점으로 작용한다.



### 문제 접근 방식 2

- 문제를 다시 한번 읽어보니, 문제에서 굳이 시작하는 날의 요일정보(월요일)와, 매달 끝나는 날짜를 준 것이 수상하다.
- 이를 for문이라는 상황적 정보와 결합하니, 이 문제의 본 의도는 총 날짜수를 이용해 요일을 추출하는 것이었음을 깨달았다.
- 실제로 그러한 방식으로 코드를 사용했을 경우 길이가 단축되고 속도도 향상되었다.

> 1) scanner 객체를 이용해 월/일 정보를 int 객체에 담는다.
>
> 2) 매달 총 일수와 요일 정보를 각각 배열로 만들어 저장한다.
>
> 3) for문을 이용, day까지의 총 날짜수를 구한다.
>
> 3-a) 총 날짜수는 (month-1)까지 해당하는 endDays의 총합 + 입력받은 day값에 해당한다.
>
> 4) 이를 7로 나눈 나머지가 바로 요일 인덱스에 해당한다.

- 이 경우에 1일이 월요일이기 때문에 인덱스 번호와 요일 정보가 일치하게 된다.



## #15552

### 빠른 a+b 계산

-  첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int testCount = Integer.parseInt(bf.readLine());
			for (int i=1; i<=testCount; i++) {
				StringTokenizer st = new StringTokenizer( bf.readLine() );
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(Integer.toString(a+b)+"\n");
			}
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
```

>```
>5
>1 1
>12 34
>5 500
>40 60
>1000 1000
>```
>
>```
>2
>46
>505
>100
>2000
>```

- 처음에 주어진 int 값을 count로 저장하고 이 횟수만큼 for문을 돌리면 되는 간단한 문제이다.

- 그러나 지금까지 사용한 Scanner 객체는 메모리에 많은 부담을 주고, 그러므로 비교적 응답 시간이 오래 걸린다는 단점이 있다.

- 그러므로 입력되는 자료가 많으면 많을수록 buffered 객체를 사용하는 것이 속도 면에서 더 나을 수 있다.

```java
for (int i=1; i<=testCount; i++) {
				StringTokenizer st = new StringTokenizer( bf.readLine() );
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(Integer.toString(a+b)+"\n");
			}
```

- for 문 내부를 들여다보면 StringTokenizer를 사용한 부분이 인상적이다.
- 기존에 scan.nextInt()로 입력받던 부분을 위와 같이 처리하는데, 먼저 줄 전체를 불러온 다음 nextToken() 메소드를 이용해 return받은 String을 다시 Integer로 변환하는 복잡한 과정을 거쳐야 한다.
- 마찬가지로 bufferedWriter 객체 역시 String만 return할 수 있기  때문에 이를 다시 toString으로 변환해주어야 한다.
- 여러모로 형변환이 잦고 익숙하지 않은 방식이었으나, scanner를 이용한 똑같은 코드는 시간 초과가 나오는 반면 buffered 객체를 이용한 경우 720ms로 평소보다 빠른 수행 결과를 얻을 수 있었다.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		for (int i = 1; i <= total; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);
		}
    }
}
```

> ![1555361079369](assets/1555361079369.png)
>
> 똑같은 결과를 냈지만 상반된 결과가 나타났다.



## #10817

### 세 정수 중 두 번째로 큰 값 리턴하기

- 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		if (A>=B && A>=C) {
			if (B>=C) {
				System.out.println(B);
			} else {
                System.out.println(C);
            }
		} else if (A<=B && A<=C) {
			if (B>=C) {
				System.out.println(C);
			} else {
                System.out.println(B);
            }
		} else {
			System.out.println(A);
		}
	}
}
```

> ```
> 20 30 10
> 30 30 10
> 40 40 40
> 20 10 10
> ```
>
> ```
> 20
> 30
> 40
> 10
> ```



### 문제 접근 방식

```java
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		if (A>B && A>C) {
			if (B>C) {
				System.out.println(B);
			}
		} else if (A<B && A<C) {
			if (B>C) {
				System.out.println(C);
			}
		} else {
			System.out.println(A);
		}
	}
}
```

- 처음엔 다음과 같은 방식으로 생각해본다.
- A를 기준으로 놓고, A가 가장 큰 경우와 가장 작은 경우를 생각한다.
- A가 가장 크다면, B와 C중에 더 큰 값을 리턴하면 된다.
- A가 가장 작다면, B와 C중에 작은 값을 리턴하면 된다.
- 어느 쪽에도 속하지 않는다면, A를 리턴하면 된다.
- 그런데 이 풀이의 오점은 A, B, C가 같은 값일 가능성을 열어두지 않았다는 점이다.
  - 사실 그렇다 하더라도 마지막 else에 걸려 어차피 A가 출력되게 하면 상관 없다.
- 진짜 문제는 내부 if문에서 else의 경우를 감안하지 않았다는 점이다.
  - 이를 보완하였더니 문제가 간단히 해결되었다.



## #1110

### 더하기 사이클

- 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

  26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

  위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

  N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int origin = scan.nextInt();
		int a = 0;
		int b = 0;
         // a, b는 최초 입력 받은 값을 저장한다.
		if(origin/10 > 0) {
			a = origin/10;
			b = origin - a*10;
		} // case A
        else {
			b = origin;
		} // case B
         // c, d는 최초 1회만 a, b값을 참조하고, 이후 자기 자신의 값을 취한다.
		int c = a;
		int d = b;
		int temp = 0;
		int count = 0;
		
		while (count == 0 || a != c || b != d) {
			if (c+d >= 10) {
				temp = c;
				c = d;
				d = temp+d-10;
			} else {
				temp = c;
				c = d;
				d = temp+d;
			}
			count += 1;
		} // while end
		System.out.println(count);
	}
}
```

> ```
> 26
> 55
> 1
> ```
>
> ```
> 4
> 3
> 60
> ```



### 문제 접근 방식

- 입력받는 숫자는 최대 두자리 숫자이다. 다음과 같은 방식으로 경우를 나눠볼 수 있다.

1. 입력받는 숫자가 두 자리 수인 경우 (case A)
   1. nextChar()을 이용, a와 b에 두 값을 할당한다.
   2. a+b는 20을 넘길 수 없다. 그러므로 if문을 통해 10보다 큰지 확인한다.
      1. a+b > 10인 경우 -> b와 (a+b)-10를 다시 c, d에 할당한다.
      2. a+b < 10인 경우 -> b와 (a+b)를 다시 c, d에 할당한다. 
2. 입력받는 숫자가 한 자리 수인 경우 (case B)
   1. a에 0을, b에 nextChar() 값을 할당한다.
      1. a+b > 10인 경우 -> b와 (a+b)-10를 다시 c, d에 할당한다.
      2. a+b < 10인 경우 -> b와 (a+b)를 다시 c, d에 할당한다. 
3. 1/2 사이클을 a, b가 c, d와 같을 때까지 반복한다 (while문 이용)

- 전체 반복 횟수를 초기에 알지 못한다는 점에서 while문을 이용한다.
- 이때 while문 마지막에 count값을 계속해서 증가시킴으로써 총 반복 횟수를 알 수 있다.



#### 문제점

1. nextChar()함수가 존재하지 않는다.
   - nextInt()로 초기 변수를 할당한 뒤, 10을 나눈 값(항상 정수)으로 10의 자리수 a를 구한다.
   - if문을 이용, 나눈 값이 0보다 작은 경우 한 자리수로 판단한다.
2. 원래 자신의 값을 이용한다는 점에서 필연적으로 재귀함수적 형태를 띌 수밖에 없는데, 변수 설정 순서에 따라서 값이 원하는 대로 나오지 않는 오류가 발생한다
   - ex) 26을 입력했을 시, c는 6이 되지만 이때 d는 변하기 전의 c값(2)이 아닌 변한 뒤의 c값(6)을 참조한다.
   - int temp라는 변수를 지정하여 temp에 원래 c값을 저장하여 d에 적용시킨다.
3. c와 d를 할당하는 코드가 두 번 반복되어 경제적이지 못하다.



### 개선된 접근 방식

1. 입력받는 숫자가 두자리 수인지, 한자리 수인지 판별하여 a(c), b(d)에 할당한다.

2. if문을 이용, c+d값이 10보다 큰지 확인한다. 

   - 이때 d가 10이 되는 경우 0으로 바꾸어 주어야 하므로 등호를 꼭 넣는다.

   1. c+d >= 10인 경우 -> temp =  c, c = d, d = temp+d-10
   2. c+d < 10인 경우 -> temp = c, c = d, d = temp+d

3. while문의 True 조건엔 (a != c || b != d)를 이용한다.
   - a와 c가 같고 b와 d가 같으면 두 조건 모두 false가 되어 break 된다.
   - 그런데 초기 할당값에서 c==a 이고 d==b 이므로 (count == 0) 이라는 or조건을 추가한다.



## #4673

### 셀프 넘버

- 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.

  양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다. 

  예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.

  33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...

  n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다. 

  생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97

  10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

```java
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        // 변수 생성부
		ArrayList <Integer> list = new ArrayList();
		int temp = 0;
		int num = 0;
		int sum = 0;
		
        // 리스트 생성부 (1회)
		for(int i = 1; i <= 10000; i++) {
			list.add(i);
		}
		
        // 재귀적 호출부
        for(int i = 1; i <= 10000; i ++) {
			num = i;
			while (num <= 10000) {
				temp = num;
				sum = 0;
				while(temp!=0) {
					sum += temp%10;
					temp /= 10;
				}
				num = num + sum;
				list.remove((Integer) num);
			}
		}
		
        //결과 출력부
		for (int j : list) {
			System.out.println(j);
		}
    }
}
```



### 문제 접근 방식

- 우선 이 문제는 문제를 이해하는 것부터 오랜 시간이 걸렸다. 메모리나 수행 시간 측면에서 우리가 셀프 넘버를 곧장 구해 list에 추가해주면 좋겠지만, 문제에서 준 수식은 셀프 넘버가 **'아닌'** 수를 찾는 함수이다.
- 그래서 어쩔 수 없이 우선적으로 1부터 10000까지의 정수를 원소로 하는 리스트를 하나 생성하여, 하나씩 지워나가는 방식으로 진행했다.
- 핵심은 num에 끊임없이 자기 자신과 sum(자릿수의 합)을 더하여 이 값을 list에서 제거하는 것이다.
- 위 문제에서 사용된 변수는 다음과 같이 세 개이다.
  - num은 우리가 최종적으로 지우고자 하는 셀프 넘버가 아닌 수이다.
  - temp는 자릿수의 합을 구하기 위해 임시적으로 값을 저장한 변수이다.
  - sum은 자릿수의 합을 저장한 변수이다.
- num은 while문 안에서 계속해서 자기 자신과 sum을 더해나가면서 몸집을 키운다.
- 매 while 수행루프마다 num 값과 일치하는 원소를 list에서 지운다.
- num이 10000보다 커지는 시점에서 while 문을 종료한다.



### 개선된 접근 방식

 - 최초 시행에서는 재귀적 호출부의 i 범위를 10000으로 설정하였다. 1부터 10000까지의 모든 정수 값을 살펴본 것이다. 위 코드를 사용했을 때의 한계는 다음과 같았다.

   1. 이미 지워진 num값에 대해서 동일한 작업을 반복한다.
   2. 아래의 while문과 곱연산되어 처리 속도가 심각하게 저하된다.

- 실제로 이를 제출했을 때 정상적으로 결과는 나오지만 시간 초과로 결국 실패하고 말았다.

- 해답은 의외로 간단했다. 이미 지워진 원소에 대해서는 수행하지 않는 것이다.

```java
// 재귀적 호출부
for(int i = 0; i < list.size(); i ++) {
	num = list.get(i);
```

- 아래의 list.remove() 때문에 list의 size는 계속해서 줄어든다. 즉, 수행하면 할수록 for문을 마치기까지의 시간이 단축된다는 의미이다. 




#### 자릿수의 합 구하기

- 기존에 자릿수의 합을 구하는 문제에서는 주어진 숫자가 두/세자리 수였기 때문에 10/100으로 나눈 값을 임의의 문자에 할당하여 일일이 더해주었다.
- 그러나 while 문을 이용하면 한번에 특정 숫자의 자릿수 합을 구할 수 있다는 것을 알게 되었다.

```java
while(temp!=0) {		
    sum += temp%10;
	temp /= 10;
}
```

- 간단한 수식이지만, num에 원하는 숫자를, sum에 0을 대입해두면 sum에 알아서 자릿수의 합이 차곡차곡 쌓인다.
- 나머지 정리를 이용한 방법으로, 수행 방식은 다음과 같다.
  1. temp를 10으로 나눈 나머지는 temp의 일의 자리 수이다.
  2. 이를 sum에 더해서 저장한다.
  3. temp를 10으로 나눈 값을 자기 자신에게 재할당한다.
  4. 이때 temp는 일의 자리 수가 지워진 값으로 저장된다.
- 이렇게 일의 자릿수부터 지워나가며 sum에 더하면 최종적으로 0이 되어 while문을 벗어난다.



#### 리스트의 특정 값 지우기

- list.remove() 함수의 인자에는 두 가지가 들어갈 수 있다.
- 보통 우리가 사용하는 int 인자를 대입할 경우, list의 n번 인덱스의 값을 제거하게 된다.
- 그러나 이 경우에는 num라는 구체적인 값에 대응하는 원소를 지워야 한다는 점과, 지워나갈 때마다 list의 인덱스 역시 변화한다는 점을 고려해야 한다.

```java
list.remove((Integer) num);
```

- 이때 인자 앞에 **(Integer)**를 적어서 명시적 형변환을 해주면 우리가 원하는 대로 해당 값과 일치하는 원소를 지우게 된다.



## #1011

### 알파 센타우리

- 우현이는 어린 시절, 지구 외의 다른 행성에서도 인류들이 살아갈 수 있는 미래가 오리라 믿었다. 그리고 그가 지구라는 세상에 발을 내려 놓은 지 23년이 지난 지금, 세계 최연소 ASNA 우주 비행사가 되어 새로운 세계에 발을 내려 놓는 영광의 순간을 기다리고 있다.

  그가 탑승하게 될 우주선은 Alpha Centauri라는 새로운 인류의 보금자리를 개척하기 위한 대규모 생활 유지 시스템을 탑재하고 있기 때문에, 그 크기와 질량이 엄청난 이유로 최신기술력을 총 동원하여 개발한 공간이동 장치를 탑재하였다. 하지만 이 공간이동 장치는 이동 거리를 급격하게 늘릴 경우 기계에 심각한 결함이 발생하는 단점이 있어서, 이전 작동시기에 k광년을 이동하였을 때는 k-1 , k 혹은 k+1 광년만을 다시 이동할 수 있다. 예를 들어, 이 장치를 처음 작동시킬 경우 -1 , 0 , 1 광년을 이론상 이동할 수 있으나 사실상 음수 혹은 0 거리만큼의 이동은 의미가 없으므로 1 광년을 이동할 수 있으며, 그 다음에는 0 , 1 , 2 광년을 이동할 수 있는 것이다. ( 여기서 다시 2광년을 이동한다면 다음 시기엔 1, 2, 3 광년을 이동할 수 있다. )

  김우현은 공간이동 장치 작동시의 에너지 소모가 크다는 점을 잘 알고 있기 때문에 x지점에서 y지점을 향해 최소한의 작동 횟수로 이동하려 한다. 하지만 y지점에 도착해서도 공간 이동장치의 안전성을 위하여 y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년으로 하려 한다.

  김우현을 위해 x지점부터 정확히 y지점으로 이동하는데 필요한 공간 이동 장치 작동 횟수의 최솟값을 구하는 프로그램을 작성하라.



### 풀이 A

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {	
	//1011 알파 센타우리 풀이 A (시간 초과)
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		int x, y, distance;
	
		for (int i=1; i<=repeat; i++) {
			int count = 0;
			int come = 1;
			int go = 1;
			int location = 0;

			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			distance = y-x;
			
			while(location < distance) {
				location += come;
				come += 1;
				count += 1;
				if(location < distance) {
					location += go;
					go += 1;
					count += 1;
				} else break; 
			}
			bw.append(Integer.toString(count)+"\n");			
		}
		bw.flush();
		bw.close();
	}
}
```

> ```
> 3
> 0 3
> 1 5
> 45 50
> ```
>
> ```
> 3
> 3
> 4
> ```

- 먼저 생각해볼 것은 우주선이 속도를 항상 1씩만 증가시키거나 감소시킬 수 있다는 점이다.
- 따라서 시작할 때의 속력과 도착할 때의 속력은 1로 고정되어있고, 그 다음/전의 속력 역시 1이거나 2여야 한다.
- 우주선이 n번 작동한다고 했을 때 움직일 수 있는 거리는 다음과 같다.

>1번 : 1 (1 광년)
>
>2번 : 1 1 (2 광년)
>
>3번 : 1 1 1 // 1 2 1 (3, 4 광년)
>
>4번 : 1 1 2 1 // 1 2 2 1 (5, 6 광년)
>
>5번 : 1 2 2 1 1 // 1 2 2 2 1 // 1 2 3 2 1 (7, 8, 9 광년)
>
>6번 : 1 2 2 2 2 1 // 1 2 2 2 3 2 1 // 1 2 2 3 3 2 1 // 1 2 3 3 3 2 1 (10, 11, 12, 13 광년)

- 이때 알아낼 수 있는 규칙은 다음과 같다.
  - 왼쪽 끝과 오른쪽 끝의 속력(각각 come/go)은 항상 1이다.
  - 그 다음번 속력은 각각 2가 되는데, 이때 홀수 번이라면 come만, 짝수 번이라면 go까지 더해주면 된다.
  - 이때 come/go의 값이 변화할 때마다 count(이동 횟수)를 증가시켜준다.
  - 이렇게 더해진 좌표값(location)은 실제 거리(distance)보다 커질 수 있다.
    - ex) 실제 거리는 5광년인데 1 2 2 1로 이동한 것으로 계산된다.
  - 그러나 우리는 항상 최단거리로 움직이기 때문에 더 많이 이동했다해도 횟수에는 지장이 없다.
- location이 가질 수 있는 값은 최단거리로 이동할 수 있는 최대 거리이다. 따라서 distance와 같을 수도, 더 클수도 있다.
- come과 go를 각각 다른 변수로 할당해준 이유는 횟수가 +1회 증가할 때마다 이동 거리는 +1, +1, +2, +2, +3, +3과 같은 규칙으로 격번마다 증가하기 때문이다.
- 따라서 while문 하나에서 진행하게 하되, 내부에 if문을 두어 짝수 번에 같은 값을 한번 더 더해주는 처리를 하였다.



### 풀이 B

- 위 풀이는 답은 맞출 수 있었지만 시간 초과가 나왔다. 따라서 두 번째는 조금 다른 접근 방식을 취했다.

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	//1011 알파 센타우리 풀이 B (int -> long으로 바꾸니 해결)
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		long x, y, distance;
		long n, k, set;
		
		for (int i=1; i <= repeat; i++) {
			n = 2;
			k = 4;
			set = 1;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			distance = y-x;
			
			while(distance > n) {
				n += k;
				k += 2;
				set += 2;
			}
			
			if(distance > n - (k-2)/2) {
				set ++;
			}
			bw.append(Long.toString(set)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
```

- 위 풀이에서는 앞서 +1, +1처럼 같은 간격으로 증가하는 홀수/짝수번째 회차를 하나로 묶어 set이라는 변수로 count했다.
- 즉, set은 (1-2회)일 때 1, (3-4회)일때 3의 값을 가진다.
- 이때 각 set의 최대값을 n으로, n의 증가폭을 k로 둔다.
- 각 set별 변수의 증감표는 다음과 같다.

| n    | k    | set  | 실제 이동 거리 |
| ---- | ---- | ---- | -------------- |
| 2    | 4    | 1    | 1 - 2 광년     |
| 6    | 6    | 3    | 3 - 6 광년     |
| 12   | 8    | 5    | 7 - 12 광년    |
| 20   | 10   | 7    | 13 - 20 광년   |
| 30   | 12   | 9    | 20 - 30 광년   |

- distance를 기준으로 n이 distance를 넘어서는 지점까지 위 규칙에 따라 while문을 진행하면, distance가 속한 set 그룹이 나온다.
- 이제 남은 것은 set 안에서 홀수번/짝수번을 가르는 것이다.
- 만약 5번 set에 distance가 포함되어 있다면 distance는 7 이상 12 이하의 값이다.
- 이때 distance가 9보다 크면 6번, 아니면 5번이다.
- 즉, 이때의 9라는 값을 얻어낼 수 있다면 if 문에 적용하여 set에 1을 더하여 짝수번으로 만들어줄 수 있다.
- n에서 (k-2)/2를 뺀 값이 그 경계값이 된다.



### 응답 속도 줄이기

- 안타깝게도 위 풀이도 시간 초과를 면할 수는 없었다.
- 풀이의 문제가 아니라 응답 속도의 문제였던 것이다.
- 응답 속도를 줄이기 위한 방법을 찾아보던 중 다음과 같은 해법을 발견했다.

1. bw.append() 기능을 이용해 출력할 내용을 모아서 bw.flush()로 한번에 출력해라.
2. int의 범위를 초과하는 계산이 있을 경우 변수를 long으로 바꾸어라.
3. set = set + 1보다는 set +=1 이 낫고, set ++가 가장 낫다.
4. String을 출력하고 싶을 땐 변수를 만드는 것보단 StringBuffer를 이용하는 것이 좋다.

- 위 풀이에서는 int를 long으로 바꾸었더니 간단하게 해결되었다.
- 그러나 2번의 내용을 숙지하고 연산 부분을 최대한 간소하게 만들었는데도 시간 초과가 나는 건 이해할 수 없는 상황이다.
- 보통 int보다 long이 더 많은 숫자를 담을 수 있기 때문에 메모리도 더 크다.
- 시간 초과의 원인을 정확하게 알 수는 없었지만, 덕분에 또 다른 풀이를 시도해볼 수 있는 좋은 기회였다.