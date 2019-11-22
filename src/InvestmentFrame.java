import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InvestmentFrame {
    private JPanel panel1;
    private JLabel savingsAmount;
    private JTextField rateField;
    private JTextField savingsField;
    private JButton calculateButton;
    private JLabel resultLabel;
    private JLabel rateLabel;
    private JLabel numYears;
    private JTextField yearsField;
    private JPanel theChart;
    private double balance;

    public InvestmentFrame() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                balance = Double.parseDouble(savingsField.getText());
                double rate = Double.parseDouble(rateField.getText());
                double interest;
                double numberYears = Double.parseDouble(yearsField.getText());
                BarChart thisChart = new BarChart();
                for(int i = 0; i < numberYears; i++) {

                    interest = balance * rate / 100;
                    balance = balance + interest;
                    thisChart.addBar(Color.getHSBColor(i+2, i+2, i+2), (int) balance);
                }
                panel1.remove(thisChart);
                panel1.add(thisChart);
            }
        });
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame ();
        frame.setLayout(new BorderLayout());
        frame.add(new InvestmentFrame().panel1, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Interest Calculator");
        frame.pack();
        frame.setVisible(true);
    }
}


