## 매니페스트의 이해
#### 매니페스트란?
안드로이드 시스탬이 앱의 코드를 실행하기 전에 확보해야 하는 앱에 대한 필수 정보를 시스템에 제공하는 목록

#### 매니페스트의 역할?
1. Java 패키지의 이름을 지정
2. 앱이 장치 또는 구성요소들과 상호작용하기 위해 필요한 권한을 설정
3. 앱이 연결되어야 하는 라이브러리를 기술

#### 01 앱이 실행했을 때의 `최초 액티비티`
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

`액티비티 자동 추가`
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

`처음 실행되는 액티비티를 변경하기 위해서`
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

#### 02 
