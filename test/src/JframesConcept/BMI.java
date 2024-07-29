package JframesConcept;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BMI {
    public static void main(String[] args) {
        System.out.println("jframe is used to build gui in Java application");
        JFrame jframe = new JFrame("BMI Calculator");

        //to get input from user JTextField
        // to display any msg we use Jlabel
        // to perform any action by click on the button JButton

        JLabel userWeightLabel = new JLabel("Enter your weight in kgs");
        userWeightLabel.setBounds(40, 40, 200, 40);

        JTextField userWeighttexField = new JTextField();
        userWeighttexField.setBounds(250,40,40,40);
        
        JLabel userHeightLabel = new JLabel("Enter your height in mtrs");
        userHeightLabel.setBounds(40, 100, 200, 40);

        JTextField userHeightTextField = new JTextField();
        userHeightTextField.setBounds(250, 100, 60, 40);

        JButton calculate = new JButton("Calculate BMI");
        calculate.setBounds(200,250,150,50);

        //JLabel cacll1 = new JLabel();
        // calcl1.setBounds(130, 100, 200, 40);
        JLabel j1 = new JLabel();
        j1.setBounds(50, 160, 200, 40);

        //to click on the button
        calculate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userWeighttexField.getText().isEmpty() || userHeightTextField.getText().isEmpty()){
                    j1.setText("Please enter both values");
                }
                else{   
                float weight = Float.parseFloat(userWeighttexField.getText().toString());
                float height = Float.parseFloat(userHeightTextField.getText().toString());
                float value = weight/(height*height);
                //for Adding color to the BMI Index
                j1.setBackground(Color.MAGENTA);
                j1.setForeground(Color.MAGENTA);
                j1.setText(String.valueOf(value));
                }
    }});
                //add these objects with frame
                jframe.add(userWeightLabel);
                jframe.add(userWeighttexField);
                jframe.add(userHeightLabel);
                jframe.add(userHeightTextField);
                jframe.add(calculate);
                jframe.add(j1);

                //to use the default layout
                jframe.setLayout(null);
                //to add the size in frame
                jframe.setSize(500,500);
                //to set the visible frame
                jframe.setVisible(true);
        }            
    }
