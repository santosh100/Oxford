/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject1;

import static MyProject1.MyLogin.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SANTOSH
 */
public class RegisteredDetail extends javax.swing.JFrame {
        
        PreparedStatement pstmt;
        ResultSet rs1_tab1;
    
    /**
     * Creates new form FeeDetail
     */
    public RegisteredDetail() {        
        pstmt=null;
        rs1_tab1=null;    
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();    
        
        this.setLocationRelativeTo(null);
        Calendar calendar = Calendar.getInstance();
     
        YearChooser.setEndYear(calendar.get(Calendar.YEAR)); //will set current year as end year
        YearChooser.setValue(calendar.get(Calendar.YEAR));  //will set only value to be visibled
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        YearChooser = new com.toedter.calendar.JYearChooser();
        ok1Button = new javax.swing.JButton();
        yrtotLabel1 = new javax.swing.JLabel();
        yrtotLabel2 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        ok2Button = new javax.swing.JButton();
        dttotLabel1 = new javax.swing.JLabel();
        dttotLabel2 = new javax.swing.JLabel();
        dtregLabel1 = new javax.swing.JLabel();
        dtregLabel2 = new javax.swing.JLabel();
        dtunregLabel1 = new javax.swing.JLabel();
        dtunregLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        refreshLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        msgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        Table.setBackground(new java.awt.Color(0, 0, 102));
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FORM NO", "ID", "FIRST NAME", "LAST NAME", "FATHER'S NAME", "ADDRESS", "DATE"
            }
        ));
        Table.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(Table);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose Year to See Detail :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        YearChooser.setBackground(new java.awt.Color(0, 0, 102));
        YearChooser.setStartYear(2011);
        jPanel1.add(YearChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 41, 118, 51));

        ok1Button.setBackground(new java.awt.Color(0, 51, 204));
        ok1Button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ok1Button.setForeground(new java.awt.Color(255, 255, 255));
        ok1Button.setText("OK");
        ok1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok1ButtonMouseClicked(evt);
            }
        });
        jPanel1.add(ok1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 55, -1, -1));

        yrtotLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        yrtotLabel1.setForeground(new java.awt.Color(255, 255, 255));
        yrtotLabel1.setText("Total :");
        yrtotLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(yrtotLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        yrtotLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        yrtotLabel2.setForeground(new java.awt.Color(255, 255, 255));
        yrtotLabel2.setText("0");
        jPanel1.add(yrtotLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 70, -1));

        idLabel.setBackground(new java.awt.Color(0, 51, 204));
        idLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("Order By ID");
        idLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        idLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                idLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                idLabelMouseExited(evt);
            }
        });
        jPanel1.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));

        nameLabel.setBackground(new java.awt.Color(0, 51, 204));
        nameLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Order By Name");
        nameLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameLabelMouseExited(evt);
            }
        });
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, -1));

        dateLabel.setBackground(new java.awt.Color(0, 51, 204));
        dateLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Order By Date");
        dateLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dateLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dateLabelMouseExited(evt);
            }
        });
        jPanel1.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose Date to See Detail :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        DateChooser.setBackground(new java.awt.Color(0, 0, 102));
        DateChooser.setForeground(new java.awt.Color(255, 255, 255));
        DateChooser.setDateFormatString(" d MMM, yyyy");
        DateChooser.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        DateChooser.setMaxSelectableDate(new java.util.Date(253370748660000L));
        DateChooser.setMinSelectableDate(new java.util.Date(1293823860000L));
        jPanel2.add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 41, 120, 52));

        ok2Button.setBackground(new java.awt.Color(0, 51, 204));
        ok2Button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ok2Button.setForeground(new java.awt.Color(255, 255, 255));
        ok2Button.setText("OK");
        ok2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok2ButtonMouseClicked(evt);
            }
        });
        jPanel2.add(ok2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 56, -1, -1));

        dttotLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        dttotLabel1.setForeground(new java.awt.Color(255, 255, 255));
        dttotLabel1.setText("Total :");
        dttotLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(dttotLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));

        dttotLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        dttotLabel2.setForeground(new java.awt.Color(255, 255, 255));
        dttotLabel2.setText("0");
        jPanel2.add(dttotLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 70, -1));

        dtregLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        dtregLabel1.setForeground(new java.awt.Color(255, 255, 255));
        dtregLabel1.setText("Registerd :");
        dtregLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(dtregLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        dtregLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        dtregLabel2.setForeground(new java.awt.Color(255, 255, 255));
        dtregLabel2.setText("0");
        jPanel2.add(dtregLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, -1));

        dtunregLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        dtunregLabel1.setForeground(new java.awt.Color(255, 255, 255));
        dtunregLabel1.setText("Unregistered :");
        dtunregLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(dtunregLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, -1));

        dtunregLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        dtunregLabel2.setForeground(new java.awt.Color(255, 255, 255));
        dtunregLabel2.setText("0");
        jPanel2.add(dtunregLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 70, -1));

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));

        backButton.setBackground(new java.awt.Color(0, 51, 204));
        backButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(backButton)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registration DETAIL");

        refreshLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        refreshLabel.setForeground(new java.awt.Color(255, 255, 255));
        refreshLabel.setText("Refresh");
        refreshLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(370, 370, 370)
                .addComponent(refreshLabel)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(refreshLabel)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 102));

        msgLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        msgLabel.setForeground(new java.awt.Color(255, 255, 255));
        msgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(msgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*************************************************************************************/
    private int showDetail(String cname,String cvalue,String order){
        rs1_tab1=null;   
        int tot=0;
     //   String yr=""+YearChooser.getYear();
  //      msgLabel.setText("LIST OF REGISTERED STUDENTS IN THE YEAR : "+yr);
        try{
            if(order.equalsIgnoreCase("FIRST_NAME")){
                pstmt=con.prepareStatement("select FORM_NO,S_ID,FIRST_NAME,LAST_NAME,FATHER_NAME,ADDRESS,REGD_DATE from ADMISSION_TABLE where "+cname+"=? and S_ID !='-' order by "+order+",LAST_NAME",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);        
            }
            else
                pstmt=con.prepareStatement("select FORM_NO,S_ID,FIRST_NAME,LAST_NAME,FATHER_NAME,ADDRESS,REGD_DATE from ADMISSION_TABLE where "+cname+"=? and S_ID !='-' order by "+order+"",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);              
                pstmt.setString(1, cvalue);       
                rs1_tab1=pstmt.executeQuery();
                pstmt.clearParameters();                 
           
            DefaultTableModel tm=(DefaultTableModel)Table.getModel();        
            while(true)
                {
                    int c=tm.getRowCount();
                    if(c==0)
                        break;
                    else
                         tm.removeRow(0);
                }
            tot=0;
            while(rs1_tab1.next()){
                tot++;                                                
                    Object kk[]={rs1_tab1.getString("FORM_NO"),rs1_tab1.getString("S_ID"),rs1_tab1.getString("FIRST_NAME"),rs1_tab1.getString("LAST_NAME"),rs1_tab1.getString("FATHER_NAME"),rs1_tab1.getString("ADDRESS"),rs1_tab1.getString("REGD_DATE")};
                    tm.addRow(kk);                 
            }
       //     yrtotLabel2.setText(""+tot);     
      // return tot;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Entry (year/date) ", "Admission", JOptionPane.ERROR_MESSAGE);
            System.out.println("Problem inside showDetail "+e);
        }
        return tot;
    }
    
    private void ok1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok1ButtonMouseClicked
        // TODO add your handling code here:
        rs1_tab1=null;   
        int tot=0;
        String yr=""+YearChooser.getYear();
        msgLabel.setText("LIST OF REGISTERED STUDENTS IN THE YEAR : "+yr);
        tot=showDetail("A_YEAR",yr,"FORM_NO");
        yrtotLabel2.setText(""+tot); 
  /*      try{
            pstmt=con.prepareStatement("select FORM_NO,S_ID,FIRST_NAME,LAST_NAME,FATHER_NAME,ADDRESS,REGD_DATE from ADMISSION_TABLE where A_YEAR=? and S_ID !='-' order by S_ID",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);        
              pstmt.setString(1, yr);       
            rs1_tab1=pstmt.executeQuery();
            pstmt.clearParameters();                 
           
            DefaultTableModel tm=(DefaultTableModel)Table.getModel();        
            while(true)
                {
                    int c=tm.getRowCount();
                    if(c==0)
                        break;
                    else
                         tm.removeRow(0);
                }
            int tot=0;
            while(rs1_tab1.next()){
                tot++;                                                
                    Object kk[]={rs1_tab1.getString("FORM_NO"),rs1_tab1.getString("FIRST_NAME"),rs1_tab1.getString("LAST_NAME"),rs1_tab1.getString("FATHER_NAME"),rs1_tab1.getString("ADDRESS"),rs1_tab1.getString("REGD_DATE")};
                    tm.addRow(kk);                 
            }
            yrtotLabel2.setText(""+tot);                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter Valid Year", "Admission", JOptionPane.ERROR_MESSAGE);
            System.out.println("Problem inside ok1Button"+e);
        }        */        
    }//GEN-LAST:event_ok1ButtonMouseClicked

    private void ok2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok2ButtonMouseClicked
        // TODO add your handling code here:        
        rs1_tab1=null; 
        int tot=0;
        String dt="";
        DateFormat df;
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);	                
            dt=df.format(DateChooser.getDate());
            msgLabel.setText("LIST OF REGISTERED STUDENTS ON :"+dt);
            tot=showDetail("REGD_DATE",dt,"FORM_NO");            
            dttotLabel2.setText(""+tot);
    /*    try{
            Date date = new Date();
		DateFormat df;
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);	
                
            dt=df.format(DateChooser.getDate());
            msgLabel.setText("LIST OF REGISTERED STUDENTS ON :"+dt);
            
            pstmt=con.prepareStatement("select FORM_NO,S_ID,FIRST_NAME,LAST_NAME,FATHER_NAME,ADDRESS,REGD_DATE from ADMISSION_TABLE where REGD_DATE = ? and S_ID !='-' order by REGD_DATE",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);            
            pstmt.setString(1, dt);                   
            rs1_tab1=pstmt.executeQuery();
            pstmt.clearParameters();

            DefaultTableModel tm=(DefaultTableModel)Table.getModel();        
            while(true)
                {
                    int c=tm.getRowCount();
                    if(c==0)
                        break;
                    else
                         tm.removeRow(0);
                }
            int tot=0;
            while(rs1_tab1.next()){
                    tot++;                                                          
                    Object kk[]={rs1_tab1.getString("FORM_NO"),rs1_tab1.getString("FIRST_NAME"),rs1_tab1.getString("LAST_NAME"),rs1_tab1.getString("FATHER_NAME"),rs1_tab1.getString("ADDRESS"),rs1_tab1.getString("REGD_DATE")};
                    tm.addRow(kk);                                        
            }            
            dttotLabel2.setText(""+tot);                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Enter Valid Date", "Admission", JOptionPane.ERROR_MESSAGE);
            System.out.println("Problem inside ok2Button"+e);
        }  */       
    }//GEN-LAST:event_ok2ButtonMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MainPage ob=new MainPage();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void idLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idLabelMouseClicked
        // TODO add your handling code here:
        String yr=""+YearChooser.getYear();
        int tot=showDetail("A_YEAR",yr,"S_ID");
        yrtotLabel2.setText(""+tot);
    }//GEN-LAST:event_idLabelMouseClicked

    private void nameLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseClicked
        // TODO add your handling code here:
        try{
            String yr=""+YearChooser.getYear();
            int tot=showDetail("A_YEAR",yr,"FIRST_NAME");
            yrtotLabel2.setText(""+tot);
        }catch(Exception e){            
        }
    }//GEN-LAST:event_nameLabelMouseClicked

    private void nameLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseEntered
        // TODO add your handling code here:
      //  nameLabel.setBackground(new java.awt.Color(0, 51, 204));
        nameLabel.setOpaque(true);
        nameLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_nameLabelMouseEntered

    private void nameLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseExited
        // TODO add your handling code here:
      //  nameLabel.setBackground(new java.awt.Color(0, 51, 204));
        nameLabel.setOpaque(false);
        nameLabel.setBorder(null);
    }//GEN-LAST:event_nameLabelMouseExited

    private void idLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idLabelMouseEntered
        // TODO add your handling code here:
        idLabel.setOpaque(true);
        idLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_idLabelMouseEntered

    private void idLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idLabelMouseExited
        // TODO add your handling code here:
        idLabel.setOpaque(false);
        idLabel.setBorder(null);
    }//GEN-LAST:event_idLabelMouseExited

    private void dateLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateLabelMouseClicked
        // TODO add your handling code here:
        try{
            String yr=""+YearChooser.getYear();
            int tot=showDetail("A_YEAR",yr,"REGD_DATE");
            yrtotLabel2.setText(""+tot);
        }catch(Exception e){            
        }
    }//GEN-LAST:event_dateLabelMouseClicked

    private void dateLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateLabelMouseEntered
        // TODO add your handling code here:
        dateLabel.setOpaque(true);
        dateLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_dateLabelMouseEntered

    private void dateLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateLabelMouseExited
        // TODO add your handling code here:
        dateLabel.setOpaque(false);
        dateLabel.setBorder(null);
    }//GEN-LAST:event_dateLabelMouseExited

    private void refreshLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshLabelMouseClicked
        RegisteredDetail ob=new RegisteredDetail();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_refreshLabelMouseClicked

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
            java.util.logging.Logger.getLogger(RegisteredDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisteredDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisteredDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisteredDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisteredDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTable Table;
    private com.toedter.calendar.JYearChooser YearChooser;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dtregLabel1;
    private javax.swing.JLabel dtregLabel2;
    private javax.swing.JLabel dttotLabel1;
    private javax.swing.JLabel dttotLabel2;
    private javax.swing.JLabel dtunregLabel1;
    private javax.swing.JLabel dtunregLabel2;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton ok1Button;
    private javax.swing.JButton ok2Button;
    private javax.swing.JLabel refreshLabel;
    private javax.swing.JLabel yrtotLabel1;
    private javax.swing.JLabel yrtotLabel2;
    // End of variables declaration//GEN-END:variables
}
