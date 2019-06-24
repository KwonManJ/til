## Android SharedPreferences

> 앱을 사용하려면 기본적으로 내가 사용한 앱을 사용한 흔적들(Data)이 저장되어있어야 한다. 우리가 앱을 실행할 때마다 매번 새롭게 데이터를 입력하고 새롭게 앱 설정을 해줘야 한다면 그것만큼 번거롭고 불편한 일이 없을 것이다.
>
> 데이터를 저장하는 방법에는 안드로이드에 내장된 LocalDB인 SQLite를 사용하거나 서버의 DB에 연결하여 데이터를 저장하거나 불러오거나 하는 방법이 있다.
>
> 많은 데이터를 저장하고 관리하기엔 이 방법이 적절하다. 하지만 그 사용 방법이 복잡하다는 단점이 있다. 만약 저장해야 하는 데이터가 단순하다면 안드로이드에서 제공하는 SharedPreferences를 사용하는 것이 적합하다.
>
> 보통 초기 설정값이나 자동 로그인 여부 등의 값을 저장하기 위해 사용한다.
>
> 이 데이터는 애플리케이션이 삭제되기 전까지 보존된다.

#### 01 SharedPreferences 인스턴스 얻기
 - `getPreferences(int mode)`
  - 하나의 액티비티에서만 사용한다.
  - SharedPreferences 파일은 해당 액티비티 이름으로 생성된다.
  - 하나의 액티비티에서만 사용할 수 있지만, getSharedPreferences()를 사용하면 다른 액티비티에서도 사용이 가능하다.

 - `getSharedPreferences(String name, int mode)`
  - **특정 이름**을 가진 SharedPreferences를 생성한다.
  - 주로 애플리케이션 전체에서 사용한다.

```java
String name = "FILE_NAME";

SharedPreferences pref = getSharedPreferences(name, 0);
```

#### 02 SharedPreferences.Editor 인스턴스 얻기
데이터를 기록하기 위해 SharedPreferences.Editor 인스턴스를 얻어야 한다.
```java
String name = "FILE_NAME";

SharedPreferences pref = getSharedPreferences(name, 0);
SharedPreferences.Editor edit = pref.edit();
```

#### 03 데이터 저장하기
SharedPreferences는 `(Key, Value)` 형태로 사용한다. <br>
`ex) putString(key, value)`

```java
String name = "FILE_NAME";

SharedPreferences pref = getSharedPreferences(name, 0);
SharedPreferences.Editor edit = pref.edit();

edit.putString("1st", first);
edit.putString("2nd", second);
edit.commit(); // 이걸 생략하면 절대 안된다.
```

#### 04 데이터 불러오기
데이터를 불러오기 위해 getString()와 같은 메소드를 사용하여 불러와야 한다. <br>
`ex) getString(key, value)`

```java
EditText et_save = (EditText)findViewById(R.id.et_save);

SharedPreferences pref = getSharedPreferences(name, 0);
String value = pref.getString("1st", "");

et_save.setText(value);
```

#### 05 변경사항 갱신하기
특정 데이터를 저장을 하든 업데이트를 하든 삭제를 하든 **반드시** 해줘야 하는 작업이 있다.

`edit.commit()` 이 메소드를 **반드시 사용**해줘야 한다.
