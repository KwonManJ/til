# 백준 알고리즘

#### 01단계 입/출력 받아보기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|2557|Hello World|
|02|1000|A＋B|
|03|1001|A－B|
|03|7287|등록|

<hr>

#### Hello World

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|Hello World!를 출력하시오|없음|Hello World!|

```java
public class Main {

	public static void main(String[] args) {
		// TODO Hello World!를 출력하시오.
		System.out.print("Hello World!");
	}

}
```

<hr>

#### A+B

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오|첫째 줄에 A와 B가 주어진다. <br> (0<A, B<10)|첫째 줄에 A+B를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 두 정수 A와 B를 받은 다음, A+B를 출력하는 프로그램을 작성하시오.

		// 입력값을 저장할 변수 선언
		int A, B;

		// 사용자로부터 입력값을 받을 수 있게 Scanner 객체 생성
		Scanner input = new Scanner(System.in);

		// 사용자의 입력을 int값으로 받는다.
		A = input.nextInt();
		B = input.nextInt();

		// 결과 값 출력
		System.out.print(A+B);
	}

}
```

<hr>

#### A-B
|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오|첫째 줄에 A와 B가 주어진다. <br> (0<A, B<10)|첫째 줄에 A-B를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 두 정수 A와 B를 받은 다음, A-B를 출력하는 프로그램을 작성하시오.

		// 입력값을 저장할 변수 선언
		int A, B;

		// 사용자로부터 입력값을 받을 수 있게 Scanner 객체 생성
		Scanner input = new Scanner(System.in);

		// 사용자의 입력을 int값으로 받는다.
		A = input.nextInt();
		B = input.nextInt();

		// 결과 값 출력
		System.out.print(A-B);
	}

}
```

<hr>

#### 등록
|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|자신이 온라인 저지에서 맞은 문제의 개수와 아이디를 그대로 출력하는 프로그램을 작성하시오.|이 문제는 입력이 없다|첫 줄에 자신이 맞은 문제의 수, 둘째 줄에 아이디를 출력한다.|

```java
public class Main {

	public static void main(String[] args) {
		// TODO 자신이 온라인 저지에서 맞은 문제의 개수와 아이디를 그대로 출력하는 프로그램을 작성하시오.

		// 정확하게는 맞은 문제를 입력하면 오답이 나오고 푼 문제의 수를 입력해야 한다...
		System.out.println(100);
		System.out.println("nosf6842");
	}

}
```

<hr>
