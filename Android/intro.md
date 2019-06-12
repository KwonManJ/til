## Android App Intro
> 안드로이드 앱을 실행시키면, 인트로 화면이 몇 초간 나타났다가 메인 화면으로 전환되는 경우를 많이 볼 수 있다. 이것은 **앱의 초기화 작업이나, 필요한 리소스를 로딩할 때 걸리는 시간을 사용자들이 지루해 하지 않도록** 연출효과를 더하는 것이다.

## 인트로 액티비티 → 메인 액티비티
#### 01 intro.xml 레이아웃 추가
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Intro"
    android:orientation="vertical"
    >

</LinearLayout>
```
#### 02 intro.java 추가

```java
public class Intro extends AppCompatActivity {

    // 딜레이 3초
    private int DELAYED_TIME = 3000;

    // 핸들러 선언
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent mainAct = new Intent(Intro.this, MainActivity.class);
            startActivity(mainAct);
            finish();

            // 화면이 넘어갈 때 애니메이션 효과를 추가한다.
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        // 액션바 숨기기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        handler.postDelayed(runnable, DELAYED_TIME);
    }

    // 뒤로 가기 버튼을 눌렀을 때 딜레이를 취소한다.
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        handler.removeCallbacks(runnable);
    }
}
```

#### 03 manifests 수정
```xml
<activity android:name=".MainActivity"></activity>
<activity android:name=".Intro">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />

        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```
