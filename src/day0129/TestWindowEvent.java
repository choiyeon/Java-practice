package day0129;

import java.awt.Frame;

@SuppressWarnings("serial")
public class TestWindowEvent extends Frame {

	public TestWindowEvent() {
		super("윈도우 이벤트 연습");
		
		//Window Component을 이벤트에 등록
//		WindowAdapterSub was = new WindowAdapterSub();
//		addWindowListener(was);
		
		setSize(300,300);
		setVisible(true);
		
	}//TestWindowEvent

	public static void main(String[] args) {
		new TestWindowEvent();
	}//main

}//class
