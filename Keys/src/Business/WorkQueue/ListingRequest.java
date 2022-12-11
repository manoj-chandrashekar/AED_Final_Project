/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Builder.Listings;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nagarjunmallesh
 */
public class ListingRequest {
    String builderName;
    int id;
    String studentId;
    String status;
    Listings listing;
    String consultantName;

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Listings getListings() {
        return listing;
    }

    public void setListings(Listings listing) {
        this.listing = listing;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }
    
     @Override
    public String toString(){
        return String.valueOf(id);
    }
    
    
    
}
