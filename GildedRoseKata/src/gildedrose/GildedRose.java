package gildedrose;

import java.util.List;

public class GildedRose {
	;


	public void updateQuality(List<Item> items) {
		AumentarCalidad aumentarCalidad = new AumentarCalidad();
		ReducirCalidad reducirCalidad = new ReducirCalidad();

		for (Item item : items) {

			if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
				if (item.getQuality() > 0) {
					if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
						reducirCalidad.ReducirC(item);
					}
				}
			} else {
				if (item.getQuality() < 50) {
					aumentarCalidad.AumentarC(item);

					if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
						if (item.getSellIn() < 11) {
							if (item.getQuality() < 50) {
								aumentarCalidad.AumentarC(item);
							}
						}

						if (item.getSellIn() < 6) {
							if (item.getQuality() < 50) {
								aumentarCalidad.AumentarC(item);
							}
						}
					}
				}
			}

			if (item.getName() != "Sulfuras, Hand of Ragnaros") {
				item.setSellIn(item.getSellIn() - 1);

			}

			if (item.getSellIn() < 0) {
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						if (item.getQuality() > 0) {
							if (item.getName() != "Sulfuras, Hand of Ragnaros") {
								reducirCalidad.ReducirC(item);
							}
						}
					} else {
						item.setQuality(item.getQuality() - item.getQuality());
					}
				} else {
					if (item.getQuality() < 50) {
						aumentarCalidad.AumentarC(item);
					}
				}
			}
		}
	}






}
