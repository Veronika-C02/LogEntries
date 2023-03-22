import java.util.ArrayList;

public class FilterAnalyzer extends LogEntryAnalyzer{

    private ArrayList<LogEntry> result;
    private String logLevel;


    public FilterAnalyzer(String logLevel) {
        this.result = new ArrayList<>();
        this.logLevel = logLevel;
    }


    @Override
    public void analyze() {

        for (LogEntry logEntry : super.getLogEntries()) {

            if (logEntry.getLogLevel().equals(logLevel)){

                result.add(logEntry);

            }
        }
    }


    public ArrayList<LogEntry> getResult() {
        return result;
    }

    public String getLogLevel() {
        return logLevel;
    }


}
