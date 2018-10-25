package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {
//test comment nnbj asdfasdf
    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 11) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
    @Test
    public void old_brie() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("brie is a higher quality",app.items[0].quality>1 );
        
    }
    @Test
    public void never_over_50() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("brie is higher quality than it should be able to",app.items[0].quality==50 );
        
    }
    @Test
    public void degrading_goods() {
        Item[] items = new Item[] { new Item("Another Thing", 1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Should degrade with one",9,app.items[0].quality );
        
    }
    @Test
    public void degrading_goods_twice() {
        Item[] items = new Item[] { new Item("Another Thing", 0, 6) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Should degrade with one",4,app.items[0].quality );
        
    }
    @Test
    public void mocPassingTest() {
        assertTrue(true);
    }
}
