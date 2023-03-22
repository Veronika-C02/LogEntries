import java.util.HashMap;

public class CountryAnalyzer extends LogEntryAnalyzer{

    private HashMap<String, Integer> result;

    @Override
    public void analyze() {

        System.out.println(super.getLogEntries());

        for (LogEntry logEntry : super.getLogEntries()) {

            String country = logEntry.getCountryID();

            if (result.containsKey(country)){

                result.put(country, result.get(country)+1);

            }else {

                result.put(country, 1);

            }

        }
    }



    public HashMap<String, Integer> getResult() {
        return result;
    }

    public CountryAnalyzer() {
        this.result = new HashMap<>();
    }

    @Override
    public String toString() {
        return "CountryAnalyzer{" +
                "result=" + result +
                '}';
    }
}
