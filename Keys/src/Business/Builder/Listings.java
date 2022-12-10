/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Builder;

/**
 *
 * @author nagarjunmallesh
 */
public class Listings {
    private int id;
    private int counter = 0;
    private int aptNo;
    private String address;
    private String houseSpecifications;
    private double rent; 
    private Boolean isAvailable;

    public Listings(int aptNo, String address, String houseSpecifications, double rent, Boolean isAvailable) {
        id = counter;
        counter = counter + 1;
        this.aptNo = aptNo;
        this.address = address;
        this.houseSpecifications = houseSpecifications;
        this.rent = rent;
        this.isAvailable = isAvailable;
    }

    public int getAptNo() {
        return aptNo;
    }

    public void setAptNo(int aptNo) {
        this.aptNo = aptNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseSpecifications() {
        return houseSpecifications;
    }

    public void setHouseSpecifications(String houseSpecifications) {
        this.houseSpecifications = houseSpecifications;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
    
    
    
}
