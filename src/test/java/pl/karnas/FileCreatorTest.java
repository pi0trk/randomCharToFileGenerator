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
        //todo
    }

}