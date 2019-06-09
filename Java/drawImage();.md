# java - GUI
### # 01 drawImage(); 사용법
## 1. drawImage();
> Class : Object > Graphics <br>
> Abstract Method : drawImage(Image, int, int, ImageObserver) <br>
> Return : boolean

## 2. ImageIcon() {}
> Class : Object > ImageIcon <br>
> Constructor : ImageIcon(URL) <br>

## 3. getImage();
> Class : Object > ImageIcon <br>
> Method : getImage() <br>
> Return : Image

```Java
private Image screenImage;
private Graphics screenGraphic;

private Image background = new ImageIcon(Main.class.getResource("../images/introBackground(Title).jpg")).getImage();

public void paint(Graphics g) {
  screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
  screenGraphic = screenImage.getGraphics();
  screenDraw(screenGraphic);
  g.drawImage(screenImage, 0, 0, null);
}

public void screenDraw(Graphics g) {
  g.drawImage(background, 0, 0, null);
  this.repaint();
}
```
1. drawImage()는 Image 객체를 매개변수로 받아서 화면에 이미지를 그린다.
2. URL을 통하여 이미지를 등록할 때에는 ImageIcon 생성자를 이용한다. <br>
`ImageIcon(Main.class.getResource("../images/introBackground(Title).jpg"))`
3. ImageIcon을 Image로 변환할 때 getImage()를 사용한다. <br>
`.getImage();`
