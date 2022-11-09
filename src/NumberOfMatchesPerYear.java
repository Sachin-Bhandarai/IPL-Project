import java.util.*;

public class NumberOfMatchesPerYear extends ConvertingRawDataToDictionaryForm{
    void noOfMatchesPlayedPerYearOfAllTheYears() {
        ConvertingRawDataToDictionaryForm obj = new ConvertingRawDataToDictionaryForm();
        Hashtable<Integer, Integer> countYearOccurences = new Hashtable<Integer, Integer>();

        putFileDataInHashMap(readCsvFile());
        System.out.println("from SolveQueries class");
        ArrayList<Integer> iplYears = new ArrayList<Integer>();

        Set<String > keys = map.keySet();
        for (String key : keys) {
            String singleRecordInStringForm = map.get(key).toString();
            int len = singleRecordInStringForm.length();
            //REOMVOVING [ AND ] this from string
            singleRecordInStringForm = singleRecordInStringForm.substring(1, len - 1);
            //process the string
            List<String> splittedCoulumValues = new ArrayList<>(Arrays.asList(singleRecordInStringForm.split(",")));

            int year=0;
            try {
                year = Integer.parseInt(splittedCoulumValues.get(0));
            } catch (NumberFormatException nfe) {
                year = 0; // or null if that is your preference
            }

            //storing each year frequencies in hashtable
            if(countYearOccurences.containsKey(year)){
                int value=countYearOccurences.get(year);
                countYearOccurences.put(year,value+1);
            } else{
                countYearOccurences.put(year,1);
            }

        }
        System.out.println(countYearOccurences);
    }

}

