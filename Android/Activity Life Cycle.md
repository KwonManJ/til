## Android Activity Life Cycle
안드로이드 세계에서 하나의 앱이 어떻게 살다가 돌아가시는지 알아보자.

그러기 위해서는 **액티비티의 생명주기**를 알면 된다.

**프래그먼트(Fragment)** 라는 녀석도 있지만 프래그먼트라는 녀석은 결국 액티비티 위에서 자신의 생명이 좌지우지 되기 때문에 프래그먼트의 생명주기가 앱의 생명주기라고 볼 수 없다.

따라서 우리는 하나의 액티비티가 어떻게 살다가 죽는지 알아보자. 또, 다른 액티비티와의 관계에 있어서 서로 어떤 프로세스를 거치는지 알아보자.

![액티비티 생명주기](./activity_life_cycle.jpg "액티비티 생명주기")

<hr>

|<center>메소드</center>|<center>설명</center>|<center>다음 메소드</center>|
|---|---|:---:|
|onCreate()|액티비티가 생성될 때 호출되며 사용자 인터페이스 초기화에 사용된다.|onStart()|
|onRestart()|액티비티가 멈췄다가 **다시 시작되기 바로 전**에 호출된다.|onStart()|
|onStart()|액티비티가 **사용자에게 보여지기 바로 직전**에 호출된다.|onResume()<br><center>or</center><br>onStop()|
|onResume()|액티비티가 **사용자와 상호작용하기 바로 전**에 호출된다.|onPause()|
|onPause()|**다른 액티비티가 보여질 때** 호출된다.<br>데이터 저장, 스레드 중지 등의 처리를 하기에 적당한 메소드|onResume()<br><center>or</center><br>onStop()|
|onStop()|액티비티가 더 이상 사용자에게 보여지지 않을 때 호출된다.<br>메모리가 부족할 경우에는 onStop() 메소드가 호출되지 않을 수 있다.|onRestart()<br><center>or</center><br>onDestroy()|
|onDestroy()|액티비티가 소멸될 때 호출된다. finish() 메소드가 호출되거나<br>시스템이 메모리 확보를 위해 액티비티를 제거할 때 호출된다.|없음|

**★ onStop(), onDestroy() 메소드는 호출되지 않을 수 있다.**

**TIP** <br>
사용자가 홈 키를 눌렀는지를 파악하는 방법? <br>
`Activity 클래스에는 onUserLeaveHint() 메소드가 제공되고 있다. 이 메소드가 바로 사용자가 홈 키를 눌렀을 때 호출되는 메소드이다. 그러므로 이 메소드를 재 정의해서 원하는 코드를 작성하면 된다. 참고로 이 메소드가 호출된 뒤에는 onPause() 메소드가 호출된다.`
