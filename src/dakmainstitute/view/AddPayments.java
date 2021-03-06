/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.view;

import dakmainstitute.controller.PaymentsController;
import dakmainstitute.model.Payments;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shashi
 */
public class AddPayments extends javax.swing.JDialog {

    /**
     * Creates new form AddPayments
     */
    DateFormat timeInstance;
    Date d;

    public AddPayments(java.awt.Frame parent, boolean modal, String index, String subject, String clz) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        indexNoText.setText(index);
        subjectText.setText(subject);
        classText.setText(clz);

        d = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM");
        String date = dateFormat.format(d);
        monthText.setText(date);
        timeInstance = DateFormat.getTimeInstance(DateFormat.SHORT);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentsButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new org.jdesktop.swingx.JXLabel();
        classLabel = new org.jdesktop.swingx.JXLabel();
        indexNoLabel1 = new org.jdesktop.swingx.JXLabel();
        monthText = new org.jdesktop.swingx.JXLabel();
        subjectText = new org.jdesktop.swingx.JXLabel();
        indexNoLabel = new org.jdesktop.swingx.JXLabel();
        indexNoText = new org.jdesktop.swingx.JXLabel();
        paymentsLabel = new org.jdesktop.swingx.JXLabel();
        yesRadioButton = new javax.swing.JRadioButton();
        noRadioButton = new javax.swing.JRadioButton();
        classLabel1 = new org.jdesktop.swingx.JXLabel();
        classText = new org.jdesktop.swingx.JXLabel();
        saveButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        titleLabel.setText("  Payments");
        titleLabel.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 480, -1));

        classLabel.setText("Month     :");
        classLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(classLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        indexNoLabel1.setText("Subject   :");
        indexNoLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(indexNoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        monthText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(monthText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 162, 23));

        subjectText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(subjectText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 162, 23));

        indexNoLabel.setText("Index No :");
        indexNoLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(indexNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        indexNoText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(indexNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 162, 23));

        paymentsLabel.setText("Payments:");
        paymentsLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(paymentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        paymentsButtonGroup.add(yesRadioButton);
        yesRadioButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        yesRadioButton.setSelected(true);
        yesRadioButton.setText("Yes");
        yesRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yesRadioButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yesRadioButtonKeyPressed(evt);
            }
        });
        jPanel1.add(yesRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 84, -1));

        paymentsButtonGroup.add(noRadioButton);
        noRadioButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        noRadioButton.setText("No");
        noRadioButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noRadioButtonKeyPressed(evt);
            }
        });
        jPanel1.add(noRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 84, -1));

        classLabel1.setText("Class :");
        classLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(classLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        classText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(classText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 122, 23));

        saveButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/Save-icon.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        saveButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                saveButtonKeyPressed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jButton2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/delete.png"))); // NOI18N
        jButton2.setText("Cancel");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, 57));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesRadioButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yesRadioButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            noRadioButton.requestFocus();
            noRadioButton.setSelected(true);
        }
        if (evt.getKeyCode() == 10) {
            saveButton.requestFocus();
        }
    }//GEN-LAST:event_yesRadioButtonKeyPressed

    private void noRadioButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noRadioButtonKeyPressed
        if (evt.getKeyCode() == 10) {
            saveButton.requestFocus();
        }
    }//GEN-LAST:event_noRadioButtonKeyPressed

    private void saveButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saveButtonKeyPressed
    }//GEN-LAST:event_saveButtonKeyPressed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String payment;
        if (yesRadioButton.isSelected()) {
            payment = "Yes";
        } else {
            payment = "No";
        }
        Payments payments = new Payments(monthText.getText(), indexNoText.getText(), classText.getText(), subjectText.getText(), payment + "");
        try {
            String pay = PaymentsController.searchPayments(indexNoText.getText(), monthText.getText());
            
            if (pay == null) {
                int res = PaymentsController.addPayments(payments);
                if (res > 0) {
                    if ("Yes".equals(payment)) {
                        JOptionPane.showMessageDialog(this, "Payments Added......");
                    } else if ("No".equals(payment)) {
                        JOptionPane.showMessageDialog(this, "Tell him to do payments next week..");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Payments Added fail....");
                }
            } else if ("No".equals(pay)) {
                int res = PaymentsController.updatePayments(payments);
                if (res > 0) {
                    JOptionPane.showMessageDialog(this, "Payments added.....");
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddPayments.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddPayments dialog = new AddPayments(new javax.swing.JFrame(), true, "", "", "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel classLabel;
    private org.jdesktop.swingx.JXLabel classLabel1;
    private org.jdesktop.swingx.JXLabel classText;
    private org.jdesktop.swingx.JXLabel indexNoLabel;
    private org.jdesktop.swingx.JXLabel indexNoLabel1;
    private org.jdesktop.swingx.JXLabel indexNoText;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXLabel monthText;
    private javax.swing.JRadioButton noRadioButton;
    private javax.swing.ButtonGroup paymentsButtonGroup;
    private org.jdesktop.swingx.JXLabel paymentsLabel;
    private javax.swing.JButton saveButton;
    private org.jdesktop.swingx.JXLabel subjectText;
    private org.jdesktop.swingx.JXLabel titleLabel;
    private javax.swing.JRadioButton yesRadioButton;
    // End of variables declaration//GEN-END:variables
}
