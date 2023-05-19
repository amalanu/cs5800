package Final.Q2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PhoneHandler extends RequestHandler{
    Request request;
    PhoneDialerApp phone;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public PhoneHandler(Request request, PhoneDialerApp phone) {
        this.request = request;
        this.phone = phone;
    }

    @Override
    public boolean validateInput() {
        boolean valid = true;
        if (!request.type().equalsIgnoreCase("Phone Call")) {
            valid = false;
        }
        notifyRequestStatus("Phonecall request validated");
        return valid;
    }

    @Override
    public void logRequest(ArrayList<String> log) {
        LocalDateTime now = LocalDateTime.now();  
        log.add(request.type() + " request acknowledged @ " + dtf.format(now));
        notifyRequestStatus("Phonecall request logged");
    }

    public void executeCommand() {
        notifyRequestStatus("Executing request");
        phone.executeCommand(request);
    }

    @Override
    public void notifyRequestStatus(String status) {
        System.out.println(status);
    }
    
}
