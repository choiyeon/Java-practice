package Semi_Team_Project;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class MainAppDesign extends JFrame {
	private JButton view;
	private JButton lineView;
	private JButton report;
	private JButton browse;
	private JTextArea info;
	private JFormattedTextField startLog;
	private JFormattedTextField endLog;
	
	public JButton getView() {
		return view;
	}
	
	public JButton getLineView() {
		return lineView;
	}

	public JButton getReport() {
		return report;
	}

	public JButton getBrowse() {
		return browse;
	}

	public JTextArea getInfo() {
		return info;
	}

	public JFormattedTextField getStartLog() {
		return startLog;
	}

	public JFormattedTextField getEndLog() {
		return endLog;
	}

	public MainAppDesign() {
		view = new JButton("View");
		lineView = new JButton("Line View");
		report = new JButton("Report");
		browse = new JButton("Browse");
		info = new JTextArea();
		startLog = new JFormattedTextField();
		endLog = new JFormattedTextField();
		
		JScrollPane jsp = new JScrollPane(info);
		
		setLayout(null);
		jsp.setBorder(new TitledBorder("로그 정보"));
		startLog.setBorder(new TitledBorder("시작 라인"));
		endLog.setBorder(new TitledBorder("끝 라인"));
		
		startLog.setBounds(70, 500, 100, 50);
		endLog.setBounds(770, 500, 100, 50);
		jsp.setBounds(70, 70, 800, 400);
		view.setBounds(70, 600, 250, 100);
		lineView.setBounds(70, 750, 250, 100);
		browse.setBounds(670, 600, 250, 100);
		report.setBounds(370, 600, 250, 100);
		
		//JFormattedTextField 초기화
		startLog.setValue(0);
		endLog.setValue(0); 
		
		add(jsp);
		add(view);
		add(lineView);
		add(report);
		add(browse);
		add(startLog);
		add(endLog);
		
		MainAppEvent me = new MainAppEvent(this);
		browse.addActionListener(me);
		lineView.addActionListener(me);
		addWindowFocusListener(me);
		
		
		setVisible(true);
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
