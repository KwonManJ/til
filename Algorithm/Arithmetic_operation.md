# 백준 알고리즘

#### 02단계 사칙연산 도전하기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|10998|A × B|

<hr>

#### A × B

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.|첫째 줄에 A와 B가 주어진다. (0<A,B<10)|첫째 줄에 A×B를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

		// 입력값을 저장할 변수 선언
		int A, B;

		// 사용자로부터 입력값을 받을 수 있게 Scanner 객체 생성
		Scanner input = new Scanner(System.in);

		// 사용자의 입력을 int값으로 받는다.
		A = input.nextInt();
		B = input.nextInt();

		// 결과 값 출력
		System.out.print(A*B);

	}

}

```
