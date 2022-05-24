package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemSortTest {

    @Test
    public void ascSortItem() {
        Item item1 = new Item(1, "aaa");
        Item item2 = new Item(2, "bbb");
        Item item3 = new Item(3, "ccc");
        Item item4 = new Item(4, "ddd");
        Item item5 = new Item(5, "eee");

        List<Item> items = new ArrayList<>();
        items.add(item2);
        items.add(item4);
        items.add(item1);
        items.add(item5);
        items.add(item3);
        Collections.sort(items, new ItemAscByName());

        List<Item> expected = new ArrayList<>();
        expected.add(item1);
        expected.add(item2);
        expected.add(item3);
        expected.add(item4);
        expected.add(item5);

        assertThat(items, is(expected));
    }

    @Test
    public void descSortItem() {
        Item item1 = new Item(1, "aaa");
        Item item2 = new Item(2, "bbb");
        Item item3 = new Item(3, "ccc");
        Item item4 = new Item(4, "ddd");
        Item item5 = new Item(5, "eee");

        List<Item> items = new ArrayList<>();
        items.add(item2);
        items.add(item4);
        items.add(item1);
        items.add(item5);
        items.add(item3);
        Collections.sort(items, new ItemDescByName());

        List<Item> expected = new ArrayList<>();
        expected.add(item5);
        expected.add(item4);
        expected.add(item3);
        expected.add(item2);
        expected.add(item1);

        assertThat(items, is(expected));
    }
}
