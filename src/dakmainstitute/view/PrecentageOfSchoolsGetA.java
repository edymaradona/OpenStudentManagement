/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.view;

import dakmainstitute.controller.TestMarksController;
import dakmainstitute.model.TestMarks;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shashi
 */
public class PrecentageOfSchoolsGetA extends javax.swing.JFrame {

    /**
     * Creates new form PrecentageOfSchoolsGetA
     */
    DefaultTableModel dtm;

    public PrecentageOfSchoolsGetA(String testId) {
        initComponents();
        testIdLabel.setText(testId);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        layerdChartLabel = new org.jdesktop.swingx.JXLabel();
        lineChartLabel = new org.jdesktop.swingx.JXLabel();
        marksRangeText = new javax.swing.JTextField();
        testIdLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        schoolsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        layerdChartLabel.setBackground(new java.awt.Color(255, 255, 255));
        layerdChartLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/templateRealAppWizBanner.png"))); // NOI18N
        layerdChartLabel.setText("View Layerd Chart");
        layerdChartLabel.setToolTipText("View layerd chart of student's marks avarage");
        layerdChartLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        layerdChartLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        layerdChartLabel.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);
        layerdChartLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        layerdChartLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                layerdChartLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                layerdChartLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                layerdChartLabelMouseExited(evt);
            }
        });

        lineChartLabel.setBackground(new java.awt.Color(255, 255, 255));
        lineChartLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\Image\\templateSharePointWizBanner.png")); // NOI18N
        lineChartLabel.setText(" View Line Chart");
        lineChartLabel.setToolTipText("View line chart of student's marks avarage");
        lineChartLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lineChartLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lineChartLabel.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);
        lineChartLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lineChartLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lineChartLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lineChartLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lineChartLabelMouseExited(evt);
            }
        });

        marksRangeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                marksRangeTextKeyPressed(evt);
            }
        });

        testIdLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(layerdChartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineChartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marksRangeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testIdLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(marksRangeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layerdChartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lineChartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        schoolsTable.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        schoolsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "School Name", "Student Count", "Average Marks", "Precentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        schoolsTable.setToolTipText("Student's marks details of get 'A'");
        schoolsTable.setAlignmentX(1.0F);
        schoolsTable.setAlignmentY(1.0F);
        schoolsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        schoolsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        schoolsTable.setRowHeight(20);
        schoolsTable.setRowMargin(5);
        schoolsTable.setSelectionBackground(new java.awt.Color(255, 153, 204));
        jScrollPane1.setViewportView(schoolsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void layerdChartLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_layerdChartLabelMouseClicked
    }//GEN-LAST:event_layerdChartLabelMouseClicked

    private void layerdChartLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_layerdChartLabelMouseEntered
        layerdChartLabel.setBackground(Color.CYAN);
    }//GEN-LAST:event_layerdChartLabelMouseEntered

    private void layerdChartLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_layerdChartLabelMouseExited
        layerdChartLabel.setBackground(Color.white);
    }//GEN-LAST:event_layerdChartLabelMouseExited

    private void lineChartLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineChartLabelMouseClicked
    }//GEN-LAST:event_lineChartLabelMouseClicked

    private void lineChartLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineChartLabelMouseEntered
        lineChartLabel.setBackground(Color.CYAN);
    }//GEN-LAST:event_lineChartLabelMouseEntered

    private void lineChartLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineChartLabelMouseExited
        lineChartLabel.setBackground(Color.white);
    }//GEN-LAST:event_lineChartLabelMouseExited

    private void marksRangeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marksRangeTextKeyPressed
        if (evt.getKeyCode() == 10) {
            dtm = (DefaultTableModel) schoolsTable.getModel();
            String range = marksRangeText.getText();
            ArrayList<TestMarks> schoolList = null;
            try {
                schoolList = TestMarksController.getPrecentageOfSchoolsGetA(testIdLabel.getText(), range);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ViewAvgChartForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            double allOfStudentsCount = 0;
            try {
                allOfStudentsCount = Integer.parseInt(TestMarksController.allOfStudentCountOfgetA(testIdLabel.getText(),marksRangeText.getText()));
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ViewRanges.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (TestMarks testMarks : schoolList) {

                double count = Double.parseDouble(testMarks.getCount());
                
                double precentage=(count/allOfStudentsCount)*100;
                
                double avg=Double.parseDouble(testMarks.getTotalMarks())/Double.parseDouble(testMarks.getCount());
                Object[] row = {testMarks.getStudent().getSchools().getSchoolName(), testMarks.getCount(),avg,precentage};
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_marksRangeTextKeyPressed

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
            java.util.logging.Logger.getLogger(PrecentageOfSchoolsGetA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrecentageOfSchoolsGetA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrecentageOfSchoolsGetA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrecentageOfSchoolsGetA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrecentageOfSchoolsGetA("").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel layerdChartLabel;
    private org.jdesktop.swingx.JXLabel lineChartLabel;
    private javax.swing.JTextField marksRangeText;
    private javax.swing.JTable schoolsTable;
    private javax.swing.JLabel testIdLabel;
    // End of variables declaration//GEN-END:variables
}
