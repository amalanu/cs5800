package HW1.Q3;

public class Course {
    private String courseName;

    //I am instantiating the Instructor and Textbook here instead of Main as that is what the assignment says
    //"In the Course class you will instantiate the instructor and textbook objects as needed"
    //I apologize if that is incorrect

    protected Instructor professor1 = new Instructor("Nima", "Davarpanah", "3-2636");
    protected Instructor professor2 = new Instructor("Walter", "White", "3-1234");
    protected Textbook book1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
    protected Textbook book2 = new Textbook("Design Patterns", "Erich Gamma at al.", "Addison-Wesley Professional");

    public Course(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.courseName = name;
    }

    public String getName() {
        return this.courseName;
    }

    public void print() {
        System.out.println("Course: " + courseName + ", Instructor 1: " + professor1.getFirstName() + " " + professor1.getLastName() + ", Office: " 
        + professor1.getOfficeNumber() + ", Instructor 2: " + professor2.getFirstName() + " " + professor2.getLastName() + ", Office: " 
        + professor2.getOfficeNumber() + ", Textbook 1: " + book1.getTitle() + ", " + book1.getAuthor() + ", " + book1.getPublisher()+ 
        ", Textbook 2: " + book2.getTitle() + ", " + book2.getAuthor() + ", " + book2.getPublisher());
    }
}
