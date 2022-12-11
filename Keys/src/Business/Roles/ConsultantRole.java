/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import UserInterface.Consultant.ConsultantViewJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Manoj Chandrasekaran
 */
public class ConsultantRole extends Roles {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new ConsultantViewJPanel(userProcessContainer, account, business);
    }
    //TODO create JPanel
}
