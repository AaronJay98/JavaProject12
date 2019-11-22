import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackColorFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private JComboBox colorBox;
    private JPanel centerPanel;
    private JPanel panel1;

    public BackColorFrame() {
        centerPanel.setBackground(Color.RED);
        colorBox.setEditable(true);
        colorBox.addItem("Red");
        colorBox.addItem("Green");
        colorBox.addItem("Blue");

        colorBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = colorBox.getSelectedIndex();
                switch(index) {
                    case 0:
                        centerPanel.setBackground(Color.RED);
                        break;
                    case 1:
                        centerPanel.setBackground(Color.GREEN);
                        break;
                    case 2:
                        centerPanel.setBackground(Color.BLUE);
                        break;
                    default:
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame ();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.add(new BackColorFrame().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BackColorChanger");
        frame.setVisible(true);
    }
}
