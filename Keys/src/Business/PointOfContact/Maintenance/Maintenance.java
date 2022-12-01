/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Maintenance;

/**
 *
 * @author nagarjunmallesh
 */
public class Maintenance {
     private int id;
    private int count =0;
    private String maintenanceCompany;
    private String maintenanceName;
    private long contactNo;

    public Maintenance(String maintenanceCompany, String maintenanceName, long contactNo) {
        id =count;
        count = count+1;
        this.maintenanceCompany = maintenanceCompany;
        this.maintenanceName = maintenanceName;
        this.contactNo = contactNo;
    }

    public String getMaintenanceCompany() {
        return maintenanceCompany;
    }

    public void setMaintenanceCompany(String maintenanceCompany) {
        this.maintenanceCompany = maintenanceCompany;
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
