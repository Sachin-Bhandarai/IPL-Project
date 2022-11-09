import java.util.Set;

class ExtraRunsConcedePerTeamIn2016  {
    ExtraRunsConcedePerTeamIn2016(){
        System.out.println("TEAM                           EXTRA RUNS");
    }
    String get(){
        ConvertingRawDataToDictionaryForm obj= new ConvertingRawDataToDictionaryForm(filePath);
        Set<String> setOfKeys =obj.storeDeliveries.keySet();
        for (String key : obj.storeDeliveries.keySet()){

        }

        return "treu";
    }

}


