/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Ambulance;

/**
 *
 * @author nagarjunmallesh
 */
public class Ambulance {
    private int id;
    private int count = 0;
    private String ambulanceServiceName;
    private String driverName;
    private long contactNo;

    public Ambulance(String ambulanceServiceName, String driverName, long contactNo) {
        id = count;
        count = count+1;
        this.ambulanceServiceName = ambulanceServiceName;
        this.driverName = driverName;
        this.contactNo = contactNo;
    }

    public String getAmbulanceServiceName() {
        return ambulanceServiceName;
    }

    public void setAmbulanceServiceName(String ambulanceServiceName) {
        this.ambulanceServiceName = ambulanceServiceName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
    
    
    
    
}
