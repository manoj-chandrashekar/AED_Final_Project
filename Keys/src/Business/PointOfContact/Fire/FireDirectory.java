/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PointOfContact.Fire;

import java.util.ArrayList;

/**
 *
 * @author nagarjunmallesh
 */
public class FireDirectory {
    
    ArrayList<Fire> fireDirectory = new ArrayList<>();

    public FireDirectory() {
    }

    public ArrayList<Fire> getFireDirectory() {
        return fireDirectory;
    }

    public void setFireDirectory(ArrayList<Fire> fireDirectory) {
        this.fireDirectory = fireDirectory;
    }
    
    
}
