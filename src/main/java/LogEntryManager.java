import java.util.ArrayList;

public class LogEntryManager {

    private ArrayList<LogEntry> logEntriesManager;

    public LogEntryManager() {
        this.logEntriesManager = new ArrayList<>();
    }

    public ArrayList<LogEntry> getLogEntriesManager() {
        return logEntriesManager;
    }

    public void addLogEntry(LogEntry logEntry){

        logEntriesManager.add(logEntry);

    }


    @Override
    public String toString() {
        return "LogEntryManager{" +
                "logEntriesManager=" + logEntriesManager +
                '}';
    }
}
