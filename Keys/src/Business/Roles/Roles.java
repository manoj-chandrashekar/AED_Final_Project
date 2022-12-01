/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.UserAccountManagement.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Manoj Chandrasekaran
 */
public abstract class Roles {
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public enum TypeOfRole {

        Admin_Builder("AdminBuilder"),
        Student("Student"),
        Consultant("Consultant"),
        Admin_Marketplace("AdminMarketplace"),
        Admin_PointOfContact("AdminPoc"),
        System_Admin("SysAdmin");

        private String value;

        private TypeOfRole(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
