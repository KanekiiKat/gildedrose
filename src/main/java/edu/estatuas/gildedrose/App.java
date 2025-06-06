package edu.estatuas.gildedrose;

public class App {

        public static void main(String[] args) {

        System.out.println("Bienvenido a Ollivanders!");

        GildedRose shop = new GildedRose();

        /**
         * Tedious but necessary, Ollivanders types the 
         * just arrived items and adds them to the 
         * inventory.
         

        List<Updateable> items = List.of(new NormalItem("+5 Dexterity Vest", 10, 20),
                                         new AgedBrie("Aged Brie", 2, 0),
                                         new NormalItem("Elixir of the Mongoose", 5, 7),
                                         new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
                                         new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
                                         new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                                         new Backstage("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                                         new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 49));

        
        for (Updateable item : items) {
            shop.addItem(item);
        }
*/

    }
}