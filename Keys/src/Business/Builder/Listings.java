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
    private static int counter = 0;
    private int aptNo;
    private String address;
    private int noOfBeds;
    private int noOfBaths;
    private String houseSpecifications;
    private double rent; 
    private boolean isAvailable;

    public Listings(int aptNo, String address, int noOfBeds, int noOfBaths, String houseSpecifications, double rent, boolean isAvailable) {
        id = counter;
        counter = counter + 1;
        this.aptNo = aptNo;
        this.address = address;
        this.noOfBeds = noOfBeds;
        this.noOfBaths = noOfBaths;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public int getNoOfBaths() {
        return noOfBaths;
    }

    public void setNoOfBaths(int noOfBaths) {
        this.noOfBaths = noOfBaths;
    }

    @Override
    public String toString() {
        return String.valueOf(aptNo);
    }
    
    
    
}
