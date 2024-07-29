package JframesConcept;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CurrConvert {
    public static void main(String[] args) {
        JFrame f = new JFrame("Currency Converter");
        JLabel l1 = new JLabel("Rupees:");
        l1.setBounds(20, 40, 60, 30);
        JLabel l2 = new JLabel("Dollars");
        l2.setBounds(170, 40, 60, 30);
        JLabel result = new JLabel();
        result.setBounds(70, 100, 200, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(80, 40, 70, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(240, 40, 70, 30);

        JButton b1 = new JButton("Convert");
        b1.setBounds(50, 80, 130, 15);

        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1.getText().isEmpty() && t2.getText().isEmpty()){
                    result.setText("Please enter value to convert");
                }
                else if(t2.getText().isEmpty()){
                    float d2 = Float.parseFloat(t1.getText());
                    float d3 = (float) (d2/83.7);
                    result.setText(String.valueOf(d3));
                }
                else if (t1.getText().isEmpty()) {
                    float d = Float.parseFloat(t2.getText());
                    float d1 = (float) (d * 83.7);
                    result.setText(String.valueOf(d1));
                }
                else if(!t1.getText().isEmpty() && !t2.getText().isEmpty()){
                    float d2 = Float.parseFloat(t1.getText());
                    float d3 = (float) (d2/83.7);
                    float d = Float.parseFloat(t2.getText());
                    float d1 = (float) (d*83.7);

                    result.setText(String.valueOf("Dollar =" +d1+ "rupees=" ));
                }
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(result);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }
}

