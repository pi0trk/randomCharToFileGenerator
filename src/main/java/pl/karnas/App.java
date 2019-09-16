package pl.karnas;

/**
 * Random character is generated and saved to file.
 *
 * @author pi0trk
 */
public class App {
    private static final String FILE_PATH = "src/test/resources/FileWithRandomString.txt";
    private static final int NR_OF_CHARS = 33;

    public static void main(String[] args) {

        StringCharGenerator newCharacter = new StringCharGenerator();
        String charString = newCharacter.generateRandomCharString(NR_OF_CHARS);

        FileWriter fileWriter = new FileWriter();
        fileWriter.writeToFile(FILE_PATH, charString);

    }
}
