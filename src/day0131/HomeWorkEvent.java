package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HomeWorkEvent extends WindowAdapter implements ActionListener, MouseListener {

	private HomeWorkDesign hwd;

	public HomeWorkEvent(HomeWorkDesign hwd) {
		this.hwd = hwd;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// 이벤트 비교
		if (ae.getSource() == hwd.getAddButon()) {
			addMember();

		}

		if (ae.getSource() == hwd.getChangeButon()) {
			changeData();
		}

		if (ae.getSource() == hwd.getDeleteButon()) {
			deleteData();
		}

		if (ae.getSource() == hwd.getEndButon()) {
			endOver();
		}
	}// actionPerformed
	
	@Override
	public void windowClosing(WindowEvent we) {
		hwd.dispose();
	}
	
	@Override
	public void windowActivated(WindowEvent we) {
		hwd.getJtfName().requestFocus();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		JTextField jtfName =  hwd.getJtfName();
		JTextField jtfCallNum =  hwd.getJftCallNum();
		JRadioButton jrbMan = hwd.getMan();
		JRadioButton jrbWman = hwd.getWman();
		JComboBox<String> jcbAge = hwd.getJcbAge();
		DefaultComboBoxModel<String> age = hwd.getAge();
		DefaultListModel<String> dlmData = hwd.getDlmData();
		JList<String> jlData = hwd.getJldata();
		
		String selectedData = jlData.getSelectedValue();
		String selectedName = selectedData.split(",")[0];
		String selectedAge = selectedData.split(",")[1];
		String selectedGender = selectedData.split(",")[2];
		String selectedCallNum = selectedData.split(",")[3];
		
		jtfName.setText(selectedName);
		jcbAge.setSelectedIndex(Integer.valueOf(selectedAge)-20);
		jrbMan.setSelected(true);
		if(selectedGender.equals("여")) {
			jrbWman.setSelected(true);
		}//end if
		jtfCallNum.setText(selectedCallNum);
	}//mouseClicked
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	private void addMember() {
		JTextField jtfName = hwd.getJtfName();
		JTextField jtfCallNum = hwd.getJftCallNum();
		JRadioButton man = hwd.getMan();
		JRadioButton wman = hwd.getWman();
		DefaultComboBoxModel<String> age = hwd.getAge();
		JComboBox<String> jcbAge = hwd.getJcbAge();
		DefaultListModel<String> dlmData = hwd.getDlmData();

		// 유효성 검증
		String name = jtfName.getText().trim();
		if (name.isEmpty()) {
			JOptionPane.showMessageDialog(hwd, "이름은 필수 입력사항입니다.");
			jtfName.requestFocus();
			return;
		}

		// MVC Pattern 도입된 컴포넌트
		String selectedAge = age.getElementAt(jcbAge.getSelectedIndex());

		String gender = "여";
		if (man.isSelected()) {
			gender = man.getText();
		}

		String tel = jtfCallNum.getText().trim();

		// 유효성 검증성공 후 데이터 채우기
		StringBuilder sbSetData = new StringBuilder();
		sbSetData.append(name).append(",");
		sbSetData.append(selectedAge).append(",");
		sbSetData.append(gender).append(",");
		sbSetData.append(tel);

		// JList에 설정
		dlmData.addElement(sbSetData.toString());

		// 컴포넌트를 초기화
		jtfName.setText("");
		jtfCallNum.setText("");
		man.setSelected(true);
		age.setSelectedItem(20);
		jtfName.requestFocus();
	}


	private void changeData() {
		JTextField jtfName = hwd.getJtfName();
		JTextField jtfCallNum = hwd.getJftCallNum();
		DefaultComboBoxModel<String> age = hwd.getAge();
		JComboBox<String> jcbAge = hwd.getJcbAge();
		DefaultListModel<String> dlmData = hwd.getDlmData();

		// 유효성 검증
		String name = jtfName.getText().trim();
		if (name.isEmpty()) {
			JOptionPane.showMessageDialog(hwd, "이름은 필수 입력사항입니다.");
			jtfName.requestFocus();
			return;
		}

		// 리스트에서 값을 얻어 이름이 같은지. 시작한다면 입력된 값으로 변경
		// MVC Pattern 도입된 컴포넌트
		String selectedAge = age.getElementAt(jcbAge.getSelectedIndex());
		String tel = jtfCallNum.getText().trim();
		
		String item = "";
		StringBuilder sbSetData = new StringBuilder();
		String gender = "";

		for (int i = 0; i < dlmData.size(); i++) {
			// 리스트에서 값 얻기
			item = dlmData.getElementAt(i);
			// 이름 같은지 확인
			if (item.startsWith(name)) {
				// 이름이 같다면 입력된 값으로 변경
				gender = item.split(",")[2];

				sbSetData.append(name).append(",")
				.append(selectedAge).append(",")
				.append(gender).append(",")
				.append(tel);

				//현재번째 아이템 삭제
				dlmData.removeElementAt(i);
				//현재번째 변경된 값을 설정
				dlmData.add(i, sbSetData.toString());
			}
		}

	}// changeData

	private void deleteData() {
		JTextField jtfName = hwd.getJtfName();
		DefaultListModel<String> dlmData = hwd.getDlmData();

		// 유효성 검증
		String name = jtfName.getText().trim();
		if (name.isEmpty()) {
			JOptionPane.showMessageDialog(hwd, "이름은 필수 입력사항입니다.");
			jtfName.requestFocus();
			return;
		}
		
		Object[] obj = new Object[dlmData.size()];
		obj = dlmData.toArray();
		String item = "";
		dlmData.removeAllElements();
		for(int i=0; i<obj.length;i++){
			//친구리스트에 넣고
//			item = dlmData.getElementAt(i);
			item = (String)obj[i];
			if(!item.startsWith(name)) {
				dlmData.addElement(item);
			}
		}
	}//deleteData

	private void endOver() {
		hwd.dispose();
	}


}
