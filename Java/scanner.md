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

<hr>

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

Scanner는 `기본적으로 띄어쓰기나 엔터(개행)를 기준으로 토큰 단위를 구분`하기 때문에 각 순서대로 변수에 입력되고, 그대로 출력한다.

<hr>

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
이름은  입니다.
```

위의 실행 결과는 프로그램을 설계한 의도와는 달리 **나이를 입력 후 이름을 입력하려고 보니 이미 입력 처리가 끝나있는 황당한 상황**이다. 이러한 상황이 발생하는 이유는 `nextLine()`과 나머지 메소드의 특성 때문인데 자세히 살펴보자.

실행결과를 뜯어서 해석해보면 다음과 같다

```java
나이를 입력하세요.
29 // input.nextInt()가 스캔하는 값 + 엔터(\n)를 쳐서 개행을 한다.

이름을 입력하세요
\n // input.nextLine()이 스캔하는 값 + 입력종료 명령

// 참고로 Scanner(System.in) 클래스는
// 시스템(버퍼)에 스캔할 값이 없으면 입력값을 받기 위해 대기하지만,
// 시스템(버퍼)에 스캔할 값이 있으면 대기하지 않고 바로 스캔한다.

나이는 29 입니다.
이름은  입니다.
```

스캐너의 토큰 구분 기준은 `스페이스 바` 혹은 `엔터(개행)` 이다. 이것을 `화이트 스페이스(White Space)`라고 한다.

`nextLine()` 메소드를 제외한 나머지 `next~()` 메소드 들은 `\n`을 `화이트 스페이스`로 인식하되 **토큰에 포함시키지 않는다**.

하지만, `\n`은 버퍼에 그대로 남아있기 때문에 남은 `\n`은 그 다음 토큰에 영향을 미친다. 그래서 `nextLine()`에서 `\n`이 스캔되기 때문에 입력을 받지않고 바로 넘어간 것이다.

이것을 이해하기 위해서는 여러 메소드를 조합해서 실험을 해볼 필요가 있다.

<hr>

#### ex 03
```java
import java.util.Scanner;

public class exScanner3 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String str1;
    String str2;

    System.out.println("문자열을 입력하세요");
    str1 = input.nextLine();

    System.out.println("문자열을 하나 더 입력하세요");
    str2 = input.nextLine();

    System.out.println("line 1 : " + str1);
    System.out.println("line 2 : " + str2);

    input.close();
  }
}
```

실행결과

```
문자열을 입력하세요
java nextLine() 메소드 이해

문자열을 하나 더 입력하세요
java nextLine()은 \n 을 포함하여 토큰을 종료한다.
```

위와같이 nextLine() 메소드는 `\n`을 포함하여 토큰을 종료시키기 때문에, `\n`가 입력되어도 다음 토큰에 영향을 주지 않는다.

이와같은 특성 때문에 nextLine() 메소드를 사용할 때는 상당한 주의를 필요로 한다.
