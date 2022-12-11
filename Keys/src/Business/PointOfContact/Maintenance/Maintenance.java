/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Maintenance;

import Business.Roles.AmbulanceDriver;
import Business.Roles.MaintenanceMan;
import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author nagarjunmallesh
 */
public class Maintenance extends UserAccount {
     private int id;
    private static int count =0;
    private String maintenanceLocation;
    private String maintenanceName;
    private long contactNo;

    public Maintenance(String userId, String pwd, String maintenanceLocation, String maintenanceName, long contactNo) {
        setUsername(userId);
        setPwd(pwd);
        setRole(new MaintenanceMan());
        id =count;
        count = count+1;
        this.maintenanceLocation = maintenanceLocation;
        this.maintenanceName = maintenanceName;
        this.contactNo = contactNo;
    }

    public String getMaintenanceLocation() {
        return maintenanceLocation;
    }

    public void setMaintenanceLocation(String maintenanceLocation) {
        this.maintenanceLocation = maintenanceLocation;
    }

    public String getMaintenanceName() {
        return maintenanceName;
    }

    public void setMaintenanceName(String maintenanceName) {
        this.maintenanceName = maintenanceName;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
    
    
    
    
    
    

}
