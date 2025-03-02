/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Login;

import javax.swing.*;
import java.sql.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Loshana's PC
 */
public class Grade5 extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
        int m1,m2,m3,m4,m5,m6,sum,avge;


    /**
     * Creates new form Grade5
     */
    public Grade5() {
        initComponents();
        conn=JavaConnection.ConnecrDb();
        Update_table();
    }
    
    private void Update_table(){
    try
    {
    String sql="Select * from grade5";
    pst=conn.prepareStatement(sql);
    rs=pst.executeQuery();
    tablestudent.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
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
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtmaths = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtsinhala = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttamil = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtenglish = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtbuddhism = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtscience = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tot = new javax.swing.JTextField();
        avg = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        searchbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablestudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(25, 118, 218));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Id");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Name");

        txtmaths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmathsActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Maths");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sinhala");

        txtsinhala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsinhalaActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Tamil");

        txttamil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttamilActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("English");

        txtenglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenglishActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buddhism");

        txtbuddhism.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuddhismActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Science");

        txtscience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtscienceActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("X");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Average");

        tot.setEditable(false);
        tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totActionPerformed(evt);
            }
        });

        avg.setEditable(false);
        avg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avgActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total");

        searchbtn.setBackground(new java.awt.Color(255, 255, 255));
        searchbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(255, 255, 255));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(255, 255, 255));
        deletebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(255, 255, 255));
        updatebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        savebtn.setBackground(new java.awt.Color(255, 255, 255));
        savebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<---");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        tablestudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student_Id", "Student_Name", "Maths", "Sinhala", "Tamil", "English", "Buddhism", "Science"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablestudent);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(updatebtn)
                        .addGap(80, 80, 80)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(688, 688, 688)
                        .addComponent(clearbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                        .addComponent(txtmaths))
                                    .addComponent(txtsinhala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttamil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtenglish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbuddhism, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtscience, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(avg, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(txtid)
                                    .addComponent(tot))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14)
                        .addGap(743, 743, 743))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(799, 799, 799)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(649, 649, 649))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtmaths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtsinhala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txttamil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtenglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtbuddhism, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(txtscience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(avg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn)
                    .addComponent(updatebtn)
                    .addComponent(deletebtn)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtmathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmathsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmathsActionPerformed

    private void txtsinhalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsinhalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsinhalaActionPerformed

    private void txttamilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttamilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttamilActionPerformed

    private void txtenglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenglishActionPerformed

    private void txtbuddhismActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuddhismActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuddhismActionPerformed

    private void txtscienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtscienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtscienceActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

for(double i=0.0; i<=1.0; i=i+0.1){
        String val=i+"";
        float f= Float.valueOf(val);
        this.setOpacity(f);
        
        try{
        Thread.sleep(50);
        }
        catch(Exception e)
        {}
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
         String stuid=txtid.getText();
        String stuname=txtname.getText();
        int maths=Integer.parseInt(txtmaths.getText());
        int sinhala=Integer.parseInt(txtsinhala.getText());
        int english=Integer.parseInt(txtenglish.getText());
        int science=Integer.parseInt(txtscience.getText());
        int tamil=Integer.parseInt(txttamil.getText());
        int buddhism=Integer.parseInt(txtbuddhism.getText());
       
        
        try{
        m1=Integer.parseInt(this.txtmaths.getText());
        m2=Integer.parseInt(this.txtsinhala.getText());
        m3=Integer.parseInt(this.txtenglish.getText());
        m4=Integer.parseInt(this.txtscience.getText());
        m5=Integer.parseInt(this.txttamil.getText());
        m6=Integer.parseInt(this.txtbuddhism.getText());

        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(this,"Please enter number", "Error", ERROR_MESSAGE);
        }
        
        sum=m1+m2+m3+m4+m5+m6;
        avge=sum/6;
        
      
        
        tot.setText(String.valueOf(sum));
        avg.setText(String.valueOf(avge));
        
        
        
        
        //int sum=sinhala+maths+english+science+tamil+buddhism;
        //float avg = sum/6;
        
       // int sum = Integer.parseInt(tot.getText());
        //float avge =Integer.parseInt(avg.getText());
        
        try{
            String qry="Insert into grade5(Student_Id,Student_Name,Maths,Sinhala,Tamil,English,Buddhism,Science)"
            +"values('"+stuid+"','"+stuname+"','"+maths+"','"+sinhala+"','"+tamil+"','"+english+"','"+buddhism+"','"+science+"')";

            pst= conn.prepareStatement(qry);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record Successfully Added");
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();
        // TODO add your handling code here:
    }//GEN-LAST:event_savebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
try{
            String value1=txtid.getText();
            String value2=txtname.getText();
            String value3=txtsinhala.getText();
            String value4=txtmaths.getText();
            String value6=txtenglish.getText();
            String value8=txtscience.getText();
            String value9=txttamil.getText();
            String value10=txtbuddhism.getText();
            


            String sql="UPDATE grade5 set Student_Id='"+value1+"',Student_Name='"+value2+"',Maths='"+value4+"',Sinhala='"+value3+"',Tamil='"+value9+"',English='"+value6+"',Buddhism='"+value10+"',Science='"+value8+"'" +"Where Student_Id= '"+value1+"'";

            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Record is update");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        String sql="DELETE FROM grade5 WHERE Student_Id=?";

        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, txtid.getText());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Record is delete  ");
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();

        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        String id=txtid.getText();

        try{
            Statement s= conn.createStatement();
            rs=s.executeQuery("SELECT * FROM grade5 WHERE Student_Id="+id+"");
            while(rs.next()){
                String stuid=rs.getString("Student_id");
                String stuname=rs.getString("Student_Name");
                String stusi=rs.getString("Sinhala");
                String stum=rs.getString("Maths");
                String stue=rs.getString("English");
                String stusc=rs.getString("Science");
                String stut=rs.getString("Tamil");
                String stubu=rs.getString("Buddhism");
              

                txtid.setText(stuid);
                txtname.setText(stuname);
                txtsinhala.setText(stusi);
                txtmaths.setText(stum);
                txtenglish.setText(stue);
                txtscience.setText(stusc);
                txttamil.setText(stut);
                txtbuddhism.setText(stubu);
            }
        }
         catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error in search please contact system admin");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
         txtid.setText("");
        txtname.setText("");
        txtmaths.setText("");
        txtsinhala.setText("");
        txtenglish.setText("");
        txtbuddhism.setText("");
        txtscience.setText("");
        txttamil.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_clearbtnActionPerformed

    private void totActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totActionPerformed

    private void avgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avgActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        this.setVisible(false);
        this.dispose();
        Grades s=new Grades();
        s.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(Grade5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grade5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grade5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grade5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grade5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avg;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTable tablestudent;
    private javax.swing.JTextField tot;
    private javax.swing.JTextField txtbuddhism;
    private javax.swing.JTextField txtenglish;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmaths;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtscience;
    private javax.swing.JTextField txtsinhala;
    private javax.swing.JTextField txttamil;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
