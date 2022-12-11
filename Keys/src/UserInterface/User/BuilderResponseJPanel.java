/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.User;

import Business.Consultant.Consultant;
import Business.EcoSystem;
import Business.Enums.ListingStatus;

import Business.UserAccountManagement.UserAccount;
import Business.WorkQueue.ListingRequest;
import Business.WorkQueue.ListingRequestDirectory;
import Business.User.User;
import Utility.Notification;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nagarjun Mallesh
 */
public class BuilderResponseJPanel extends javax.swing.JPanel {

    EcoSystem system;
    JPanel rightSidePanel;
    /**
     * Creates new form BloodDonations
     *
     * @param system
     * @param rightSidePanel
     */

    UserAccount userAcc;

    public BuilderResponseJPanel(JPanel rightSidePanel, EcoSystem system, UserAccount userAcc) {
        initComponents();
        this.rightSidePanel = rightSidePanel;
        this.system = system;
        this.userAcc = userAcc;
        displayTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listingsTbl = new javax.swing.JTable();
        confirmMoveIn = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Listing Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        listingsTbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "ID", "AptNo", "Address", "Beds", "Baths", "Rent", "Builder", "Status"
                }));
        listingsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listingsTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listingsTbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1110, 400));

        confirmMoveIn.setBackground(new java.awt.Color(51, 51, 255));
        confirmMoveIn.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        confirmMoveIn.setForeground(new java.awt.Color(255, 255, 255));
        confirmMoveIn.setText("Confirm Move-In");
        confirmMoveIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmMoveInActionPerformed(evt);
            }
        });
        jPanel1.add(confirmMoveIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 210, 39));

        cancelButton.setBackground(new java.awt.Color(255, 55, 95));
        cancelButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, 200, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    private void listingsTblMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_listingsTblMouseClicked
        // TODO add your handling code here:
        // txtCost.setText("");
        // jTextAccomodation.setText("");
        //
        // DefaultTableModel table = (DefaultTableModel) ListingsTbl.getModel();
        // int selectedRow=ListingsTbl.getSelectedRow();
        // int sRow=Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
        //
        // ListingRequestDirectory medDir= system.getListingRequestDirectory();
        // List<ListingRequest> listorder=medDir.getListingRequirement();
        // int l=listorder.size();
        // for(int i=0;i<l;i++)
        // {
        // ListingRequest medReq=listorder.get(i);
        // if(sRow==medReq.getId())
        // {
        // Map<String,String> orderMap=medReq.getListingOrderList();
        // int count =1;
        // for (String key: orderMap.keySet()) {
        // jTextAccomodation.append("Item "+ count+ " : "+key+" Quantity :
        // "+orderMap.get(key)+"\n");
        // count++;
        //
        // }
        // Map<String,String> orderMap2=medReq.getListingOrderList();
        // int n=0;
        // for (String key: orderMap2.keySet()) {
        //
        // n=n+(Integer.parseInt(orderMap2.get(key)));
        //
        //
        // }
        // txtCost.append(String.valueOf(n));
        //
        // }
        // }
    }// GEN-LAST:event_listingsTblMouseClicked

    private void confirmMoveInActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmMoveInActionPerformed
        // TODO add your handling code here:
        confirmListing();

    }// GEN-LAST:event_confirmMoveInActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:

        cancelOrder();

    }// GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmMoveIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listingsTbl;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {

        ListingRequestDirectory listingDirectory = system.getListingRequestDirectory();
        List<ListingRequest> order = listingDirectory.getListingRequirement();
        int length = order.size();
        User r = (User) userAcc;
        for (int i = 0; i < length; i++) {
            ListingRequest listingRequest = order.get(i);
            if (listingRequest.getStudentId().matches(r.getUserId())) {
                DefaultTableModel table = (DefaultTableModel) listingsTbl.getModel();
                Object[] row = new Object[8];
                row[0] = listingRequest;
                row[1] = listingRequest.getListings().getAptNo();
                row[2] = listingRequest.getListings().getAddress();
                row[3] = listingRequest.getListings().getNoOfBeds();
                row[4] = listingRequest.getListings().getNoOfBaths();
                row[5] = listingRequest.getListings().getRent();
                row[6] = listingRequest.getBuilderName();
                row[7] = listingRequest.getStatus();
                // String
                // s[]={s1,reqMed.getConsultantName(),reqMed.getBuilderName(),reqMed.getStatus()};
                table.addRow(row);
            }
        }

    }

    private void confirmListing() {
        int selectedListing = listingsTbl.getSelectedRow();
        String emailId = null;
        if (selectedListing < 0) {
            JOptionPane.showMessageDialog(this, "Please select the Listing to confirm");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) listingsTbl.getModel();
        ListingRequest request = (ListingRequest) model.getValueAt(selectedListing, 0);

        if (request.getStatus() == ListingStatus.READY_TO_MOVE_IN) {
            request.setStatus(ListingStatus.LEASED);
            JOptionPane.showMessageDialog(this, "Congrats! House leased successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Not yet available to lease. Process pending approval.");
        }
    }

    public void sendMail(String emailId, String subject, String content) {
        Notification notification = new Notification();
        String toEmail = "aedproject22@gmail.com";
        String emailSubject = subject;
        String emailContent = content;
        notification.sendMail(toEmail, emailSubject, emailContent);
    }

    private void cancelOrder() {
        int selectedListing = listingsTbl.getSelectedRow();
        if (selectedListing >= 0) {
            DefaultTableModel model = (DefaultTableModel) listingsTbl.getModel();
            ListingRequest request = (ListingRequest) model.getValueAt(selectedListing, 0);
            if (request.getStatus() == ListingStatus.RESERVED) {
                request.setStatus(ListingStatus.CANCELLED);
                JOptionPane.showMessageDialog(this, "Listing declined");
            } else {
                JOptionPane.showMessageDialog(this, "Wrong move! Cannot cancel now.");
            }
            displayTable();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
    }
}
