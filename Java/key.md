## java - KeyListener & KeyAdapter

### # 01 KeyAdapter를 상속받은 클래스 생성

```java
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// KeyAdapter을 상속 받는다.
public class KeyListener extends KeyAdapter {

  // KeyAdapter의 메소드
  // 1. keyPressed(KeyEvent e) {}
  // 2. keyReleased(KeyEvent e) {}
  // 3. keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		if(DynamicBeat.game == null) {
			return;
		}

    // KeyEvent 의 메소드
    // 1. char getKeyChar : 아스키 코드를 이용한다.
    // 2. int getKeyCode : 키의 상수값을 이용한다.
    // 3. static String keyText(int keyCode) : 눌려진 키의 이름을 리턴

		if(e.getKeyCode()==KeyEvent.VK_S) {
			DynamicBeat.game.pressS();
		} else if(e.getKeyCode()==KeyEvent.VK_D) {
			DynamicBeat.game.pressD();
		} else if(e.getKeyCode()==KeyEvent.VK_F) {
			DynamicBeat.game.pressF();
		} else if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			DynamicBeat.game.pressSpace();
		} else if(e.getKeyCode()==KeyEvent.VK_J) {
			DynamicBeat.game.pressJ();
		} else if(e.getKeyCode()==KeyEvent.VK_K) {
			DynamicBeat.game.pressK();
		} else if(e.getKeyCode()==KeyEvent.VK_L) {
			DynamicBeat.game.pressL();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(DynamicBeat.game == null) {
			return;
		}

		if(e.getKeyCode()==KeyEvent.VK_S) {
			DynamicBeat.game.releaseS();
		} else if(e.getKeyCode()==KeyEvent.VK_D) {
			DynamicBeat.game.releaseD();
		} else if(e.getKeyCode()==KeyEvent.VK_F) {
			DynamicBeat.game.releaseF();
		} else if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			DynamicBeat.game.releaseSpace();
		} else if(e.getKeyCode()==KeyEvent.VK_J) {
			DynamicBeat.game.releaseJ();
		} else if(e.getKeyCode()==KeyEvent.VK_K) {
			DynamicBeat.game.releaseK();
		} else if(e.getKeyCode()==KeyEvent.VK_L) {
			DynamicBeat.game.releaseL();
		}
	}
}
```

### # 02 KeyListener를 더해준다.

```java
addKeyListener(new KeyListener());
```
