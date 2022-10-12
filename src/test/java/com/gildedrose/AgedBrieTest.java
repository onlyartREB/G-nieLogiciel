package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AgedBrieTest {

    @Test
    @DisplayName("normal case")
    void testCase1AgedBrie() {
        Item element = new Item("Aged Brie", 10, 49);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Aged Brie, 9, 50"));

    }


    @Test
    @DisplayName(" Sellin under 0")
    void testCase2AgedBrie() {
        Item element = new Item("Aged Brie", -1, 48);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Aged Brie, -2, 50"));
    }

    @Test
    @DisplayName(" Sellin under 0")
    void testCase3AgedBrie() {
        Item element = new Item("Aged Brie", -1, 49);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Aged Brie, -2, 50"));
    }

    @Test
    @DisplayName(" normal case with 50 quality")
    void testCase4AgedBrie() {
        Item element = new Item("Aged Brie", 10, 50);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Aged Brie, 9, 50"));
    }
}
