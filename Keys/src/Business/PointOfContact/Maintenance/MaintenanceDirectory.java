/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Maintenance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nagarjunmallesh
 */
public class MaintenanceDirectory {
    List<Maintenance> maintenanceList = new ArrayList<>();

    public MaintenanceDirectory() {
    }
    

    public List<Maintenance> getMaintenanceList() {
        return maintenanceList;
    }

    public void setMaintenanceList(List<Maintenance> maintenanceList) {
        this.maintenanceList = maintenanceList;
    }
    
    public void addNewMaintenance(Maintenance maintenance) {
        maintenanceList.add(maintenance);
    }
    
    public void removeMaintenance(Maintenance maintenance) {
        maintenanceList.remove(maintenance);
    }
    
    
}
