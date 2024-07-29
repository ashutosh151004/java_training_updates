package JframesConcept;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame j = new JFrame(" Simple Calcultor");

        JLabel l1 = new JLabel("Number 1");
        l1.setBounds(30, 50, 100, 40);
        JTextField t1 = new JTextField();
        t1.setBounds(100, 50, 100, 40);

        JLabel l2 = new JLabel("Number 2");
        l2.setBounds(210, 50, 100, 40);
        JTextField t2 = new JTextField();
        t2.setBounds(280, 50, 100, 40);
        //Add Buttons to perform operations
        JButton b1 = new JButton("+");
        b1.setBounds(60, 130, 100, 50);
        JButton b2 = new JButton("-");
        b2.setBounds(180, 130, 100, 50);
        JButton b3 = new JButton("*");
        b3.setBounds(60, 200, 100, 50);
        JButton b4 = new JButton("/");
        b4.setBounds(180, 200, 100, 50);
        JButton result = new JButton("Result");

        result.setBounds(120, 260, 100, 50);
        j.add(l1);
        j.add(l2);
        j.add(t1);
        j.add(t2);
        j.add(b1);
        j.add(b2);
        j.add(b3);
        j.add(b4);
        j.add(result);
        b1.addActionListener(new ActionListener() {
            @Override
            public void 
            actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(t1.getText().toString());
                float num2 = Float.parseFloat(t2.getText().toString());
                float answer = num1+num2;
                result.setText(String.valueOf(answer));
            }
        });
        j.setSize(450, 400);
        j.setLayout(null);
        j.setVisible(true);
    }
}
