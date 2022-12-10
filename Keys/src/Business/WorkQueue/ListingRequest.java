/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.HashMap;
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
    Map<String, String> listingOrderList = new HashMap<String, String>();
    Map<String, String> listingCostList = new HashMap<String, String>();
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

    public Map<String, String> getListingOrderList() {
        return listingOrderList;
    }

    public void setListingOrderList(Map<String, String> listingOrderList) {
        this.listingOrderList = listingOrderList;
    }

    public Map<String, String> getListingCostList() {
        return listingCostList;
    }

    public void setListingCostList(Map<String, String> listingCostList) {
        this.listingCostList = listingCostList;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }
    
    
    
}
