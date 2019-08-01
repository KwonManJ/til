## java - String

자바에서 유용하게 사용할 수 있는 String 클래스의 메소드를 정리해보자.

#### 01 startWith(String prefix)
문자열이 지정한 문자로 시작하는지를 판단한다. <br> 같으면 true / 다르면 false를 반환한다. (대/소문자 구별)

```java
String str = "apple";
boolean startWith = str.startsWith("a");
System.out.println("startWith : " + startWith);

String str2 = "mango";
boolean startWith2 = str2.startsWith("ma");
System.out.println("startWith2 : " + startWith2);

콘솔 결과
startWith : true
startWith2 : true
```

#### 02 endsWith(String suffix)
문자열 마지막에 지정한 문자가 있는지를 판단한다. <br> 있으면 true / 없으면 false를 반환한다. (대/소문자 구별)

```java
String str = "apple";
boolean endsWith = str.endsWith("e");
System.out.println("endsWith : " + endsWith);

String str2 = "mango";
boolean endsWith2 = str2.endsWith("go");
System.out.println("endsWith2 : " + endsWith2);

콘솔 결과
endsWith : true
endsWith2 : true
```

#### 03 equals(Object anObject)
두 개의 String 값을 비교해서 <br> 같으면 true / 다르면 false를 반환한다. (대/소문자 구별)

```java
String str1 = "java";
String str2 = "java";

boolean equals = str1.equals(str2);
System.out.println("equals : " + equals);
System.out.println(str1 == str2);

String str3 = "java";
String str4 = "jav";

str4 += "a";

boolean equals2 = str3.equals(str4);
System.out.println("equals2 : " + equals2);
System.out.println(str3 == str4);

콘솔 결과
equals : true
true
equals2 : true
false
```

String은 원시타입`primitive type`처럼 쓰이지만 참조형 클래스 객체이다. 그리고 불변`immutable`객체다.

자바에서는 String 문자열끼리의 + 연산으로 문자열을 합칠 수 있고 내가 선언한 변수 안에서 연산이 이루어지는 것 처럼 보인다. 하지만 그렇지 않다.

```java
String a = "aaa";
```

String 타입 변수 a = "aaa"에 + 연산으로

```java
String a += "bbb";
```

+"bbb"가 이루어졌다면, 이미 존재하는 a에 bbb가 붙어 a = "aaabbb"가 되는 것이 아니라 **새로운 객체를 생성**하는 구조를 가지고 있다.

String 타입을 비교할 때 == 연산자를 쓰지 않고 **.equls()**를 쓰는 이유가 바로 이 때문이다.

#### 04 indexOf(String str)
지정한 문자가 문자열의 몇 번째에 있는지를 반환한다.

```java
String str = "abcdefg";
int indexOf = str.indexOf("e");
System.out.println("indexOf : " + indexOf);

콘솔 결과
indexOf : 4 // index의 넘버링은 0부터 시작한다.
```

#### 05 length()
문자열의 길이를 반환한다.

```java
String str = "abcdefg";
int length = str.length();
System.out.println("length : " + length);

콘솔 결과
length : 7
```

#### 06 replace(char oldChar, char newChar)
문자열에 지정한 문자가 있으면 새로 지정한 문자로 바꿔서 출력한다.

```java
String str = "abcdefg";
String replace = str.replace("cd", "ab");
System.out.println("replace : " + replace);

콘솔 결과
replace : ababefg
```

#### 07 replaceAll(String regex, String replacement)
정규표현식을 지정한 문자로 바꿔서 출력한다. (정규표현식에 대해서는 따로 살펴보도록 하자.)

```java
String str = "A A A";
String replaceAll = str.replaceAll("\\p{Space}", "추가");
System.out.println("replaceAll : " + replaceAll);

콘솔 결과
replaceAll : A추가A추가A
```

#### 08 split(String regex)
지정한 문자로 문자열을 나눌 수 있다. (배열로 반환한다.)

```java
String str = "A:B:C:D:abcd";
String[] split = str.split(":");
System.out.println("split : " + split[4]);

콘솔 결과
split : abcd
```
#### 09 substring(int beginIndex, int endIndex)
지정한 범위에 속한 문자열을 반환한다. (시작 인덱스, 끝날 인덱스+1) <br> 지정한 인덱스부터 문자열을 반환한다. (시작 인덱스)

```java
String str = "01234567";
String substring = str.substring(0, 5);
System.out.println("substring : " + substring);

String str2 = "01234567";
String substring2 = str2.substring(5);
System.out.println("substring2 : " + substring2);

콘솔 결과
substring : 01234
substring2 : 567
```

#### 10 toLowerCase
문자열에 존재하는 대문자를 소문자로 변한한다.

```java
String str = "abcDEF";
String toLowerCase = str.toLowerCase();
System.out.println("toLowerCase : " + toLowerCase);

콘솔 결과
toLowerCase : abcdef
```

#### 11 toUpperCase
문자열에 존재하는 소문자를 대문자로 변환한다.

```java
String str = "abcDEF";
String toUpperCase = str.toUpperCase();
System.out.println("toUpperCase : " + toUpperCase);

콘솔 결과
toUpperCase : ABCDEF
```

#### 12 trim()
문자열의 앞/뒤 공백을 없애준다. 문자열 사이에 있는 공백은 제거되지 않는다.

```java
String s = "	tab space	tab space ";
String space;
space = s.trim();
System.out.println("trim:" + space);

콘솔 결과
trim:tab Space  tab space
```

#### 13 contains(CharSequence s)
S1의 문자열과 S2의 문자열을 비교하여 포함관계가 있다면 true / 아니면 false를 반환한다. (대/소문자 구분)

```java
String s1 = "java String method";
String s2 = "String";
boolean contains = s1.contains(s2);
System.out.println("contains : " + contains);

콘솔 결과
contains : true
```

#### 14 charAt(int index)
지정한 index에 있는 문자를 반환한다.

```java
String str = "charAt";
char charAt = str.charAt(2);
System.out.println("charAt : " + charAt);

콘솔 결과
charAt : a
```

#### 15 concat(String str)
문자열과 문자열을 결합해준다.

```java
String str1 = "jisu";
String str2 = "-Jang";
String concat = str1.concat(str2);
System.out.println("concat : " + concat);

콘솔 결과
concat : jisu-Jang
```

#### 16 format
서식 문자열을 이용해서 서식화된 문자열을 반환한다. (서식 문자열에 대해서도 따로 살펴보도록 하자.)

```java
int i = 1234567;
String str = String.format("%,d", i);
System.out.println("format : " + str);

콘솔 결과
format : 1,234,567
```
