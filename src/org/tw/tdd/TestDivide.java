package org.tw.tdd;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class TestDivide {

    @Test
    public void testDivideBy3(){
        Divide divide=new Divide();
        Assert.assertEquals(2,divide.doOperation(6,3));
    }

    @Test()
    public void testDivide6By5(){
        Divide divide=new Divide();
        Assert.assertEquals(1,divide.doOperation(6,5));
    }

    @Test()
    public void testDivideLongNumbers(){
        Divide divide=new Divide();
        Assert.assertEquals(1000000000,divide.doOperation(1222000000000L,1222L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideBy0(){
        Divide divide=new Divide();
        divide.doOperation(19,0);
    }



}
