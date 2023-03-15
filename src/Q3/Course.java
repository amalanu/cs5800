package Q3;

public class Course {
    private String courseName;

    //I am instantiating the Instructor and Textbook here instead of Main as that is what the assignment says
    //"In the Course class you will instantiate the instructor and textbook objects as needed"
    //I apologize if that is incorrect
    
    protected Instructor professor = new Instructor("Nima", "Davarpanah", "3-2636");
    protected Textbook book1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

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
        System.out.println("Course: " + courseName + ", Instructor: " + professor.getFirstName() + " " + professor.getLastName() + ", Office: " 
        + professor.getOfficeNumber() + ", Textbook: " + book1.getTitle() + ", " + book1.getAuthor() + ", " + book1.getPublisher());
    }
}
