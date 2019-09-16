package pl.karnas;

/**
 * Random character is generated and saved to file.
 *
 * @author pi0trk
 */
public class App {

    private static final String FILE_SEPARATOR = System.getProperty("file.separator");
    private static final String RELATIVE_FILE_PATH = "src" + FILE_SEPARATOR + "test" + FILE_SEPARATOR + "resources" + FILE_SEPARATOR;
    private static final String FILE_NAME = "FileWithRandomString.txt";
    static final String FILE_PATH = RELATIVE_FILE_PATH + FILE_NAME;
    private static final int NR_OF_CHARS = 33;

    public static void main(String[] args) {

        StringCharGenerator newCharacter = new StringCharGenerator();
        String charString = newCharacter.generateRandomCharString(NR_OF_CHARS);
        System.out.println("Generated strings of chars: " + charString);

        FileCreator.createFile(FILE_PATH);

        FileWriter.writeToFile(FILE_PATH, charString);

    }
}
