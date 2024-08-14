import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class d8p4 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField resultField;

    public d8p4() {
        setTitle("Add Numbers");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels
        JLabel label1 = new JLabel("Number 1:");
        JLabel label2 = new JLabel("Number 2:");
        JLabel resultLabel = new JLabel("Sum:");

        // Create text fields
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make the result field read-only

        // Create the "Add" button
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the values from the text fields
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double sum = num1 + num2;

                    // Display the sum in the result field
                    resultField.setText(Double.toString(sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(d8p4.this, "Invalid input. Please enter numbers.");
                }
            }
        });

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(addButton);
        panel.add(new Label("                 \n"));
        panel.add(resultLabel);
        panel.add(resultField);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new d8p4();
            }
        });
    }
}
