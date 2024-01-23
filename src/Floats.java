import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Floats {
    public String write () throws Exception{
        String floats = "";
        String curDir = System.getProperty("user.dir");// текущая директория
        BufferedReader br1 = new BufferedReader(new FileReader(curDir + "\\in1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader(curDir + "\\in2.txt"));
        for (;;) {
            String line1 = br1.readLine();
            if (line1 == null) {
                break;
            }
            if (line1.contains(".")) {
                floats += line1 + "\n";
            }
        }
        for (;;) {
            String line2 = br2.readLine();
            if (line2 == null) {
                break;
            }
            if (line2.contains(".")) {
                floats += line2 + "\n";
            }
        }
        return floats.trim();
    }
}
