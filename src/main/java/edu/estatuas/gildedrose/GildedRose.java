package edu.estatuas.gildedrose;

import java.util.ArrayList;
import java.util.List;

import edu.estatuas.gildedrose.items.Updateable;


public class GildedRose {

    private List<Updateable> inventory = new ArrayList<Updateable>();

    public GildedRose() {
    }

    public List<Updateable> inventory(){
        return this.inventory;
    }

    public void addItem(Updateable item){
        inventory.add(item);
    }


    public void updateQuality() {
        for (Updateable item : inventory){
            item.updateQuality();
        }
    }

    @Override
    public String toString(){
        StringBuilder stringitem = new StringBuilder();
        for (Updateable item : inventory){
            stringitem.append(item.toString() + "\n");
        }
        return stringitem.toString();
    }
    
}
