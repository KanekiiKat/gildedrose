package edu.estatuas.gildedrose.items;

public class Conjured extends NormalItem{
    
    public Conjured(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        if (getSell_in() > 0){
            computeQuality(-2);
        } else if (getSell_in() <= 0){
            computeQuality(-4);
        }
        setSell_in();
    }
      

    
}
