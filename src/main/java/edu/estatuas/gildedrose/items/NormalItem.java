package edu.estatuas.gildedrose.items;


public class NormalItem implements Updateable {

    private String name;
    private int sell_in;
    private int quality;
    private final Item item;


    public NormalItem(String name, int sell_in, int quality) {
        this.item = new Item(name, sell_in, quality);
    }


    public String getName() {
        return item.getName();
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getSell_in() {
        return item.getSell_in();
    }

    void setSell_in(){
        item.setSell_in();
    }



    public int getQuality() {
        return item.getQuality();
    }

    @Override
    public void updateQuality() {
        if (getSell_in() > 0){
            computeQuality(-1);
        } else if (getSell_in() <= 0){
            computeQuality(-2);
        }
        setSell_in();
    }
  
    
  


    void computeQuality(int value){
        if (getQuality() + value > 50){
        item.setQuality(50);
        } else if (getQuality() + value >= 0){
            item.setQuality(getQuality() + value);
        } else {
            item.setQuality(0);
        }
        
    }

    
    @Override
    public String toString(){
    return this.name;
    }

}
