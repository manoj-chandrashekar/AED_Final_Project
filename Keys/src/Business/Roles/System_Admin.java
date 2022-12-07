/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import UserInterface.SysAdmin.SysAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Manoj Chandrasekaran
 */
public class System_Admin extends Roles {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        return new SysAdminWorkAreaJPanel(userProcessContainer, ecoSystem);
    }
    
}
