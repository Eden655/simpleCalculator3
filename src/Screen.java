import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {
    private JPanel panelMain;
    private JPanel panelNum;
    private JTextField textNumber1;
    private JTextField textNumber2;
    private JButton addButton;
    private JButton substractButton;
    private JButton devitionButton;
    private JButton multiplicationButton;
    private JPanel panelAdd;
    private JPanel panelSub;
    private JPanel panelMul;
    private JPanel panelDiv;
    private JLabel lableAnswer;


    Screen() {
        super("Calculator Project");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textNumber1.getText();
                double a = Double.parseDouble(text1);

                String text2 = textNumber2.getText();
                double b = Double.parseDouble(text2);

                double answer = a + b;

                lableAnswer.setText(String.valueOf(answer));
            }

        });
        substractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textNumber1.getText();
                double a = Double.parseDouble(text1);

                String text2 = textNumber2.getText();
                double b = Double.parseDouble(text2);

                double answer = a - b;

                lableAnswer.setText(String.valueOf(answer));
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textNumber1.getText();
                double a = Double.parseDouble(text1);

                String text2 = textNumber2.getText();
                double b = Double.parseDouble(text2);

                double answer = a * b;

                lableAnswer.setText(String.valueOf(answer));
            }
        });
        devitionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textNumber1.getText();
                double a = Double.parseDouble(text1);

                String text2 = textNumber2.getText();
                double b = Double.parseDouble(text2);

                double answer = a / b;

                lableAnswer.setText(String.valueOf(answer));
            }
        });
    }

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setVisible(true);
    }
}