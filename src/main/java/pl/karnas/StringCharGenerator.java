package pl.karnas;

import java.util.Random;

/**
 * Generates string with random characters with provided string length.
 */
class StringCharGenerator {
    private final Random random = new Random();

    String generateRandomCharString(int nrOfChars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nrOfChars; i++) {
            stringBuilder.append(generateRandomCharacter());
        }
        return stringBuilder.toString();
    }

    private char generateRandomCharacter() {
        return (char) (random.nextInt('~' - '!') + '!');
    }
}
