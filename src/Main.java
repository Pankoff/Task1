import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    List<Integer> listOfValue = new ArrayList<>();
    readFile(listOfValue);
    Collections.sort(listOfValue);
    MyMath myMath = new MyMath();
    myMath.findPercentile(listOfValue);
    myMath.findMaxValue(listOfValue);
    myMath.findMinValue(listOfValue);
    myMath.findAverage(listOfValue);
    myMath.findMedian(listOfValue);

    }
    public static void readFile(List<Integer> listOfValue){
        String tmp=null;
    try(BufferedReader reader = new BufferedReader(new InputStreamReader
            (new FileInputStream(new File("Numbers")), "utf-8" ))){
        while ((tmp=reader.readLine())!=null){
            listOfValue.add(Integer.parseInt(tmp));
            }
        }catch (IOException ex){ ex.printStackTrace();}
    }
}
