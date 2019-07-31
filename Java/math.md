## java - Math

Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스이다. <br>
Math 클래스의 모든 메소드는 `클래스 메소드(static method)`이므로, 객체를 생성하지 않고도 바로 사용할 수 있다. <br>
이러한 Math 클래스는 java.lang 패키지에 포함되어 제공된다.

<hr>

#### Math.E 와 Math.PI
Math 클래스에 정의되어 있는 `클래스 필드`는 다음과 같다.

1. Math.E : 오일러의 수라 불리며, 자연로그의 밑 값으로 약 2.718을 의미한다.
2. Math.PI : 원의 원주를 지름으로 나눈 비율(원주율) 값으로 약 3.14159를 의미한다.

<hr>

#### 1. random() 메소드

`random() 메소드`는 0.0이상 1.0 미만의 범위에서 임의의 double형 값을 하나 생성하여 반환한다. <br>
이 메소드는 내부적으로 java.util 패키지의 Random 클래스를 사용한 의사 난수 발생기를 사용하여 임의의 수를 생성한다.

다음 예제는 Math 클래스의 random() 메소드를 이용하여 0부터 99까지의 난수를 생성하는 예제이다.

```java
System.out.println((int)(Math.random()*100)); // 0 ~ 99

Random ran = new Random();
System.out.println(ran.nextInt(100)); // 0 ~ 99
```

자바에서는 Math 클래스의 random() 메소드 뿐 아니라 java.util 패키지에 포함된 Random 클래스의 nextInt() 메소드를 사용해도 난수를 생성할 수 있다.

만약 특정 범위에 속하는 난수를 생성하려면, 다음과 같이 난수 생성 범위를 조절할 수 있다.

```java
(int)(Math.random()*6); // 0 ~ 5
```

#### 2. abs() 메소드

`abs() 메소드`는 전달된 값이 음수이면 그 값의 절댓값을 반환하며, 전달된 값이 양수이면 전달된 값을 그대로 반환한다.

```java
System.out.println(Math.abs(10)); // 10
System.out.println(Math.abs(-10)); // 10
System.out.println(Math.abs(-3.14)); // 3.14
```

#### 3. floor() / ceil() / round() 메소드

`floor() 메소드`는 인수로 전달받은 값과 같거나 작은 수 중에서 가장 큰 정수를 반환한다.

```java
System.out.println(Math.floor(10.0)); // 10.0
System.out.println(Math.floor(10.9)); // 10.0
```

쉽게 얘기하면 실수의 소숫점을 제거한다.

`ceil() 메소드`는 반대로 인수로 전달받은 값과 같거나 큰 수 중에서 가장 작은 정수를 반환한다.

```java
System.out.println(Math.ceil(10.0)); // 10.0
System.out.println(Math.ceil(10.1)); // 11.0
System.out.println(Math.ceil(10.01)); // 11.0
```

쉽게 얘기하면 소숫점이 존재한다면 소숫점 아래의 수는 제거되고 정수는 무조건 +1 됨을 의미한다.

`round() 메소드`는 전달받은 실수를 소숫점 첫째 자리에서 반올림한 정수를 반환한다.

```java
System.out.println(Math.round(10.0)); // 10
System.out.println(Math.round(10.4)); // 10
System.out.println(Math.round(10.5)); // 11
System.out.println(Math.round(10.15)); // 10
System.out.println(Math.round(10.51)); // 11
```

소숫점 첫째 자리만 판단하면 된다.

#### 3. max() 메소드와 min() 메소드

전달된 두 값을 비교하여 최댓값, 최솟값을 반환한다.

`Math.max(int a, int b)` <br>
`Math.min(int a, int b)`

위의 두 메소드의 존재만 기억하면 쉽게 사용할 수 있다.

#### 4. pow() 메소드와 sqrt() 메소드

`pow() 메소드`는 전달된 두 개의 double형 값을 가지고 제곱 연산을 수행한다.

예를 들어, pow(a, b)는 a의 b승, 즉 a<sup>b</sup>를 반환하게 된다.

반대로 `sqrt() 메소드`는 전달된 double형 값의 제곱근 값을 반환한다.

```java
System.out.println((int)Math.pow(5, 2)); // 25
System.out.println((int)Math.sqrt(25)); // 5
```

#### 5. sin() / cos() / tan() 메소드

자바에서는 삼각 함수와 관련된 다양한 연산을 간편하게 수행할 수 있도록 많은 삼각함수를 제공하고 있다.

`sin() 메소드`는 전달된 double형 값의 사인값 <br>
`cos() 메소드`는 코사인 값 <br>
`tan() 메소드`는 탄젠트 값을 반환한다.
