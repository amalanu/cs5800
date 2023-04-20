package HW4.Q1;

import java.util.ArrayList;

public class FileDirectory {
    private static FileDirectory instance;
    ArrayList<File> files = new ArrayList<>();

    public FileDirectory() {

    }

    public static FileDirectory getInstance() {
        if (instance == null) {
            instance = new FileDirectory();
        }
        return instance;
    }

    public void saveFile(File file) {
        files.add(file);
    }

    public File openFile(String name) {
        String filename;
        File file = null;
        for (int i = 0; i < files.size(); i++) {
            filename = files.get(i).getFileName();
            if (filename.equalsIgnoreCase(name)) {
                file = files.get(i);
            }
        }

        return file;
    }
    
}
