import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class ConvertingRawDataToDictionaryForm extends  ReadingCsvFile {
    //HashMap<Integer, List<String>> map = new HashMap<Integer,List<String>>();
    // Hashtable<Integer, List<String>> map = new Hashtable<Integer,List<String>>();
    LinkedHashMap<String, List<String>> map = new LinkedHashMap<String, List<String>>();
    String id;

    @Override
    void putFileDataInHashMap(String rawData) throws NumberFormatException {
        List<String> lineBylineData = new ArrayList<>(Arrays.asList(fileData.split("\n")));
        lineBylineData.remove(0);

        for (String singleLine : lineBylineData) {
            List<String> singleLineData = new ArrayList<>(Arrays.asList(singleLine.split(",")));
//            try {
//                id = Integer.parseInt(singleLineData.get(0));
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }
            //  Integer id = Integer.parseInt(singleLineData.get(0));
              id=singleLineData.get(0);
            singleLineData.remove(0);
            map.put(id, singleLineData);
        }
        Set<String> setOfKeys = map.keySet();
        //working fine
       /* for (Integer key : map.keySet()) {
            System.out.println(map.get(key));
      }*/
        }
    }

