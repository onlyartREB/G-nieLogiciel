package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class OtherTest {
    @Test
    @DisplayName("Case when Quality 0")
    void testCase1() {
        Item element = new Item("Elixir of the Mongoose", 0, 2);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Elixir of the Mongoose, -1, 0"));

    }
    @Test
    @DisplayName("Case when Quality 0")
    void testCase2() {
        Item element = new Item("+5 Dexterity Vest", 0, 2);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("+5 Dexterity Vest, -1, 0"));

    }



}
