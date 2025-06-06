package edu.estatuas.gildedrose;

import java.util.ArrayList;
import java.util.List;

import edu.estatuas.gildedrose.items.Updateable;


public class GildedRose {

    private List<Updateable> inventory = new ArrayList<Updateable>();

    public GildedRose() {
    }

    public List<Updateable> inventory(){
        return inventory;
    }

    public void addItem(Updateable item){
        inventory.add(item);
    }

    @Override
    public String toString(){
        return inventory.toString();
    }


    public void updateQuality() {
        for (Updateable item : inventory){
            item.updateQuality();
        }
    }

    
    
}
