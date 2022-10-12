package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConjuredManaTest {

    @Test
    @DisplayName("Normal case")
    void testCase1ConjuredMana() {
        Item element = new Item("Conjured Mana Cake", 2, 10);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Conjured Mana Cake, 1, 9"));

    }
    @Test
    @DisplayName("Seelin 0, quality more than 0")
    void testCase2ConjuredMana() {
        Item element = new Item("Conjured Mana Cake", 0, 3);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Conjured Mana Cake, -1, 1"));

    }

}
