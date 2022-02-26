package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenLessThan0() {
        Fact fact = new Fact();
        int  rsl = fact.calc(-5);
    }

    @Test
    public void when5Then120() {
        int rsl = new Fact().calc(5);
        assertThat(rsl, is(120));
    }
}