package ru.vsu.sample.flowershop.model;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.sample.flowershop.model.Flower;
import ru.vsu.sample.flowershop.model.Rose;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FlowerTest {

    @Test
    public void testRose() {
        Flower f = new Rose("rose", BigDecimal.TEN, "red");
        assertEquals("rose", f.getName());
        assertEquals("Rose: red: rose", f.toString());
    }

}
