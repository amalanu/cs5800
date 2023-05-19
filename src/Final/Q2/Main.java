package Final.Q2;

public class Main {
    
    public static void main(String[] args) {
        DigitalAssistant app = new DigitalAssistant();

        PhoneCallRequest phone = new PhoneCallRequest("555-432-5678");
        EmailRequest email = new EmailRequest("aanu@cpp.edu", "Hello");
        MusicRequest music = new MusicRequest("All Star");
        ReminderRequest reminder = new ReminderRequest("5/20/2023", "Drink more water");

        app.process(phone);
        System.out.println();
        app.process(email);
        System.out.println();
        app.process(music);
        System.out.println();
        app.process(reminder);

        app.outputLogs();
    }
}
