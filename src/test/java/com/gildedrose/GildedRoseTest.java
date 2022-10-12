package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("foo", 0, 1);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.name, is("foo"));
  }
  @Test
  @DisplayName("Sellin under 0 quality more than 0")
  void testName1() {
    Item element = new Item("Guided Rose", -1, 1);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.toString(), is("Guided Rose, -2, 0"));
  }
  @Test
  @DisplayName("Sellin more than 0, Quality 0")
  void testName2() {
    Item element = new Item("Guided Rose", 10, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.toString(), is("Guided Rose, 9, 0"));
  }

  @Test
  @DisplayName("Sellin and Quality more than 0")
  void testName3() {
    Item element = new Item("Guided Rose", 10, 40);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.toString(), is("Guided Rose, 9, 39"));
  }
  @Test
  @DisplayName("Sellin under 0, Quality more than 0 ")
  void testName4() {
    Item element = new Item("Guided Rose", 0, 1);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.toString(), is("Guided Rose, -1, 0"));
  }
  @Test
  @DisplayName("Sellin more than 0, Quality more than 0")
  void testName5() {
    Item element = new Item("Guided Rose", 1, 50);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.toString(), is("Guided Rose, 0, 49"));
  }



}
