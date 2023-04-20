package HW1.Q4;

import java.util.ArrayList;

public class Folder implements FileObject{
    private String folderName;
    ArrayList<FileObject> contents = new ArrayList<>();

    public Folder(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.folderName = name;
    }

    public String getName() {
        return this.folderName;
    }

    public void addItem(FileObject item) {
        contents.add(item);
    }

    public FileObject getItem(int index) {
        return (FileObject) contents.get(index);
    }

    public void deleteItem(int index) {
        contents.remove(index);
    }

    public void print() {
        System.out.println(this.folderName);
        for (int i = 0; i < contents.size(); i++) {
            if (contents.get(i) instanceof FileObject) {
                ((FileObject) contents.get(i)).print();
            }
        }
    }

}
