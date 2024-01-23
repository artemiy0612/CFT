import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Integers {
    public String write () throws Exception{
        String integer = "";
        String regexInteger = "[\\D]";
        String curDir = System.getProperty("user.dir");// текущая директория
        BufferedReader br1 = new BufferedReader(new FileReader(curDir + "\\in1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader(curDir + "\\in2.txt"));
        for (;;) {
            String line1 = br1.readLine();
            if (line1 == null) {
                break;
            }
            Pattern pattern1 = Pattern.compile(regexInteger);
            Matcher matcher1 = pattern1.matcher(line1);
            if (!matcher1.find()) { //поиск согласно регулярному выражению (Нецифр), отрицание
                integer += line1 + "\n";
            }
        }
        for (;;) {
            String line2 = br2.readLine();
            if (line2 == null) {
                break;
            }
            Pattern pattern1 = Pattern.compile(regexInteger);
            Matcher matcher1 = pattern1.matcher(line2);
            if (!matcher1.find()) {
                integer += line2 + "\n";
            }
        }
        return integer.trim();
    }
}
