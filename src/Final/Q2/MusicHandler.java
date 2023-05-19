package Final.Q2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MusicHandler extends RequestHandler{
    Request request;
    MusicPlayerApp music;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public MusicHandler(Request request, MusicPlayerApp music) {
        this.request = request;
        this.music = music;
    }

    @Override
    public boolean validateInput() {
        boolean valid = true;
        if (!request.type().equalsIgnoreCase("Music")) {
            valid = false;
        }
        notifyRequestStatus("Play Music request validated");
        return valid;
    }

    @Override
    public void logRequest(ArrayList<String> log) {
        LocalDateTime now = LocalDateTime.now();  
        log.add(request.type() + " request acknowledged @ " + dtf.format(now));
        notifyRequestStatus("Play Music request logged");
    }

    public void executeCommand() {
        notifyRequestStatus("Executing request");
        music.executeCommand(request);
    }

    @Override
    public void notifyRequestStatus(String status) {
        System.out.println(status);
    }
}
