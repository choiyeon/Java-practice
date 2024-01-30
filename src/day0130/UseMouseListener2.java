package day0130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class UseMouseListener2 extends JFrame implements MouseListener, ActionListener {

	// 이벤트와 관련있는 컴포넌트를 인스턴스 변수에 선언
	private DefaultListModel<String> dlmFriend;
	private DefaultListModel<String> dlmBlockFriend;

	private JList<String> jlFriend;
	private JList<String> jlBlockFriend;

	private JButton jbtnBlockAll;
	private JButton jbtnAll;

	public UseMouseListener2() {
		super("친구리스트");

		// MVC 패턴이 도입된 컴포넌트는 Model에 값을 설정.
		dlmFriend = new DefaultListModel<String>();
		dlmFriend.addElement("루피");
		dlmFriend.addElement("나루토");
		dlmFriend.addElement("이치고");
		dlmFriend.addElement("쵸파");
		dlmFriend.addElement("히루루크");

		dlmBlockFriend = new DefaultListModel<String>();

		// 모델객체와 has a관계로 view객체를 생성
		jlFriend = new JList<String>(dlmFriend);
		jlBlockFriend = new JList<String>(dlmBlockFriend);

		jbtnBlockAll = new JButton(">>");
		jbtnAll = new JButton("<<");

		JScrollPane jspFriend = new JScrollPane(jlFriend);
		JScrollPane jspBlockFriend = new JScrollPane(jlBlockFriend);

		jspFriend.setBorder(new TitledBorder("친구"));
		jspBlockFriend.setBorder(new TitledBorder("차단된 친구"));

		// 이벤트에 컴포넌트를 등록
		jlFriend.addMouseListener(this);
		jlBlockFriend.addMouseListener(this);
		jbtnBlockAll.addActionListener(this);
		jbtnAll.addActionListener(this);

		setLayout(null);

		jspFriend.setBounds(20, 40, 150, 200);
		jbtnBlockAll.setBounds(190, 130, 50, 30);
		jbtnAll.setBounds(190, 90, 50, 30);
		jspBlockFriend.setBounds(250, 40, 150, 200);

		add(jspFriend);
		add(jbtnBlockAll);
		add(jbtnAll);
		add(jspBlockFriend);

		setBounds(100, 100, 440, 300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseMouseListener

	@Override
	public void actionPerformed(ActionEvent ae) {
		// getSource() 이벤트를 발생시킨 객체의 주소가 반환
		// 차단된 친구로 전체이동
		if (ae.getSource() == jbtnBlockAll) {
			// 친구리스트에서 모든 값 가져오기
			Object[] obj = new Object[dlmFriend.size()];// 배열 생성
			obj = dlmFriend.toArray();// 친구리스트의 모든 값을 배열로 복사

			// 차단된 친구리스트에 넣고
			for (int i = 0; i < obj.length; i++) {
				dlmBlockFriend.addElement(obj[i].toString());
			} // for

			// 친구리스트 삭제.
			dlmFriend.removeAllElements();
		} // end if
			// 친구로 전체이동
		if (ae.getSource() == jbtnAll) {
			// 친구리스트에서 모든 값 가져오기
			Object[] obj = new Object[dlmBlockFriend.size()];// 배열 생성
			obj = dlmBlockFriend.toArray();// 친구리스트의 모든 값을 배열로 복사

			// 차단된 친구리스트에 넣고
			for (int i = 0; i < obj.length; i++) {
				dlmFriend.addElement(obj[i].toString());
			} // for

			// 친구리스트 삭제.
			dlmBlockFriend.removeAllElements();
		} // end if
	}// actionPerformed

	@Override
	public void mouseClicked(MouseEvent me) {
		// 클릭에서 손 땠을 때. 키 작업이 종료된 후.
//		System.out.println("mouseClicked");

		// 어떤 키가 눌리든 호출됨. : 키에 대한 비교를 해야함.
//		System.out.println(me.getButton()); //눌려진 버튼 값 알 수 있음 왼1 휠2 오3
		int ind = 0;
		String name = "";
//		switch (me.getButton()) { //버튼이 눌렸는데
//		case MouseEvent.BUTTON1: //그 버튼이 왼쪽 클릭일 경우

		//클릭해서 차단된 친구로 이동
		if (me.getSource() == jlFriend) {
			ind = jlFriend.getSelectedIndex();
			if (ind != -1) {// 이름없는 빈곳은 -1
				// 선택된 인덱스에 해당하는 값을 model에서 얻고
				name = dlmFriend.getElementAt(ind);

				// 얻어낸 값을 차단된 친구로 등록 (dlmBlockFriend)
				dlmBlockFriend.addElement(name);

				// 선택된 인덱스에 해당하는 값을 model에서 삭제
				dlmFriend.remove(ind);

				System.out.println(name);
			} // if
		} // if
		
		//클릭해서 친구로 이동
		if (me.getSource() == jlBlockFriend) {
			ind = jlBlockFriend.getSelectedIndex();
			if (ind != -1) {// 이름없는 빈곳은 -1
				// 선택된 인덱스에 해당하는 값을 model에서 얻고
				name = dlmBlockFriend.getElementAt(ind);

				// 얻어낸 값을 차단된 친구로 등록 (dlmBlockFriend)
				dlmFriend.addElement(name);

				// 선택된 인덱스에 해당하는 값을 model에서 삭제
				dlmBlockFriend.remove(ind);

				System.out.println(name);
			} // if
		} // if

	}// mouseClicked

	@Override
	public void mousePressed(MouseEvent e) {
		// 클릭 누르고 있을 때
//		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 클릭된 키가 올라갔을 때
//		System.out.println("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 특정영역 들어감
//		System.out.println("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 특정영역 나감
//		System.out.println("mouseExited");

	}

	public static void main(String[] args) {
		new UseMouseListener2();
	}// main

}// class
