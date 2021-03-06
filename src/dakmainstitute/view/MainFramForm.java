/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.view;

import dakmainstitute.view.managestudents.AddStudentForm;
import dakmainstitute.view.managestudents.ViewAllStudents;
import dakmainstitute.view.managetest.AddTest;
import dakmainstitute.view.managetest.AddTestMarks;
import dakmainstitute.view.managetest.viewTestMarks;

/**
 *
 * @author Shashi
 */
public class MainFramForm extends javax.swing.JFrame {

    /**
     * Creates new form MainFramForm
     */
    public MainFramForm() {
        initComponents();

        DesktopPane.repaint();
        DesktopPane.revalidate();

        DesktopPane.add(new defaultMainFrame()).setVisible(true);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addStudentButton = new javax.swing.JButton();
        addStudentButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        addStudentButton2 = new javax.swing.JButton();
        addStudentButton3 = new javax.swing.JButton();
        addStudentButton4 = new javax.swing.JButton();
        DesktopPane = new javax.swing.JDesktopPane();
        sendSMSButton = new javax.swing.JButton();
        markAttendenceButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        backupButton = new javax.swing.JButton();
        addAvarageChart = new javax.swing.JButton();
        viewRangesButton = new javax.swing.JButton();
        viewSchoolsAvarageButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        addSubjectButton1 = new javax.swing.JButton();
        addSchoolButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        addStudentButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addStudentButton.setIcon(new javax.swing.ImageIcon("F:\\NetBeans Project\\DekmaInstitute - Copy\\src\\dakmainstitute\\icon\\InstallTypeLogo.png")); // NOI18N
        addStudentButton.setText("Add New Student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        addStudentButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addStudentButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/search-icon.png"))); // NOI18N
        addStudentButton1.setText("Search Sutdents");
        addStudentButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addStudentButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addStudentButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        addStudentButton2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addStudentButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\Add\\add_list\\add_list-26.png")); // NOI18N
        addStudentButton2.setText("View Test Marks");
        addStudentButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButton2ActionPerformed(evt);
            }
        });

        addStudentButton3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addStudentButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\Add\\add_file\\add_file-26.png")); // NOI18N
        addStudentButton3.setText("Add New Test");
        addStudentButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButton3ActionPerformed(evt);
            }
        });

        addStudentButton4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addStudentButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\Add\\add_folder\\add_folder-26.png")); // NOI18N
        addStudentButton4.setText("Add Test Marks");
        addStudentButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStudentButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStudentButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addStudentButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addStudentButton2, addStudentButton3, addStudentButton4});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStudentButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(addStudentButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addStudentButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 320, 140));

        DesktopPane.setBackground(new java.awt.Color(202, 203, 255));

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        getContentPane().add(DesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 900, 740));

        sendSMSButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        sendSMSButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/iphone-26.png"))); // NOI18N
        sendSMSButton.setText("Send SMS");
        sendSMSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendSMSButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sendSMSButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 299, 33));

        markAttendenceButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        markAttendenceButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\Add\\add_list\\add_list-26.png")); // NOI18N
        markAttendenceButton.setText("Mark Attendance");
        markAttendenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markAttendenceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(markAttendenceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 299, 33));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        backupButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        backupButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\Image\\FileAssocLogo.png")); // NOI18N
        backupButton.setText("Backup");
        backupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupButtonActionPerformed(evt);
            }
        });

        addAvarageChart.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addAvarageChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/eventsWizBanner.png"))); // NOI18N
        addAvarageChart.setText("View Avarage's Chart");
        addAvarageChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAvarageChartActionPerformed(evt);
            }
        });

        viewRangesButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        viewRangesButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\Image\\FileAssocLogo.png")); // NOI18N
        viewRangesButton.setText("View Ranges");
        viewRangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRangesButtonActionPerformed(evt);
            }
        });

        viewSchoolsAvarageButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        viewSchoolsAvarageButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\Image\\FileAssocLogo.png")); // NOI18N
        viewSchoolsAvarageButton1.setText("View School's Avg");
        viewSchoolsAvarageButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSchoolsAvarageButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addAvarageChart, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewRangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewSchoolsAvarageButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addAvarageChart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewRangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewSchoolsAvarageButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 320, 240));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        addSubjectButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addSubjectButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\Image\\FileAssocLogo.png")); // NOI18N
        addSubjectButton1.setText("Add New Subject");
        addSubjectButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubjectButton1ActionPerformed(evt);
            }
        });

        addSchoolButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addSchoolButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/eventsWizBanner.png"))); // NOI18N
        addSchoolButton1.setText("Add New School");
        addSchoolButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSchoolButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addSchoolButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSubjectButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addSchoolButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSubjectButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 320, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shashi\\Desktop\\drops_of_water_3-wallpaper-1920x1080.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        DesktopPane.removeAll();
        DesktopPane.add(new AddStudentForm()).setVisible(true);
        DesktopPane.repaint();
        DesktopPane.revalidate();
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void addStudentButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButton1ActionPerformed
        DesktopPane.removeAll();
        new ViewAllStudents().setVisible(true);
        DesktopPane.repaint();
        DesktopPane.revalidate();

    }//GEN-LAST:event_addStudentButton1ActionPerformed

    private void sendSMSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendSMSButtonActionPerformed
        DesktopPane.removeAll();
        DesktopPane.add(new SMSForm(this, true)).setVisible(true);
        DesktopPane.repaint();
        DesktopPane.revalidate();
    }//GEN-LAST:event_sendSMSButtonActionPerformed

    private void markAttendenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markAttendenceButtonActionPerformed
        DesktopPane.removeAll();
        DesktopPane.add(new MarkAttendence()).setVisible(true);
        DesktopPane.repaint();
        DesktopPane.revalidate();
    }//GEN-LAST:event_markAttendenceButtonActionPerformed

    private void backupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupButtonActionPerformed
        DesktopPane.removeAll();
        new Backup().setVisible(true);
        DesktopPane.repaint();
        DesktopPane.revalidate();
    }//GEN-LAST:event_backupButtonActionPerformed

    private void addAvarageChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAvarageChartActionPerformed
        DesktopPane.removeAll();
        new AddSchoolForm().setVisible(true);
        DesktopPane.repaint();
        DesktopPane.revalidate();
    }//GEN-LAST:event_addAvarageChartActionPerformed

    private void addStudentButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButton2ActionPerformed
        DesktopPane.removeAll();
        new viewTestMarks().setVisible(true);
        DesktopPane.repaint();
        DesktopPane.revalidate();
    }//GEN-LAST:event_addStudentButton2ActionPerformed

    private void addStudentButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButton3ActionPerformed
        DesktopPane.removeAll();
        new AddTest().setVisible(true);
        DesktopPane.repaint();
        DesktopPane.revalidate();
    }//GEN-LAST:event_addStudentButton3ActionPerformed

    private void addStudentButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButton4ActionPerformed
        DesktopPane.removeAll();
        DesktopPane.add(new AddTestMarks()).setVisible(true);
        DesktopPane.repaint();
        DesktopPane.revalidate();
    }//GEN-LAST:event_addStudentButton4ActionPerformed

    private void addSubjectButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubjectButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSubjectButton1ActionPerformed

    private void addSchoolButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSchoolButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSchoolButton1ActionPerformed

    private void viewRangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRangesButtonActionPerformed
       DesktopPane.removeAll();
        DesktopPane.add(new ViewRanges(this, true)).setVisible(true);
        DesktopPane.repaint();
        DesktopPane.revalidate();
    }//GEN-LAST:event_viewRangesButtonActionPerformed

    private void viewSchoolsAvarageButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSchoolsAvarageButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewSchoolsAvarageButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFramForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFramForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFramForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFramForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFramForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JButton addAvarageChart;
    private javax.swing.JButton addSchoolButton1;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton addStudentButton1;
    private javax.swing.JButton addStudentButton2;
    private javax.swing.JButton addStudentButton3;
    private javax.swing.JButton addStudentButton4;
    private javax.swing.JButton addSubjectButton1;
    private javax.swing.JButton backupButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton markAttendenceButton;
    private javax.swing.JButton sendSMSButton;
    private javax.swing.JButton viewRangesButton;
    private javax.swing.JButton viewSchoolsAvarageButton1;
    // End of variables declaration//GEN-END:variables
}
