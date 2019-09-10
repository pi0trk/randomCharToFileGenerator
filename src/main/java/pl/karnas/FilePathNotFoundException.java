package pl.karnas;

class FilePathNotFoundException extends RuntimeException {
    FilePathNotFoundException(String message) {
        super(message);
    }
}
