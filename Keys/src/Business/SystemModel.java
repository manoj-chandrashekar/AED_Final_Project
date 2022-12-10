/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Builder.BuilderDirectory;
import Business.Builder.ListingsDirectory;
import Business.Consultant.ConsultantDirectory;
import Business.PointOfContact.Ambulance.AmbulanceDirectory;
import Business.PointOfContact.Fire.FireDirectory;
import Business.PointOfContact.Maintenance.MaintenanceDirectory;
import Business.UserAccountManagement.UserAccountDirectory;
import Business.WorkQueue.EmergencyRequestDirectory;
import Business.WorkQueue.ConsultantAppointmentDirectory;
import Business.WorkQueue.SearchApplication;
import Business.MarketPlace.MarketPlaceDirectory;
import Business.WorkQueue.DonateProductDirectory;
import Business.WorkQueue.ListingRequestDirectory;

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
    private ConsultantAppointmentDirectory consultantAppointmentDir;
    private MarketPlaceDirectory marketPlaceDirectory;
    private DonateProductDirectory donateProdirectory;

    private BuilderDirectory builderDirectory;
    private ListingRequestDirectory listingRequestDirectory;
    private SearchApplication checkApplication;

    public SystemModel() {
        userAccDirectory = new UserAccountDirectory();
        listingsDirectory = new ListingsDirectory();
        consultantDirectory = new ConsultantDirectory();
        ambulanceDirectory = new AmbulanceDirectory();
        fireDirectory = new FireDirectory();
        maintenanceDirectory = new MaintenanceDirectory();
        emergencyRequestDirectory = new EmergencyRequestDirectory();
        consultantDirectory = new ConsultantDirectory();
        checkApplication = new SearchApplication();
        builderDirectory = new BuilderDirectory();
        marketPlaceDirectory = new MarketPlaceDirectory();
        donateProdirectory = new DonateProductDirectory();
        listingRequestDirectory = new ListingRequestDirectory();
    }

    public ListingRequestDirectory getListingRequestDirectory() {
        return listingRequestDirectory;
    }

    public void setListingRequestDirectory(ListingRequestDirectory listingRequestDirectory) {
        this.listingRequestDirectory = listingRequestDirectory;
    }

    public DonateProductDirectory getDonateProdirectory() {
        return donateProdirectory;
    }

    public void setDonateProdirectory(DonateProductDirectory donateProdirectory) {
        this.donateProdirectory = donateProdirectory;
    }

    public MarketPlaceDirectory getMarketPlaceDirectory() {
        return marketPlaceDirectory;
    }

    public void setMarketPlaceDirectory(MarketPlaceDirectory marketPlaceDirectory) {
        this.marketPlaceDirectory = marketPlaceDirectory;
    }

    public SearchApplication getCheckApplication() {
        if (checkApplication == null) {
            checkApplication = new SearchApplication();
        }
        return checkApplication;
    }

    public void setCheckApplication(SearchApplication checkApplication) {
        this.checkApplication = checkApplication;
    }

    public ConsultantAppointmentDirectory getConsultantAppointmentDir() {
        return consultantAppointmentDir;
    }

    public void setConsultantAppointmentDir(ConsultantAppointmentDirectory consultantAppointmentDir) {
        this.consultantAppointmentDir = consultantAppointmentDir;
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

    public BuilderDirectory getBuilderDirectory() {
        if (builderDirectory == null) {
            builderDirectory = new BuilderDirectory();
        }
        return builderDirectory;
    }

    public void setBuilderDirectory(BuilderDirectory builderDirectory) {
        this.builderDirectory = builderDirectory;
    }

}
