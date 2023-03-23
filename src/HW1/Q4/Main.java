package Q4;

public class Main {

    public static void main(String[] args) {

        //Couldn't figure out how to make the file names indented, so the printed file structure may be confusing to read
        //I apologize for the inconveniece
        Folder root = new Folder("php_demo");
        root.addItem(new Folder("Source Files"));
        root.addItem(new Folder("Include Path"));
        root.addItem(new Folder("Remote Files"));
        ((Folder) root.getItem(0)).addItem(new Folder(".phalcon"));
        ((Folder) root.getItem(0)).addItem(new Folder("app"));
        ((Folder) root.getItem(0)).addItem(new Folder("cache"));
        ((Folder) root.getItem(0)).addItem(new Folder("public"));
        ((Folder) ((Folder) root.getItem(0)).getItem(1)).addItem(new Folder("config"));
        ((Folder) ((Folder) root.getItem(0)).getItem(1)).addItem(new Folder("controllers"));
        ((Folder) ((Folder) root.getItem(0)).getItem(1)).addItem(new Folder("library"));
        ((Folder) ((Folder) root.getItem(0)).getItem(1)).addItem(new Folder("migrations"));
        ((Folder) ((Folder) root.getItem(0)).getItem(1)).addItem(new Folder("models"));
        ((Folder) ((Folder) root.getItem(0)).getItem(1)).addItem(new Folder("views"));
        ((Folder) ((Folder) root.getItem(0)).getItem(3)).addItem(new File(".htaccess"));
        ((Folder) ((Folder) root.getItem(0)).getItem(3)).addItem(new File(".htrouter.php"));
        ((Folder) ((Folder) root.getItem(0)).getItem(3)).addItem(new File("index.html"));

        System.out.println("Current File Structure\n");
        root.print();

        System.out.println("\nDeleted app folder\n");
        ((Folder) root.getItem(0)).deleteItem(1);

        root.print();

        System.out.println("\nDeleted public folder\n");
        ((Folder) root.getItem(0)).deleteItem(2);

        root.print();
        
    }
    
}
