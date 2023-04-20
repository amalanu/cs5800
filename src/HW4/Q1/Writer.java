package HW4.Q1;

public class Writer {
    private static Writer instance;
    PropertyBuilder builder = PropertyBuilder.getInstance();
    File currentFile;
    FileCharacter currentChar;

    public Writer() {

    }

    public static Writer getInstance() {
        if (instance == null) {
            instance = new Writer();
        }

        return instance;
    }

    public void openFile(File file) {
        this.currentFile = file;
    }

    public void addCharacter(char character, String font, String color, int size) {
        CharacterProperties tempProperty = builder.getProperties(font, color, size);
        FileCharacter temp = new FileCharacter(character, tempProperty);
        currentFile.addToFile(temp);
    }
    
}
