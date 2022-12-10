/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Builder;

import Business.Roles.BuilderAdmin;
import Business.UserAccountManagement.UserAccount;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Manoj Chandrasekaran
 */
public class Builder extends UserAccount {
    
    private String builderName;
    private String builderLocation;
    private String builderEmail;
    private String builderUserID;
    private String builderPassword;
    public Map<String, String> listings = new HashMap<>();

    public Builder(String builderName, String builderLocation, String builderEmail, String builderUserID, String builderPassword) {
        setUsername(builderUserID);
        setPwd(builderPassword);
        setRole(new BuilderAdmin());
        this.builderName = builderName;
        this.builderLocation = builderLocation;
        this.builderEmail = builderEmail;
        this.builderUserID = builderUserID;
        this.builderPassword = builderPassword;
    }

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public String getBuilderLocation() {
        return builderLocation;
    }

    public void setBuilderLocation(String builderLocation) {
        this.builderLocation = builderLocation;
    }

    public String getBuilderEmail() {
        return builderEmail;
    }

    public void setBuilderEmail(String builderEmail) {
        this.builderEmail = builderEmail;
    }

    public String getBuilderUserID() {
        return builderUserID;
    }

    public void setBuilderUserID(String builderUserID) {
        this.builderUserID = builderUserID;
    }

    public String getBuilderPassword() {
        return builderPassword;
    }

    public void setBuilderPassword(String builderPassword) {
        this.builderPassword = builderPassword;
    }

    public Map<String, String> getListings() {
        return listings;
    }

    public void setListings(Map<String, String> listings) {
        this.listings = listings;
    }
    
    
}


