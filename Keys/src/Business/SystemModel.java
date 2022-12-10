/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Builder.ListingsDirectory;
import Business.Consultant.ConsultantDirectory;
import Business.PointOfContact.Ambulance.AmbulanceDirectory;
import Business.PointOfContact.Fire.FireDirectory;
import Business.PointOfContact.Maintenance.MaintenanceDirectory;
import Business.UserAccountManagement.UserAccountDirectory;
import Business.WorkQueue.EmergencyRequestDirectory;

/**
 *
 * @author Manoj Chandrasekaran
 */
public class SystemModel {
    
    private UserAccountDirectory userAccDirectory;
    private ListingsDirectory listingsDirectory;
    private ConsultantDirectory consultantDirectory;
    private AmbulanceDirectory ambulanceDirectory;
    private FireDirectory fireDirectory;
    private MaintenanceDirectory maintenanceDirectory;
    private EmergencyRequestDirectory emergencyRequestDirectory;

    public SystemModel() {
        userAccDirectory = new UserAccountDirectory();
        listingsDirectory = new ListingsDirectory();
        consultantDirectory = new ConsultantDirectory();
        ambulanceDirectory = new AmbulanceDirectory();
        fireDirectory = new FireDirectory();
        maintenanceDirectory = new MaintenanceDirectory();
        emergencyRequestDirectory = new EmergencyRequestDirectory();
    }

    public UserAccountDirectory getUserAccDirectory() {
        return userAccDirectory;
    }

    public void setUserAccDirectory(UserAccountDirectory userAccDirectory) {
        this.userAccDirectory = userAccDirectory;
    }

    public ListingsDirectory getListingsDirectory() {
        return listingsDirectory;
    }

    public void setListingsDirectory(ListingsDirectory listingsDirectory) {
        this.listingsDirectory = listingsDirectory;
    }

    public ConsultantDirectory getConsultantDirectory() {
        return consultantDirectory;
    }

    public void setConsultantDirectory(ConsultantDirectory consultantDirectory) {
        this.consultantDirectory = consultantDirectory;
    }

    public AmbulanceDirectory getAmbulanceDirectory() {
        return ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public FireDirectory getFireDirectory() {
        return fireDirectory;
    }

    public void setFireDirectory(FireDirectory fireDirectory) {
        this.fireDirectory = fireDirectory;
    }

    public MaintenanceDirectory getMaintenanceDirectory() {
        return maintenanceDirectory;
    }

    public void setMaintenanceDirectory(MaintenanceDirectory maintenanceDirectory) {
        this.maintenanceDirectory = maintenanceDirectory;
    }

    public EmergencyRequestDirectory getEmergencyRequestDirectory() {
        return emergencyRequestDirectory;
    }

    public void setEmergencyRequestDirectory(EmergencyRequestDirectory emergencyRequestDirectory) {
        this.emergencyRequestDirectory = emergencyRequestDirectory;
    }
    
    
    
    
}
