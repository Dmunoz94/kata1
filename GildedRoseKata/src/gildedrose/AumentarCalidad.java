package gildedrose;

/**
 * Created by davidmunoztrevino on 09/10/15.
 */
public class AumentarCalidad extends GildedRose {
    public void AumentarC (Item item){
        item.setQuality(item.getQuality()+1);
        }
}
