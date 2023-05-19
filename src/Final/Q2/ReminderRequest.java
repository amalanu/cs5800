package Final.Q2;

public class ReminderRequest implements Request{
    private String date;
    private String reminder;

    public ReminderRequest(String date, String reminder) {
        this.date = date;
        this.reminder = reminder;
    }

    @Override
    public void execute() {
        System.out.println("Reminder: " + reminder);
        System.out.println("Set for date: " + date);
    }

    @Override
    public String type() {
        return "Reminder";
    }
}
