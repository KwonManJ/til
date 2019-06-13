## 안드로이드 컴포넌트 메소드 구현하기

이번 포스팅에서는 다음 3가지 흐름을 살펴보자.

1. Activity Layout 리소스 XML에 Button 추가
2. java 코드에서 Button에 대한 참조 획득
3. Button 클릭에 대한 이벤트 처리


#### 01 Activity Layout 리소스 XML에 Button 추가
```xml
//abc.xml
<Button
  // 생성된 컴포넌트를 자바에 연결하기 위해서는 id 값이 필요하다.
  android:id="@+id/btn_test"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:text="버튼" />
```

<hr>

[지난 포스팅](./R_java.md)에서 컴포넌트의 id 값이 변해도 R.java 파일에 변화가 생긴다고 언급했는데, 진짜 그런지 살펴보자.

![](images/added_id.png)

위와 같이 자동으로 잘 추가 되었음을 볼 수 있다. 이제 저 상수값을 java 에서 잘 이용해주기만 하면 된다.

#### 02 java 코드에서 Button에 대한 참조 획득
```java
// DEF.java
import android.widget.Button;

public class DEF extends AppCompatActivity {

    // 버튼 객체의 변수를 선언한다.
    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abc);

        // 이 곳을 주목
        btnTest = (Button)findViewById(R.id.btn_test);
    }
}
```

**버튼을 연결하는 방법!**

1. findViewById() 메소드를 통해서 .xml 파일의 컴포넌트를 가져온다.
2. 컴포넌트는 지정된 id 값을 통하여 가져올 수 있다.
3. 가져온 컴포넌트의 데이터 타입을 객체에 맞게 변환한다.

<hr>

#### 03 Button 클릭에 대한 이벤트 처리

아래의 과정들이 필요하다.

```java
// 1. setOnClickListener를 컴포넌트에 붙인다.
public void setOnClickListener(@Nullable OnClickListener I)

// 2. 이벤트가 발생했을 때 감지하는 객체 생성
public interface OnClickListener {

  // 3. Overriding 하여 실제적 메소드를 구현한다.
  void onClick(View v);
}
```

안드로이드에서는 위젯에서 발생한 특정 이벤트를 처리하기 위해서 **리스너(Listner)**라는 것을 사용한다. 리스너(Listener)의 사전적 의미는 "듣는 사람" 또는 "청취자" 이다. 어떤 말이 나오는지 귀기울이는 사람처럼 안드로이드에서는 **특정 이벤트의 발생 여부에 귀기울이는 객체**를 리스너라고 한다.

Button 에서 발생할 수 있는 클릭 이벤트는 부모 클래스인 View 클래스에 이미 정의되어 있다. 또한 클릭 이벤트를 위한 리스너도 java 인터페이스의 형태로 정의되어 있고, 이벤트 발생 시 호출된 함수의 형식도 인터페이스 내에 정의되어 있다.

이벤트를 처리하기 위해 남은 일은, **"이벤트 발생 시 호출될 함수를 구현한 리스너 객체를 생성하여 Button에 지정"**하는 것 뿐이다.

구체적으로 살펴보자면 클릭 이벤트 발생 시 호출될 onClick 함수를 구현한 OnClickListener 객체를 new로 생성한 다음, setOnClickListener() 함수를 호출하여 Button에 지정하는 것이다.

```java
// DEF.java
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class DEF extends AppCompatActivity {

    // 버튼 객체의 변수를 선언한다.
    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abc);

        // 이 곳을 주목
        btnTest = (Button)findViewById(R.id.btn_test);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTest.setText("선비 개발자");
            }
        });
    }
}
```

위와 같이 onClick 메소드를 구현한다면?<br>
버튼을 클릭하면 버튼의 text가 `버튼` 에서 `선비 개발자` 로 변경되는 것을 볼 수 있다!
