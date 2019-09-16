package pl.karnas;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static pl.karnas.App.FILE_PATH;

public class FileCreatorTest {

    @Test
    public void testCreateFile() {
        FileCreator.createFile(FILE_PATH);
        Assert.assertTrue(Files.exists(Paths.get(FILE_PATH)));
    }
}