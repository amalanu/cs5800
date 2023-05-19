package Final.Q2;

public class EmailRequest implements Request{
    private String recipient;
    private String content;

    public EmailRequest(String recipient, String content) {
        this.recipient = recipient;
        this.content = content;
    }
    @Override
    public void execute() {
        System.out.println("Sending email to " + recipient);
        System.out.println(content);
    }

    @Override
    public String type() {
        return "Email";
    }
    
}
