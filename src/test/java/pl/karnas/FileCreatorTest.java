package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static pl.karnas.App.FILE_PATH;

public class FileCreatorTest {
    FileCreator fc = new FileCreator();

    @Test
    public void testCreateFile() {
        fc.createFile(FILE_PATH);
        Assert.assertTrue(Files.exists(Paths.get(FILE_PATH)));
    }

    @Test
    public void testWriteToFile() throws IOException {
        String content = "String is wrote to file if file exists..";
        fc.writeToFile("src/test/resources/exampleFile.txt", content);
        Assert.assertEquals(new String(Files.readAllBytes( Paths.get("src/test/resources/exampleFile.txt") ) ), content);
    }

}