package day0126;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class UseTable extends JFrame {

	public UseTable() {
		super("MVC 패턴을 도입한 JTable");
		
		//1. Model객체 생성
		String[] columnName = {"번호","이름","나이","이메일"};
		String[][] data = {
				{"1", "루피", "24", "test@test.com"},
				{"2", "히루루크", "60", "hihi@test.com"},
				{"3", "쵸파", "13", ""},
				{"4", "상디", "27", "cook@test.com"}
		};
		DefaultTableModel dtm = new DefaultTableModel(data, columnName);
		
		//2. Model객체와 has a 관계로 view 생성.
		JTable jtable = new JTable(dtm);
		
		//3. 데이터 추가 => Model 객체를 사용
		String[] tempData = {"5", "샹크스", "40", ""};
		dtm.addRow(tempData);
		
		//Vector도 값추가 가능
		Vector<String> vec = new Vector<String>();
		vec.add("6");
		vec.add("윤웅찬");
		vec.add("27");
		vec.add("chan@sist.co.kr");
		
		dtm.addRow(vec);
		
		JScrollPane jsp = new JScrollPane(jtable);
		jsp.setBorder(new TitledBorder("해적왕 후보자"));
		jtable.setRowHeight(25);
//		add(jtable); //스크롤바를 사용하지 않으면 컬럼명이 보이지 않는다.
		add(jsp); //스크롤바를 사용하지 않으면 컬럼명이 보이지 않는다.
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseTable
	
	public static void main(String[] args) {
		new UseTable();
	}//main

}//class
