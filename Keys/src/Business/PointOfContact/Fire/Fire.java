/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Fire;

/**
 *
 * @author nagarjunmallesh
 */
public class Fire {
    private int id;
    private int count =0;
    private String FireServiceLocation;
    private String FireManName;
    private long contactNo;

    public Fire() {
       
    }

    public Fire(String FireServiceLocation, String FireManName, long contactNo) {
        id = count;
        count= count + 1;
        this.FireServiceLocation = FireServiceLocation;
        this.FireManName = FireManName;
        this.contactNo = contactNo;
    }

    public String getFireServiceLocation() {
        return FireServiceLocation;
    }

    public void setFireServiceLocation(String FireServiceLocation) {
        this.FireServiceLocation = FireServiceLocation;
    }

    public String getFireManName() {
        return FireManName;
    }

    public void setFireManName(String FireManName) {
        this.FireManName = FireManName;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
    
    
    
    
    
    
    
    
}
