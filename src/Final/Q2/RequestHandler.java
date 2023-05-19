package Final.Q2;

import java.util.ArrayList;

public abstract class RequestHandler {
    public abstract boolean validateInput();
    public abstract void logRequest(ArrayList<String> log);
    public abstract void executeCommand();
    public abstract void notifyRequestStatus(String status);
}
