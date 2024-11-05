package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")
                    || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality < 50) {
                    item.increaseQualityByOne();

                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.sellIn < 11) {
                            item.increaseQualityByOne();
                        }

                        if (item.sellIn < 6) {
                            item.increaseQualityByOne();
                        }
                    }
                }
            } else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.decreasedQualityByOne();
            }
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn - 1;
            }


            if (item.name.equals("Aged Brie")) {
                if (item.sellIn < 0) {
                    item.increaseQualityByOne();
                }
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.sellIn < 0) {
                            item.quality = 0;
                        }
                    } else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                            if (item.sellIn < 0) {
                                item.decreasedQualityByOne();
                            }
                        }
                    }
                }
            }
