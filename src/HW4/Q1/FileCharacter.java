package HW4.Q1;

public class FileCharacter {
    char character;
    protected CharacterProperties properties;

    public FileCharacter(char character, CharacterProperties properties) {
        this.character = character;
        this.properties = properties;
    }

    public void print() {
        System.out.print(character);
    }
}
