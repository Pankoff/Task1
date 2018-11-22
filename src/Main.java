import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    String path="C:\\Users\\Павел\\Desktop\\Value.txt";
    List<Integer> listOfValue = new ArrayList<>();
    readFile(listOfValue,path);
    Collections.sort(listOfValue);
    MyMath myMath = new MyMath();
    myMath.findPercentile(listOfValue);
    myMath.findMaxValue(listOfValue);
    myMath.findMinValue(listOfValue);
    myMath.findAverage(listOfValue);
    myMath.findMedian(listOfValue);

    }
    public static void readFile(List<Integer> listOfValue, String path){
        File file = new File(path);
        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                listOfValue.add(scanner.nextInt());
            }
        }catch (FileNotFoundException ex){ex.printStackTrace();}
    }
}
