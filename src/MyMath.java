import java.util.List;

public class MyMath {
    public void findPercentile(List<Integer> listOfValue){}
    public void findMedian(List<Integer> listOfValue){}



    public void findAverage(List<Integer> listOfValue){
        int summ=0;
        for (Integer i:listOfValue) {
            summ+=i;
        }
        System.out.println("average " + summ/((double)listOfValue.size()));
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
