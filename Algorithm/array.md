# 백준 알고리즘

#### 06단계 1차원 배열 사용하기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|1152|단어의 개수|
|02|2577|숫자의 개수|

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
