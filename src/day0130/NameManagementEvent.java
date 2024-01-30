package day0130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;

/**
 * 이벤트를 모아 처리하기 위해 작성
 */
public class NameManagementEvent extends WindowAdapter implements ActionListener {

	private NameManagementDesign nmd;
	private JTextField jtfName;

	// NameManagementEvent와 NameManagementDesign의 has a 관계
	public NameManagementEvent(NameManagementDesign nmd) {
		this.nmd = nmd;
	}// NameManagementEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		// 이벤트 비교
		if (ae.getSource() == nmd.getJbtnAdd()) {
			addName();
		} // if
		if (ae.getSource() == nmd.getJbtnRemove()) {
			removeName();
		} // if
	}// actionPerformed

	@Override
	public void windowClosing(WindowEvent we) {
		nmd.dispose();
	}// windowClosing

	private void addName() {
		jtfName = nmd.getJtfName();
		// 이름을 가져와서
		String name = jtfName.getText().trim();

		if (!name.isEmpty()) {
			// Model객체에 값을 설정
			nmd.getDlmName().addElement(name);
			jtfName.setText("");
			jtfName.requestFocus();
		} // if
	}// addName

	private void removeName() {
		jtfName = nmd.getJtfName();
		DefaultListModel<String> dlmName = nmd.getDlmName();

		List<String> list = new ArrayList<String>();
		String tempName = "";
		for (int i = 0; i < dlmName.size(); i++) {
			tempName = dlmName.getElementAt(i);
			// JTF의 이름과 같지 않은 이름만 리스트에 추가
			if (!jtfName.getText().equals(tempName)) {
				list.add(tempName);
			}
		} // end for
		
		//Model의 모든 아이템을 삭제하고
		dlmName.removeAllElements();
		
		//리스트에 저장된 값으로 Model에 추가
		for(String name : list) {
			dlmName.addElement(name);
		}//end for
	}// removeName

}// class
