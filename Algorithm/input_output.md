# 백준 알고리즘

#### 01단계 입/출력 받아보기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|2557|Hello World|
|02|1000|A＋B|
|03|1001|A－B|
|04|7287|등록|
|05|10172|개|
|06|10718|We love kriii|
|07|11718|그대로 출력하기|

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

#### 개

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|아래 예제와 같이 개를 출력하시오.|없음|개를 출력한다.|

```java
public class Main {

	public static void main(String[] args) {
		// TODO 아래 예제와 같이 개를 출력하시오.

		/*
		|\_/|
		|q p|   /}
		( 0 )"""\
		|"^"`    |
		||_/=\\__|
		*/

		/*
		\와 같은 텍스트는 기능을 가진 텍스트기 때문에 한 번만 사용하면 출력되지 않는다.
		\ 를 출력하기 위해서는 \\ 이런식으로 두 번 사용해야 한다.
		마찬가지로 " 를 출력하기 위해서도 \" 와 같은 방식을 사용해야 한다.
		*/
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");

	}

}
```

<hr>

#### We love kriii

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고 왠지 모르게 올 해에도 파주 World Finals 준비 캠프에 참여했다. <br><br> 대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.|본 문제는 입력이 없다.|두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.|

```java
public class C06 {

	public static void main(String[] args) {
		// TODO ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 kriii는
		// 미련을 버리지 못하고 왠지 모르게 올 해에도 파주 World Finals 준비 캠프에 참여했다.

		// 대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.

		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}

}

```

<hr>

#### 그대로 출력하기

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|입력 받은 그대로 출력하는 프로그램을 작성하시오.|입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문, 대문자, 공백, 숫자로만 이루어져 잇다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또 각, 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.|입력받은 그대로 출력한다.|

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 입력 받은 대로 출력하는 프로그램을 작성하시오.

		/*
		 * 조건 1. 입력은 최대 100줄로 이루어져 있다.
		 * 조건 2. 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
		 * 조건 3. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다.
		 * 조건 4. 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
		 */

		Scanner scan = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<String>();

		while(scan.hasNextLine()) {
			String input = scan.nextLine();

			if(input == null || input.isEmpty()) {
				break;
			} else if(input.startsWith(" ") || input.endsWith(" ")) {
				System.out.println("문장의 처음과 끝은 비울 수 없습니다.");
				continue;
			} else if(inputCheck(input) == false) {
				System.out.println("소문자, 대문자, 숫자, 공백만 사용가능합니다.");
				continue;
			} else if(input.length()>100) {
				inputs.add(input.substring(0, 101));
			} else {
				inputs.add(input);
			}
		}
		scan.close();

		for(int i = 0; i < inputs.size(); i++) {
			if(i==101) {
				break;
			}
			System.out.println(inputs.get(i));
		}

	}

	public static boolean inputCheck(String textInput) {
		char charInput;

		for(int i=0; i<textInput.length(); i++) {
			charInput = textInput.charAt(i);

			if(charInput >= 97 && charInput <= 122) {
				return true; // 소문자
			} else if (charInput >= 65 && charInput <= 90){
				return true; // 대문자
			} else if (charInput >= 48 && charInput <=57) {
				return true; // 숫자
			} else if (charInput == 32) {
				return true; // space
			} else {
				return false; // 그 외 문자
			}

		}
		return true;
	}

}
```
