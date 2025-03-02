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
public class Grade10 extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
            int m1,m2,m3,m4,m5,m6,m7,m8,sum,avge;

    /**
     * Creates new form Grade10
     */
    public Grade10() {
        initComponents();
        
         conn=JavaConnection.ConnecrDb();
        Update_table();
    }
    
    private void Update_table(){
    try
    {
    String sql="Select * from grade10";
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
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmaths = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsinhala = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtenglish = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtbuddhism = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtscience = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablestudent = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        tot = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        avg = new javax.swing.JTextField();
        c3m = new javax.swing.JTextField();
        c1m = new javax.swing.JTextField();
        c2m = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        clearbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 118, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 180, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Maths");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtmaths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmathsActionPerformed(evt);
            }
        });
        jPanel1.add(txtmaths, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sinhala");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtsinhala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsinhalaActionPerformed(evt);
            }
        });
        jPanel1.add(txtsinhala, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtenglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenglishActionPerformed(evt);
            }
        });
        jPanel1.add(txtenglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("English");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtbuddhism.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuddhismActionPerformed(evt);
            }
        });
        jPanel1.add(txtbuddhism, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 180, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buddhism");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Science");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtscience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtscienceActionPerformed(evt);
            }
        });
        jPanel1.add(txtscience, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 180, -1));

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
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 30, 30));

        updatebtn.setBackground(new java.awt.Color(255, 255, 255));
        updatebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, -1, -1));

        deletebtn.setBackground(new java.awt.Color(255, 255, 255));
        deletebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, 77, -1));

        savebtn.setBackground(new java.awt.Color(255, 255, 255));
        savebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        jPanel1.add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, 77, -1));

        searchbtn.setBackground(new java.awt.Color(255, 255, 255));
        searchbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, 77, -1));

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, 77, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Category I");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Category II");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Category III");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        tablestudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablestudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student_Id", "Maths", "Sinhala", "Buddhism", "English", "Science", "CategoryI", "CategortII", "CategoryIII"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablestudent);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 11, 673, 384));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        tot.setEditable(false);
        tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totActionPerformed(evt);
            }
        });
        jPanel1.add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 180, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Average");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        avg.setEditable(false);
        avg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avgActionPerformed(evt);
            }
        });
        jPanel1.add(avg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 180, -1));
        jPanel1.add(c3m, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 180, -1));
        jPanel1.add(c1m, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 180, -1));
        jPanel1.add(c2m, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 180, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<---");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        clearbtn1.setBackground(new java.awt.Color(255, 255, 255));
        clearbtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearbtn1.setText("Clear");
        clearbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 77, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

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
        int maths=Integer.parseInt(txtmaths.getText());
        int sinhala=Integer.parseInt(txtsinhala.getText());
        int english=Integer.parseInt(txtenglish.getText());
        int Buddhism=Integer.parseInt(txtbuddhism.getText());
        int science=Integer.parseInt(txtscience.getText());
         int cm=Integer.parseInt(c1m.getText());
        int cm2=Integer.parseInt(c2m.getText());
        int cm3=Integer.parseInt(c3m.getText());
  
         try{
        m1=Integer.parseInt(this.txtmaths.getText());
        m2=Integer.parseInt(this.txtsinhala.getText());
        m3=Integer.parseInt(this.txtenglish.getText());
        m4=Integer.parseInt(this.txtscience.getText());
        m5=Integer.parseInt(this.c1m.getText());
        m6=Integer.parseInt(this.txtbuddhism.getText());
        m7=Integer.parseInt(this.c2m.getText());
        m8=Integer.parseInt(this.c3m.getText());
        
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(this,"Please enter number", "Error", ERROR_MESSAGE);
        }
        
        sum=m1+m2+m3+m4+m5+m6+m7+m8;
        avge=sum/8;
        
      
        
        tot.setText(String.valueOf(sum));
        avg.setText(String.valueOf(avge));
            
        try{
            String qry="Insert into grade10(Student_id,Maths,Sinhala,English,Buddhism,Science,CategoryI,CategoryII,CategoryIII)"
            +"values('"+stuid+"','"+maths+"','"+sinhala+"','"+english+"','"+Buddhism+"','"+science+"','"+cm+"','"+cm2+"','"+cm3+"')";

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
            String value3=txtmaths.getText();
            String value4=txtsinhala.getText();
            String value5=txtenglish.getText();
            String value6=txtbuddhism.getText();
            String value7=txtscience.getText();
            String value8=c1m.getText();
            String value9=c2m.getText();
            String value10=c3m.getText();


            String sql="UPDATE grade10 set Student_Id='"+value1+"',Maths='"+value3+"',Sinhala='"+value4+"',English='"+value5+"',Buddhism='"+value6+"',Science='"+value7+"',CategoryI='"+value8+"',CategoryII='"+value9+"',CategoryIII='"+value10+"'" +"Where Student_id= '"+value1+"'";

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
        String sql="DELETE FROM grade10 WHERE Student_id=?";

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
            rs=s.executeQuery("SELECT * FROM grade10 WHERE Student_id="+id+"");
            while(rs.next()){
                String stuid=rs.getString("Student_id");
                String stun=rs.getString("Maths");
                String stusi=rs.getString("Sinhala");
                String stue=rs.getString("English");
                String stub=rs.getString("Buddhism");
                String stusc=rs.getString("Science");
                String cm=rs.getString("CategoryI");
                String cm2=rs.getString("CategoryII");
                String cm3=rs.getString("CategoryIII");
                

                txtid.setText(stuid);
                txtmaths.setText(stun);
                txtsinhala.setText(stusi);
                txtenglish.setText(stue);
                txtbuddhism.setText(stub);
                txtscience.setText(stusc);
                c1m.setText(cm);
                c2m.setText(cm2);
                c3m.setText(cm3);
              
                
            }

        }

        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error in search please contact system admin");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_exitbtnActionPerformed

    private void totActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totActionPerformed

    private void avgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avgActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

        this.setVisible(false);
        this.dispose();
        Grades s=new Grades();
        s.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void clearbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtn1ActionPerformed
        txtid.setText("");
        txtname.setText("");
        txtmaths.setText("");
        txtsinhala.setText("");
        txtenglish.setText("");
        txtbuddhism.setText("");
        txtscience.setText("");
        
        c1m.setText("");
        c2m.setText("");
        c3m.setText("");
        
// TODO add your handling code here:
    }//GEN-LAST:event_clearbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Grade10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grade10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grade10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grade10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grade10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avg;
    private javax.swing.JTextField c1m;
    private javax.swing.JTextField c2m;
    private javax.swing.JTextField c3m;
    private javax.swing.JButton clearbtn1;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
