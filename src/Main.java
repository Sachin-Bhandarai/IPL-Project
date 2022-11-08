import java.io.*;
import java.util.*;
import java.lang.Iterable;


class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader buffReader = new BufferedReader(new FileReader("../ipl/matches.csv"));
        String fileData="";

        while (buffReader.ready()) {
            fileData+=buffReader.readLine();
            fileData+='\n';
        }
        String[] lineBylineData= fileData.split("\n");
        






    }
}