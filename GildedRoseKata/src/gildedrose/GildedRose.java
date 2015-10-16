package gildedrose;

import java.util.List;

public class GildedRose extends Productos {
	;


	public void updateQuality(List<Item> items) {
		AumentarCalidad aumentarCalidad = new AumentarCalidad();
		ReducirCalidad reducirCalidad = new ReducirCalidad();

		for (Item item : items) {

			if (!item.getName().equals(Aged) && !item.getName().equals(Backstage)) {
				if (item.getQuality() > 0) {
					if (!item.getName().equals(Sulfuras)) {
						reducirCalidad.ReducirC(item);
					}
				}
			} else {
				if (item.getQuality() < 50) {
					aumentarCalidad.AumentarC(item);

					if (item.getName().equals(Backstage)) {
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
			if (item.getName() != Sulfuras) {
				item.setSellIn(item.getSellIn() - 1);
			}
			if (item.getSellIn() < 0) {
				if (item.getName() != Aged) {
					if (item.getName() != Backstage) {
						if (item.getQuality() > 0) {
							if (item.getName() != Sulfuras) {
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
