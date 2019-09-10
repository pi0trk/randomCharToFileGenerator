package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCharGeneratorTest {

    @Test
    public void testGenerateRandomCharString() {
        String randomCharString = new StringCharGenerator().generateRandomCharString(22);
        //todo..
        Assert.assertEquals(randomCharString, "//TODO");
    }
}