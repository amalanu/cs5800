package Final.Q2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class EmailHandler extends RequestHandler{
    Request request;
    EmailApp email;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public EmailHandler(Request request, EmailApp email) {
        this.request = request;
        this.email = email;
    }

    @Override
    public boolean validateInput() {
        boolean valid = true;
        if (!request.type().equalsIgnoreCase("Email")) {
            valid = false;
        }
        notifyRequestStatus("Phonecall request validated");
        return valid;
    }

    @Override
    public void logRequest(ArrayList<String> log) {
        LocalDateTime now = LocalDateTime.now();  
        log.add(request.type() + " request acknowledged @ " + dtf.format(now));
        notifyRequestStatus("Email request logged");
    }

    @Override
    public void executeCommand() {
        notifyRequestStatus("Executing request");
        email.executeCommand(request);
    }

    @Override
    public void notifyRequestStatus(String status) {
        System.out.println(status);
    }
    
}
