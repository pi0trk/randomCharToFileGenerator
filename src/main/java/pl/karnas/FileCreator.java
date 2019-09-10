package pl.karnas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

class FileCreator {

    private static final Logger log = Logger.getLogger(FileCreator.class.getName());


    void writeToFile(String filePath, String content) {
        try (PrintWriter out = new PrintWriter(filePath)) {
            out.println(content);
        } catch (FileNotFoundException e) {
            log.info("--- Couldn't write to file, file not found. ---");
        }
    }


    void createFile(String filePath) {
        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                log.info(filePath + " --> File was successfully created.");
            } else {
                log.info("File " + filePath + " --> File already exists.");
            }
        } catch (IOException e) {
            throw new FilePathNotFoundException("--- Wrong file path, file not created. ---");
        }
    }

}
