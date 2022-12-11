/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Fire;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nagarjunmallesh
 */
public class FireDirectory {
    
    List<Fire> fireList = new ArrayList<>();

    public FireDirectory() {
    }

    public List<Fire> getFireDirectory() {
        return fireList;
    }

    public void setFireDirectory(List<Fire> fireList) {
        this.fireList = fireList;
    }
    
    public void addFire(Fire item) {
        fireList.add(item);
    }
    
    public void removeFire(Fire item) {
        fireList.remove(item);
    }
    
    
}
