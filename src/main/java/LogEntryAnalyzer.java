import java.util.ArrayList;

public abstract class LogEntryAnalyzer {

    private ArrayList<LogEntry> logEntries;

    public LogEntryAnalyzer() {
        this.logEntries = new ArrayList<>();
    }

    public void setLogEntries(ArrayList<LogEntry> logEntries) {
        this.logEntries = logEntries;
    }

    public ArrayList<LogEntry> getLogEntries() {
        return logEntries;
    }

    public abstract void analyze();

    @Override
    public String toString() {
        return "LogEntryAnalyzer{" +
                "logEntries=" + logEntries +
                '}';
    }
}
