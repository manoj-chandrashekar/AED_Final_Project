/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.User;

import Business.DatabaseUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
//import Utility.MapCoordinates;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import static java.time.InstantSource.system;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Nagarjun Mallesh
 */
public class UserAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserAreaJPanel
     */
    private UserAccount userAcc;
    private EcoSystem system;
    private JPanel container;
    //MapCoordinates locationPoint;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    Timer timer;

    private void Time() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                DateFormat timeFormat = new SimpleDateFormat("HH:mm a");
                String time = timeFormat.format(date);
                timeLabel.setText(time);
            }
        };
        timer = new Timer(100, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    public UserAreaJPanel(JPanel userProcessContainer, UserAccount userAcc, EcoSystem system) {
        initComponents();
        this.system = system;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        Time();
    }

    public void displayRequestTable() {

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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        goBack = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emergencyReport = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        builder = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        survey = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        marketPlace = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        bookAppointment = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, 190, 30));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        goBack.setBackground(new java.awt.Color(255, 255, 255));
        goBack.setPreferredSize(new java.awt.Dimension(100, 48));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goBackMousePressed(evt);
            }
        });
        goBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(115, 120, 128));
        jLabel22.setText("Sign Out");
        goBack.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/exit.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        goBack.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, -1));

        jPanel3.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 290, 60));

        emergencyReport.setBackground(new java.awt.Color(255, 255, 255));
        emergencyReport.setPreferredSize(new java.awt.Dimension(100, 48));
        emergencyReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emergencyReportMousePressed(evt);
            }
        });
        emergencyReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(115, 120, 128));
        jLabel17.setText("Point of contact");
        emergencyReport.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/poclogo.png"))); // NOI18N
        jLabel27.setText("jLabel9");
        emergencyReport.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, -1));

        jPanel3.add(emergencyReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 290, 60));

        builder.setBackground(new java.awt.Color(255, 255, 255));
        builder.setPreferredSize(new java.awt.Dimension(100, 48));
        builder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                builderMousePressed(evt);
            }
        });
        builder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(115, 120, 128));
        jLabel15.setText("View Suggested Listings");
        builder.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/optionslog.png"))); // NOI18N
        jLabel25.setText("jLabel9");
        builder.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, -1));

        jPanel3.add(builder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 290, 60));

        survey.setBackground(new java.awt.Color(255, 255, 255));
        survey.setPreferredSize(new java.awt.Dimension(100, 48));
        survey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                surveyMousePressed(evt);
            }
        });
        survey.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(115, 120, 128));
        jLabel11.setText("Survey");
        survey.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 150, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/managelisting30.png"))); // NOI18N
        jLabel24.setText("jLabel9");
        survey.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, -1));

        jPanel3.add(survey, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 290, 60));

        marketPlace.setBackground(new java.awt.Color(255, 255, 255));
        marketPlace.setPreferredSize(new java.awt.Dimension(100, 48));
        marketPlace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                marketPlaceMousePressed(evt);
            }
        });
        marketPlace.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(115, 120, 128));
        jLabel13.setText("Market place");
        marketPlace.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/marketlogo.png"))); // NOI18N
        jLabel23.setText("jLabel9");
        marketPlace.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        jPanel3.add(marketPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 290, 60));

        bookAppointment.setBackground(new java.awt.Color(255, 255, 255));
        bookAppointment.setPreferredSize(new java.awt.Dimension(100, 48));
        bookAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookAppointmentMousePressed(evt);
            }
        });
        bookAppointment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(115, 120, 128));
        jLabel6.setText("Find A Consultant");
        bookAppointment.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/consultantreq.png"))); // NOI18N
        jLabel18.setText("jLabel9");
        bookAppointment.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jPanel3.add(bookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 60));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 290, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Icons/keyslogo.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 130));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 288, 1080));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel10.setText("User Requests");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(152, 151, 151));
        jLabel1.setText("Find everything that are related to the user queries");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        timeLabel.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        timeLabel.setText("3:45 PM");
        jPanel6.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 20, 190, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1630, 90));

        rightSidePanel.setBackground(new java.awt.Color(250, 249, 251));
        rightSidePanel.setLayout(new java.awt.CardLayout());
        jPanel2.add(rightSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1630, 990));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMousePressed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        dB4OUtil.storeSystem(system);
        //DB4OUtil.dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_goBackMousePressed

    private void bookAppointmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookAppointmentMousePressed
        // TODO add your handling code here:

        bookAppointment();
    }//GEN-LAST:event_bookAppointmentMousePressed

    private void surveyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surveyMousePressed
        // TODO add your handling code here:
        housingQuestionnaire();
    }//GEN-LAST:event_surveyMousePressed

    private void marketPlaceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marketPlaceMousePressed
        // TODO add your handling code here:
        marketPlaceRequest();
    }//GEN-LAST:event_marketPlaceMousePressed

    private void builderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_builderMousePressed
        // TODO add your handling code here:

        BuilderResponse();

    }//GEN-LAST:event_builderMousePressed

    private void emergencyReportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emergencyReportMousePressed
        // TODO add your handling code here:

        emergencyReport();

    }//GEN-LAST:event_emergencyReportMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bookAppointment;
    private javax.swing.JPanel builder;
    private javax.swing.JPanel emergencyReport;
    private javax.swing.JPanel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel marketPlace;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JPanel survey;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

    private void bookAppointment() {

        emergencyReport.setBackground(new Color(255, 255, 255));
        builder.setBackground(new Color(255, 255, 255));
        marketPlace.setBackground(new Color(255, 255, 255));
        survey.setBackground(new Color(255, 255, 255));
        bookAppointment.setBackground(new Color(213, 230, 249));
        ConsultantAppointmentJPanel pr = new ConsultantAppointmentJPanel(system, container, userAcc);
        rightSidePanel.add(pr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);

    }

    private void housingQuestionnaire() {
        
        emergencyReport.setBackground(new Color(255,255,255));
        builder.setBackground(new Color(255,255,255));
        marketPlace.setBackground(new Color(255,255,255));
        bookAppointment.setBackground(new Color(255,255,255));
        survey.setBackground(new Color(213,230,249));
        HousingQuestionnaire questionnaire=new HousingQuestionnaire (system, rightSidePanel,userAcc);
        rightSidePanel.add(questionnaire);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    }
   

    private void marketPlaceRequest() {
        emergencyReport.setBackground(new Color(255, 255, 255));
        builder.setBackground(new Color(255, 255, 255));
        marketPlace.setBackground(new Color(213, 230, 249));
        survey.setBackground(new Color(255, 255, 255));
        bookAppointment.setBackground(new Color(255, 255, 255));
        MarketPlaceGiveawayJPanel pcr = new MarketPlaceGiveawayJPanel(system, container, userAcc);
        rightSidePanel.add(pcr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);

    }

    private void emergencyReport() {
        
    
        emergencyReport.setBackground(new Color(213,230,249));
        builder.setBackground(new Color(255,255,255));
        marketPlace.setBackground(new Color(255,255,255));
        survey.setBackground(new Color(255,255,255));
        bookAppointment.setBackground(new Color(255,255,255));
        EmergencyReport pcr = new EmergencyReport(rightSidePanel,system,userAcc);
        rightSidePanel.add(pcr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    
    
    }


    private void BuilderResponse() {
        emergencyReport.setBackground(new Color(255, 255, 255));
        builder.setBackground(new Color(213, 230, 249));
        marketPlace.setBackground(new Color(255, 255, 255));
        survey.setBackground(new Color(255, 255, 255));
        bookAppointment.setBackground(new Color(255, 255, 255));
        BuilderResponseJPanel pcr = new BuilderResponseJPanel(rightSidePanel, system, userAcc);
        rightSidePanel.add(pcr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);

    }
}
