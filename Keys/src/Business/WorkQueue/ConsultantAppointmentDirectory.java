/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manoj Chandrasekaran
 */
public class ConsultantAppointmentDirectory {
    
    List<ConsultantAppointment> appointments = new ArrayList<>();

    public List<ConsultantAppointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<ConsultantAppointment> appointments) {
        this.appointments = appointments;
    }
    
    public void removeRequest(ConsultantAppointment appointment){
        appointments.remove(appointment);
    }
    
    public void addRequest(ConsultantAppointment appointment){
        appointments.add(appointment);
    }
    
}
