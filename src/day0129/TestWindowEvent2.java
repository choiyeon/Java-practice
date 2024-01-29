package day0129;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TestWindowEvent2 extends Frame {

	public TestWindowEvent2() {
		super("윈도우 이벤트 연습2");
		
		//has a 관계의 이벤트 처리
		//Window Component을 이벤트에 등록
//		WindowAdapterSub was = new WindowAdapterSub(this);
//		addWindowListener(was);
		
		//anonymouse inner class로 처리
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		} );//addWindowListener
		
		
		setSize(300,300);
		setVisible(true);
		
	}//TestWindowEvent2

	public static void main(String[] args) {
		new TestWindowEvent2();
	}//main

}//class
