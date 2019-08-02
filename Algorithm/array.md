# 백준 알고리즘

#### 06단계 1차원 배열 사용하기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|1152|단어의 개수|
|02|2577|숫자의 개수|
|03|8958|OX퀴즈|
|04|2920|음계|
|05|10039|평균 점수|

<hr>

#### 단어의 개수

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. <br><br> 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.|첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. <br><br> 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. <br><br> 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.|첫째 줄에 단어의 개수를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String sentence;
		sentence = scan.nextLine().trim(); // 앞, 뒤 공백 제거


		if(sentence.isEmpty()) { // 문장이 공백일 경우에도 생각해줘야 한다.
			System.out.println(0);
		} else {
			String[] split = sentence.split(" "); // 공백을 기준으로 배열 생성
			System.out.println(split.length); // 배열의 길이 출력
		}


	}

}
```

#### 숫자의 개수

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.|첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.|첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.|

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

		/*
		예를 들어 A = 150, B = 266, C = 427 이라면

		A × B × C = 150 × 266 × 427 = 17037300 이 되고,

		계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		*/

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		Integer result = A * B * C;

		String convertString = result.toString();
		char[] array = new char[convertString.length()];
		int[] count = new int[10];
		Arrays.fill(count, 0);

		for(int i=0; i<convertString.length(); i++) {
			array[i] = convertString.charAt(i);

			switch(array[i]-48) {

				case 0:
					++count[0];
					break;
				case 1:
					++count[1];
					break;
				case 2:
					++count[2];
					break;
				case 3:
					++count[3];
					break;
				case 4:
					++count[4];
					break;
				case 5:
					++count[5];
					break;
				case 6:
					++count[6];
					break;
				case 7:
					++count[7];
					break;
				case 8:
					++count[8];
					break;
				case 9:
					++count[9];
					break;
			}

		}

		for(int i=0; i<10; i++) {
			System.out.println(count[i]);
		}

	}

}
```

<hr>

#### OX퀴즈

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.|첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.|각 테스트 케이스마다 점수를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

		/*

		"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.

		문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.

		예를 들어, 10번 문제의 점수는 3이 된다.

		"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

		*/

		Scanner scan = new Scanner(System.in);

		int testCase;
		testCase = scan.nextInt();

		String[] OX = new String[testCase];

		for(int i = 0; i<testCase; i++) {
			OX[i] = scan.next();
		}

		// 각 케이스의 점수를 저장할 배열
		int[] sumOfScore = new int[testCase];

		// 각 케이스의 OX를 판단할 변수
		char judge;

		for(int i=0; i<testCase; i++) {

			int score = 0;
			int sum = 0;

			for(int j=0; j<OX[i].length(); j++) {

				judge = OX[i].charAt(j);

				if(judge == 'O') {
					score++;
				} else {
					score = 0;
				}

				sum = sum + score;
			}

			sumOfScore[i] = sum;
		}

		for(int i=0; i<testCase; i++) {
			System.out.println(sumOfScore[i]);
		}

		//
		scan.close();
	}

}
```

<hr>

#### 음계

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.|첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.|첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

		/*

		다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다.

		c는 1로, d는 2로, ..., C를 8로 바꾼다.

		1부터 8까지 차례대로 연주한다면 ascending,

		8부터 1까지 차례대로 연주한다면 descending,

		둘 다 아니라면 mixed 이다.

		*/

		Scanner scan = new Scanner(System.in);

		int[] scale = new int[8];

		for(int i = 0; i < 8; i++) {
			scale[i] = scan.nextInt();
		}

		String[] judge = new String[7];

		for(int i = 1; i < 8; i++) {
			if(scale[i]>scale[i-1]) {
				judge[i-1] = "asc";
			} else {
				judge[i-1] = "dec";
			}
		}

		for(int i = 1; i < 7; i++) {
			if(judge[i] != judge[i-1]) {
				System.out.println("mixed");
				break;
			} else if (judge[i] == "asc") {
				if(i == 6) {
					System.out.println("ascending");
				}
				continue;
			} else {
				if(i == 6) {
					System.out.println("descending");
				}
				continue;
			}
		}
	}

}
```

<hr>

#### 평균 점수

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.|입력은 총 5줄로 이루어져 있고, 원섭이의 점수, 세희의 점수, 상근이의 점수, 숭이의 점수, 강수의 점수가 순서대로 주어진다.<br><br>점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다.|첫째 줄에 학생 5명의 평균 점수를 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.

		/*

		상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.

		어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다.

		기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다.

		하지만, 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다.

		보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.

		*/

		Scanner scan = new Scanner(System.in);

		int[] score = new int[5];

		for(int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}

		int sum = 0;

		for(int i = 0; i < score.length; i++) {
			if(score[i] < 40) {
				score[i] = 40;
			}

			sum += score[i];
		}

		int avg = sum/5;
		System.out.println(avg);
	}

}
```
