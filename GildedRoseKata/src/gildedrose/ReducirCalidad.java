package gildedrose;

/**
 * Created by davidmunoztrevino on 09/10/15.
 */
public class ReducirCalidad extends  GildedRose{
    public void ReducirC(Item item){
        if (item.getName().equals("Conjured Mana Cake")){
            item.setQuality(item.getQuality() - 2);
        }else {
            item.setQuality(item.getQuality() - 1);
        }
    }
}
