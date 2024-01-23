import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public String write () throws Exception{
        String string = "";
        String regexWords = "[a-zA-Zа-€ј-я&&[^E]]"; // дл€ слов
        String curDir = System.getProperty("user.dir");// текуща€ директори€
        BufferedReader br1 = new BufferedReader(new FileReader(curDir + "\\in1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader(curDir + "\\in2.txt"));
        for (;;) {
            String line1 = br1.readLine();
            if (line1 == null) {
                break;
            }
            Pattern pattern = Pattern.compile(regexWords);
            Matcher matcher = pattern.matcher(line1);
            if (matcher.find()) {
                string += line1 + "\n";
            }
        }
        for (;;) {
            String line2 = br2.readLine();
            if (line2 == null) {
                break;
            }
            Pattern pattern = Pattern.compile(regexWords);
            Matcher matcher = pattern.matcher(line2);
            if (matcher.find()) {
                string += line2 + "\n";
            }
        }
        return string.trim();
    }
}
