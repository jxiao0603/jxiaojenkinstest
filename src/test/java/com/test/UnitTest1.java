package com.test;

import com.jxiao.jenkinstest.Demo1;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class UnitTest1 {
    @Test
    public void testAddInt(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        int c = a + b;
        int r = new Demo1().intAdd(a, b);
        Assert.assertTrue("检查intAdd(a, b)函数返回值是否正确", c == r);
    }
}
