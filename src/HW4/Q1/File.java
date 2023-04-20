package HW4.Q1;

import java.util.ArrayList;

public class File {
    private ArrayList<FileCharacter> fileContents = new ArrayList<>();
    protected String filename;

    public File(String filename) {
        this.filename = filename;
    }

    public void renameFile(String filename) {
        this.filename = filename;
    }

    public String getFileName() {
        return this.filename;
    }

    public void addToFile(FileCharacter ch) {
        fileContents.add(ch);
    }

    public void printFileContents() {
        for(int i = 0; i < fileContents.size(); i++) {
            fileContents.get(i).print();
        }
    }
}
