# 백준 알고리즘

#### 03단계 for문 사용해보기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|2741|N 찍기|
|02|2742|기찍 N|

<hr>

#### N 찍기

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.|첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.|첫째 줄부터 N번째 줄 까지 차례대로 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
	}

}

```

<hr>

#### 기찍 N

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.|첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.|첫째 줄부터 N번째 줄 까지 차례대로 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for(int i=N; i>0; i--) {
			System.out.println(i);
		}
	}

}

```
