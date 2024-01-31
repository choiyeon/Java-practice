package kr.co.sist.memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * 이벤트를 모아 처리하기 위해 작성
 */
public class StudentInfoEvent extends WindowAdapter implements ActionListener {

	private StudentInfoDesign jmd;
	private JTextField jtfName, jtfPhoneNumber;
	private JRadioButton jrbMen, jrbWomen;
	private DefaultComboBoxModel<String> dcbmAge;
	private DefaultListModel<String> dlm;

	// NameManagementEvent와 NameManagementDesign의 has a 관계
	public StudentInfoEvent(StudentInfoDesign jmd) {
		this.jmd = jmd;
	}// NameManagementEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		// 이벤트 비교
		if (ae.getSource() == jmd.getJbtArr()[0]) {
			addName();
		} // if
		if (ae.getSource() == jmd.getJbtArr()[1]) {
			System.out.println("변경");
		} // if
		if (ae.getSource() == jmd.getJbtArr()[2]) {
			removeInfo();
		} // if
		if (ae.getSource() == jmd.getJbtArr()[3]) {
			jmd.dispose();
		} // if
	}// actionPerformed

	@Override
	public void windowClosing(WindowEvent we) {
		jmd.dispose();
	}// windowClosing

	private void addName() {
		jtfName = jmd.getJtfName();
		dcbmAge = jmd.getDcbmAge();
		jtfPhoneNumber = jmd.getJtfPhoneNumber();
		jrbMen = jmd.getJrbMen();
		jrbWomen = jmd.getJrbWomen();

		// 정보 가져와서
		String name = jtfName.getText().trim();
		String age = (String)dcbmAge.getSelectedItem();
		String phoneNum = jtfPhoneNumber.getText().trim();
		String gender = "";//아니무조건 남자로 나오는데?
//		if(man.isSelected()) {
//		gender = man.getText();
//	}
//		}else if(!jrbWomen.getText().isEmpty()) {
//			gender = "여자";
//		}

		if (!(name.isEmpty() && age.isEmpty() && phoneNum.isEmpty() &&
				gender.isEmpty())) {
			// Model객체에 값을 설정
			String info = name + "," + age + "," + gender + "," + phoneNum;
			jmd.getDlm().addElement(info);
			
			jtfName.setText("");
			jtfPhoneNumber.setText("");
			dcbmAge.setSelectedItem(20);
//			jrbMen.
			
			jtfName.requestFocus();
		} // if
	}// addName
	
	private void changeInfo() {
		
	}

	private void removeInfo() {
		System.out.println("돌아간아?");
		jtfName = jmd.getJtfName();
		DefaultListModel<String> dlmInfo = jmd.getDlm();

		List<String> list = new ArrayList<String>();
		String tempName = "";
		for (int i = 0; i < dlmInfo.size(); i++) {
			tempName = dlmInfo.getElementAt(i);
			// JTF의 이름과 같지 않은 이름만 리스트에 추가
			if (!jtfName.getText().contains(tempName)) {
				list.add(tempName);
			}
		} // end for
		
		//Model의 모든 아이템을 삭제하고
		dlmInfo.removeAllElements();
		
		//리스트에 저장된 값으로 Model에 추가
		for(String info : list) {
			dlmInfo.addElement(info);
		}//end for
	}// removeName

}// class
