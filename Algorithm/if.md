# 백준 알고리즘

#### 04단계 if문 사용해보기

#### Categories

|<center>단계</center>|<center>문제번호</center>|<center>제목</center>|
|---|---|---|
|01|9498|시험 성적|
|02|10817|세 수|

<hr>

#### 시험 성적

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|시험 점수를 입력받아 <br> 90 ~ 100점은 A <br> 80 ~ 89점은 B <br> 70 ~ 79점은 C <br> 60 ~ 69점은 D <br> 나머지 점수는 F <br> 를 출력하는 프로그램을 작성하시오.|첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.|시험 성적을 출력한다.|

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO

		/*
		90 ~ 100점 A
		80 ~ 89점 B
		70 ~ 79점 C
		60 ~ 69점 D
		나머지 점수는 F
		*/

		int score;

		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();

		if(score>=90) System.out.println("A");
		else if(score>=80) System.out.println("B");
		else if(score>=70) System.out.println("C");
		else if(score>=60) System.out.println("D");
		else System.out.println("F");

	}

}

```

<hr>

#### 세 수

|<center>문제</center>|<center>입력</center>|<center>출력</center>|
|---|---|---|
|세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. |첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)|두 번째로 큰 정수를 출력한다.|

```java

````
