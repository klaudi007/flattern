package com.citrusbyte;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CitrusbyteTest {

    private Citrusbyte c;

    @Before
    public void init(){
        c = new Citrusbyte();
    }

    @Test
    public void flatten() {


        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5 ,6 ,7 ,8 ,9 ,10);
//        c.flat(array).forEach(e->System.out.println(e));
        Assert.assertEquals(expected, c.flat(array));

    }

    @Test
    public void isArray() {

    }
}