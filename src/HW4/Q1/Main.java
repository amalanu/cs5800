package HW4.Q1;

public class Main {

    public static void main(String[] args) {
        FileDirectory directory = FileDirectory.getInstance();
        Writer writer = Writer.getInstance();

        File newFile = new File("savedFile");
        writer.openFile(newFile);

        writer.addCharacter('H', "Arial", "Red", 12);
        writer.addCharacter('e', "Arial", "Red", 12);
        writer.addCharacter('l', "Arial", "Red", 12);
        writer.addCharacter('l', "Arial", "Red", 12);
        writer.addCharacter('o', "Arial", "Red", 12);
        writer.addCharacter('W', "Calibri", "Blue", 14);
        writer.addCharacter('o', "Calibri", "Blue", 14);
        writer.addCharacter('r', "Calibri", "Blue", 14);
        writer.addCharacter('l', "Calibri", "Blue", 14);
        writer.addCharacter('d', "Calibri", "Blue", 14);
        writer.addCharacter('C', "Verdana", "Black", 16);
        writer.addCharacter('S', "Verdana", "Black", 16);
        writer.addCharacter('5', "Verdana", "Red", 14);
        writer.addCharacter('8', "Verdana", "Red", 14);
        writer.addCharacter('0', "Verdana", "Red", 14);
        writer.addCharacter('0', "Verdana", "Red", 14);
        
        directory.saveFile(newFile);

        File temp = directory.openFile("savedFile");

        temp.printFileContents();

    }
    
}
