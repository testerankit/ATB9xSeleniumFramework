package org.testing.sample;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sample1 {
    @Description("SampleTC1")
    @Test
    public void sampleTest0(){
        Assert.assertTrue(true);
    }

    @Test
    public void sampleTest1(){
        Assert.assertTrue(true);
    }
}
