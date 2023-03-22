public class MaxLogEntryAnalyzer extends LogEntryAnalyzer {

    private LogEntry logEntry;


    @Override
    public void analyze() {

        for (LogEntry entry : super.getLogEntries()) {

            if ( logEntry == null || entry.getLogEntryID() > logEntry.getLogEntryID()){

                logEntry = entry;
            }
        }
    }

    public LogEntry getLogEntry() {
        return logEntry;
    }



    public MaxLogEntryAnalyzer() {
        this.logEntry = null;
    }

    @Override
    public String toString() {
        return "MaxLogEntryAnalyzer{" +
                "logEntry=" + logEntry +
                '}';
    }
}
