## java - Grammar

#### 제어문

```
제어문(Control Flow Statement)
```

 - 제어문이란, 프로그램 실행 흐름을 개발자가 원하는 방향으로 바꿀 수 있도록 해주는 것이다.
 - 일반적으로 조건식과 실행 구문인 중괄호(블록, {})으로 구성되어 있다.

#### 제어문의 종류
 - `조건문(conditional statements)` : if문, switch문
 - `반복문(looping statements)` : for문, while문, do-while문
 - `분기문(branching statements)` : break, continue, return

<hr>

### `조건문`

 - 조건식의 결과에 따라 블록 실행여부가 결정
 - 조건식에는 boolean 변수 또는 true/false 값을 산출하는 연산식을 사용
 - 조건식이 true이면 블록 실행, false이면 실행하지 않음

#### if문

 - if문

```java
if(조건식) {
 // 조건식이 참일 경우 실행되는 구문
}
```

 - if-else문

```java
if(조건식) {
  // 조건식이 참일 경우 실행되는 구문
} else {
  // 조건식이 거짓일 경우 실행되는 구문
}
```

 - if-else if-else문

```java
if(조건식 A) {
  // 조건식 A가 참일 경우 실행되는 구문
} else if(조건식 B) {
  // 조건식 A가 거짓이고, 조건식 B가 참일 경우 실행되는 구문
} else if(조건식 C) {
  // 조건식 A, B가 거짓이고, 조건식 C가 참일 경우 실행되는 구문
} else {
  // 모든 조건식이 거짓일 경우 실행되는 구문
}
```

 - 중첩 if문

```java
if(조건식 A) {
  // 조건식 A가 참일 경우 실행되는 구문
  if(조건식 B) {
    // 조건식 A와 B가 참일 경우 실행되는 구문
  }
}
```

#### switch문

 - if문과 달리 변수가 어떤 값을 갖느냐에 따라 실행문이 선택
 - if문의 경우의 수가 많아질 수록 switch 문을 사용하는 것이 효과적
 - 괄호 안의 동일한 값을 갖는 case로 가서 실행문을 실행
 - 동일한 값의 case가 없으면 default로 가서 실행문 실행 **(생략가능)**
 - 변수 값에 따라 case가 실행된 후 제어문을 빠져나가기 위해 break; 사용

```java
switch(변수) {
  case A1:
    실행문1;
    break;

  case A2:
    실행문2;
    break;

  default:
    실행문3;
    break;
}
```

<hr>

### `반복문`

 - 어떤 작업이 반복적으로 수행되도록 할 때 사용하는 구문

#### 반복문의 종류
 - `for문` : 주로 반복횟수를 알고 있을 때 사용
 - `향상된 for문` : 컬렉션과 배열을 처리할 때 더 효과적인 문법
 - `while문` : 조건식으로 반복할 때 주로 사용
 - `do-while문` : 반복하기 전에 먼저 실행해야 하는 구문이 있을 때 사용

#### for문

```java
for(초기식; 조건식; 증감식) {
  // 반복 수행될 로직
}
```
 - for문 예제 : 1부터 10까지의 합

 ```java
 public class ExFor {
   public static void main(String[] args) {
     int i;
     int sum = 0;

     for(i=1; i<=10; i++) {
       sum += i;
     }

     // 1부터 10까지의 합
     System.out.println(sum);
   }
 }
 ```

#### 향상된 for문

```java
for(자료형 변수명 : 배열 또는 컬렉션) {
  // 반복 수행될 로직
}
```
 - 향상된 for문 예제 : 배열에 담긴 국어 점수 출력

```java
public class ExEnhancedFor {
  public static void main(String[] args) {

    int[] kors = new int[5];

    kors[0] = 100;
    kors[1] = 90;
    kors[2] = 80;
    kors[3] = 70;
    kors[4] = 60;

    for(int kor : kors) {
      System.out.println(kor);
    }
  }
}
```

#### while문

```java
while(조건식) {
  // 조건식이 참일 동안 반복 수행될 로직
}
```
 - while문 예제 : 10부터 0까지의 합

```java
public class ExWhile {
  public static void main(String[] args) {

    int i = 10, sum = 0;

    while(i >= 0) {
      sum += i;
      i--;
    }

    System.out.println(sum);
  }
}
```

#### do-while문

```java
do {
  // 먼저 한 번 실행하고, 조건식이 참일 동안 반복 수행될 로직
}while(조건식);
```
 - do-while문 예제 : 증가치에 따라 증가하는 항 값의 누적 합

```java
public class ExDoWhile {
  public static void main(String[] args) throws java.lang.Exception {

    int h = 1; // n 항의 누적 합
    int n = 1; // 각 항 : [1]+[2]+[3]+...
    int k = 0; // 증가치

    do {
      k += 1;
      n += k;
      if(n > 100) break;
      else h += n; // 누적
    } while(true);
  }
}
```
