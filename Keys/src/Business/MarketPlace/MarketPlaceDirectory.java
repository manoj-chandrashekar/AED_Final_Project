/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.MarketPlace;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nagarjunmallesh
 */
public class MarketPlaceDirectory {
    
    List<MarketPlace> marketPlaceList = new ArrayList<MarketPlace>();

    public List<MarketPlace> getMarketPlaceList() {
        return marketPlaceList;
    }

    public void setMarketPlaceList(List<MarketPlace> marketPlaceList) {
        this.marketPlaceList = marketPlaceList;
    }
    
    public void addMarketPlace(MarketPlace store){
        marketPlaceList.add(store);
    }
    
    public void removeMarketPlace(MarketPlace store){
        marketPlaceList.remove(store);
    }
    
}
