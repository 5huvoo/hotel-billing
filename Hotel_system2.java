/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hote_managementl_system2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mollik
 */
public class Hotel_system2 extends javax.swing.JFrame {
    private int SingleRoom;
   /* private Object jTextCustomerRef;
    private Object jTextLastName;
    private Object jTextPresentAddress;
    private Object jTextPostCode;
    private Object jTextMobileNo;
    private Object jTextEmail;
    private Object jLocaleChooser;
    private Object jDateChooser1;
    private Object jDateChooser2;
    private Object jDateChooser3;
    private Object jComboBoxId;
    private Object jComboBoxGeder;
    private Object jComboBoxMeal;
    private Object jComboBoxRoomtype;
    private Object jComboBoxRoomNo;
    private Object jComboBoxExtNo;
    */

    /**
     * Creates new form Hotel_system2
     */
    public Hotel_system2() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextCustomerRef = new javax.swing.JTextField();
        jTextFirstName = new javax.swing.JTextField();
        jTextPresentAddress = new javax.swing.JTextField();
        jTextLastName = new javax.swing.JTextField();
        jTextPostCode = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextMobileNo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxMeal = new javax.swing.JComboBox();
        jComboBoxId = new javax.swing.JComboBox();
        jComboBoxExtNo = new javax.swing.JComboBox();
        jComboBoxRoomtype = new javax.swing.JComboBox();
        jComboBoxRoomNo = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jComboBoxGeder = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextTax = new javax.swing.JTextField();
        jTextSubTotal = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jbtnexit = new javax.swing.JButton();
        jButtonTotalCoast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLocaleChooser = new com.toedter.components.JLocaleChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Firstname");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Lastname");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Customer_Ref");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Post Code");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Present Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Nationality");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Customer Mobile No");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Id Type");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Gender");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Meal");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 50, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Date Of Birth");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jTextCustomerRef.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextCustomerRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, -1));

        jTextFirstName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 110, -1));

        jTextPresentAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextPresentAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 110, -1));

        jTextLastName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, -1));

        jTextPostCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, -1));

        jTextEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, -1));

        jTextMobileNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 110, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Check In Date");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Room No");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Room Type");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Room Ext. No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jComboBoxMeal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxMeal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        getContentPane().add(jComboBoxMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 110, -1));

        jComboBoxId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Driving Licence", "Passport", "Student Id", "Other" }));
        jComboBoxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIdActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 110, -1));

        jComboBoxExtNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxExtNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "04", "05" }));
        getContentPane().add(jComboBoxExtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 110, -1));

        jComboBoxRoomtype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxRoomtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Double", "Family" }));
        getContentPane().add(jComboBoxRoomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 110, -1));

        jComboBoxRoomNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxRoomNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "101", "102", "103", "104", "104", "105" }));
        getContentPane().add(jComboBoxRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 110, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Check Out Date");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jComboBoxGeder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxGeder.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(jComboBoxGeder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 110, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Tax");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("SubTotal");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Total");

        jTextTax.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jTextSubTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSubTotalActionPerformed(evt);
            }
        });

        jTextFieldTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        jButtonTotalCoast.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonTotalCoast.setText("Total Cost");
        jButtonTotalCoast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalCoastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jButtonTotalCoast, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnexit)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel7)
                        .addComponent(jLabel20))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextTax, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(788, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTotalCoast, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel7))
                        .addComponent(jTextTax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel20)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1020, 120));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_Ref", "First Name", "Last Name", "Present Address", "Post Code", "Customer Mobile No", "Email", "Nationality", "Date Of Birth", "ID Type", "Gender", "Check In Date", "Check Out Date", "Meal", "Room Type", "Room No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAlignmentX(1.0F);
        jTable1.setAlignmentY(1.0F);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 780, 530));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 260, 110, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 350, 110, -1));
        getContentPane().add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 380, 110, -1));

        jLocaleChooser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arabic (United Arab Emirates)", "Arabic (Jordan)", "Arabic (Syria)", "Bangladeshi", "Bhutan", "Barma", "Nigerian", "Croatian (Croatia)", "French (Belgium)", "Spanish (Panama)", "Maltese (Malta)", "Spanish (Venezuela)", "Chinese (Taiwan)", "Danish (Denmark)", "Spanish (Puerto Rico)", "Vietnamese (Vietnam)", "English (United States)", "Serbian (Montenegro)", "Swedish (Sweden)", "Spanish (Bolivia)", "English (Singapore)", "Arabic (Bahrain)", "Arabic (Saudi Arabia)", "Arabic (Yemen)", "Hindi (India)", "English (Malta)", "Finnish (Finland)", "Serbian (Latin,Bosnia and Herzegovina)", "Ukrainian (Ukraine)", "French (Switzerland)", "Spanish (Argentina)", "Arabic (Egypt)", "Japanese (Japan,JP)", "Spanish (El Salvador)", "Portuguese (Brazil)", "Icelandic (Iceland)", "Czech (Czech Republic)", "Polish (Poland)", "Catalan (Spain)", "Serbian (Serbia and Montenegro)", "Malay (Malaysia)", "Spanish (Spain)", "Spanish (Colombia)", "Bulgarian (Bulgaria)", "Serbian (Bosnia and Herzegovina)", "Spanish (Paraguay)", "Spanish (Ecuador)", "Spanish (United States)", "Arabic (Sudan)", "Romanian (Romania)", "English (Philippines)", "Arabic (Tunisia)", "Serbian (Latin,Montenegro)", "Spanish (Guatemala)", "Korean (South Korea)", "Greek (Cyprus)", "Spanish (Mexico)", "Russian (Russia)", "Spanish (Honduras)", "Chinese (Hong Kong)", "Norwegian (Norway,Nynorsk)", "Hungarian (Hungary)", "Thai (Thailand)", "Arabic (Iraq)", "Spanish (Chile)", "Arabic (Morocco)", "Irish (Ireland)", "Turkish (Turkey)", "Estonian (Estonia)", "Arabic (Qatar)", "Portuguese (Portugal)", "French (Luxembourg)", "Arabic (Oman)", "Albanian (Albania)", "Spanish (Dominican Republic)", "Spanish (Cuba)", "English (New Zealand)", "Serbian (Serbia)", "German (Switzerland)", "Spanish (Uruguay)", "Greek (Greece)", "Hebrew (Israel)", "English (South Africa)", "Thai (Thailand,TH)", "French (France)", "German (Austria)", "Norwegian (Norway)", "English (Australia)", "Dutch (Netherlands)", "French (Canada)", "Latvian (Latvia)", "German (Luxembourg)", "Spanish (Costa Rica)", "Arabic (Kuwait)", "Arabic (Libya)", "Italian (Switzerland)", "German (Germany)", "Arabic (Algeria)", "Slovak (Slovakia)", "Lithuanian (Lithuania)", "Italian (Italy)", "English (Ireland)", "Chinese (Singapore)", "English (Canada)", "Dutch (Belgium)", "Chinese (China)", "Japanese (Japan)", "German (Greece)", "Serbian (Latin,Serbia)", "English (India)", "Arabic (Lebanon)", "Spanish (Nicaragua)", "Macedonian (Macedonia)", "Belarusian (Belarus)", "Slovenian (Slovenia)", "Spanish (Peru)", "Indonesian (Indonesia)", "English (United Kingdom)" }));
        getContentPane().add(jLocaleChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 110, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxIdActionPerformed

    private void jTextSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSubTotalActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
         DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
       if( jTable1.getSelectedRow()==-1){
           if( jTable1.getRowCount()==0){
               JOptionPane.showMessageDialog(null,"Hotel Booking Update Confirmed","Hotel Management System",
               JOptionPane.OK_OPTION);
           }
             
       }
    }//GEN-LAST:event_jButtonUpdateActionPerformed
private JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
       frame=new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Hotel Management System",
               JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
           System.exit(0);
       }
            
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
       DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
       if( jTable1.getSelectedRow()==-1){
           if( jTable1.getRowCount()==0){
               JOptionPane.showMessageDialog(null,"No data to Delete","Hotel Management System",
                       JOptionPane.OK_OPTION);
           }
           else{
               JOptionPane.showMessageDialog(null,"Select a row to Delete","Hotel Management System",
               JOptionPane.OK_OPTION);
           }
       }
       else{
            model.removeRow(jTable1.getSelectedRow());        
       }
     
           
       
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonTotalCoastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalCoastActionPerformed
      
        int oneMeal=7;
        int twoMeals=55;
        int threeMeal=75;
        
        int singleRoom=35;
        int doubleRoom=55;
        int familyRoom=75;
        
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        Date Check_In_Date=null;
        Date Check_Out_Date=null;
        try{
        
        Check_In_Date=format.parse(format.format(jDateChooser2.getDate()));
        Check_Out_Date=format.parse(format.format(jDateChooser3.getDate()));
        }
       
        catch(Exception e){
             e.printStackTrace();
        }
        long Checkediff=Check_In_Date.getTime()-Check_Out_Date.getTime();
            int Checkdiff = 0;
        int Daysdiff=(int)(Checkdiff /100/60/60/24);
        
        if(jComboBoxRoomtype.getSelectedItem().equals("Single")&& jComboBoxMeal.getSelectedItem().equals("1"))
                {
           
              
                jTextFieldTotal.setText(Integer.toString(Daysdiff*SingleRoom)+oneMeal);
                jTextTax.setText(Integer.toString(Daysdiff*SingleRoom)+oneMeal);
               jTextSubTotal.setText(Integer.toString(Daysdiff*SingleRoom)+oneMeal);
               
               
               double q=Double.parseDouble(jTextTax.getText());
               q=(q*0.25)/100;
               String tax=String.format(("$ %.2f"),q);
               jTextTax.setText(tax);
               
               double st=Double.parseDouble(jTextSubTotal.getText());
               String subtotal=String.format(("$ %.2f"),st);
               jTextSubTotal.setText(subtotal);
                
                double tt=Double.parseDouble(jTextFieldTotal.getText());
               String total=String.format(("$ %.2f"),tt+q);
               jTextFieldTotal.setText(total);
                
                }
        
   /*********************************************************************/
        
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
       model.addRow(new Object[]{
        jTextFirstName.getText(),
        jTextLastName.getText(),
        jTextPresentAddress.getText(),
        jTextPostCode.getText(),
        jTextMobileNo.getText(),
        jTextEmail.getText(),
        jLocaleChooser.getSelectedItem(),
        jDateChooser1.getDate(),
        jDateChooser2.getDate(),
        jDateChooser3.getDate(),
        jComboBoxId.getSelectedItem(),
        jComboBoxGeder.getSelectedItem(),
        jComboBoxMeal.getSelectedItem(),
        jComboBoxRoomtype.getSelectedItem(),
        jComboBoxRoomNo.getSelectedItem(),
        jComboBoxExtNo.getSelectedItem(),
        });
        
        
        
    }//GEN-LAST:event_jButtonTotalCoastActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jTextCustomerRef.setText(null);
        jTextFirstName.setText(null);
        jTextLastName.setText(null);
        jTextPresentAddress.setText(null);
        jTextPostCode.setText(null);
        jTextMobileNo.setText(null);
        jTextEmail.setText(null);
        jLocaleChooser.setLocale(null);
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        jDateChooser3.setDate(null);
        jComboBoxId.setSelectedIndex(0);
        jComboBoxGeder.setSelectedIndex(0);
        jComboBoxMeal.setSelectedIndex(0);
        jComboBoxRoomtype.setSelectedIndex(0);
        jComboBoxRoomNo.setSelectedIndex(0);
        jComboBoxExtNo.setSelectedIndex(0);
        jTextTax.setText(null);
        jTextSubTotal.setText(null);
        jTextFieldTotal.setText(null);
                
        
        
        
    }//GEN-LAST:event_jButtonResetActionPerformed

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
            java.util.logging.Logger.getLogger(Hotel_system2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel_system2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel_system2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel_system2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hotel_system2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTotalCoast;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox jComboBoxExtNo;
    private javax.swing.JComboBox jComboBoxGeder;
    private javax.swing.JComboBox jComboBoxId;
    private javax.swing.JComboBox jComboBoxMeal;
    private javax.swing.JComboBox jComboBoxRoomNo;
    private javax.swing.JComboBox jComboBoxRoomtype;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCustomerRef;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextLastName;
    private javax.swing.JTextField jTextMobileNo;
    private javax.swing.JTextField jTextPostCode;
    private javax.swing.JTextField jTextPresentAddress;
    private javax.swing.JTextField jTextSubTotal;
    private javax.swing.JTextField jTextTax;
    private javax.swing.JButton jbtnexit;
    // End of variables declaration//GEN-END:variables
}
