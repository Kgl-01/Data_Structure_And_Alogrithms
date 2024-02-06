package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class AverageCelcuisReading {
    public static void main(String[] args) {
        double[] farenheitReadings={102.4,90.4,104.8,107};
        System.out.println(averageCelcius(farenheitReadings));
    }

    public static double averageCelcius(double[]farenheitReadings){
        List<Double> al = new ArrayList<>();

        for(double i : farenheitReadings){
            double celcius = (i-32)/1.8;
            al.add(celcius);
        }

        double sum = 0;
        int count = 0;

        for(double i : al){
            sum+=i;
            count++;
        }

        return Math.round(sum/count);
    }
}
