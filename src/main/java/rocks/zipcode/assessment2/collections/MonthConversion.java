package rocks.zipcode.assessment2.collections;
import java.util.TreeMap;
import java.util.Map;
import java.util.TreeMap;
/**
 * Use a map to solve
 */

/*import java.util.HashMap;
import java.util.Map;

public class CollectionsHashMap {

    /* Example public static void main(String[] args) {
        // Create a map to store country codes and their names
        Map<String, String> countryCodes = new HashMap<>();

        // Adding key-value pairs to the map
        countryCodes.put("US", "United States");
        countryCodes.put("CA", "Canada");
        countryCodes.put("UK", "United Kingdom");

        // Finding a value using its key
        String countryCode = "US";
        String countryName = countryCodes.get(countryCode);
        System.out.println("Country with code '" + countryCode + "' is: " + countryName); // Output: Country with code 'US' is: United States

        // Removing an entry from the map
        countryCodes.remove("CA"); // Removes the entry with key "CA"

        // Displaying all entries in the map
        System.out.println("Country codes and names: " + countryCodes); // Output: Country codes and names: {US=United States, UK=United Kingdom}
    }

}*/






























public class MonthConversion {

    Map<Integer, String> mapOfMonths = new TreeMap<>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        mapOfMonths.put(monthNumber,monthName);


    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return mapOfMonths.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
      //  (Map.Entry<Integer, String> entry : mapOfMonths.entrySet()) // loop
    return 0;}

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return mapOfMonths.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return mapOfMonths.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        int size = mapOfMonths.size();
        return size;
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        mapOfMonths.put(monthNumber,monthName);

    }
}
