import java.util.ArrayList;

public class UniqueAnalyzer extends LogEntryAnalyzer{

    private ArrayList<String> result;


    @Override
    public void analyze() {

        for (LogEntry logEntry : super.getLogEntries()) {

            if (!(result.contains(logEntry.getMessage()))){
                result.add(logEntry.getMessage());
            }
        }

    }



    public ArrayList<String> getResult() {
        return result;
    }

    public UniqueAnalyzer() {
        this.result = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "UniqueAnalyzer{" +
                "result=" + result +
                '}';
    }
}
