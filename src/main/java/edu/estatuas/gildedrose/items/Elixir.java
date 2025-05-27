package edu.estatuas.gildedrose.items;

public class Elixir extends NormalItem{
    
    private String name;
    private int sell_in;
    private int quality;

    public Elixir(String name, int sell_in, int quality) {
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


    public String getName() {
        return name;
    }


    public int getSell_in() {
        return sell_in;
    }



}
