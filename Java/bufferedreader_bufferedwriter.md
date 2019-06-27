## java - BufferedReader / BufferedWriter

### `BufferedReader`
> 자바에서 처음 입출력 매커니즘을 배울 때 가장 많이 사용하는 것은 단연 `Scanner` 일 것이다. `Scanner`를 통해 입력 받을 경우엔 *Space, Enter* 모두 경계로 인식하기 때문에 입력받은 데이터를 가공하기 매우 편리하다.
>
> 하지만 그에비해 `BufferedReader`는 *Enter* 만 경계로 인식하고 **받은 데이터가 String으로 고정**되기 때문에 입력받은 데이터를 가공하는 작업이 필요한 경우가 많다.
>
> Scanner에 비해 다소 사용하기 불편하지만 많은 데이터의 양을 입력받을 경우 `BufferedReader`를 통해 입력받는 것이 효율면에서 훨씬 낫다. 작업속도 차이가 많이 난다.

#### BufferedReader 사용법

```java
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

String s = bf.readLine();
int i = Integer.parseInt(bf.readLine());
```

 1. `readLine()`를 사용할 시 리턴값은 String으로 고정된다.
 2. 다른 타입으로 입력을 받으려면 형변환을 꼭 해줘야한다.
 3. 예외 처리를 반드시 해줘야한다. `throws IOException`을 통하여 작업한다.

#### Read한 데이터 가공

```java
StringTokenizer st = new StringTokenizer(s);

int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());

String array[] = s.split(" "); // 공백마다 데이터를 끊어서 배열에 추가
```

다음 두가지 방법이 대표적이다.

 1. `StringTokenizer`에 `nextToken()` 함수를 쓰면 `readLine()`을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있다.
 2. `String.split()` 함수를 활용하여 배열에 공백단위로 끊어서 데이터를 넣고 사용할 수도 있다.

### `BufferedWriter`
> 일반적으로 출력할 때 `System.out.println("");` 방식을 사용하고는 한다. 적은양의 출력일 경우 성능차이가 미미하겠지만 많은 양의 출력에서는 입력과 마찬가지로 Buffer를 활용해주는 것이 좋다.

#### BufferWriter 사용법
```java
BufferWriter bw = new BufferWriter(new OutputStream(System.out));

String s = "선비개발자";

bw.write(s + "\n"); // 출력

bw.flush(); // 남아있는 데이터를 모두 출력시킨다.
bw.clse() // 스트림을 닫는다.
```

 1. `BufferedWirter`의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush()와 close()를 호출하여 뒤처리를 해줘야 한다.
 2. `write()`는 `System.out.println();`과 같이 자동으로 개행이 되지 않기에 `\n`을 따로 처리해야한다.
