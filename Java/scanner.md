## java - Scanner

자바의 기본 입력 클래스인 스캐너(Scanner) 클래스에 대해 알아보도록 하자.

자바의 스캐너 클래스는 **java.util 패키지 내에 존재**하는 클래스로 정수(int), 실수(double), 문자(Character), 문자열(String) 등을 읽어올 수 있다. **정확하게 얘기하자면**, 읽은 바이트를 정수, 실수, 문자, 문자열 등 다양한 타입으로 변환하여 리턴하는 클래스이다.

#### Scanner 기본 사용법
```java
// Scanner를 사용하기 위해서 import를 통해 외부 클래스를 호출한다.
import java.util.Scanner;

// Scanner의 객체 생성
Scanner input = new Scanner(System.in);

// 다 사용하고 난 후 close() 메소드로 메모리 손실을 줄여줄 수도 있다.
input.close();
```

#### Scanner 클래스의 메소드
|메소드|설명|
|---|---|
|String next()|다음 토큰을 **String 타입**으로 리턴|
|byte nextByte()|다음 토큰을 **byte 타입**으로 리턴|
|short nextShort()|다음 토큰을 **short 타입**으로 리턴|
|int nextInt()|다음 토큰을 **int 타입**으로 리턴|
|long nextLong()|다음 토큰을 **long 타입**으로 리턴|
|float nextFloat()|다음 토큰을 **float 타입**으로 리턴|
|double nextDouble()|다음 토큰을 **double 타입**으로 리턴|
|String nextLine()|'\n'을 포함하는 한 라인을 읽고 '\n'을 버린 나머지만 리턴|
|void close()|Scanner의 사용 종료|

#### ex 01
```java
import java.util.Scanner;

public class exScanner1 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String name, ad;
    int age;
    double weight;

    name = input.next();
    ad = input.next();
    age = input.nextInt();
    weight = input.nextDouble();

    System.out.println(name + ad + age + weight);

    input.close();
  }
}
```

실행결과
```
입력값 : Jang Korea 29 70
출력값 : JangKorea2970
```

위와 같은 방식을 사용하면 Scanner는 띄어쓰기를 기준으로 토큰 단위를 구분하기 때문에 각 순서대로 변수에 입력되고, 그대로 출력한다.

#### ex 02
```java
import java.util.Scanner;

public class exScanner2 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String name;
    int age;

    System.out.println("나이를 입력하세요.");
    age = input.nextInt();

    System.out.println("이름을 입력하세요.");
    name = input.nextLine();

    System.out.println("나이는 " + age + " 입니다.");
    System.out.println("이름은 " + name + " 입니다.");

    input.close();
  }
}
```

실행결과
```
나이를 입력하세요
29
이름을 입력하세요.

나이는 29 입니다.
이름은 입니다.
```
