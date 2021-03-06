/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject1;

import java.util.Calendar;
import javax.swing.JFrame;

/**
 *
 * @author SANTOSH
 */
public class AdminControl extends javax.swing.JFrame {
    
    public static int year=0;
     
    /**
     * Creates new form AdminControl
     */
    public AdminControl() {               
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        this.setLocationRelativeTo(null);
        Calendar calendar = Calendar.getInstance();
     
        jYearChooser1.setEndYear(calendar.get(Calendar.YEAR)); //will set current year as end year
        jYearChooser1.setValue(calendar.get(Calendar.YEAR));  //will set only value to be visibled
        
     //   if(MainPage.option!=4){          
            grandTotalButton.setVisible(false);
     //   }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j2011Button = new javax.swing.JButton();
        j2012Button = new javax.swing.JButton();
        j2013Button = new javax.swing.JButton();
        j2014Button = new javax.swing.JButton();
        j2015Button = new javax.swing.JButton();
        j2016Button = new javax.swing.JButton();
        j2017Button = new javax.swing.JButton();
        grandTotalButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        OKButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        j2011Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProject1/icons/2011.png"))); // NOI18N
        j2011Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2011ButtonActionPerformed(evt);
            }
        });

        j2012Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProject1/icons/2012.png"))); // NOI18N
        j2012Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2012ButtonActionPerformed(evt);
            }
        });

        j2013Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProject1/icons/2013.png"))); // NOI18N
        j2013Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2013ButtonActionPerformed(evt);
            }
        });

        j2014Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProject1/icons/2014.png"))); // NOI18N
        j2014Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2014ButtonActionPerformed(evt);
            }
        });

        j2015Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProject1/icons/2015.png"))); // NOI18N
        j2015Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2015ButtonActionPerformed(evt);
            }
        });

        j2016Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProject1/icons/2016.png"))); // NOI18N
        j2016Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2016ButtonActionPerformed(evt);
            }
        });

        j2017Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProject1/icons/2017.png"))); // NOI18N
        j2017Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2017ButtonActionPerformed(evt);
            }
        });

        grandTotalButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProject1/icons/GRAND_TOTAL.png"))); // NOI18N
        grandTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grandTotalButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1380, 100));

        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        mainMenuButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mainMenuButton.setText("MAIN MENU");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainMenuButton)
                .addGap(113, 113, 113))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(mainMenuButton))
                .addGap(44, 44, 44))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("OR");

        jYearChooser1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jYearChooser1.setStartYear(2011);

        OKButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        OKButton.setText("OK");
        OKButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(j2011Button)
                        .addGap(87, 87, 87)
                        .addComponent(j2012Button))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(j2016Button)
                        .addGap(87, 87, 87)
                        .addComponent(j2017Button)))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j2013Button)
                    .addComponent(grandTotalButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(j2014Button)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j2015Button))
                .addGap(0, 123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j2011Button)
                    .addComponent(j2012Button)
                    .addComponent(j2013Button)
                    .addComponent(j2014Button)
                    .addComponent(j2015Button))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(j2016Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(j2017Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grandTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void pageSelection(){
        if(MainPage.option==3&&Password.del.equals("Unregistered")){            
                Delete ob=new Delete();
                ob.setVisible(true);
                this.setVisible(false);            
        }else{
            if(MainPage.option==1){
                Admission ob=new Admission();
                ob.setVisible(true);
                this.setVisible(false);
            }   
            else{
                Section ob=new Section();
                ob.setVisible(true);
                this.setVisible(false);
            }
        }       
    } 
    
    private void j2011ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2011ButtonActionPerformed
        // TODO add your handling code here:
        j2011Button.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));        
        year=2011;
        pageSelection();           
    }//GEN-LAST:event_j2011ButtonActionPerformed

    private void j2012ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2012ButtonActionPerformed
        // TODO add your handling code here:
        j2012Button.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        year=2012;
        pageSelection();
    }//GEN-LAST:event_j2012ButtonActionPerformed

    private void j2013ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2013ButtonActionPerformed
        // TODO add your handling code here:
        j2013Button.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        year=2013;
        pageSelection();
    }//GEN-LAST:event_j2013ButtonActionPerformed

    private void j2014ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2014ButtonActionPerformed
        // TODO add your handling code here:
        j2014Button.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        year=2014;
        pageSelection();
    }//GEN-LAST:event_j2014ButtonActionPerformed

    private void j2015ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2015ButtonActionPerformed
        // TODO add your handling code here:
        j2015Button.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        year=2015;
        pageSelection();
    }//GEN-LAST:event_j2015ButtonActionPerformed

    private void j2016ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2016ButtonActionPerformed
        // TODO add your handling code here:
        j2016Button.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        year=2016;
        pageSelection();
    }//GEN-LAST:event_j2016ButtonActionPerformed

    private void j2017ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2017ButtonActionPerformed
        // TODO add your handling code here:
        j2017Button.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        year=2017;
        pageSelection();
    }//GEN-LAST:event_j2017ButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            year=0;
            MainPage mainpage=new MainPage();
            mainpage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // TODO add your handling code here:
        mainMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            year=0;
            MainPage mainpage=new MainPage();
            mainpage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        // TODO add your handling code here:
        OKButton.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        year=jYearChooser1.getYear();   
        pageSelection();
    }//GEN-LAST:event_OKButtonActionPerformed

    private void grandTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grandTotalButtonActionPerformed
        // TODO add your handling code here:
        grandTotalButton.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        GrandTotal grandtotal=new GrandTotal();
        grandtotal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_grandTotalButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton grandTotalButton;
    private javax.swing.JButton j2011Button;
    private javax.swing.JButton j2012Button;
    private javax.swing.JButton j2013Button;
    private javax.swing.JButton j2014Button;
    private javax.swing.JButton j2015Button;
    private javax.swing.JButton j2016Button;
    private javax.swing.JButton j2017Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JButton mainMenuButton;
    // End of variables declaration//GEN-END:variables
}
