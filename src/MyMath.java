import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMath {
    public void findPercentile(List<Integer> listOfValue){
        int tmp=(listOfValue.size()*90)/100;
        System.out.println("percentile "+listOfValue.get(tmp));
    }

    public void findMedian(List<Integer> listOfValue){
        int halfColl=listOfValue.size()/2;
        if(listOfValue.size()%2==0){
            System.out.println("median " +((double)listOfValue.get(halfColl)+listOfValue.get(halfColl-1))/2);
        }else System.out.println("median " +(listOfValue.get(halfColl)));

    }

    public void findAverage(List<Integer> listOfValue){
        int sum=0;
        for (Integer i:listOfValue) {
            sum+=i;
        }
        System.out.println("average " + sum/((double)listOfValue.size()));
    }

    public void findMaxValue(List<Integer> listOfValue){
        int max=listOfValue.get(0);
        for (int i = 1; i <listOfValue.size(); i++){
            if(max<listOfValue.get(i))max=listOfValue.get(i);
        }
        System.out.println("max "+ max);
    }
    public void findMinValue(List<Integer> listOfValue){
        int min=listOfValue.get(0);
        for (int i = 1; i <listOfValue.size(); i++){
            if(min>listOfValue.get(i))min=listOfValue.get(i);
        }
        System.out.println("min "+ min);
    }
}
