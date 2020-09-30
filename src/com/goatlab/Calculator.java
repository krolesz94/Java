package com.goatlab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{

    // Variables declaration
    private javax.swing.JButton calc_Button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField p1_InValue_Field;
    private javax.swing.JLabel p1_Label;
    private javax.swing.JLabel p1_rc_Value_Label;
    private javax.swing.JTextField p2_InValue_Field;
    private javax.swing.JLabel p2_Label;
    private javax.swing.JLabel p2_rc_Value_Label;
    private javax.swing.JLabel rc_Label;
    private javax.swing.JTextField rc_Value_Field;
    private javax.swing.JLabel sum_Label;
    private javax.swing.JLabel sum_Value_Label;
    // End of variables declaration

    public void init(){
        jPanel1 = new javax.swing.JPanel();
        rc_Label = new javax.swing.JLabel();
        rc_Value_Field = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        p1_Label = new javax.swing.JLabel();
        p1_InValue_Field = new javax.swing.JTextField();
        p1_rc_Value_Label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        p2_Label = new javax.swing.JLabel();
        p2_InValue_Field = new javax.swing.JTextField();
        p2_rc_Value_Label = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        sum_Value_Label = new javax.swing.JLabel();
        sum_Label = new javax.swing.JLabel();
        calc_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rc_Label.setLabelFor(rc_Value_Field);
        rc_Label.setText("Rental Cost");

        rc_Value_Field.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rc_Label)
                                .addGap(18, 18, 18)
                                .addComponent(rc_Value_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rc_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(rc_Value_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        rc_Label.getAccessibleContext().setAccessibleName("rc_Label");
        rc_Value_Field.getAccessibleContext().setAccessibleName("rc_Value_Field");

        p1_Label.setLabelFor(p1_InValue_Field);
        p1_Label.setText("Payment 1");

        p1_InValue_Field.setText("");

        p1_rc_Value_Label.setText("");

        p2_Label.setLabelFor(p2_InValue_Field);
        p2_Label.setText("Payment 2");

        p2_InValue_Field.setText("");

        p2_rc_Value_Label.setText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(p2_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p2_InValue_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(p2_rc_Value_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(p2_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(p2_InValue_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(p2_rc_Value_Label))
                                .addContainerGap())
        );

        p2_Label.getAccessibleContext().setAccessibleName("p2_Label");
        p2_InValue_Field.getAccessibleContext().setAccessibleName("p2_InValue_Field");
        p2_rc_Value_Label.getAccessibleContext().setAccessibleName("p2_rc_Value_Label");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(p1_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p1_InValue_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(p1_rc_Value_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(p1_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(p1_InValue_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(p1_rc_Value_Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        p1_Label.getAccessibleContext().setAccessibleName("p1_Lable");
        p1_InValue_Field.getAccessibleContext().setAccessibleName("p1_InValue_Field");
        p1_rc_Value_Label.getAccessibleContext().setAccessibleName("p1_rc_Value_Label");

        sum_Value_Label.setText("Rental Cost");

        sum_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sum_Label.setLabelFor(sum_Value_Label);
        sum_Label.setText("Summary");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sum_Value_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(sum_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(210, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sum_Value_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(sum_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        sum_Value_Label.getAccessibleContext().setAccessibleName("sum_Value_Lable");
        sum_Label.getAccessibleContext().setAccessibleName("sum_Label");
        sum_Label.getAccessibleContext().setAccessibleDescription("");

        calc_Button.setText("Calculate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(calc_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calc_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    public Calculator() {

        this.init();
        this.setVisible(true);

        calc_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int rValue = Integer.parseInt(rc_Value_Field.getText());

                int p1Value = Integer.parseInt(p1_InValue_Field.getText());
                int p2Value = Integer.parseInt(p2_InValue_Field.getText());
                int sum = p1Value + p2Value;
                sum_Value_Label.setText(String.valueOf(sum));

                float p1Percentage = (float) p1Value / (float) sum;
                float r_p1_Percentage = rValue * p1Percentage;
                p1_rc_Value_Label.setText(String.valueOf(r_p1_Percentage));
                p1_rc_Value_Label.setToolTipText((p1Percentage * 100) + "%");

                float p2Percentage = (float) p2Value / (float) sum;
                float r_p2_Percentage = rValue * p2Percentage;
                p2_rc_Value_Label.setText(String.valueOf(r_p2_Percentage));
                p2_rc_Value_Label.setToolTipText((p2Percentage * 100) + "%");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Calculator f = new Calculator();
            }
        });
    }
}
