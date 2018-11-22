import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    String path="C:\\Users\\Павел\\Desktop\\Value.txt";
    List<Integer> listOfValue = new ArrayList<>();
    readFile(listOfValue,path);
    MyMath myMath = new MyMath();
    myMath.findMaxValue(listOfValue);
    myMath.findMinValue(listOfValue);
    myMath.findAverage(listOfValue);
    myMath.findMedian(listOfValue);
        for (Integer i:listOfValue) {
            System.out.println(i);
        }
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
