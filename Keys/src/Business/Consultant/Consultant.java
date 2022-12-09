/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Consultant;

import Business.Roles.ConsultantRole;
import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author Manoj Chandrasekaran
 */
public class Consultant extends UserAccount {
    
    String userId;
    String accPassword;
    String name;
    String specialization;
    Long phoneNo;
    String rentalAgency;

    public Consultant(String userId, String accPassword, String name, String specialization, Long phoneNo, String rentalAgency) {
        setUsername(userId);
        setPwd(accPassword);
        setRole(new ConsultantRole());
        this.userId = userId;
        this.accPassword = accPassword;
        this.name = name;
        this.specialization = specialization;
        this.phoneNo = phoneNo;
        this.rentalAgency = rentalAgency;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getRentalAgency() {
        return rentalAgency;
    }

    public void setRentalAgency(String rentalAgency) {
        this.rentalAgency = rentalAgency;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
