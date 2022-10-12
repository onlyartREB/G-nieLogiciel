package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
//La qualité augmente de 2 quand il reste 10 jours ou moins et de 3  quand il reste 5 jours ou moins,
// mais la qualité tombe à 0 après le concert.
public class BackStagePassesTest {
    @Test
@DisplayName("Sellin more than 0, quality under 50")
void testCase1BackStage() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 9, 50"));

}

    @Test
    @DisplayName("Sellin under 6, quality under 50")
    void testCase3BackStage() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 46);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 4, 49"));

    }
    @Test
    @DisplayName("Sellin under 0, quality under 50")
    void testCase4BackStage() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", -1, 46);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, -2, 0"));

    }
    @Test
    @DisplayName("Sellin under 6, Quality under 50")
    void testCase5BackStage() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 4, 50"));

    }
    @Test
    @DisplayName("Sellin = 11, quality under 50")
    void testCase6BackStage() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 48);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 10, 49"));

    }

    @Test
    @DisplayName("Sellin = 6, Quality under 50")
    void testCase7BackStage() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 33);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 5, 35"));

    }

    @Test
    @DisplayName("Sellin under 6, Quality under 50")
    void testCase8BackStage() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 35);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 4, 38"));

    }


}
