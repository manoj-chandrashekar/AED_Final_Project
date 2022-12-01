/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Consultant;

import java.util.ArrayList;

/**
 *
 * @author Manoj Chandrasekaran
 */
public class ConsultantDirectory {

    ArrayList<Consultant> consultants = new ArrayList<>();

    public ArrayList<Consultant> getConsultants() {
        return consultants;
    }

    public void setConsultants(ArrayList<Consultant> consultants) {
        this.consultants = consultants;
    }

    public void addNewConsultant(Consultant consultant) {
        consultants.add(consultant);
    }

    public void removeConsultant(Consultant consultant) {
        consultants.remove(consultant);
    }

    public Consultant findConsultant(String name) {
        for (Consultant consultant : consultants) {
            if (consultant.getName().equals(name)) {
                return consultant;
            }
        }
        return null;
    }
}
