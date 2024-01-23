import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class FullStatistics {
    private String curDir = System.getProperty("user.dir");
    private BufferedReader brIntegers;
    private BufferedReader brFloats;
    private String floats = "";
    private String integers = "";
    {
        try {
            brIntegers = new BufferedReader(new FileReader(curDir + "\\result_integers.txt"));
            brFloats = new BufferedReader(new FileReader(curDir + "\\result_floats.txt"));
            for (;;) {
                String line = brFloats.readLine();
                if (line == null) {
                    break;
                }
                floats += line + "\n";
            }
            for (;;) {
                String line = brIntegers.readLine();
                if (line == null) {
                    break;
                }
                integers += line + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String[] strInteregs = integers.split("\\n");// делим файл построчно
    private long[] longArr = Arrays.stream(strInteregs).mapToLong(Long::parseLong).toArray();// массив String в массив long

    private String[] strFloats = floats.split("\\n");
    private double[] doubleArr = Arrays.stream(strFloats).mapToDouble(Double::parseDouble).toArray();

    public long getMinInt () {
        long result = 0;
        result = Arrays.stream(longArr).min().getAsLong();
        System.out.println("Минимальное значение среди int: " + result);
        return result;
    }
    public double getMinDouble () {
        double result = 0.0;
        result = Arrays.stream(doubleArr).min().getAsDouble();
        System.out.println("Минимальное значение среди float: " + result);
        return result;
    }

    public long getMaxInt () {
        long result = 0;
        result = Arrays.stream(longArr).max().getAsLong();
        System.out.println("Максимальное значение среди int: " + result);
        return result;
    }
    public double getMaxDouble () {
        double result = 0.0;
        result = Arrays.stream(doubleArr).max().getAsDouble();
        System.out.println("Максимальное значение среди float: " + result);
        return result;
    }

    public long getSumInt () {
        long sum = 0;
        for (int i = 0; i < longArr.length; i++) {
            sum += longArr[i];
        }
        System.out.println("Сумма int: " + sum);
        return sum;
    }
    public double getSumDouble () {
        double sum = 0.0;
        for (int i = 0; i < doubleArr.length; i++) {
            sum += doubleArr[i];
        }
        System.out.println("Сумма float: " + sum);
        return sum;
    }

    public long getAverageInt () {
        long result = 0;
        long sum = 0;
        for (int i = 0; i < longArr.length; i++) {
            sum += longArr[i];
        }
        result = sum / longArr.length;
        System.out.println("Среднее значение среди int: " + result);
        return result;
    }
    public double getAverageDouble () {
        double result = 0.0;
        double sum = 0.0;
        for (int i = 0; i < doubleArr.length; i++) {
            sum += doubleArr[i];
        }
        result = sum / doubleArr.length;
        System.out.println("Среднее значение среди float: " + result);
        return result;
    }
}
