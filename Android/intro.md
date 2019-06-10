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
```

#### 03 manifests 수정
```xml

```
