/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nagarjunmallesh
 */
public class ListingsDirectory {
    
    List<Listings> listings = new ArrayList<>();

    public List<Listings> getListings() {
        return listings;
    }

    public void setListings(List<Listings> listings) {
        this.listings = listings;
    }
    
    //add listing
    public void addListing(Listings listing) {
        listings.add(listing);
    }
    
    //Remove a listing
    public void removeListing(Listings listing) {
        listings.remove(listing);
    }
}
