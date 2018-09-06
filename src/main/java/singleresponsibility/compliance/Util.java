package singleresponsibility.compliance;

public class Util {
    public static Double calculateAverage(Integer[] values) {
        Integer sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        Double avg = (double) (sum / values.length);
        return avg;
    }
}
