package gildedrose;

/**
 * Created by davidmunoztrevino on 09/10/15.
 */
public class ReducirCalidad extends  GildedRose{
    public void ReducirC(Item item){
        item.setQuality(item.getQuality() - 1);

    }
}
