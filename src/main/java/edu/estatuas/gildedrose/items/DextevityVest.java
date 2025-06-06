package edu.estatuas.gildedrose.items;

public class DextevityVest extends NormalItem{


    private String name;
    private int sell_in;
    private int quality;

    public DextevityVest(String name, int quality, int sell_in) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        this.quality = quality;
    }

    public void updateSelling( int sell_in) {
        this.sell_in = sell_in;
    }


}
