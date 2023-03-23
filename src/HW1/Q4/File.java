package HW1.Q4;

public class File implements FileObject {
    private String fileName;

    public File(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.fileName = name;
    }

    public String getName() {
        return this.fileName;
    }

    public void print() {
        System.out.println(this.fileName);
    }
    
}
