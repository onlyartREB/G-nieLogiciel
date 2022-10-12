package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SulfurasTest {  @Test
@DisplayName("normal case")
void testSulfurasInNormalCase() {
    Item element = new Item("Sulfuras, Hand of Ragnaros", 10, 40);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.toString(), is("Sulfuras, Hand of Ragnaros, 10, 40"));
}
    @Test
    @DisplayName("case sellIn < 0")
    void testSulfurasSellInUnder0() {
        Item element = new Item("Sulfuras, Hand of Ragnaros", -1, 40);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Sulfuras, Hand of Ragnaros, -1, 40"));
    }
}
