## java - Arrays 클래스

### java.util.Arrays 클래스
 1.  Arrays 클래스에는 배열을 다루기 위한 다양한 메소드가 포함되어 있다.
 2. Arrays 클래스의 모든 메소드는 `static`이므로, 객체를 생성하지 않고도 바로 사용할 수 있다.

#### 01 binarySearch()
> 특정 객체의 위치를 이진 검색 알고리즘을 사용하여 검색한 후, 해당 위치를 반환한다. 이 메소드는 이진 검색 알고리즘을 사용하므로, 매개변수로 전달되는 배열이 미리 정렬되어 있어야만 제대로 동작한다.

예제
```java
int[] arr = new int[1000]
for(int i=0; i<arr.length; i++) {
  arr[i] = i;
}

System.out.println(Arrays.binarySearch(arr, 437));
```

실행 결과
```
437
```

#### 02 copyOf()
> 전달받은 배열의 특정 길이만큼을 새로운 배열로 복사한다. <br> <br>
> 첫 매개변수로 원본 배열을 전달받고, 다음 매개변수로 복사할 요소의 개수를 전달 받는다. 그리고, 원본 배열과 같은 타입의 배열을 반환한다.

예제
```java
int[] arr1 = {1, 2, 3, 4, 5};

// 복제 1
int[] arr2 = Arrays.copyOf(arr1, 3);

// 복제 2
int[] arr3 = Arrays.copyOf(arr1, 10);

// 복제 1 출력
for(int i = 0; i < arr2.length; i++) {
  System.out.print(arr2[i] + " ");
}

// 복제 2 출력
for(int i = 0; i < arr3.length; i++) {
  System.out.print(arr3[i] + " ");
}
```

실행 결과
```
1 2 3
1 2 3 4 5 0 0 0 0 0
```

#### 03 copyOfRange()
> 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사한다. <br> <br>
> 1 첫 매개변수로 원본 배열을 전달받고 <br> 2 다음 매개변수로 복사할 배열의 시작 인덱스 <br> 3 그 다음 매개변수로 복사할 배열의 바로 다음 인덱스를 전달 받는다. <br> <br> 그리고, 동일하게 원본 배열과 같은 타입의 배열을 반환한다.

예제
```java
int[] arr1 = {1, 2, 3, 4, 5};

// 복제
int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);

// 출력
for(int i = 0; i < arr2.length; i++) {
  System.out.print(arr[i] + " ");
}
```

실행 결과
```
3 4
```

#### sort()
> 전달받은 배열의 모든 요소를 `오름차순`으로 정렬한다.

예제
```java
int[] arr = {5, 2, 4, 1, 3};

// 정렬
Arrays.sort(arr);

// 출력
for(int i = 0; i < arr.length; i++) {
  System.out.print(arr[i] + " ");
}
```

실행 결과
```
1 2 3 4 5
```
