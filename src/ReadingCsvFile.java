import  java.io.*;
public abstract  class ReadingCsvFile   extends Main {
    String fileData="";
    @Override
    String readCsvFile() {
        try{
             BufferedReader buffReader = new BufferedReader(new FileReader("../ipl/matches.csv"));
               while (buffReader.ready()){
                 fileData+=buffReader.readLine();
                 fileData+='\n';
               }
         }catch (IOException e){
             e.printStackTrace();
         }
         return fileData;
    }
}
