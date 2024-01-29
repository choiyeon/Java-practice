package day0129;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *windowAdapter는 abstract method가 존재하지 않는 추상클래스
 *자식클래스에서 반드시 override해야할 method가 없다.
 *개발자가 필요로 하는 method만 override하면 된다. 
 */
public class WindowAdapterSub extends WindowAdapter{
	//WindowAdapterSub와 TestWindowEvent2는 has a 관계
	private TestWindowEvent2 twe2;//초기화 값인 null이 들어있음.
	
	//null인 twe2에 주소를 할당하기 위해 생성자에 매개변수를 선언했다.
	public WindowAdapterSub(TestWindowEvent2 twe2) {
		this.twe2 = twe2;
	}//WindowAdapterSub

	@Override
	public void windowClosing(WindowEvent we) {
		//TestWindowEvent2클래스의 부모클래스가 제공하는 dispose()
		//호출하여 TestWindowEvent2만 종료

		//has a관계로 설정된 twe의 dispose 메소드 호출
		twe2.dispose();
	}//windowClosing

}//windowDeactivated
