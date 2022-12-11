/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nagarjunmallesh
 */
public class RequestMarketPlaceDirectory {
    List<RequestMarketPlace> productRequestList = new ArrayList<RequestMarketPlace>();

    public List<RequestMarketPlace> getProductRequestList() {
        return productRequestList;
    }

    public void setProductRequestList(List<RequestMarketPlace> productRequestList) {
        this.productRequestList = productRequestList;
    }
    
    public void addProductRequest(RequestMarketPlace productRequest){
        productRequestList.add(productRequest);
    }
    
    public void removeProductRequest(RequestMarketPlace productRequest){
        productRequestList.remove(productRequest);
    }
    
}
