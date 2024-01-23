import java.io.BufferedReader;
import java.io.FileReader;

public class ShortStatistics {
    public int getNumberOfElements () throws Exception{
        int result = 0;
        String curDir = System.getProperty("user.dir");
        BufferedReader brFloats = new BufferedReader(new FileReader(curDir + "\\result_floats.txt"));
        BufferedReader brIntegers = new BufferedReader(new FileReader(curDir + "\\result_integers.txt"));
        BufferedReader brStrings = new BufferedReader(new FileReader(curDir + "\\result_strings.txt"));

        String resultFloats = "";
        for (;;) {
            String line = brFloats.readLine();
            if (line == null) {
                break;
            }
            resultFloats += line + "\n";
        }
        String[] splitFloats = resultFloats.trim().split("\\n");

        String resultIntegers = "";
        for (;;) {
            String line = brIntegers.readLine();
            if (line == null) {
                break;
            }
            resultIntegers += line + "\n";
        }
        String[] splitIntegers = resultIntegers.trim().split("\\n");

        String resultStrings = "";
        for (;;) {
            String line = brStrings.readLine();
            if (line == null) {
                break;
            }
            resultStrings += line + "\n";
        }
        String[] splitStrings = resultStrings.trim().split("\\n");
        result = splitFloats.length + splitIntegers.length + splitStrings.length;
        System.out.println("Количество элементов в файле floats - " + splitFloats.length + "\n" +
                "Количество элементов в файле integers - " + splitIntegers.length + "\n" +
                "Количество элементов в файле strings - " + splitStrings.length);
        return result;
    }
}
