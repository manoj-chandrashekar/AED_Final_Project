/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Maintenance;

import Business.EcoSystem;
import Business.PointOfContact.Maintenance.Maintenance;
import Business.UserAccountManagement.UserAccount;
import Business.UserAccountManagement.UserAccount;
import Business.WorkQueue.EmergencyRequest;
import Business.WorkQueue.EmergencyRequestDirectory;
//import UserInterface.SysAdmin.MapViewerTwo;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sanjay Bhaskar Kashyap
 */
public class MaintenanceDisplay extends javax.swing.JPanel {

    private UserAccount userAcc;
    private EcoSystem system;
    private JPanel container;
    String locationCordinate;
   
    /**
     * Creates new form PoliceDisplay
     */
    MaintenanceDisplay(EcoSystem ecosystem, JPanel userProcessContainer, UserAccount userAcc) {
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        initComponents();
        populate_table();
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
        locationButton = new javax.swing.JButton();
        closeCaseButton = new javax.swing.JButton();
        respondButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        falseAlarmButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Maintenance Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        locationButton.setBackground(new java.awt.Color(51, 51, 255));
        locationButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        locationButton.setForeground(new java.awt.Color(255, 255, 255));
        locationButton.setText("View Location");
        locationButton.setBorder(null);
        locationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(locationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 180, 50));

        closeCaseButton.setBackground(new java.awt.Color(51, 51, 255));
        closeCaseButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        closeCaseButton.setForeground(new java.awt.Color(255, 255, 255));
        closeCaseButton.setText("Close Case");
        closeCaseButton.setBorder(null);
        closeCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCaseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(closeCaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 590, 180, 50));

        respondButton.setBackground(new java.awt.Color(51, 51, 255));
        respondButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        respondButton.setForeground(new java.awt.Color(255, 255, 255));
        respondButton.setText("Respond");
        respondButton.setBorder(null);
        respondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respondButtonActionPerformed(evt);
            }
        });
        jPanel1.add(respondButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 590, 180, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Location", "Status", "Response"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 1460, -1));

        falseAlarmButton.setBackground(new java.awt.Color(255, 55, 95));
        falseAlarmButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        falseAlarmButton.setForeground(new java.awt.Color(255, 255, 255));
        falseAlarmButton.setText("False Alarm");
        falseAlarmButton.setBorder(null);
        falseAlarmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                falseAlarmButtonActionPerformed(evt);
            }
        });
        jPanel1.add(falseAlarmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 590, 180, 50));

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

    private void locationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationButtonActionPerformed
        // TODO add your handling code here:
        showMap();
        
    }//GEN-LAST:event_locationButtonActionPerformed

    private void showMap() {
                // TODO add your handling code here:
         DefaultTableModel  table2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {       
        int rowId = Integer.parseInt(table2.getValueAt(selectedRow, 0).toString());
        EmergencyRequestDirectory reqEmergencyDirectory=system.getEmergencyRequestDirectory();
        List<EmergencyRequest> reqEmergencyList = reqEmergencyDirectory.getEmergencyUserList();
        int size= reqEmergencyList.size();
        Maintenance maintenance =(Maintenance) userAcc;
         for(int i=0;i<size;i++)
        {
            EmergencyRequest emergency = reqEmergencyList.get(i);
            if(rowId ==emergency.getId())
            {
                locationCordinate = emergency.getLocation();
            }

        }
        String [] parts = locationCordinate.split(",");
        String lattitude = parts[0].replaceAll("\\s","");
        String longitude = parts[1].replaceAll("\\s","");
        
//        MapViewerTwo oLJP = new MapViewerTwo(container, lattitude, longitude);
//        container.add("MapViewr", oLJP);
//        CardLayout layout = (CardLayout) container.getLayout();
//        layout.next(container);
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Select A Row!!");
//        }

        
    }
    }
    
    private void closeCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCaseButtonActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel table2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int rowId = Integer.parseInt(table2.getValueAt(selectedRow, 0).toString());
        EmergencyRequestDirectory reqEmergencyDirectory = system.getEmergencyRequestDirectory();
        List<EmergencyRequest> emergencies = reqEmergencyDirectory.getEmergencyUserList();
        int size = emergencies.size();
        for(int i=0;i<size;i++)
        {
            EmergencyRequest emergency = emergencies.get(i);
            if(rowId ==emergency.getId())
            {
                if(emergency.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(emergency.getStatus().matches("False Alaram"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(emergency.getResponse().matches("No Response"))
                {
                    JOptionPane.showMessageDialog(null, "respond to emergency");
                }
                else
                {
                    emergency.setStatus("Closed");
                }

            }

        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_closeCaseButtonActionPerformed

    private void respondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respondButtonActionPerformed
        // TODO add your handling code here:
         DefaultTableModel  table2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {       
        int rowId = Integer.parseInt(table2.getValueAt(selectedRow, 0).toString());
        EmergencyRequestDirectory reqEmergencyDirectory=system.getEmergencyRequestDirectory();
        List<EmergencyRequest> reqEmergencyList = reqEmergencyDirectory.getEmergencyUserList();
        int size= reqEmergencyList.size();
        Maintenance maintenance =(Maintenance) userAcc;
        for(int i=0;i<size;i++)
        {
            EmergencyRequest emergency = reqEmergencyList.get(i);
            if(rowId ==emergency.getId())
            {
                locationCordinate = emergency.getLocation();
                if(emergency.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(emergency.getStatus().matches("False Alaram"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(emergency.getResponse().matches("No Response"))
                {
                    emergency.setResponse((maintenance.getMaintenanceName())+" "+"Responded");
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "Already Responded!!"); 
                }
                

            }

        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select A Row!!");
        }
    }//GEN-LAST:event_respondButtonActionPerformed

    private void falseAlarmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_falseAlarmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_falseAlarmButtonActionPerformed

    
    
    public void populate_table()
    {
        EmergencyRequestDirectory reqEmergencyDirectory=system.getEmergencyRequestDirectory();
        List<EmergencyRequest> reqEmergencyList=reqEmergencyDirectory.getEmergencyUserList();
        int size = reqEmergencyList.size();
        
        for(int i=0;i<size;i++)
        {
            EmergencyRequest emergency = reqEmergencyList.get(i);
            if(emergency.getEmergency().matches("Police"))
            {
            
                DefaultTableModel table2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(emergency.getId());
                
                
                String row[]={s1,emergency.getName(),emergency.getEmergency(),emergency.getLocation(),emergency.getStatus(),emergency.getResponse()};
                table2.addRow(row);
            
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeCaseButton;
    private javax.swing.JButton falseAlarmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton locationButton;
    private javax.swing.JButton respondButton;
    // End of variables declaration//GEN-END:variables
}
