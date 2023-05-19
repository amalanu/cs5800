package Final.Q2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReminderHandler extends RequestHandler{
    Request request;
    CalenderApp calender;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    

    public ReminderHandler(Request request, CalenderApp calender) {
        this.request = request;
        this.calender = calender;
    }

    @Override
    public boolean validateInput() {
        boolean valid = true;
        if (!request.type().equalsIgnoreCase("Reminder")) {
            valid = false;
        }
        notifyRequestStatus("Reminder request validated");
        return valid;
    }

    @Override
    public void logRequest(ArrayList<String> log) {
        LocalDateTime now = LocalDateTime.now();  
        log.add(request.type() + " request acknowledged @ " + dtf.format(now));
        notifyRequestStatus("Reminder request logged");
    }

    public void executeCommand() {
        notifyRequestStatus("Executing request");
        calender.executeCommand(request);
    }

    @Override
    public void notifyRequestStatus(String status) {
        System.out.println(status);
    }
}
