package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *부가적인 기능을 제공하기 위해 제작하는 창 : Dialog 
 */
//@SuppressWarnings("serial")
//public class HWMemoSubJDialog extends JDialog implements ActionListener {
//
//	public HWMemoSubJDialog(HWMemoDesign hmd) {//Frame의 자식창
////		super(hmd, "부가적인 기능", true); //modal 첫창 클릭 안됨.
//		super(hmd, "부가적인 기능", false); //non-modal 첫창 클릭 가능. 여러 서브창 띄울 수 있음
//		
//		ImageIcon ii = new ImageIcon("E:/dev/workspace/java_se/src/day0125/images/img3.png");
//		JLabel jlblBack = new JLabel("자식창에서 제공하는 이미지",ii, JLabel.CENTER);
//		
//		JButton jbtn = new JButton("닫기");
//		JPanel jp = new JPanel();
//		jp.add(jbtn);
//		
//		add("Center", jlblBack);
//		add("South", jp);
//		
//		//JDialog는 이벤트 등록 코드를 setVisible전에 정의해야한다.
//		jbtn.addActionListener(this);//jbtn이 actionPerformed으로 들어옴.
//		//JDialog의 종료 : DISPOSE_ON_CLOSE 사용
//		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//		
//		setBounds(hmd.getX()+125, hmd.getY()+100, 244, 200);//부모의 시작 좌표를 받아 자식 창 위치 설정
//		setVisible(true);//사용자에게 보여지는 일
//	}//SubJDialog
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		dispose(); // 닫기 버튼으로 서브창 닫기
////		System.exit(JFrame.ABORT);//자식이 닫히면 부모도 닫힘. 권장하지않음.
//	}//actionPerformed
//
//}//class
