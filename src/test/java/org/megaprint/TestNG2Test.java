package org.megaprint;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Baurz on 4/22/2017.
 */
public class TestNG2Test {

    @Test(dataProvider = "testData")
    public void test1(int a,int b){
        Assert.assertEquals(a,b);
    }
    @DataProvider()
    public Object [][] testData(){
        Object obj[][]=new Object[4][2];
        obj[0][0]=3;
        obj[0][1]=3;
        obj[1][0]=1;
        obj[1][1]=1;

        obj[2][0]=4;
        obj[2][1]=4;
        obj[3][0]=7;
        obj[3][1]=7;
        return obj;
    }
}
