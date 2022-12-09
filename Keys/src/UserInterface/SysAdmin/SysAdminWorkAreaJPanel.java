/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysAdmin;

import Business.DatabaseUtil.DB4OUtil;
import Business.EcoSystem;
import UserInterface.UserLogin;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Manoj Chandrasekaran
 */

public class SysAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminWorkAreaJPanel
     */
    JPanel container;
    EcoSystem ecosystem;
    // private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public SysAdminWorkAreaJPanel(JPanel container,EcoSystem ecosystem) {
        initComponents();
       // ecosystem = dB4OUtil.retrieveSystem();
        this.setSize(1920, 1080);
        this.container=container;
        this.ecosystem=ecosystem;
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
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pharmaButton = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        emergencyButton = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nonProfitButton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        governmentButton = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hospitalButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        exitLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel1.setText("Enterprise");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(193, 192, 193));
        jLabel2.setText("Easily manage your enteprise in this section");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-supplement-bottle-96.png"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 87));

        jLabel12.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel12.setText("Builder Enterprise");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(106, 110, 133));
        jLabel13.setText("house availability and new listings");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 230, 30));

        jLabel14.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(106, 110, 133));
        jLabel14.setText("Place where you can manage Builder's");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 280, 30));

        pharmaButton.setBackground(new java.awt.Color(51, 51, 255));
        pharmaButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        pharmaButton.setForeground(new java.awt.Color(255, 255, 255));
        pharmaButton.setText("Manage");
        pharmaButton.setBorder(null);
        pharmaButton.setFocusPainted(false);
        jPanel4.add(pharmaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 180, 40));

        jLabel23.setText("jLabel23");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, 107));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 160, 430, 290));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-siren-96.png"))); // NOI18N
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 87));

        jLabel20.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel20.setText("Student POC Enterprise");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel21.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(106, 110, 133));
        jLabel21.setText("Fire, medical and personal emergency");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 250, 30));

        jLabel22.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(106, 110, 133));
        jLabel22.setText("Place where you can manage emergencies");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 290, 30));

        emergencyButton.setBackground(new java.awt.Color(51, 51, 255));
        emergencyButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        emergencyButton.setForeground(new java.awt.Color(255, 255, 255));
        emergencyButton.setText("Manage");
        emergencyButton.setBorder(null);
        emergencyButton.setFocusPainted(false);
        jPanel6.add(emergencyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 180, 40));

        jLabel25.setText("jLabel23");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 99, 101));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, 430, 290));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-world-health-organization-96.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 87));

        jLabel4.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel4.setText("Marketplace Enterprise");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, -1));

        jLabel5.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(106, 110, 133));
        jLabel5.setText("Student essentials marketplace");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, 30));

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(106, 110, 133));
        jLabel6.setText("Place where you can manage marketplace");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 280, 30));

        nonProfitButton.setBackground(new java.awt.Color(51, 51, 255));
        nonProfitButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        nonProfitButton.setForeground(new java.awt.Color(255, 255, 255));
        nonProfitButton.setText("Manage");
        nonProfitButton.setBorder(null);
        nonProfitButton.setFocusPainted(false);
        jPanel2.add(nonProfitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 180, 40));

        jLabel26.setText("jLabel23");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 108, 74));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 430, 290));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-city-hall-96.png"))); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 87));

        jLabel16.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel16.setText("Housing Board Dev Enterprise");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel17.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(106, 110, 133));
        jLabel17.setText("See student requirement trends");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 230, 30));

        jLabel18.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(106, 110, 133));
        jLabel18.setText("Place where you can manage housing board");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 300, 30));

        governmentButton.setBackground(new java.awt.Color(51, 51, 255));
        governmentButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        governmentButton.setForeground(new java.awt.Color(255, 255, 255));
        governmentButton.setText("Manage");
        governmentButton.setBorder(null);
        governmentButton.setFocusPainted(false);
        jPanel5.add(governmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 180, 40));

        jLabel27.setText("jLabel23");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 120, 66));

        jLabel28.setText("jLabel23");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 108, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 430, 290));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-hospital-room-96.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 87));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel8.setText("Consultant Enterprise");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(106, 110, 133));
        jLabel9.setText("Rental consultants for student housing");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 250, 30));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(106, 110, 133));
        jLabel10.setText("Place where you can manage consultants");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 280, 30));

        hospitalButton.setBackground(new java.awt.Color(51, 51, 255));
        hospitalButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        hospitalButton.setForeground(new java.awt.Color(255, 255, 255));
        hospitalButton.setText("Manage");
        hospitalButton.setBorder(null);
        hospitalButton.setFocusPainted(false);
        jPanel3.add(hospitalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 180, 40));

        jLabel24.setText("jLabel23");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, 74));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 430, 290));

        exitLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitLabel1MousePressed(evt);
            }
        });
        jPanel1.add(exitLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 30, 60, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabel1MousePressed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_exitLabel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton emergencyButton;
    private javax.swing.JLabel exitLabel1;
    private javax.swing.JButton governmentButton;
    private javax.swing.JButton hospitalButton;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton nonProfitButton;
    private javax.swing.JButton pharmaButton;
    // End of variables declaration//GEN-END:variables
}
