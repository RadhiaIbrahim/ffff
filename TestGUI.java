import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGUI {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton addFromFirstButton;
    private JButton addFromLastButton;
    private JButton removeFromFirstButton;
    private JLabel elementLabel;
    private JLabel sizeLabel;
    private JLabel emptyLabel;
    SinglyLinkedList<String>l= new SinglyLinkedList<>();
public TestGUI() {
    sizeLabel.setText(l.size()+"");
    emptyLabel.setText(l.isEmpty()+"");
    elementLabel.setText(l.getAll());
    addFromFirstButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!textField1.getText().equals(""))
            {
                l.addFirst(textField1.getText());
                sizeLabel.setText(l.size()+"");
                emptyLabel.setText(l.isEmpty()+"");
                elementLabel.setText(l.getAll());
                textField1.setText("");
            }
        }
    });
    addFromLastButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!textField1.getText().equals(""))
            {
                l.addLast(textField1.getText());
                sizeLabel.setText(l.size()+"");
                emptyLabel.setText(l.isEmpty()+"");
                elementLabel.setText(l.getAll());
                textField1.setText("");
            }
        }
    });
    removeFromFirstButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            l.removeFirst();
            sizeLabel.setText(l.size()+"");
            emptyLabel.setText(l.isEmpty()+"");
            elementLabel.setText(l.getAll());
        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("TestGUI");
        frame.setContentPane(new TestGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
