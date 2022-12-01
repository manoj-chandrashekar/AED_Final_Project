/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Maintenance;

import java.util.ArrayList;

/**
 *
 * @author nagarjunmallesh
 */
public class MaintenanceDirectory {
    ArrayList<Maintenance> maintenanceDirectory = new ArrayList<>();

    public MaintenanceDirectory() {
    }
    

    public ArrayList<Maintenance> getMaintenanceDirectory() {
        return maintenanceDirectory;
    }

    public void setMaintenanceDirectory(ArrayList<Maintenance> maintenanceDirectory) {
        this.maintenanceDirectory = maintenanceDirectory;
    }
    
    
}
