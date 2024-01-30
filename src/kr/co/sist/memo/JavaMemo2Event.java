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
public class JavaMemo2Event extends WindowAdapter implements ActionListener {

	private JavaMemo2Design jmd;
	private JTextField jtfName, jtfPhoneNumber;
	private JRadioButton jrbMen, jrbWomen;
	private DefaultComboBoxModel<String> dcbmAge;
	private DefaultListModel<String> dlm;

	// NameManagementEvent와 NameManagementDesign의 has a 관계
	public JavaMemo2Event(JavaMemo2Design jmd) {
		this.jmd = jmd;
	}// NameManagementEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		// 이벤트 비교
		if (ae.getSource() == jmd.getJbtArr()[0]) {
			addName();
		} // if
		if (ae.getSource() == jmd.getJbtArr()[1]) {
			System.out.println("삭제");
		} // if
		if (ae.getSource() == jmd.getJbtArr()[2]) {
			System.out.println("변경");
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
		System.out.println(jrbMen.getText());
		String gender = "남자";//아니무조건 남자로 나오는데?
		if(!jrbMen.getText()) {
			gender = "남자";
		}else if(!jrbWomen.getText().isEmpty()) {
			gender = "여자";
		}

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

	private void removeName() {
		jtfName = jmd.getJtfName();
//		DefaultListModel<String> dlmName = jmd.getDlmName();
//
//		List<String> list = new ArrayList<String>();
//		String tempName = "";
//		for (int i = 0; i < dlmName.size(); i++) {
//			tempName = dlmName.getElementAt(i);
//			// JTF의 이름과 같지 않은 이름만 리스트에 추가
//			if (!jtfName.getText().equals(tempName)) {
//				list.add(tempName);
//			}
//		} // end for
//		
//		//Model의 모든 아이템을 삭제하고
//		dlmName.removeAllElements();
//		
//		//리스트에 저장된 값으로 Model에 추가
//		for(String name : list) {
//			dlmName.addElement(name);
//		}//end for
	}// removeName

}// class
