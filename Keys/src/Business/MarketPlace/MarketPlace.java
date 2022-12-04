/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.MarketPlace;

import Business.Roles.Admin_Marketplace;
import Business.UserAccountManagement.UserAccount;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sanjay Bhaskar Kashyap
 */
public class MarketPlace extends UserAccount {
     Map<String, Integer> marketMap = new HashMap<String, Integer>();
     String userId;
    String password; 
    String storeName;
    String storeLocation;
   
       
    public MarketPlace(String storeName, String storeLocation, String userId, String password) {
       setUsername(userId);
        setPwd(password);
        setRole(new Admin_Marketplace());
        this.storeName = storeName;
        this.storeLocation = storeLocation;
        this.userId = userId;
        this.password = password;
    }
    
    // Generate the getter and setter method the variables
    public String getUserNames() {
        return storeName;
    }

    public void setUserNames(String userName) {
        this.storeName = userName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Integer> getMarketMap() {
        return marketMap;
    }

    public void setMarketMap(Map<String, Integer> marketMap) {
        this.marketMap = marketMap;
    }

}
  
