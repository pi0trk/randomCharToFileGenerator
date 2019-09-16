package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCharGeneratorTest {

    @Test
    public void shouldGenerateRandomStringWithGivenLength() {
        String randomCharString = new StringCharGenerator().generateRandomCharString(22);
        Assert.assertEquals(randomCharString.length(), 22);
    }
}