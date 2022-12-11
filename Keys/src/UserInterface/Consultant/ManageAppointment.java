/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Consultant;

import Business.Consultant.Consultant;
import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import Business.WorkQueue.ConsultantAppointment;
import Business.WorkQueue.ConsultantAppointmentDirectory;
import Business.WorkQueue.SearchApplication;
import java.awt.CardLayout;
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
public class ManageAppointment extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoc
     */
    private UserAccount userAcc;
    private EcoSystem system;
    private JPanel container;

    public ManageAppointment(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        consultation = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        prescribe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Status", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 853, -1));

        consultation.setBackground(new java.awt.Color(51, 51, 255));
        consultation.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        consultation.setForeground(new java.awt.Color(255, 255, 255));
        consultation.setText("Consult");
        consultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultationActionPerformed(evt);
            }
        });
        jPanel1.add(consultation, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, 180, 50));

        cancel.setBackground(new java.awt.Color(255, 69, 58));
        cancel.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 180, 50));

        prescribe.setBackground(new java.awt.Color(51, 51, 255));
        prescribe.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        prescribe.setForeground(new java.awt.Color(255, 255, 255));
        prescribe.setText("Suggestions");
        prescribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribeActionPerformed(evt);
            }
        });
        jPanel1.add(prescribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, 180, 50));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Appointments");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

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

    private void consultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultationActionPerformed
        // TODO add your handling code here:
        consultation();

    }//GEN-LAST:event_consultationActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        cancelAppoint();

    }//GEN-LAST:event_cancelActionPerformed

    private void prescribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribeActionPerformed
        // TODO add your handling code here:
        prescribeMed();
    }//GEN-LAST:event_prescribeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton consultation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton prescribe;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ConsultantAppointmentDirectory consultationDir = system.getConsultantAppointmentDir();
        List<ConsultantAppointment> dAppList = consultationDir.getAppointments();
        int l = dAppList.size();
        for (int i = 0; i < l; i++) {
            ConsultantAppointment consultantApp = dAppList.get(i);
            Consultant consultant = (Consultant) userAcc;
            if (consultantApp.getConsultantName().matches(consultant.getName())) {

                DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
                String s1 = String.valueOf(consultantApp.getId());

                String s2[] = {s1, consultantApp.getUserName(), consultantApp.getStatus(), consultantApp.getDate().toString(), consultantApp.getTime()};
                table.addRow(s2);
            }

        }

    }

    private void consultation() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
            ConsultantAppointmentDirectory dAppList = system.getConsultantAppointmentDir();
            List<ConsultantAppointment> appList = dAppList.getAppointments();
            int l = appList.size();

            for (int i = 0; i < l; i++) {
                ConsultantAppointment consultantApp = appList.get(i);
                if (sRow == consultantApp.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/) {
                    if (consultantApp.getStatus().matches("Consultation Booked")) {
                        consultantApp.setStatus("Consultation Done");
                        JOptionPane.showMessageDialog(null, "Processed!!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong move!!");

                    }
                }
            }
            jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Status", "Date", "Time"}));
            displayTable();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }

    }

    private void cancelAppoint() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
            //System.out.println("id" + s);
            ConsultantAppointmentDirectory dApp = system.getConsultantAppointmentDir();
            List<ConsultantAppointment> appList = dApp.getAppointments();

            int l = appList.size();

            for (int i = 0; i < l; i++) {
                ConsultantAppointment consultantApplication = appList.get(i);
                if (sRow == consultantApplication.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/) {
                    if (consultantApplication.getStatus().matches("Appointment Booked")) {
                        consultantApplication.setStatus("Cancelled");
                        Verify(consultantApplication.getConsultantName(), consultantApplication.getDate(), consultantApplication.getTime());
                        JOptionPane.showMessageDialog(null, "Appointment Cancelled");
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid request! please contact the sysadmin.");

                    }
                }
            }
            jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Status", "Date", "Time"}));
            displayTable();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }

    }

    private void Verify(String name, Date app, String date) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean rand = false;
        SearchApplication check = system.getCheckApplication();
        Map<String, List<String>> appList = check.getSearchByName();
        for (Map.Entry mapElement : appList.entrySet()) {
            if (mapElement.getKey().toString().matches(name)) {
                List<String> docList = (List) mapElement.getValue();
                String s1 = docList.get(0);
                String s2 = docList.get(1);
                if (s1.matches(app.toString())) {
                    if (s2.matches(date)) {
                        appList.remove(name);
                    }
                }
            }

        }

    }

    private void prescribeMed() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

            ConsultantAppointmentDirectory consultantApp = system.getConsultantAppointmentDir();
            List<ConsultantAppointment> consultantAppList = consultantApp.getAppointments();

            int l = consultantAppList.size();

            for (int i = 0; i < l; i++) {
                ConsultantAppointment docList = consultantAppList.get(i);
                if (sRow == docList.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/) {
                    if (docList.getStatus().matches("Consultation Done")) {

                        BuilderConsult builder = new BuilderConsult(container, system, userAcc, docList.getUserId(), sRow);

                        container.add(builder);
                        CardLayout layout = (CardLayout) container.getLayout();
                        layout.next(container);

                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Move!!");
                    }
                }
            }
            jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Status", "Date", "Time"}));
            displayTable();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }

    }
}
