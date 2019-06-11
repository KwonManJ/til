## 매니페스트의 이해
#### 매니페스트란?
안드로이드 시스탬이 앱의 코드를 실행하기 전에 확보해야 하는 앱에 대한 필수 정보를 시스템에 제공하는 목록

#### 매니페스트의 역할?
1. Java 패키지의 이름을 지정
2. 앱이 장치 또는 구성요소들과 상호작용하기 위해 필요한 권한을 설정
3. 앱이 연결되어야 하는 라이브러리를 기술

<hr>

#### # 01 앱이 실행했을 때의 `최초 액티비티` * `intent-filter`
```xml
<activity android:name="MainActivity">
  <intent-filter>
    <action android:name="android.intent.action.MAIN"/>
    <category android:name="android.intent.category.LAUNCHER"/>
  </intent-filter>
</activity>
```
처음 실행되는 액티비티 이름은 MainActivity 이다. <br>
<span style="color:blue">action</span>은 뭐고 <span style="color:blue">category</span>는 무엇인가?

1. action : intent를 통해 수행할 행동을 지정한다.
2. category : action과 함게 activity의 특징을 나타낸다.

`액티비티 자동 추가` <br>
Intro 라는 액티비티를 새롭게 생성하면 매니페스트에 자동으로 다음과 같이 `<activity android:name="Intro">` 코드 한 줄이 추가가 된다.
```xml
<activity android:name="Intro">
<activity android:name="MainActivity">
  <intent-filter>
    <action android:name="android.intent.action.MAIN"/>
    <category android:name="android.intent.category.LAUNCHER"/>
  </intent-filter>
</activity>
```

`처음 실행되는 액티비티를 변경하기 위해서` <br>
다음과 같이 <span style="color:blue">intent-filter</span>가 포함된 액티비티의 이름을 변경 해야 한다.
```xml
<activity android:name="MainActivity">
<activity android:name="Intro">
  <intent-filter>
    <action android:name="android.intent.action.MAIN"/>
    <category android:name="android.intent.category.LAUNCHER"/>
  </intent-filter>
</activity>
```

#### # 02 앱의 기본 정보 `<application>`
```xml
<application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
</application>
```
앱의 선언 부분이다. 이는 앱의 컴포넌트에 영향을 줄 수 있는 속성들을 가지고 있다.
|속성|기능|
|---|---|
|android:allowBackup|백업 및 복구 기능의 사용 여부를 표시한다.|
|android:icon|앱 전체를 위한 아이콘과 각각의 컴포넌트들을 위한 아이콘을 나타낸다. 이미지 파일을 포함하고 있는 참조로써 반드시 셋팅 되어야 한다.|
|android:label|앱과 각각의 컴포넌트들을 위한 기본 레이블을 나타낸다. 레이블은 반드시 String 값으로 설정되어야 한다. |
|android:supportsRtl|앱이 RTL(Right-To-Left)를 지원할지의 여부를 선언한다. 만약 true로 설정되어 있고 sdk 버전이 17이상이면 RTL 레이아웃 기능을 활성화 시킬 수 있다.|
|android:theme|앱 안의 모든 기능들을 위한 기본 테마를 정의한 스타일 리소스의 참조점이다. 개개인의 액티비티들은 기본 테마를 오버라이드하여 자신만의 테마 속성을 셋팅할 수 있다.|
