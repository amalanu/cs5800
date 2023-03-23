package HW1.Q3;

public class Textbook {
    protected String title;
    protected String author;
    protected String publisher;

    public Textbook(String title, String author, String publisher) {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }
}
