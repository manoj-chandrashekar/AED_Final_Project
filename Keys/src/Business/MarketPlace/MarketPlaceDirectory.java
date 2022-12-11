/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.MarketPlace;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manoj Chandrasekaran
 */
public class MarketPlaceDirectory {
    
    private List<MarketPlace> marketPlaces = new ArrayList<>();

    
    public List<MarketPlace> getMarketPlaces() {
        return marketPlaces;
    }

    public void setMarketPlaces(List<MarketPlace> marketPlaces) {
        this.marketPlaces = marketPlaces;
    }
    
    // Add item to the market place list
    public void addMarketPlace(MarketPlace item) {
        marketPlaces.add(item);
    }
    
    // removing the market plcae from the market place list to save storage
    public void removeMarketPlace(MarketPlace item) {
        marketPlaces.remove(item);
    }

    
    
    
}
