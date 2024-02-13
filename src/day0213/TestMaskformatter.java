package day0213;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.text.ParseException;

public class TestMaskformatter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Number Only FormattedTextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JFormattedTextField formattedTextField = createNumberOnlyFormattedTextField();
        panel.add(new JLabel("숫자 입력: "));
        panel.add(formattedTextField);

        frame.getContentPane().add(panel);
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JFormattedTextField createNumberOnlyFormattedTextField() {
        MaskFormatter maskFormatter;
        try {
            maskFormatter = new MaskFormatter("####"); // 숫자만 허용하는 포맷
        } catch (ParseException e) {
            e.printStackTrace();
            return new JFormattedTextField();
        }

        JFormattedTextField formattedTextField = new JFormattedTextField(maskFormatter);
        formattedTextField.setColumns(10);

//        // InputVerifier를 사용하여 입력값을 검증
//        formattedTextField.setInputVerifier(new InputVerifier() {
//            @Override
//            public boolean verify(JComponent input) {
//                JFormattedTextField field = (JFormattedTextField) input;
//                String text = field.getText();
//
//                // 숫자만 포함되어 있는지 확인
//                if (text.matches("\\d+")) {
//                    return true;
//                } else {
//                    JOptionPane.showMessageDialog(field, "숫자 이외의 값은 입력할 수 없습니다.", "입력 오류", JOptionPane.ERROR_MESSAGE);
//                    return false;
//                }
//            }
//        });

        return formattedTextField;
    }
}
