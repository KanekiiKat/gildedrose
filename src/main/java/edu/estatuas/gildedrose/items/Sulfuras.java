package edu.estatuas.gildedrose.items;

public class Sulfuras extends NormalItem{
    
    private String name;
    private int sell_in;
    private int quality;


    public Sulfuras(String name, int quality, int sell_in) {
        super(name, sell_in, quality);
    }

    
    @Override
    public void updateQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public void updateSelling( int sell_in) {
        this.sell_in = sell_in;
    }

    
}
