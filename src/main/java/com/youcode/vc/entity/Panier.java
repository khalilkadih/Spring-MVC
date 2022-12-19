/*
package com.youcode.vc.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Panier implements Serializable {
private Map<Long,CommandItem> items= new HashMap<Long,CommandItem>();

public void addArticle(Product product,int quantite){
    if(items.get(product.getId())==null){
        CommandItem commandItem= new CommandItem();
        commandItem.setProduct(product);
        commandItem.setItemQuantity(quantite);
        commandItem.setItemUnitPrice(product.getProductPrice());

    }
    else {
        CommandItem commandItem= items.get(product.getId());
        commandItem.setItemQuantity(commandItem.getItemQuantity()+quantite);
    }

}
public Collection<CommandItem> getItem(){
    return items.values();
}
public  double getTotatl(){
    double totale=0;
    for(CommandItem commandItem: items.values()){
        totale+=commandItem.getItemUnitPrice()*commandItem.getItemQuantity();
    }
    return  totale;

}

}
*/
