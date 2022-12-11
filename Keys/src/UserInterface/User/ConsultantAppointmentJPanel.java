/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.User;

import Business.Consultant.Consultant;
import Business.EcoSystem;
import Business.Enums.AppointmentStatus;
import static Business.Enums.AppointmentStatus.CANCELLED;
import Business.UserAccountManagement.UserAccount;
import Business.WorkQueue.ConsultantAppointment;
import Business.WorkQueue.ConsultantAppointmentDirectory;
//import Business.WorkQueue.SearchApp;
import Business.User.User;
import Business.Utils.DateFormatter;
import Business.WorkQueue.SearchApplication;
//import Utility.Notification;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nagarjun Mallesh
 */
public class ConsultantAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConsultantAppointment
     */
    UserAccount userAcc;
    EcoSystem system;
    JPanel rightSidePanel;

    public ConsultantAppointmentJPanel(EcoSystem system, JPanel rightSidePanel, UserAccount userAcc) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.userAcc = userAcc;
        this.setSize(1160, 750);
        specializationCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timeCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        specializationCombo = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        viewAppointmentButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        consultantAvailTbl = new javax.swing.JTable();
        bookAppointment = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        findConsultant = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container.setBackground(new java.awt.Color(250, 249, 251));
        container.setPreferredSize(new java.awt.Dimension(1160, 750));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Book Appointment");
        container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel2.setText("Date");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 102, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel3.setText("Time");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 6, 86, -1));

        timeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00-10:00", "10:00-11:00", "11:00-12:00", "12:00-13:00", "13:00-14:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "17:00-18:00" }));
        jPanel2.add(timeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 38, 231, 36));

        jLabel4.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel4.setText("Consultant Specialization");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 230, -1));

        specializationCombo.setPreferredSize(new java.awt.Dimension(140, 30));
        specializationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializationComboActionPerformed(evt);
            }
        });
        jPanel2.add(specializationCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 38, 235, 36));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 210, 30));

        container.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 1090, 90));

        viewAppointmentButton.setBackground(new java.awt.Color(51, 51, 255));
        viewAppointmentButton.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        viewAppointmentButton.setForeground(new java.awt.Color(255, 255, 255));
        viewAppointmentButton.setText("View Appointment Status");
        viewAppointmentButton.setBorder(null);
        viewAppointmentButton.setFocusPainted(false);
        viewAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAppointmentButtonActionPerformed(evt);
            }
        });
        container.add(viewAppointmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 680, 230, 50));

        consultantAvailTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Specialization", "Consultancy agency", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(consultantAvailTbl);

        container.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 1090, 250));

        bookAppointment.setBackground(new java.awt.Color(51, 51, 255));
        bookAppointment.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        bookAppointment.setForeground(new java.awt.Color(255, 255, 255));
        bookAppointment.setText("Book Appointment");
        bookAppointment.setBorder(null);
        bookAppointment.setFocusPainted(false);
        bookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointmentActionPerformed(evt);
            }
        });
        container.add(bookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, 230, 50));

        cancel.setBackground(new java.awt.Color(255, 69, 50));
        cancel.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel Appointment");
        cancel.setBorder(null);
        cancel.setFocusPainted(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        container.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 680, 230, 50));

        findConsultant.setBackground(new java.awt.Color(51, 51, 255));
        findConsultant.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        findConsultant.setForeground(new java.awt.Color(255, 255, 255));
        findConsultant.setText("Find Consultant");
        findConsultant.setBorder(null);
        findConsultant.setFocusPainted(false);
        findConsultant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findConsultantActionPerformed(evt);
            }
        });
        container.add(findConsultant, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 680, 230, 50));

        add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1139, 1073));
    }// </editor-fold>//GEN-END:initComponents

    private void specializationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specializationComboActionPerformed
        // TODO add your handling code here:
        displayConsultants();
    }//GEN-LAST:event_specializationComboActionPerformed

    private void viewAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAppointmentButtonActionPerformed
        // TODO add your handling code here:
        // viewAppointmentStatus();
        displayAppointmentStatus();
    }//GEN-LAST:event_viewAppointmentButtonActionPerformed

    private void bookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointmentActionPerformed
        // TODO add your handling code here:

        bookConsultantAppointment();
    }//GEN-LAST:event_bookAppointmentActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        cancelAppoint();
    }//GEN-LAST:event_cancelActionPerformed

    private void findConsultantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findConsultantActionPerformed
        // TODO add your handling code here:
        displayConsultants();
    }//GEN-LAST:event_findConsultantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookAppointment;
    private javax.swing.JButton cancel;
    private javax.swing.JTable consultantAvailTbl;
    private javax.swing.JPanel container;
    private javax.swing.JButton findConsultant;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> specializationCombo;
    private javax.swing.JComboBox<String> timeCombo;
    private javax.swing.JButton viewAppointmentButton;
    // End of variables declaration//GEN-END:variables

    private void specializationCombo() {

        List<Consultant> consultant = system.getConsultantDirectory().getConsultants();
        int l = consultant.size();
        List<String> specialization = new ArrayList<String>();
        for (int i = 0; i < l; i++) {
            Consultant d1 = consultant.get(i);
            if (!specialization.contains(d1.getSpecialization())) {

                specialization.add(d1.getSpecialization());
            }

        }
        for (int i = 0; i < specialization.size(); i++) {
            specializationCombo.addItem(specialization.get(i));
        }

    }

    private void displayConsultants() {
        String specialSelect = specializationCombo.getSelectedItem().toString();
        List<Consultant> consultantList = system.getConsultantDirectory().getConsultants();
        int l = consultantList.size();

        consultantAvailTbl.setModel(new DefaultTableModel(null, new String[]{"Name", "Specialization", "Consultancy Agency", "Phone Number"}));
        for (int i = 0; i < l; i++) {
            Consultant consultant = consultantList.get(i);
            if (consultant.getSpecialization().matches(specialSelect)) {
                DefaultTableModel table = (DefaultTableModel) consultantAvailTbl.getModel();
                String content[] = {consultant.getName(), consultant.getSpecialization(), consultant.getRentalAgency(), String.valueOf(consultant.getPhoneNo())};
                table.addRow(content);
            }
        }

    }

//    public void sendmail() {
//        Notification notification = new Notification();
//        String toEmail = "aedproject22@gmail.com";
//        String emailSubject = "Doctor Appointment confirmation";
//        String emailContent = "Successfully booked your doctor appointment!!";
//        notification.sendMail(toEmail, emailSubject, emailContent);
//    }
    private void bookConsultantAppointment() {

        DefaultTableModel model = (DefaultTableModel) consultantAvailTbl.getModel();
        int selectedRow = consultantAvailTbl.getSelectedRow();
        if (selectedRow >= 0) {
            if (jDateChooser1.getDate() != null) {
                int rand = 1 + (int) (Math.random() * 100);
//                SimpleDateFormat sdate = new SimpleDateFormat("yyyy-MM-dd");
//                String appDate = sdate.format(jDateChooser1.getDate());
                Date appDate = jDateChooser1.getDate();
                //TODO check date format
                System.out.println("Chosen date: " + appDate);
                System.out.println("Chosen date in string: " + DateFormatter.getDateString(appDate));
                DateTimeFormatter datetf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                Date currentDate = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                formatter.format(currentDate);
                //LocalDateTime date2 = LocalDateTime.now();
                String name = (model.getValueAt(selectedRow, 0).toString());
                String time = timeCombo.getSelectedItem().toString();
                //String date = specializationCombo.getSelectedItem().toString();
                if (isAreadyBooked(appDate)) {
                    JOptionPane.showMessageDialog(this, "Appointment already booked for the chosen date.");
                    return;
                } else if (appDate.compareTo(currentDate) >= 0) {
                    boolean appoint = verify(name, appDate, time, false);
                    if (appoint == false) {
                        ConsultantAppointment consultant = new ConsultantAppointment();
                        consultant.setId(rand);
                        consultant.setConsultantName(name);
                        String verifyName = (model.getValueAt(selectedRow, 1).toString());
                        consultant.setLastName(verifyName);
                        consultant.setDate(appDate);
//                        consultant.setStatus("Appointment Booked");
                        consultant.setStatus(AppointmentStatus.APPOINTMENT_BOOKED);
                        consultant.setTime(timeCombo.getSelectedItem().toString());
                        //System.out.print(doc.getTime());
                        User user = (User) (userAcc);
                        consultant.setUserId(user.getUserId());
                        consultant.setUserName(user.getFirstName());
                        ConsultantAppointmentDirectory consultantDir = system.getConsultantAppointmentDir();
                        consultantDir.addRequest(consultant);
                        SearchApplication check = system.getCheckApplication();
                        Map<String, List<String>> aList = check.getSearchByName();
                        List<String> list = new ArrayList<>();
                        list.add(DateFormatter.getDateString(appDate));
                        list.add(timeCombo.getSelectedItem().toString());
                        aList.put(name, list);

                        //code to send email
                        //TODO send mail
                        // sendmail();
                        //end of code
                        JOptionPane.showMessageDialog(this, "Your Appointment request is successful!!");

                    } else {
                        JOptionPane.showMessageDialog(this, "Appointment slot not available!!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please select any future date!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Date is mandatory!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Consultant you want to book an appointment with!!");
        }

    }

    public boolean isAreadyBooked(Date date) {
        ConsultantAppointmentDirectory consultantDir = system.getConsultantAppointmentDir();
        List<ConsultantAppointment> appointments = consultantDir.getAppointments();
        int size = appointments.size();
        User a = (User) userAcc;
        String userId = a.getUserId();
        for (int i = 0; i < size; i++) {
            ConsultantAppointment appointment = appointments.get(i);
            if (appointment.getUserId().matches(userId)) {
                Date currentAppointment = appointment.getDate();
                if (currentAppointment.compareTo(date) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean verify(String name, Date appointmentDate, String time, boolean cancelAppointment) {

        boolean rand = false;
        SearchApplication check = system.getCheckApplication();
        Map<String, List<String>> appList = check.getSearchByName();
        for (Map.Entry mapElement : appList.entrySet()) {
            if (mapElement.getKey().toString().matches(name)) {
                List<String> appointment = (List) mapElement.getValue();
                String date = appointment.get(0);
                String appTime = appointment.get(1);
                if (date.matches(DateFormatter.getDateString(appointmentDate))) {
                    if (appTime.matches(time)) {
                        if(cancelAppointment) {
                            appList.remove(mapElement.getKey().toString());
                        }
                        rand = true;
                        break;
                    }
                }
            }

        }
        return rand;

    }

//    private void viewAppointmentStatus() {
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    
//    DocAppointmentStatus docApp=new DocAppointmentStatus(rightSidePanel,system,userAcc);
//        container.add("DocAppointmentStatus",docApp);
//        CardLayout layout = (CardLayout) container.getLayout();
//        layout.next(container); 
//        
//        
//    
//    }
    private void displayAppointmentStatus() {

        ConsultantAppointmentDirectory consultantDir = system.getConsultantAppointmentDir();
        List<ConsultantAppointment> consultantApplicationList = consultantDir.getAppointments();
        int l = consultantApplicationList.size();

        consultantAvailTbl.setModel(new DefaultTableModel(null, new String[]{"AppID", "Name", "Date", "Time", "Status"}));
        for (int i = 0; i < l; i++) {
            ConsultantAppointment consultantApplication = consultantApplicationList.get(i);

            if (consultantApplication.getUserId().matches(userAcc.getUsername())) {

                DefaultTableModel table = (DefaultTableModel) consultantAvailTbl.getModel();
                int r1 = consultantApplication.getId();
                Object r2[] = {r1, consultantApplication.getConsultantName(), DateFormatter.getDateString(consultantApplication.getDate()), consultantApplication.getTime(), consultantApplication.getStatus()};
                table.addRow(r2);
            }
        }
    }

    private void cancelAppoint() {

        DefaultTableModel table = (DefaultTableModel) consultantAvailTbl.getModel();
        int selectedRow = consultantAvailTbl.getSelectedRow();
        if (selectedRow >= 0) {
            if (table.getColumnCount() == 4) {
                JOptionPane.showMessageDialog(this, "Please select an appointment to cancel");
                return;
            }
            int sRow = (int) table.getValueAt(selectedRow, 0);

            ConsultantAppointmentDirectory consultantAppointmentDirectory = system.getConsultantAppointmentDir();
            List<ConsultantAppointment> consultantApplnList = consultantAppointmentDirectory.getAppointments();
            int l = consultantApplnList.size();
            User u = (User) userAcc;
            for (int i = 0; i < l; i++) {
                ConsultantAppointment consultantAppln = consultantApplnList.get(i);
                if (sRow == consultantAppln.getId()) {

                    if (consultantAppln.getStatus() == AppointmentStatus.APPOINTMENT_BOOKED) {
                        consultantAppln.setStatus(CANCELLED);
                        verify(consultantAppln.getConsultantName(), consultantAppln.getDate(), consultantAppln.getTime(), true);        
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot cancel this appointment now");
                    }

                }

            }
//            consultantAvailTbl.setModel(new DefaultTableModel(null, new String[]{"ID", "Doctor Name", "Hospital", "Status", "Date", "Time"}));
            displayAppointmentStatus();
        } else {
            JOptionPane.showMessageDialog(null, "Select an appointment to cancel!!");
        }

    }
}
