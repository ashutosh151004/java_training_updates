package JframesConcept;

import java.awt.event.*;
import javax.swing.*;

public class CurrConvert {
    public static void main(String[] args) {
        JFrame f = new JFrame("Currency Converter");
        JLabel l1 = new JLabel("Rupees:");
        l1.setBounds(20, 40, 60, 30);
        JLabel l2 = new JLabel("Dollars");
        l2.setBounds(170, 40, 60, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(80, 40, 70, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(240, 40, 70, 30);

        JButton b1 = new JButton("Dollar");
        b1.setBounds(50, 80, 80, 15);
        JButton b2 = new JButton("INR");
        b2.setBounds(190, 80, 80, 15);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //converting to float
                float d = Float.parseFloat(t1.getText());
                //convert rupees into dollars
                float d1 =  (float)(d/83.7);
                //get string value of calculated value
                String str1 = String.valueOf(d1);
                //place in the textbox
                t2.setText(str1);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float d2 = Float.parseFloat(t2.getText());
                float d3 = (float) (d2*83.7);
                String str2 = String.valueOf(d3);
                t1.setText(str2);
            }
    });
    f.add(l1);
    f.add(t1);
    f.add(l2);
    f.add(t2);
    f.add(b1);
    f.add(b2);

    f.setLayout(null);
    f.setSize(400, 300);
    f.setVisible(true);
}
}

