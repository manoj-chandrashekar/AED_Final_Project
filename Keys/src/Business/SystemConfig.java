/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Roles.System_Admin;
import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author Manoj Chandrasekaran
 */
public class SystemConfig {

    public static EcoSystem configureSystem() {

        EcoSystem system = EcoSystem.getInstance();

        UserAccount ua = system.getUserAccDirectory().createUserAccount("sysadmin", "sysadmin", new System_Admin());

        return system;
    }
}
