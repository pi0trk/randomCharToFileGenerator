package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriterTest {

    @Test
    public void testWriteToFile() throws IOException {
        String content = "String is wrote to file if file exists..";
        FileWriter.writeToFile("src/test/resources/exampleFile.txt", content);
        Assert.assertEquals(new String(Files.readAllBytes( Paths.get("src/test/resources/exampleFile.txt") ) ), content);
    }
}