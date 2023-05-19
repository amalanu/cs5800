package Final.Q2;

import java.util.ArrayList;

public class DigitalAssistant {
    private ArrayList<String> log =  new ArrayList<>();
    private PhoneDialerApp phone = new PhoneDialerApp();
    private EmailApp email = new EmailApp();
    private MusicPlayerApp music = new MusicPlayerApp();
    private CalenderApp calender = new CalenderApp();

    public DigitalAssistant() {
        
    }

    public void process(Request request) {
        RequestHandler handler;
        if (request.type().equalsIgnoreCase("Phone Call")) {
            handler = new PhoneHandler(request, phone);
        } else if (request.type().equalsIgnoreCase("Email")){
            handler = new EmailHandler(request, email);
        } else if (request.type().equalsIgnoreCase("Music")){
            handler = new MusicHandler(request, music);
        } else {
            handler = new ReminderHandler(request, calender);
        }

        if (handler.validateInput()) {
            handler.logRequest(log);
            handler.executeCommand();
        } else {
            System.out.println("Invalid request");
        }
    }

    public void outputLogs() {
        System.out.println("\nOutputting logs");
        for (int i = 0; i < log.size(); i++) {
            System.out.println(log.get(i));
        }
    }
}
