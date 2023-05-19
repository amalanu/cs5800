package Final.Q2;

public class PhoneCallRequest implements Request{
    private String number;

    public PhoneCallRequest(String number) {
        this.number = number;
    }

    @Override
    public void execute() {
        System.out.println("Calling " + number);
    }

    @Override
    public String type() {
        return "Phone Call";
    }
    
}
