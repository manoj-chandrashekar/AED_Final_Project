/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.User;

import Business.MarketPlace.MarketPlace;
import Business.MarketPlace.MarketPlaceDirectory;
import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import Business.WorkQueue.DonateProduct;
import Business.WorkQueue.DonateProductDirectory;
import Business.User.User;
//import Utility.Notification;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nagarjun Mallesh
 */
public class MarketPlaceGiveawayJPanel extends javax.swing.JPanel {

    EcoSystem system;
    JPanel rightSidePanel;
    UserAccount userAccount;

    /**
     * Creates new form BloodDonations
     *
     * @param system
     * @param rightSidePanel
     */
    public MarketPlaceGiveawayJPanel(EcoSystem system, JPanel rightSidePanel, UserAccount userAccount) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.userAccount = userAccount;
        this.setSize(1160, 750);
        User u = (User) (userAccount);
        firstNameField.setText(u.getFirstName());
        lastNameField.setText(u.getLastName());
        setDonationCenterList();

        displayTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        bookButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        appointmentLabel = new javax.swing.JLabel();
        appointmentTimeLabel = new javax.swing.JLabel();
        storeBox = new javax.swing.JComboBox<>();
        timeBox = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Marketplace giveaway");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 580, 630));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookButton.setBackground(new java.awt.Color(51, 51, 255));
        bookButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        bookButton.setForeground(new java.awt.Color(255, 255, 255));
        bookButton.setText("Book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        jPanel7.add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 140, 39));

        cancelButton.setBackground(new java.awt.Color(255, 55, 95));
        cancelButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel7.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 140, 39));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 50));

        firstNameLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(73, 84, 90));
        firstNameLabel.setText("First Name");
        jPanel7.add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        lastNameField.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 40));

        lastNameLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(73, 84, 90));
        lastNameLabel.setText("Last Name");
        jPanel7.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        firstNameField.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        jPanel7.add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 40));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("Blood Bank");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, -1));

        appointmentLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        appointmentLabel.setForeground(new java.awt.Color(73, 84, 90));
        appointmentLabel.setText("Appointment Date");
        jPanel7.add(appointmentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        appointmentTimeLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        appointmentTimeLabel.setForeground(new java.awt.Color(73, 84, 90));
        appointmentTimeLabel.setText("Appointment Time");
        jPanel7.add(appointmentTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 220, -1));

        jPanel7.add(storeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 420, 40));

        timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "19:00 - 20:00" }));
        jPanel7.add(timeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 420, 40));
        jPanel7.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 420, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 470, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setDonationCenterList() {
        MarketPlaceDirectory mp = system.getMarketPlaceDirectory();
        List<MarketPlace> storeList = mp.getMarketPlaces();
        int l = storeList.size();
        for (int i = 0; i < l; i++) {
            MarketPlace blood = storeList.get(i);
            storeBox.addItem(blood.getStoreName());
        }

    }

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:
        productDonationAppointment();
    }//GEN-LAST:event_bookButtonActionPerformed

    private void productDonationAppointment() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        if (jDateChooser1.getDate() != null) {
            DonateProduct donate = new DonateProduct();
            int z = 1 + (int) (Math.random() * 100);
            donate.setId(z);
            donate.setFirstName(firstNameField.getText());
            donate.setMarketplaceName(storeBox.getSelectedItem().toString());
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = jDateChooser1.getDate();
            donate.setStatus("Appoinment Booked");
            User u = (User) (userAccount);
            donate.setUserId(u.getUserId());
            donate.setAppoinmentDate(date1);
            donate.setAppoinmentTime(timeBox.getSelectedItem().toString());
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//            LocalDateTime date2 = LocalDateTime.now();
                Date currentDate = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                formatter.format(currentDate);
            if(isAreadyBooked(date1)){
                JOptionPane.showMessageDialog(null,"Appointment already booked for the chosen date.");
                return;
            } else if (date1.compareTo(currentDate) >= 0) {
                DonateProductDirectory storeDir = system.getDonateProdirectory();
                storeDir.addRequest(donate);
                jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Center", "Status", "Date", "Time"}));
                JOptionPane.showMessageDialog(null, "Appointment Booked!");
                //sendmail();
                displayTable();
            } else {
                JOptionPane.showMessageDialog(null, "Appointment Available from Tomorrow");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pick A Date!!");
        }

    }
    
//    public void sendmail() {
//        Notification notification = new Notification();
//        String toEmail = "aedproject22@gmail.com";
//        String emailSubject = "Blood Donation";
//        String emailContent = "Successfully booked your blood donation appointment!!";
//        notification.sendMail(toEmail, emailSubject, emailContent);
//    }

    
    public boolean isAreadyBooked(Date date){
        DonateProductDirectory storeDonors = system.getDonateProdirectory();
        List<DonateProduct> appointments = storeDonors.getDonors();
        int size = appointments.size();
        User a =(User)(userAccount);
        String userId = a.getUserId();
        for(int i=0; i<size; i++){
            DonateProduct appointment = appointments.get(i);
            if(appointment.getUserId().matches(userId)){
                Date currentAppointment = appointment.getAppoinmentDate();
                if(currentAppointment.compareTo(date) == 0){
                    return true;
                }
            }
        }
        return false;
    }

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
     cancelButton();
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointmentLabel;
    private javax.swing.JLabel appointmentTimeLabel;
    private javax.swing.JButton bookButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JComboBox<String> storeBox;
    private javax.swing.JComboBox<String> timeBox;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Center", "Status", "Date", "Time"}));
        DonateProductDirectory donateProductDir = system.getDonateProdirectory();
        List<DonateProduct> donorList = donateProductDir.getDonors();
        int l = donorList.size();

        for (int i = 0; i < l; i++) {
            DonateProduct donate = donorList.get(i);

            if (userAccount.getUsername().matches(donate.getUserId())) {
                DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
                String r1 = String.valueOf(donate.getId());
                String r2[] = {r1, donate.getMarketplaceName(), donate.getStatus(), donate.getAppoinmentDate().toString(), donate.getAppoinmentTime()};
                table.addRow(r2);
            }
        }

    }

    private void cancelButton() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

            DonateProductDirectory productDonateDir = system.getDonateProdirectory();
            List<DonateProduct> donateBloodList = productDonateDir.getDonors();

            int l = donateBloodList.size();
            User u = (User) (userAccount);
            for (int i = 0; i < l; i++) {
                DonateProduct donate = donateBloodList.get(i);
                if (sRow == donate.getId()) {
                    if (donate.getStatus().matches("Appoinment Booked")) {
                        donate.setStatus("Cancelled");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Action!!");
                    }

                }
            }
            jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Center", "Status", "Date", "Time"}));
            displayTable();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }

    
    
    
    }

//    private void viewButton() {
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//         DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
//        int selectedRow = jTable1.getSelectedRow();
//        if (selectedRow >= 0) {
//            int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
//
//            DonateProductDirectory donateBloodDir = system.getDonateProdirectory();
//            List<DonateProduct> donorList = donateBloodDir.getDonors();
//
//            int l = donorList.size();
//            User u = (User) (userAccount);
//            for (int i = 0; i < l; i++) {
//                DonateProduct donate = donorList.get(i);
//                if (sRow == donate.getId()) {
//                    if (donate.getStatus().matches("Blood Collected")) {
//                        JOptionPane.showMessageDialog(null, "WBC :" + donate.get() + " " + "RBC :" + donate.getRBC() + " " + "Cholesterol :" + donate.getCholesterol() + " " + "Platelets :" + donate.getPlatelets());
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Results not Available Yet!!");
//                    }
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
//        }
//    }
}
