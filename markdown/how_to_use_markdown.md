# 마크다운(MarkDown) 사용법

### 0. 마크다운이란?

> **MarkDown** 은 마크업 언어의 일종으로, 존 그루버(John Gruber)가 만들었다. 처음 이메일의 글쓰기 형식에 영감받아 python을 이용하여 html 변환기를 만들면서 시작되었다. 마크다운 문법은 읽기도 쉽지만 쓰기도 쉽다는 장점이 있다. 그루버는 마크다운으로 작성한 문서를 HTML로 변환하는 펄 스크립트도 만들었다. 확장자는 .md를 쓴다.

## 마크다운의 장&#183;단점
### 장점
	1. 문법이 쉽다.
	2. 관리가 쉽다.
	3. 지원 가능한 프로그램과 플랫폼이 다양하다.
### 단점
	1. 표준이 없어 사용자마다 문법이 상이할 수 있다.
	2. 모든 HTML 마크업을 대신하지 못한다.
## 마크다운의 사용
메모장부터 전용 에디터까지 많은 곳에서 활용할 수 있다. <br>
문법이 쉽기 때문에 꼭 전용 에디터를 사용할 필요는 없지만, 마크다운 코드의 하이라이트 효과를 원한다면 전용 에디터가 좋은 선택이 될 수 있다. <br>

# 1. 마크다운 문법(syntax)

## 1.1 제목(Header)
`<h1>` 부터 `<h6>` 까지 제목을 표현할 수 있다.
```
# 제목 1
## 제목 2
### 제목 3
#### 제목 4
##### 제목 5
###### 제목 6
```
제목1(h1)과 제목2(h2)는 다음과 같이 표현할 수 있다.
```
제목 1
=====

제목 2
-----
```

## 1.2 강조(Emphasis)
`* or _` / `** or __` / `~~`   

각각 `<em>`, `<strong>`, `<del>` 태그로 변환된다.

밑줄을 입력하고 싶다면 `<u></u>` 태그를 사용하면 된다.
```
*single asterisks* <br>
_single underscores_ <br>
**double asterisks** <br>
++double underscores__ <br>
~~cancel line~~
```

*single asterisks* <br>
_single underscores_ <br>
**double asterisks** <br>
__double underscores__ <br>
~~cancel line~~

## 1.3 목록(List)
* #### 순서 있는 목록(번호)

순서있는 목록은 `숫자`와 `점`을 사용한다.

		1. 첫번째
		2. 두번째
		3. 세번째

1. 첫번째
2. 두번째
3. 세번째


**특이사항** : 숫자의 번호와는 상관 없이 순차적으로 넘버링 된다.

		1. 첫번째
		1. 두번째
		1. 세번째

1. 첫번째
1. 두번째
1. 세번째


* #### 순서 없는 목록(글머리 기호)

```
* 적색
	* 녹색
		* 청색

+ 적색
	+ 녹색
		+ 청색

- 적색
	- 녹색
		- 청색
```
* 적색
	* 녹색
		* 청색

+ 적색
	+ 녹색
		+ 청색

- 적색
	- 녹색
		- 청색

## 1.4 링크(Links)
`<a>` 로 변환된다. <br>
기본적으로는 `<>`를 사용하여 감싼다. <br>
* 이메일 주소 링크

```
<nosf6842@naver.com>
```
<nosf6842@naver.com>

* 웹 사이트 주소(URL) 링크

```
<https://github.com/nosf6842>
```
<https://github.com/nosf6842>
* 주소 대신 단어가 보이는 링크

`1) 표시할 단어의 양쪽을 대괄호로 감싼다` <br>
`2) 주소의 양쪽은 소괄호로 감싼다` <br>
`3) 주소 뒤에 "링크에 대한 설명을 추가할 수 있다."`

```
[로뎀미디어](https://www.youtube.com/channel/UCtexst5lG5I-kkw4lIP0gnQ?view_as=subscriber "로뎀미디어 채널로 이동합니다.")
```
[로뎀미디어](https://www.youtube.com/channel/UCtexst5lG5I-kkw4lIP0gnQ?view_as=subscriber "로뎀미디어 채널로 이동합니다.")

## 1.5 이미지(Images)
`<img>` 로 변환된다. <br>
링크와 비슷하지만 앞에 `!`가 붙는다. <br>
상대 참조 URL을 사용할 수 있다. <br>
```
![다이나믹 비트](images/introBackground.jpg "다이나믹 비트 로고 입니다.")
```
![다이나믹 비트](images/introBackground.jpg "다이나믹 비트 타이틀 이미지 입니다.")

`이미지에 링크도 걸 수 있다.`
```
[![다이나믹 비트](images/introBackground.jpg)](https://github.com/nosf6842 "개발자 사이트로 이동합니다.")
```
[![다이나믹 비트](images/introBackground.jpg)](https://github.com/nosf6842 "개발자 사이트로 이동합니다.")

## 1.6 코드(Code) 강조
`<pre>`, `<code>` 로 변환된다. <br>
숫자 1번 키 왼쪽에 있는 ``` 로 감싼다.
## 1.6.1 인라인(inline) 코드 강조
```
`background` 혹은 `background-image` 속성으로 요소에 배경 이미지를 삽입할 수 있다.
```
`background` 혹은 `background-image` 속성으로 요소에 배경 이미지를 삽입할 수 있다.
## 1.6.2 블록(block) 코드 강조 <br>
<code>`</code>를 3번 이상 입력하고 코드 종류도 적는다.

		```HTML
		<a href="https://github.com/nosf6842" target="_blank">개발자 사이트</a>
		```

		```css
		#footer > .logo {
			margin: 10px;
			border-bottom: 2px solid red;
		}
		```

		```javascript
		function open() {
			var op = 'a';
			return;
		}
		```

		```bash
		$ vim ./README.md
		```

		```python
		p = "I Love Jesus"
		print p
		```


<hr>

```HTML
<a href="https://github.com/nosf6842" target="_blank">개발자 사이트</a>
```

```css
#footer > .logo {
	margin: 10px;
	border-bottom: 2px solid red;
}
```

```javascript
function open() {
	var op = 'a';
	return;
}
```

```bash
$ vim ./README.md
```

```python
p = "I Love Jesus"
print p
```

## 1.7 표(Table)
`<table>` 태그로 변환된다. <br>
헤더 셀을 구분할 때 3개 이상의 `-`(hyphen / dash) 기호가 필요하다. <br>
헤더 셀을 구분하면서 `:`(Colons) 기호로 셀(열/칸) 안에 내용을 **정렬**할 수 있다. <br>
가장 좌측과 가장 우측에 있는 `|`(vertical bar) 기호는 **생략 가능**하다.
```
|값|의미|기본값|
|---|:---:|---:|
|`static`|유형(기준) 없음 / 배치 불가능|`static`|
|`relative`|요소 **자신**을 기준으로 배치| |
|`absolute`|위치 상 **부모 요소**를 기준으로 배치| |
|`fixed`|브라우저 창을 기준으로 배치| |
```
|값|의미|기본값|
|:---|:---:|---:|
|`static`|유형(기준) 없음 / 배치 불가능|`static`|
|`relative`|요소 **자신**을 기준으로 배치| |
|`absolute`|위치 상 **부모 요소**를 기준으로 배치| |
|`fixed`|**브라우저 창**을 기준으로 배치| |

<hr>

#### Q) <br>
컨텐츠는 좌측 정렬 <br>헤더는 중앙 정렬하고 싶을 땐?

```
|<center>값</center>|<center>의미</center>|<center>기본값</center>|
|---|---|---|
|`static`|유형(기준) 없음 / 배치 불가능|`static`|
|`relative`|요소 **자신**을 기준으로 배치| |
|`absolute`|위치 상 **부모 요소**를 기준으로 배치| |
|`fixed`|브라우저 창을 기준으로 배치| |
```

|<center>값</center>|<center>의미</center>|<center>기본값</center>|
|---|---|---|
|`static`|유형(기준) 없음 / 배치 불가능|`static`|
|`relative`|요소 **자신**을 기준으로 배치| |
|`absolute`|위치 상 **부모 요소**를 기준으로 배치| |
|`fixed`|**브라우저 창**을 기준으로 배치| |

## 1.8 인용문(Block Quote)
`<blockquote>` 태그로 변한된다.
```
> This is a blockquote!

<hr>

> This is nested blockquote!
>> nested blockquote2
>>> nested blockquote3
>>>> nested blockquote4
```
> This is a blockquote!

<hr>

> This is nested blockquote!
>> nested blockquote2
>>> nested blockquote3
>>>> nested blockquote4

## 1.9 수평선(Horizontal Rule)
각 기호를 3개 이상 입력한다.
```
---
(Hyphens)

***
(Asterisks)

___
(underscores)
```
---
(Hyphens)

***
(Asterisks)

___
(underscores)

## 1.10 줄바꿈(Line Breaks)
`<br>`을 사용하거나 `'2번 띄어쓰기(Enter*2)'`를 활용하면 된다.
```
하나님이 세상을 이처럼 사랑하사 독생자를 주셨으니 <br>
이는 그를 믿는 자마다 멸망하지 않고 영생을 얻게 하려 하심이라 <br>
<br>
John 3:16
```
하나님이 세상을 이처럼 사랑하사 독생자를 주셨으니 <br>
이는 그를 믿는 자마다 멸망하지 않고 영생을 얻게 하려 하심이라 <br>
<br>
John 3:16

```
하나님이 세상을 이처럼 사랑하사 독생자를 주셨으니

이는 그를 믿는 자마다 멸망하지 않고 영생을 얻게 하려 하심이라

John 3:16
```
하나님이 세상을 이처럼 사랑하사 독생자를 주셨으니

이는 그를 믿는 자마다 멸망하지 않고 영생을 얻게 하려 하심이라

John 3:16

## 1.11 주석 달기
