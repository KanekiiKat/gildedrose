package edu.estatuas.gildedrose.items;

public class DextevityVest implements Updateable{


    private String name;
    private int sell_in;
    private int quality;

    public DextevityVest(String name, int quality, int sell_in) {
        this.name = name;
        this.quality = quality;
        this.sell_in = sell_in;
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
