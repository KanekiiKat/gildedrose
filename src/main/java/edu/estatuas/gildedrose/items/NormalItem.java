package edu.estatuas.gildedrose.items;

public class NormalItem implements Updateable{

    private String name;
    private int sell_in;
    private int quality;


    NormalItem(String name, int sell_in, int quality) {
        this.name = name;
        this.quality = quality;
        this.sell_in = sell_in;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getSell_in() {
        return sell_in;
    }



    public double getQuality() {
        return quality;
    }

    @Override
    public void updateQuality(int quality) {
        this.quality = quality;
    }
    @Override
    public void updateSelling( int sell_in) {
        this.sell_in = sell_in;
    }
    
  
    @Override
    public String toString(){
    return this.name;
    }


    

}
