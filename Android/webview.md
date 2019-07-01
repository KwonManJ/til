## Android - Web-View

> 웹뷰 : 앱 내에 웹 화면을 띄우는 뷰를 말한다.

#### 01 매니페스트 설정하기
> manifests > AndroidManifest.xml

웹뷰는 인터넷을 사용하기 때문에 웹뷰를 사용하기 위해서 `manifests` 파일에 들어가서 `permission` 즉, **인터넷 접속권한을 등록**해야한다.

```xml
// 인터넷 권한을 부여한다.
<uses-permission android:name="android.permission.INTERNET"/>
```

#### 02 웹뷰 등록
> res > layout > activity_main.xml

```xml
<WebView
  android:id="@+id/webView"
  android:layout_width="match_parent"
  android:layout_height="match_parent"
  />
```

#### 03 메인 액티비티 소스
> java > com.example. > MainActivity

```java
private WebView webView; // 웹뷰
String url = "http://www.naver.com";

protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);

  // 웹뷰 Setting..
  webView = (WebView)findViewById(R.id.webView);
  webView.getSettings(); // 셋팅 권한 획득

  // 1
  webView.setJavaScriptEnabled(true); // 자바스크립트 사용 하용
  // 2
  webView.setSupportZoom(true); // 손으로 확대, 축소를 할 수 있도록 허용
  // 3
  webView.setBuiltInZoomControls(true); // WebView 내장 Zoom 사용

  webView.loadUrl(url)
}
```

이 상태에서 `loadUrl()`을 통해 페이지를 불러오려고 하면 외부 브라우저를 실행하게 된다.

  1. 웹뷰 내에서 웹 페이지를 돌아다니기 위해선 `WebViewClient`의 `shouldOverrideUrlLoading` 함수를 사용해야 한다.
  2. 또한, 웹에서 띄우는 팝업 창을 웹뷰를 통해서 보여지게 하려면 `setWebChromeClient()`를 설정해야 한다.

#### 04 뒤로 가기 버튼
```java
@Override
public boolean onKeyDown(int keyCode, keyEvent event) {
  if((keyCode == Key.Event.KEYCODE_BACK) && webView.canGoBack()) {
    webView.goBack();
    return true;
  }
}
```
