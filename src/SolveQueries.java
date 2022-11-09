import java.util.*;
import  java.lang.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
public class SolveQueries extends ConvertingRawDataToDictionaryForm {
    void noOfMatchesPlayedPerYearOfAllTheYears() {
        ConvertingRawDataToDictionaryForm obj = new ConvertingRawDataToDictionaryForm();
        Hashtable<Integer, Integer> countYearOccurences = new Hashtable<Integer, Integer>();

        putMatchFileDataInHashMap(readMatchesFile());
      //  System.out.println("from SolveQueries class");
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

    void extraRunsConcededPerTeam(){

    }
    void topEconomicalBowlerOf2015(){

    }
   /* public  static  void main(String[] args){
        ConvertingRawDataToDictionaryForm obj=new ConvertingRawDataToDictionaryForm();
        SolveQueries obj2= new SolveQueries();
       /
        obj2.noOfMatchesPlayedPerYearOfAllTheYears();


    }*/

}

