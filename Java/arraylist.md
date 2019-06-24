## java - ArrayList<> 활용법

#### 01 새로운 클래스 생성

```java
public class Track {

  // 변수 선언
  private String titleImage; // 제목 부분 이미지
  private String startImage; // 게임 선택 창 표지 이미지
  private String gameImage; // 해당 곡을 실행했을 때 표지 이미지
  private String startMusic; // 게임 선택 창 음악
  private String gameMusic; // 해당 곡을 실행했을 때 음악

  // Generate Getters and Setters
  public String getTitleImage() {
  	return titleImage;
  }
  public void setTitleImage(String titleImage) {
  	this.titleImage = titleImage;
  }
  public String getStartImage() {
  	return startImage;
  }
  public void setStartImage(String startImage) {
  	this.startImage = startImage;
  }
  public String getGameImage() {
  	return gameImage;
  }
  public void setGameImage(String gameImage) {
  	this.gameImage = gameImage;
  }
  public String getStartMusic() {
  	return startMusic;
  }
  public void setStartMusic(String startMusic) {
  	this.startMusic = startMusic;
  }
  public String getGameMusic() {
  	return gameMusic;
  }
  public void setGameMusic(String gameMusic) {
  	this.gameMusic = gameMusic;
  }

  // 생성자
  public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic) {
  	super();
  	this.titleImage = titleImage;
  	this.startImage = startImage;
  	this.gameImage = gameImage;
  	this.startMusic = startMusic;
  	this.gameMusic = gameMusic;
}
```

#### 02 ArrayList<> 생성

```java
ArrayList<Track> trackList = new ArrayList<Track>();
```

#### 03 ArrayList<>에 데이터 삽입

```java
trackList.add(new Track("Moon Light Title Image.png", "Moon Light Start Image.jpg", "Moon Light Game Image.jpg", "Moonlight Selected.mp3", "Ludwig van Beethove - Moonlight Sonata - 3rd.mp3"));
trackList.add(new Track("La Campanella Title Image.png", "La Campanella Start Image.jpg", "La Campanella Game Image.jpg", "La Campanella Selected.mp3", "Liszt - La Campanella.mp3"));
trackList.add(new Track("Bumble Bee Title Image.png", "Bumble Bee Start Image.jpg", "Bumble Bee Game Image.jpg", "Bumble Bee Selected.mp3", "Flight of the Bumble Bee.mp3"));
trackList.add(new Track("Chase Title Image.png", "Chase Start Image.jpg", "Chase Game Image.jpg", "Chase Selected.mp3", "Chopin Etude Op.10 No.4 - Chase.mp3"));
```

#### 04 Index 설정하기

```java
private int nowSelected = 0; // 최초 인덱스 0

public void selectLeft() {
  if(nowSelected == 0) {
    nowSelected = trackList.size() -1;
  } else {
    nowSelected--;
  }
  selectTrack(nowSelected);
}

public void selectRight() {
  if(nowSelected == trackList.size()-1) {
    nowSelected = 0;
  } else {
    nowSelected++;
  }
  selectTrack(nowSelected);
}
```

#### 05 ArrayList<>에서 데이터 불러오기

```java
trackList.get(nowSelected).getTitleImage()
trackList.get(nowSelected).getStartImage()
trackList.get(nowSelected).getGameImage()
trackList.get(nowSelected).getStartMusic()
trackList.get(nowSelected).getGameMusic()
```
