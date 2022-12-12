/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Builder.BuilderDirectory;
import Business.Builder.ListingsDirectory;
import Business.Consultant.ConsultantDirectory;
import Business.HouseDevelopmentBoard.QuestionnaireDirectory;
import Business.PointOfContact.Ambulance.AmbulanceDirectory;
import Business.PointOfContact.Fire.FireDirectory;
import Business.PointOfContact.Maintenance.MaintenanceDirectory;
import Business.UserAccountManagement.UserAccountDirectory;
import Business.WorkQueue.EmergencyRequestDirectory;
import Business.WorkQueue.ConsultantAppointmentDirectory;
import Business.WorkQueue.SearchApplication;
import Business.MarketPlace.MarketPlaceDirectory;
import Business.Surveyor.SurveyorDirectory;
import Business.WorkQueue.DonateProductDirectory;
import Business.WorkQueue.ListingRequestDirectory;
import Business.User.UserDirectory;
import Business.WorkQueue.RequestMarketPlaceDirectory;

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
    private RequestMarketPlaceDirectory requestMarketPlaceDirectory;
    private EmergencyRequestDirectory emergencyRequestDirectory;
    private ConsultantAppointmentDirectory consultantAppointmentDir;
    private MarketPlaceDirectory marketPlaceDirectory;
    private DonateProductDirectory donateProdirectory;
    private QuestionnaireDirectory questionnaireDirectory;
    private BuilderDirectory builderDirectory;
    private ListingRequestDirectory listingRequestDirectory;
    private SearchApplication checkApplication;
    private UserDirectory userDirectory;
    private SurveyorDirectory surveyorDirectory;
    

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
        userDirectory = new UserDirectory();
        requestMarketPlaceDirectory = new RequestMarketPlaceDirectory();
        questionnaireDirectory = new QuestionnaireDirectory();
        surveyorDirectory = new SurveyorDirectory();
    }

    public SurveyorDirectory getSurveyorDirectory() {
        if(surveyorDirectory == null){
            surveyorDirectory = new SurveyorDirectory();   
        }
        return surveyorDirectory;
    }

    public void setSurveyorDirectory(SurveyorDirectory surveyorDirectory) {
        this.surveyorDirectory = surveyorDirectory;
    }
    
    

    public QuestionnaireDirectory getQuestionnaireDirectory() {
        if(questionnaireDirectory == null){
            questionnaireDirectory = new QuestionnaireDirectory();

        }
        return questionnaireDirectory;
    }

    public void setQuestionnaireDirectory(QuestionnaireDirectory questionnaireDirectory) {
        this.questionnaireDirectory = questionnaireDirectory;
    }
    
    

    public RequestMarketPlaceDirectory getRequestMarketPlaceDirectory() {
        if(requestMarketPlaceDirectory == null){
            requestMarketPlaceDirectory = new RequestMarketPlaceDirectory();
        }
        return requestMarketPlaceDirectory;
    }

    public void setRequestMarketPlaceDirectory(RequestMarketPlaceDirectory requestMarketPlaceDirectory) {
        this.requestMarketPlaceDirectory = requestMarketPlaceDirectory;
    }

    public UserDirectory getUserDirectory() {
        if(userDirectory == null){
            userDirectory = new UserDirectory();
        }
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public ListingRequestDirectory getListingRequestDirectory() {
        if(listingRequestDirectory == null){
            listingRequestDirectory = new ListingRequestDirectory();
        }
        return listingRequestDirectory;
    }

    public void setListingRequestDirectory(ListingRequestDirectory listingRequestDirectory) {
        this.listingRequestDirectory = listingRequestDirectory;
    }

    public DonateProductDirectory getDonateProdirectory() {
        if(donateProdirectory == null){
            donateProdirectory = new DonateProductDirectory();
        }
        return donateProdirectory;
    }

    public void setDonateProdirectory(DonateProductDirectory donateProdirectory) {
        this.donateProdirectory = donateProdirectory;
    }

    public MarketPlaceDirectory getMarketPlaceDirectory() {
        if(marketPlaceDirectory == null){
            marketPlaceDirectory = new MarketPlaceDirectory();
        }
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
        if(consultantAppointmentDir == null) {
            consultantAppointmentDir = new ConsultantAppointmentDirectory();
        }
        return consultantAppointmentDir;
    }

    public void setConsultantAppointmentDir(ConsultantAppointmentDirectory consultantAppointmentDir) {
        this.consultantAppointmentDir = consultantAppointmentDir;
    }

    public UserAccountDirectory getUserAccDirectory() {
        if(userAccDirectory == null) {
            userAccDirectory = new UserAccountDirectory();
        }
        return userAccDirectory;
    }

    public void setUserAccDirectory(UserAccountDirectory userAccDirectory) {
        this.userAccDirectory = userAccDirectory;
    }

    public ListingsDirectory getListingsDirectory() {
        if(listingsDirectory == null) {
            listingsDirectory = new ListingsDirectory();
        }
        return listingsDirectory;
    }

    public void setListingsDirectory(ListingsDirectory listingsDirectory) {
        this.listingsDirectory = listingsDirectory;
    }

    public ConsultantDirectory getConsultantDirectory() {
        if(consultantDirectory == null) {
            consultantDirectory = new ConsultantDirectory();
        }
        return consultantDirectory;
    }

    public void setConsultantDirectory(ConsultantDirectory consultantDirectory) {
        this.consultantDirectory = consultantDirectory;
    }

    public AmbulanceDirectory getAmbulanceDirectory() {
        if(ambulanceDirectory == null) {
            ambulanceDirectory = new AmbulanceDirectory();
        }
        return ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public FireDirectory getFireDirectory() {
        if(fireDirectory == null) {
            fireDirectory = new FireDirectory();
        }
        return fireDirectory;
    }

    public void setFireDirectory(FireDirectory fireDirectory) {
        this.fireDirectory = fireDirectory;
    }

    public MaintenanceDirectory getMaintenanceDirectory() {
        if(maintenanceDirectory == null) {
            maintenanceDirectory = new MaintenanceDirectory();
        }
        return maintenanceDirectory;
    }

    public void setMaintenanceDirectory(MaintenanceDirectory maintenanceDirectory) {
        this.maintenanceDirectory = maintenanceDirectory;
    }

    public EmergencyRequestDirectory getEmergencyRequestDirectory() {
        if(emergencyRequestDirectory == null) {
            emergencyRequestDirectory = new EmergencyRequestDirectory();
        }
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
