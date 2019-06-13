## .xml과 .java를 링크하기

액티비티를 생성하면 자동적으로 .xml과 .java의 생성과 링크가 이루어지는데, 이 부분을 살펴보자.

가령 abc.xml 파일과 DEF.java 파일을 따로 생성하여 두 파일을 이어주고 싶다면 이 원리를 알아야 할 것이다. 그럴일이 거의 없겠지만 원리를 알아두는 것은 매우 중요한 일이라고 생각한다. :)

**.xml 파일을 명명할 때 주의사항!!** <br>
모든 res 디렉토리 내부 파일이름은 **소문자(lowercase)로 명명**해야 한다.

우선 .xml의 생김새부터 알아보자.

```xml
// abc.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".DEF"
    android:orientation="vertical"
    >

</LinearLayout>
```

대략 코드를 보면서 정보를 얻을 수 있다.

1. xml은 <></>로 에워싼 html과 유사한 태그 방식을 사용하는 것 같다.
2. html과 유사한 속성="값" 형식의 문법도 보인다.
3. xml 버전은 1.0, 인코딩 utf-8 방식을 채택하고 있다.
4. 생소한 미지의 코드인 <br>
    xmlns:android="http://schemas.android.com/apk/res/android" <br>
    xmlns:app="http://schemas.android.com/apk/res-auto" <br>
    xmlns:tools="http://schemas.android.com/tools" <br>
    의 코드는 [이후 포스팅]()에서 더 깊이 알아보도록 하자.

다음으로 .java의 생김새를 알아보자.

```java
// DEF.java
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DEF extends AppCompatActivity {

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abc);
    }

}
```

1. 기본적으로 2개의 라이브러리가 자동으로 import 된다.
2. 생성된 클래스를 액티비티로 사용하기 위해서 기본적으로 **Activity** 나 **AppCompatActivity** 클래스를 상속받아야 한다.
3. onCreate() 메소드가 보이는데 이는 [액티비티 생명주기](./Activity_Life_Cycle.md) 포스팅을 참고하자.
4. 우리가 주목해야하는 부분은 **setContentView()** 이다.

장황하게(?) 글을 썼지만 사실 우리가 알아야 할 것은 **setContentView()**. **끝**. <br> 저 메소드의 파라미터로 위와같이 abc.xml 파일을 연결시키면 되는 것이다. 파라미터로 사용 된 값에서 **R.layout** 이라는 새로운 것이 등장했는데, [다음 포스팅](./R_java.md)에서 알아보자.
