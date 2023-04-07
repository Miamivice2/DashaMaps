package com.github.zipcodewilmington;

import com.fasterxml.jackson.databind.deser.CreatorProperty;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap1Test {
}

    @Test
    public void before() {

    map = new DashaMap();
    }

    @Test
    public void setTest(){
    String key = "key";
    String value = "value";

    map.set(key, value);
    long actual = map.bucketsize(key "k");

        
    }

    @Test
    public void deleteTest() {
        String key = "key";
        String value = "value";
        long expected = 0;
        map.set(key, value);
        map.delete(key);
        long actual = map.bucketSize


    }

    @Test
    public void getTest() {
    String key = "ki";
    String expected = "energy";
    map.set(key, expected);
    String actual = map.get(expected);

    Assert.assertEquals(expected,actual);
    }


    @Test
    public void isEmptyTest() {
    String e  = "e";
    String key = "dre";
    map.set(key,e);
    Assert.assertEquals(map.isEmpty());
    }

    @Test
    public void isEmptyTest2() {
    Assert.assertEquals(map.isEmpty());


    }

    @Test
    public void name() {
    }
}
